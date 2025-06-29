package com.parse;

import com.parse.boltsinternal.Task;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
abstract class ParseExecutors {
    private static final Object SCHEDULED_EXECUTOR_LOCK = new Object();
    private static ScheduledExecutorService scheduledExecutor;

    public static Executor io() {
        return Task.BACKGROUND_EXECUTOR;
    }

    public static Executor main() {
        return Task.UI_THREAD_EXECUTOR;
    }

    public static ScheduledExecutorService scheduled() {
        synchronized (SCHEDULED_EXECUTOR_LOCK) {
            try {
                if (scheduledExecutor == null) {
                    scheduledExecutor = Executors.newScheduledThreadPool(1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return scheduledExecutor;
    }
}
