package com.parse;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
class TaskQueue {
    private final Lock lock = new ReentrantLock();
    private Task<Void> tail;

    private Task<Void> getTaskToAwait() {
        this.lock.lock();
        try {
            Task<Void> taskForResult = this.tail;
            if (taskForResult == null) {
                taskForResult = Task.forResult(null);
            }
            return taskForResult.continueWith(new C0833(18));
        } finally {
            this.lock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void lambda$getTaskToAwait$2(Task task) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$waitFor$0(Task task, Task task2) {
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$waitFor$1(Task task, Task task2) {
        return task.continueWithTask(new C0814(task2, 3));
    }

    public static <T> Continuation<T, Task<T>> waitFor(Task<Void> task) {
        return new C0814(task, 2);
    }

    public <T> Task<T> enqueue(Continuation<Void, Task<T>> continuation) {
        this.lock.lock();
        try {
            Task<Void> taskForResult = this.tail;
            if (taskForResult == null) {
                taskForResult = Task.forResult(null);
            }
            try {
                Task<T> taskThen = continuation.then(getTaskToAwait());
                this.tail = Task.whenAll(Arrays.asList(taskForResult, taskThen));
                return taskThen;
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        } finally {
            this.lock.unlock();
        }
    }

    public Lock getLock() {
        return this.lock;
    }
}
