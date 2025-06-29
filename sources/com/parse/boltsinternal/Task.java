package com.parse.boltsinternal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import ʻˉ.ᐧˋ;
import ᴵˏ.ʽᐧ;
import ᴵˏ.ʿʼ;
import ᴵˏ.ˑʽ;
import ᴵˏ.ـﹶ;
import ᴵˏ.ٴˎ;
import ᴵˏ.ﹳﹳ;

/* loaded from: classes.dex */
public class Task<TResult> {
    private boolean cancelled;
    private boolean complete;
    private Exception error;
    private boolean errorHasBeenObserved;
    private TResult result;
    private UnobservedErrorNotifier unobservedErrorNotifier;
    public static final ExecutorService BACKGROUND_EXECUTOR = BoltsExecutors.background();
    public static final Executor UI_THREAD_EXECUTOR = AndroidExecutors.uiThread();
    private static final Executor IMMEDIATE_EXECUTOR = BoltsExecutors.immediate();
    private static final Task<?> TASK_NULL = new Task<>((Object) null);
    private static final Task<Boolean> TASK_TRUE = new Task<>(Boolean.TRUE);
    private static final Task<Boolean> TASK_FALSE = new Task<>(Boolean.FALSE);
    private static final Task<?> TASK_CANCELLED = new Task<>(true);
    private final Object lock = new Object();
    private List<Continuation<TResult, Void>> continuations = new ArrayList();

    public interface UnobservedExceptionHandler {
    }

    public Task() {
    }

    private Task(TResult tresult) {
        trySetResult(tresult);
    }

    private Task(boolean z) {
        if (z) {
            trySetCancelled();
        } else {
            trySetResult(null);
        }
    }

    public static <TResult> Task<TResult> call(Callable<TResult> callable, Executor executor) {
        return call(callable, executor, null);
    }

