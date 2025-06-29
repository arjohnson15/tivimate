package com.parse;

import android.content.Context;
import android.content.Intent;
import com.parse.ConnectivityNotifier;
import com.parse.boltsinternal.Task;
import com.parse.boltsinternal.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class ParsePinningEventuallyQueue extends ParseEventuallyQueue {
    private final ParseHttpClient httpClient;
    private final ConnectivityNotifier.ConnectivityListener listener;
    private final ConnectivityNotifier notifier;
    private final Object connectionLock = new Object();
    private final Object taskQueueSyncLock = new Object();
    private final HashMap<String, TaskCompletionSource<JSONObject>> pendingOperationSetUUIDTasks = new HashMap<>();
    private final TaskQueue taskQueue = new TaskQueue();
    private final TaskQueue operationSetTaskQueue = new TaskQueue();
    private final ArrayList<String> eventuallyPinUUIDQueue = new ArrayList<>();
    private final HashMap<String, TaskCompletionSource<JSONObject>> pendingEventuallyTasks = new HashMap<>();
    private final HashMap<String, ParseOperationSet> uuidToOperationSet = new HashMap<>();
    private final HashMap<String, EventuallyPin> uuidToEventuallyPin = new HashMap<>();
    private TaskCompletionSource<Void> connectionTaskCompletionSource = new TaskCompletionSource<>();

    public ParsePinningEventuallyQueue(Context context, ParseHttpClient parseHttpClient) {
        C0844 c0844 = new C0844(this, 1);
        this.listener = c0844;
        setConnected(ConnectivityNotifier.isConnected(context));
        this.httpClient = parseHttpClient;
        ConnectivityNotifier notifier = ConnectivityNotifier.getNotifier(context);
        this.notifier = notifier;
        notifier.addListener(c0844);
        resume();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(Context context, Intent intent) {
        if (intent.getBooleanExtra("noConnectivity", false)) {
            setConnected(false);
        } else {
            setConnected(ConnectivityNotifier.isConnected(context));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$populateQueueAsync$10(Task task) {
        Iterator it = ((List) task.getResult()).iterator();
        while (it.hasNext()) {
            runEventuallyAsync((EventuallyPin) it.next());
        }
        return task.makeVoid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$populateQueueAsync$9(Task task) {
        return EventuallyPin.findAllPinned(this.eventuallyPinUUIDQueue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$process$17(Task task, int i, ParseObject parseObject, ParseOperationSet parseOperationSet, Task task2) {
        return i == 1 ? parseObject.handleSaveEventuallyResultAsync((JSONObject) task.getResult(), parseOperationSet) : (i != 2 || task.isFaulted()) ? task2 : parseObject.handleDeleteEventuallyResultAsync();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$process$18(Task task, Task task2) {
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$process$19(EventuallyPin eventuallyPin, ParseOperationSet parseOperationSet, int i, ParseObject parseObject, Task task) {
        Exception error = task.getError();
        if (error == null || !(error instanceof ParseException) || ((ParseException) error).getCode() != 100) {
            return eventuallyPin.unpinInBackground("_eventuallyPin").continueWithTask(new C0832(task, i, parseObject, parseOperationSet)).continueWithTask(new C0814(task, 1));
        }
        setConnected(false);
        notifyTestHelper(7);
        return process(eventuallyPin, parseOperationSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$process$20(EventuallyPin eventuallyPin, ParseOperationSet parseOperationSet, Task task) throws JSONException {
        Task taskExecuteAsync;
        int type = eventuallyPin.getType();
        ParseObject object = eventuallyPin.getObject();
        String sessionToken = eventuallyPin.getSessionToken();
        if (type == 1) {
            taskExecuteAsync = object.saveAsync(this.httpClient, parseOperationSet, sessionToken);
        } else if (type == 2) {
            taskExecuteAsync = object.deleteAsync(sessionToken).cast();
        } else {
            ParseRESTCommand command = eventuallyPin.getCommand();
            if (command == null) {
                taskExecuteAsync = Task.forResult(null);
                notifyTestHelper(8);
            } else {
                taskExecuteAsync = command.executeAsync(this.httpClient);
            }
        }
        return taskExecuteAsync.continueWithTask(new C0852(this, eventuallyPin, parseOperationSet, type, object));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$runEventuallyAsync$11(String str, Task task) {
        this.eventuallyPinUUIDQueue.remove(str);
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$runEventuallyAsync$12(EventuallyPin eventuallyPin, String str, Task task) {
        return runEventuallyAsync(eventuallyPin, task).continueWithTask(new C0855(this, 14, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$runEventuallyAsync$13(Task task) {
        return waitForConnectionAsync();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$runEventuallyAsync$14(EventuallyPin eventuallyPin, Task task) {
        Exception error = task.getError();
        if (error != null) {
            if (6 >= Parse.getLogLevel()) {
                PLog.e("ParsePinningEventuallyQueue", "Failed to run command.", error);
            }
            notifyTestHelper(2, error);
        } else {
            notifyTestHelper(1);
        }
        TaskCompletionSource<JSONObject> taskCompletionSourceRemove = this.pendingOperationSetUUIDTasks.remove(eventuallyPin.getUUID());
        if (taskCompletionSourceRemove != null) {
            if (error != null) {
                taskCompletionSourceRemove.setError(error);
            } else {
                taskCompletionSourceRemove.setResult((JSONObject) task.getResult());
            }
        }
        return task.makeVoid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$runEventuallyAsync$15(EventuallyPin eventuallyPin, Task task) {
        return waitForOperationSetAndEventuallyPin(null, eventuallyPin).continueWithTask(new C0791(this, eventuallyPin, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$waitForOperationSetAndEventuallyPin$16(String str, TaskCompletionSource taskCompletionSource, Task task) {
        synchronized (this.taskQueueSyncLock) {
            this.pendingEventuallyTasks.remove(str);
            this.uuidToOperationSet.remove(str);
            this.uuidToEventuallyPin.remove(str);
        }
        Exception error = task.getError();
        if (error != null) {
            taskCompletionSource.trySetError(error);
        } else if (task.isCancelled()) {
            taskCompletionSource.trySetCancelled();
        } else {
            taskCompletionSource.trySetResult((JSONObject) task.getResult());
        }
        return taskCompletionSource.getTask();
    }

    private Task<Void> populateQueueAsync() {
        return this.taskQueue.enqueue(new C0831(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task<Void> populateQueueAsync(Task<Void> task) {
        return task.continueWithTask(new C0831(this, 2)).onSuccessTask(new C0831(this, 3));
    }

    private Task<JSONObject> process(EventuallyPin eventuallyPin, ParseOperationSet parseOperationSet) {
        return waitForConnectionAsync().onSuccessTask(new C0813(this, eventuallyPin, parseOperationSet, 13));
    }

    private Task<Void> runEventuallyAsync(EventuallyPin eventuallyPin) {
        String uuid = eventuallyPin.getUUID();
        if (this.eventuallyPinUUIDQueue.contains(uuid)) {
            return Task.forResult(null);
        }
        this.eventuallyPinUUIDQueue.add(uuid);
        this.operationSetTaskQueue.enqueue(new C0813(this, eventuallyPin, uuid, 11));
        return Task.forResult(null);
    }

    private Task<Void> runEventuallyAsync(EventuallyPin eventuallyPin, Task<Void> task) {
        return task.continueWithTask(new C0831(this, 0)).onSuccessTask(new C0791(this, eventuallyPin, 1));
    }

    private Task<Void> waitForConnectionAsync() {
        Task<Void> task;
        synchronized (this.connectionLock) {
            task = this.connectionTaskCompletionSource.getTask();
        }
        return task;
    }

    public void resume() {
        if (isConnected()) {
            this.connectionTaskCompletionSource.trySetResult(null);
            TaskCompletionSource<Void> taskCompletionSource = new TaskCompletionSource<>();
            this.connectionTaskCompletionSource = taskCompletionSource;
            taskCompletionSource.trySetResult(null);
        } else {
            this.connectionTaskCompletionSource = new TaskCompletionSource<>();
        }
        populateQueueAsync();
    }

    @Override // com.parse.ParseEventuallyQueue
    public void setConnected(boolean z) {
        synchronized (this.connectionLock) {
            try {
                if (isConnected() != z) {
                    super.setConnected(z);
                    if (z) {
                        this.connectionTaskCompletionSource.trySetResult(null);
                        TaskCompletionSource<Void> taskCompletionSource = new TaskCompletionSource<>();
                        this.connectionTaskCompletionSource = taskCompletionSource;
                        taskCompletionSource.trySetResult(null);
                    } else {
                        this.connectionTaskCompletionSource = new TaskCompletionSource<>();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.parse.ParseEventuallyQueue
    public Task<JSONObject> waitForOperationSetAndEventuallyPin(ParseOperationSet parseOperationSet, EventuallyPin eventuallyPin) {
        String uuid;
        TaskCompletionSource<JSONObject> taskCompletionSource;
        if (eventuallyPin != null && eventuallyPin.getType() != 1) {
            return process(eventuallyPin, null);
        }
        synchronized (this.taskQueueSyncLock) {
            try {
                if (parseOperationSet != null && eventuallyPin == null) {
                    uuid = parseOperationSet.getUUID();
                    this.uuidToOperationSet.put(uuid, parseOperationSet);
                } else {
                    if (parseOperationSet != null || eventuallyPin == null) {
                        throw new IllegalStateException("Either operationSet or eventuallyPin must be set.");
                    }
                    String operationSetUUID = eventuallyPin.getOperationSetUUID();
                    this.uuidToEventuallyPin.put(operationSetUUID, eventuallyPin);
                    uuid = operationSetUUID;
                }
                EventuallyPin eventuallyPin2 = this.uuidToEventuallyPin.get(uuid);
                ParseOperationSet parseOperationSet2 = this.uuidToOperationSet.get(uuid);
                if (eventuallyPin2 != null && parseOperationSet2 != null) {
                    return process(eventuallyPin2, parseOperationSet2).continueWithTask(new C0813(this, uuid, this.pendingEventuallyTasks.get(uuid), 12));
                }
                if (this.pendingEventuallyTasks.containsKey(uuid)) {
                    taskCompletionSource = this.pendingEventuallyTasks.get(uuid);
                } else {
                    taskCompletionSource = new TaskCompletionSource<>();
                    this.pendingEventuallyTasks.put(uuid, taskCompletionSource);
                }
                return taskCompletionSource.getTask();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
