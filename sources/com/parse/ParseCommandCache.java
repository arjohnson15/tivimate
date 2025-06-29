package com.parse;

import android.content.Context;
import android.content.Intent;
import com.parse.ConnectivityNotifier;
import com.parse.boltsinternal.Capture;
import com.parse.boltsinternal.Task;
import com.parse.boltsinternal.TaskCompletionSource;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class ParseCommandCache extends ParseEventuallyQueue {
    private static final Object lock = new Object();
    private final File cachePath;
    private final ParseHttpClient httpClient;
    final ConnectivityNotifier.ConnectivityListener listener;
    private final Logger log;
    private int maxCacheSizeBytes;
    ConnectivityNotifier notifier;
    private final HashMap<File, TaskCompletionSource<JSONObject>> pendingTasks;
    private boolean running;
    private final Object runningLock;
    private boolean shouldStop;
    private int timeoutMaxRetries;
    private double timeoutRetryWaitSeconds;
    private boolean unprocessedCommandsExist;

    public ParseCommandCache(Context context, ParseHttpClient parseHttpClient) {
        C0844 c0844 = new C0844(this, 0);
        this.listener = c0844;
        this.pendingTasks = new HashMap<>();
        this.timeoutMaxRetries = 5;
        this.timeoutRetryWaitSeconds = 600.0d;
        this.maxCacheSizeBytes = 10485760;
        setConnected(false);
        this.shouldStop = false;
        this.running = false;
        this.runningLock = new Object();
        this.httpClient = parseHttpClient;
        this.log = Logger.getLogger("com.parse.ParseCommandCache");
        this.cachePath = getCacheDir();
        if (Parse.hasPermission("android.permission.ACCESS_NETWORK_STATE")) {
            setConnected(ConnectivityNotifier.isConnected(context));
            ConnectivityNotifier notifier = ConnectivityNotifier.getNotifier(context);
            this.notifier = notifier;
            notifier.addListener(c0844);
            resume();
        }
    }

    private static File getCacheDir() {
        File file = new File(Parse.getParseCacheDir(), "CommandCache");
        file.mkdirs();
        return file;
    }

    public static int getPendingCount() {
        int length;
        synchronized (lock) {
            String[] list = getCacheDir().list();
            length = list == null ? 0 : list.length;
        }
        return length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$maybeRunAllCommandsNow$3(ParseRESTCommand parseRESTCommand, TaskCompletionSource taskCompletionSource, Task task) {
        String strOptString;
        String localId = parseRESTCommand.getLocalId();
        Exception error = task.getError();
        if (error != null) {
            if ((!(error instanceof ParseException) || ((ParseException) error).getCode() != 100) && taskCompletionSource != null) {
                taskCompletionSource.setError(error);
            }
            return task;
        }
        JSONObject jSONObject = (JSONObject) task.getResult();
        if (taskCompletionSource != null) {
            taskCompletionSource.setResult(jSONObject);
        } else if (localId != null && (strOptString = jSONObject.optString("objectId", null)) != null) {
            ParseCorePlugins.getInstance().getLocalIdManager().setObjectId(localId, strOptString);
        }
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void lambda$new$0(boolean z, boolean z2) {
        if (z) {
            setConnected(false);
            return null;
        }
        setConnected(z2);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(Context context, Intent intent) {
        final boolean booleanExtra = intent.getBooleanExtra("noConnectivity", false);
        final boolean zIsConnected = ConnectivityNotifier.isConnected(context);
        Task.call(new Callable() { // from class: com.parse.ﾞˎ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f3876.lambda$new$0(booleanExtra, zIsConnected);
            }
        }, ParseExecutors.io());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void lambda$waitForTaskWithoutLock$2(Capture capture, Task task) {
        capture.set(Boolean.TRUE);
        Object obj = lock;
        synchronized (obj) {
            obj.notifyAll();
        }
        return null;
    }

    private void maybeRunAllCommandsNow(int i) {
        String[] strArr;
        Task taskForResult;
        synchronized (lock) {
            boolean z = false;
            try {
                this.unprocessedCommandsExist = false;
                if (isConnected()) {
                    String[] list = this.cachePath.list();
                    if (list != null && list.length != 0) {
                        Arrays.sort(list);
                        int length = list.length;
                        int i2 = 0;
                        while (i2 < length) {
                            File file = new File(this.cachePath, list[i2]);
                            try {
                                try {
                                    try {
                                        JSONObject fileToJSONObject = ParseFileUtils.readFileToJSONObject(file);
                                        TaskCompletionSource<JSONObject> taskCompletionSource = this.pendingTasks.containsKey(file) ? this.pendingTasks.get(file) : null;
                                        try {
                                            ParseRESTCommand parseRESTCommandCommandFromJSON = commandFromJSON(fileToJSONObject);
                                            boolean z2 = true;
                                            if (parseRESTCommandCommandFromJSON == null) {
                                                try {
                                                    taskForResult = Task.forResult(null);
                                                    if (taskCompletionSource != null) {
                                                        taskCompletionSource.setResult(null);
                                                    }
                                                    notifyTestHelper(8);
                                                } catch (ParseException e) {
                                                    if (e.getCode() != 100) {
                                                        strArr = list;
                                                        if (6 >= Parse.getLogLevel()) {
                                                            this.log.log(Level.SEVERE, "Failed to run command.", (Throwable) e);
                                                        }
                                                        removeFile(file);
                                                        notifyTestHelper(2, e);
                                                    } else if (i > 0) {
                                                        if (4 >= Parse.getLogLevel()) {
                                                            this.log.info("Network timeout in command cache. Waiting for " + this.timeoutRetryWaitSeconds + " seconds and then retrying " + i + " times.");
                                                        }
                                                        long jCurrentTimeMillis = System.currentTimeMillis();
                                                        long j = ((long) (this.timeoutRetryWaitSeconds * 1000.0d)) + jCurrentTimeMillis;
                                                        while (jCurrentTimeMillis < j) {
                                                            if (!isConnected() || this.shouldStop) {
                                                                if (4 >= Parse.getLogLevel()) {
                                                                    this.log.info("Aborting wait because runEventually thread should stop.");
                                                                }
                                                                return;
                                                            }
                                                            try {
                                                                lock.wait(j - jCurrentTimeMillis);
                                                            } catch (InterruptedException unused) {
                                                                this.shouldStop = z2;
                                                            }
                                                            jCurrentTimeMillis = System.currentTimeMillis();
                                                            String[] strArr2 = list;
                                                            double d = this.timeoutRetryWaitSeconds;
                                                            if (jCurrentTimeMillis < j - ((long) (d * 1000.0d))) {
                                                                jCurrentTimeMillis = j - ((long) (d * 1000.0d));
                                                            }
                                                            list = strArr2;
                                                            z2 = true;
                                                        }
                                                        strArr = list;
                                                        maybeRunAllCommandsNow(i - 1);
                                                        z = false;
                                                    } else {
                                                        strArr = list;
                                                        setConnected(z);
                                                        notifyTestHelper(7);
                                                    }
                                                }
                                            } else {
                                                taskForResult = parseRESTCommandCommandFromJSON.executeAsync(this.httpClient).continueWithTask(new C0855(parseRESTCommandCommandFromJSON, 13, taskCompletionSource));
                                            }
                                            waitForTaskWithoutLock(taskForResult);
                                            if (taskCompletionSource != null) {
                                                waitForTaskWithoutLock(taskCompletionSource.getTask());
                                            }
                                            removeFile(file);
                                            notifyTestHelper(1);
                                            strArr = list;
                                        } catch (JSONException e2) {
                                            strArr = list;
                                            if (6 >= Parse.getLogLevel()) {
                                                this.log.log(Level.SEVERE, "Unable to create ParseCommand from JSON.", (Throwable) e2);
                                            }
                                            removeFile(file);
                                        }
                                    } catch (IOException e3) {
                                        strArr = list;
                                        if (6 >= Parse.getLogLevel()) {
                                            this.log.log(Level.SEVERE, "Unable to read contents of file in cache.", (Throwable) e3);
                                        }
                                        removeFile(file);
                                    }
                                } catch (JSONException e4) {
                                    strArr = list;
                                    if (6 >= Parse.getLogLevel()) {
                                        this.log.log(Level.SEVERE, "Error parsing JSON found in cache.", (Throwable) e4);
                                    }
                                    removeFile(file);
                                }
                            } catch (FileNotFoundException e5) {
                                strArr = list;
                                if (6 >= Parse.getLogLevel()) {
                                    this.log.log(Level.SEVERE, "File disappeared from cache while being read.", (Throwable) e5);
                                }
                            }
                            i2++;
                            list = strArr;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void removeFile(File file) {
        synchronized (lock) {
            this.pendingTasks.remove(file);
            try {
                commandFromJSON(ParseFileUtils.readFileToJSONObject(file)).releaseLocalIds();
            } catch (Exception unused) {
            }
            ParseFileUtils.deleteQuietly(file);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runLoop() {
        boolean z;
        boolean z2;
        if (4 >= Parse.getLogLevel()) {
            this.log.info("Parse command cache has started processing queued commands.");
        }
        synchronized (this.runningLock) {
            try {
                if (this.running) {
                    return;
                }
                this.running = true;
                this.runningLock.notifyAll();
                synchronized (lock) {
                    try {
                        z = (this.shouldStop || Thread.interrupted()) ? false : true;
                    } finally {
                    }
                }
                while (z) {
                    Object obj = lock;
                    synchronized (obj) {
                        try {
                            maybeRunAllCommandsNow(this.timeoutMaxRetries);
                            if (!this.shouldStop) {
                                try {
                                    if (!this.unprocessedCommandsExist) {
                                        obj.wait();
                                    }
                                } catch (InterruptedException unused) {
                                    this.shouldStop = true;
                                }
                            }
                        } catch (Exception e) {
                            if (6 >= Parse.getLogLevel()) {
                                this.log.log(Level.SEVERE, "saveEventually thread had an error.", (Throwable) e);
                            }
                        }
                        z2 = !this.shouldStop;
                    }
                    z = z2;
                }
                synchronized (this.runningLock) {
                    this.running = false;
                    this.runningLock.notifyAll();
                }
                if (4 >= Parse.getLogLevel()) {
                    this.log.info("saveEventually thread has stopped processing commands.");
                }
            } finally {
            }
        }
    }

    private <T> T waitForTaskWithoutLock(Task<T> task) {
        T t;
        synchronized (lock) {
            Capture capture = new Capture(Boolean.FALSE);
            task.continueWith(new C0848(capture, 2), Task.BACKGROUND_EXECUTOR);
            while (!((Boolean) capture.get()).booleanValue()) {
                try {
                    lock.wait();
                } catch (InterruptedException unused) {
                    this.shouldStop = true;
                }
            }
            t = (T) ParseTaskUtils.wait(task);
        }
        return t;
    }

    public void resume() {
        synchronized (this.runningLock) {
            if (!this.running) {
                new Thread("ParseCommandCache.runLoop()") { // from class: com.parse.ParseCommandCache.1
                    @Override // java.lang.Thread, java.lang.Runnable
                    public void run() {
                        ParseCommandCache.this.runLoop();
                    }
                }.start();
                try {
                    this.runningLock.wait();
                } catch (InterruptedException unused) {
                    Object obj = lock;
                    synchronized (obj) {
                        this.shouldStop = true;
                        obj.notifyAll();
                    }
                }
            }
        }
    }

    @Override // com.parse.ParseEventuallyQueue
    public void setConnected(boolean z) {
        Object obj = lock;
        synchronized (obj) {
            try {
                if (isConnected() != z && z) {
                    obj.notifyAll();
                }
                super.setConnected(z);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