    public static <TResult> Task<TResult> call(Callable<TResult> callable, Executor executor, CancellationToken cancellationToken) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        try {
            executor.execute(new ᐧˋ(taskCompletionSource, 18, callable));
        } catch (Exception e) {
            taskCompletionSource.setError(new ExecutorException(e));
        }
        return taskCompletionSource.getTask();
    }

    public static <TResult> Task<TResult> callInBackground(Callable<TResult> callable) {
        return call(callable, BACKGROUND_EXECUTOR, null);
    }

    public static <TResult> Task<TResult> cancelled() {
        return (Task<TResult>) TASK_CANCELLED;
    }

    private static <TContinuationResult, TResult> void completeAfterTask(TaskCompletionSource<TContinuationResult> taskCompletionSource, Continuation<TResult, Task<TContinuationResult>> continuation, Task<TResult> task, Executor executor, CancellationToken cancellationToken) {
        try {
            executor.execute(new ʿʼ(taskCompletionSource, continuation, task, 0));
        } catch (Exception e) {
            taskCompletionSource.setError(new ExecutorException(e));
        }
    }

    private static <TContinuationResult, TResult> void completeImmediately(TaskCompletionSource<TContinuationResult> taskCompletionSource, Continuation<TResult, TContinuationResult> continuation, Task<TResult> task, Executor executor, CancellationToken cancellationToken) {
        try {
            executor.execute(new ʿʼ(taskCompletionSource, continuation, task, 1));
        } catch (Exception e) {
            taskCompletionSource.setError(new ExecutorException(e));
        }
    }

    public static <TResult> Task<TResult> forError(Exception exc) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        taskCompletionSource.setError(exc);
        return taskCompletionSource.getTask();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <TResult> Task<TResult> forResult(TResult tresult) {
        if (tresult == 0) {
            return (Task<TResult>) TASK_NULL;
        }
        if (tresult instanceof Boolean) {
            return ((Boolean) tresult).booleanValue() ? (Task<TResult>) TASK_TRUE : (Task<TResult>) TASK_FALSE;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        taskCompletionSource.setResult(tresult);
        return taskCompletionSource.getTask();
    }

    public static UnobservedExceptionHandler getUnobservedExceptionHandler() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void lambda$call$2(CancellationToken cancellationToken, TaskCompletionSource taskCompletionSource, Callable callable) {
        try {
            taskCompletionSource.setResult(callable.call());
        } catch (CancellationException unused) {
            taskCompletionSource.setCancelled();
        } catch (Exception e) {
            taskCompletionSource.setError(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Void lambda$completeAfterTask$8(CancellationToken cancellationToken, TaskCompletionSource taskCompletionSource, Task task) {
        if (task.isCancelled()) {
            taskCompletionSource.setCancelled();
            return null;
        }
        if (task.isFaulted()) {
            taskCompletionSource.setError(task.getError());
            return null;
        }
        taskCompletionSource.setResult(task.getResult());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$completeAfterTask$9(CancellationToken cancellationToken, TaskCompletionSource taskCompletionSource, Continuation continuation, Task task) {
        try {
            Task task2 = (Task) continuation.then(task);
            if (task2 == null) {
                taskCompletionSource.setResult(null);
            } else {
                task2.continueWith(new ﹳﹳ(2, taskCompletionSource));
            }
        } catch (CancellationException unused) {
            taskCompletionSource.setCancelled();
        } catch (Exception e) {
            taskCompletionSource.setError(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void lambda$completeImmediately$7(CancellationToken cancellationToken, TaskCompletionSource taskCompletionSource, Continuation continuation, Task task) {
        try {
            taskCompletionSource.setResult(continuation.then(task));
        } catch (CancellationException unused) {
            taskCompletionSource.setCancelled();
        } catch (Exception e) {
            taskCompletionSource.setError(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$continueWhile$11(CancellationToken cancellationToken, Callable callable, Continuation continuation, Executor executor, Capture capture, Task task) {
        return ((Boolean) callable.call()).booleanValue() ? forResult(null).onSuccessTask(continuation, executor).onSuccessTask((Continuation) capture.get(), executor) : forResult(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void lambda$continueWith$12(TaskCompletionSource taskCompletionSource, Continuation continuation, Executor executor, CancellationToken cancellationToken, Task task) {
        completeImmediately(taskCompletionSource, continuation, task, executor, cancellationToken);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void lambda$continueWithTask$13(TaskCompletionSource taskCompletionSource, Continuation continuation, Executor executor, CancellationToken cancellationToken, Task task) {
        completeAfterTask(taskCompletionSource, continuation, task, executor, cancellationToken);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$makeVoid$10(Task task) {
        return task.isCancelled() ? cancelled() : task.isFaulted() ? forError(task.getError()) : forResult(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$onSuccess$14(CancellationToken cancellationToken, Continuation continuation, Task task) {
        return task.isFaulted() ? forError(task.getError()) : task.isCancelled() ? cancelled() : task.continueWith(continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$onSuccessTask$15(CancellationToken cancellationToken, Continuation continuation, Task task) {
        return task.isFaulted() ? forError(task.getError()) : task.isCancelled() ? cancelled() : task.continueWithTask(continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void lambda$whenAll$6(Object obj, ArrayList arrayList, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, TaskCompletionSource taskCompletionSource, Task task) {
        if (task.isFaulted()) {
            synchronized (obj) {
                arrayList.add(task.getError());
            }
        }
        if (task.isCancelled()) {
            atomicBoolean.set(true);
        }
        if (atomicInteger.decrementAndGet() == 0) {
            if (arrayList.size() != 0) {
                if (arrayList.size() == 1) {
                    taskCompletionSource.setError((Exception) arrayList.get(0));
                } else {
                    taskCompletionSource.setError(new AggregateException(String.format("There were %d exceptions.", Integer.valueOf(arrayList.size())), arrayList));
                }
            } else if (atomicBoolean.get()) {
                taskCompletionSource.setCancelled();
            } else {
                taskCompletionSource.setResult(null);
            }
        }
        return null;
    }

    private void runContinuations() {
        synchronized (this.lock) {
            Iterator<Continuation<TResult, Void>> it = this.continuations.iterator();
            while (it.hasNext()) {
                try {
                    it.next().then(this);
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            }
            this.continuations = null;
        }
    }

    public static Task<Void> whenAll(Collection<? extends Task<?>> collection) {
        if (collection.size() == 0) {
            return forResult(null);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        ArrayList arrayList = new ArrayList();
        Object obj = new Object();
        AtomicInteger atomicInteger = new AtomicInteger(collection.size());
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        Iterator<? extends Task<?>> it = collection.iterator();
        while (it.hasNext()) {
            it.next().continueWith(new ˑʽ(obj, arrayList, atomicBoolean, atomicInteger, taskCompletionSource));
        }
        return taskCompletionSource.getTask();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <TOut> Task<TOut> cast() {
        return this;
    }

    public Task<Void> continueWhile(Callable<Boolean> callable, Continuation<Void, Task<Void>> continuation) {
        return continueWhile(callable, continuation, IMMEDIATE_EXECUTOR, null);
    }

    public Task<Void> continueWhile(Callable<Boolean> callable, Continuation<Void, Task<Void>> continuation, Executor executor, CancellationToken cancellationToken) {
        Capture capture = new Capture();
        capture.set(new ʽᐧ(callable, continuation, executor, capture));
        return makeVoid().continueWithTask((Continuation) capture.get(), executor);
    }

    public <TContinuationResult> Task<TContinuationResult> continueWith(Continuation<TResult, TContinuationResult> continuation) {
        return continueWith(continuation, IMMEDIATE_EXECUTOR, null);
    }

    public <TContinuationResult> Task<TContinuationResult> continueWith(Continuation<TResult, TContinuationResult> continuation, Executor executor) {
        return continueWith(continuation, executor, null);
    }

    public <TContinuationResult> Task<TContinuationResult> continueWith(Continuation<TResult, TContinuationResult> continuation, Executor executor, CancellationToken cancellationToken) {
        boolean zIsCompleted;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (this.lock) {
            try {
                zIsCompleted = isCompleted();
                if (!zIsCompleted) {
                    this.continuations.add(new ـﹶ(taskCompletionSource, continuation, executor, 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zIsCompleted) {
            completeImmediately(taskCompletionSource, continuation, this, executor, cancellationToken);
        }
        return taskCompletionSource.getTask();
    }

    public <TContinuationResult> Task<TContinuationResult> continueWithTask(Continuation<TResult, Task<TContinuationResult>> continuation) {
        return continueWithTask(continuation, IMMEDIATE_EXECUTOR, null);
    }

    public <TContinuationResult> Task<TContinuationResult> continueWithTask(Continuation<TResult, Task<TContinuationResult>> continuation, Executor executor) {
        return continueWithTask(continuation, executor, null);
    }

    public <TContinuationResult> Task<TContinuationResult> continueWithTask(Continuation<TResult, Task<TContinuationResult>> continuation, Executor executor, CancellationToken cancellationToken) {
        boolean zIsCompleted;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (this.lock) {
            try {
                zIsCompleted = isCompleted();
                if (!zIsCompleted) {
                    this.continuations.add(new ـﹶ(taskCompletionSource, continuation, executor, 0));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zIsCompleted) {
            completeAfterTask(taskCompletionSource, continuation, this, executor, cancellationToken);
        }
        return taskCompletionSource.getTask();
    }

    public Exception getError() {
        Exception exc;
        synchronized (this.lock) {
            try {
                if (this.error != null) {
                    this.errorHasBeenObserved = true;
                }
                exc = this.error;
            } catch (Throwable th) {
                throw th;
            }
        }
        return exc;
    }

    public TResult getResult() {
        TResult tresult;
        synchronized (this.lock) {
            tresult = this.result;
        }
        return tresult;
    }

    public boolean isCancelled() {
        boolean z;
        synchronized (this.lock) {
            z = this.cancelled;
        }
        return z;
    }

    public boolean isCompleted() {
        boolean z;
        synchronized (this.lock) {
            z = this.complete;
        }
        return z;
    }

    public boolean isFaulted() {
        boolean z;
        synchronized (this.lock) {
            z = getError() != null;
        }
        return z;
    }

    public Task<Void> makeVoid() {
        return continueWithTask(new ٴˎ());
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccess(Continuation<TResult, TContinuationResult> continuation) {
        return onSuccess(continuation, IMMEDIATE_EXECUTOR, null);
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccess(Continuation<TResult, TContinuationResult> continuation, Executor executor) {
        return onSuccess(continuation, executor, null);
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccess(Continuation<TResult, TContinuationResult> continuation, Executor executor, CancellationToken cancellationToken) {
        return continueWithTask(new ﹳﹳ(1, continuation), executor);
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccessTask(Continuation<TResult, Task<TContinuationResult>> continuation) {
        return onSuccessTask(continuation, IMMEDIATE_EXECUTOR);
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccessTask(Continuation<TResult, Task<TContinuationResult>> continuation, Executor executor) {
        return onSuccessTask(continuation, executor, null);
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccessTask(Continuation<TResult, Task<TContinuationResult>> continuation, Executor executor, CancellationToken cancellationToken) {
        return continueWithTask(new ﹳﹳ(0, continuation), executor);
    }

    public boolean trySetCancelled() {
        synchronized (this.lock) {
            try {
                if (this.complete) {
                    return false;
                }
                this.complete = true;
                this.cancelled = true;
                this.lock.notifyAll();
                runContinuations();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean trySetError(Exception exc) {
        synchronized (this.lock) {
            try {
                if (this.complete) {
                    return false;
                }
                this.complete = true;
                this.error = exc;
                this.errorHasBeenObserved = false;
                this.lock.notifyAll();
                runContinuations();
                if (!this.errorHasBeenObserved) {
                    getUnobservedExceptionHandler();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean trySetResult(TResult tresult) {
        synchronized (this.lock) {
            try {
                if (this.complete) {
                    return false;
                }
                this.complete = true;
                this.result = tresult;
                this.lock.notifyAll();
                runContinuations();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void waitForCompletion() {
        synchronized (this.lock) {
            try {
                if (!isCompleted()) {
                    this.lock.wait();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
