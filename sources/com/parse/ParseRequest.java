package com.parse;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.parse.boltsinternal.TaskCompletionSource;
import com.parse.http.ParseHttpBody;
import com.parse.http.ParseHttpRequest;
import com.parse.http.ParseHttpResponse;
import java.io.IOException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
abstract class ParseRequest<Response> {
    private static final int CORE_POOL_SIZE;
    private static final int CPU_COUNT;
    private static final int MAX_POOL_SIZE;
    protected static final ExecutorService NETWORK_EXECUTOR;
    private static long defaultInitialRetryDelay;
    private static final ThreadFactory sThreadFactory;
    ParseHttpRequest.Method method;
    String url;

    /* renamed from: com.parse.ParseRequest$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$parse$http$ParseHttpRequest$Method;

        static {
            int[] iArr = new int[ParseHttpRequest.Method.values().length];
            $SwitchMap$com$parse$http$ParseHttpRequest$Method = iArr;
            try {
                iArr[ParseHttpRequest.Method.GET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$parse$http$ParseHttpRequest$Method[ParseHttpRequest.Method.DELETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$parse$http$ParseHttpRequest$Method[ParseHttpRequest.Method.POST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$parse$http$ParseHttpRequest$Method[ParseHttpRequest.Method.PUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static class ParseRequestException extends ParseException {
        boolean isPermanentFailure;

        public ParseRequestException(int i, String str) {
            super(i, str);
            this.isPermanentFailure = false;
        }

        public ParseRequestException(int i, String str, Throwable th) {
            super(i, str, th);
            this.isPermanentFailure = false;
        }
    }

    static {
        ThreadFactory threadFactory = new ThreadFactory() { // from class: com.parse.ParseRequest.1
            private final AtomicInteger mCount = new AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                return new Thread(runnable, "ParseRequest.NETWORK_EXECUTOR-thread-" + this.mCount.getAndIncrement());
            }
        };
        sThreadFactory = threadFactory;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        CPU_COUNT = iAvailableProcessors;
        int i = (iAvailableProcessors * 2) + 1;
        CORE_POOL_SIZE = i;
        int i2 = (iAvailableProcessors * 4) + 1;
        MAX_POOL_SIZE = i2;
        NETWORK_EXECUTOR = newThreadPoolExecutor(i, i2, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(128), threadFactory);
        defaultInitialRetryDelay = 1000L;
    }

    public ParseRequest(ParseHttpRequest.Method method, String str) {
        this.method = method;
        this.url = str;
    }

    private Task<Response> executeAsync(final ParseHttpClient parseHttpClient, final ParseHttpRequest parseHttpRequest, final int i, final long j, final ProgressCallback progressCallback, final Task<Void> task) {
        return (task == null || !task.isCancelled()) ? (Task<Response>) sendOneRequestAsync(parseHttpClient, parseHttpRequest, progressCallback).continueWithTask(new Continuation() { // from class: com.parse.ᵎʾ
            @Override // com.parse.boltsinternal.Continuation
            public final Object then(Task task2) {
                return this.f3816.lambda$executeAsync$4(task, i, j, parseHttpClient, parseHttpRequest, progressCallback, task2);
            }
        }) : Task.cancelled();
    }

    private Task<Response> executeAsync(ParseHttpClient parseHttpClient, ParseHttpRequest parseHttpRequest, ProgressCallback progressCallback, Task<Void> task) {
        long j = defaultInitialRetryDelay;
        return executeAsync(parseHttpClient, parseHttpRequest, 0, j + ((long) (Math.random() * j)), progressCallback, task);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$executeAsync$2(TaskCompletionSource taskCompletionSource, Task task) {
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
    public /* synthetic */ void lambda$executeAsync$3(ParseHttpClient parseHttpClient, ParseHttpRequest parseHttpRequest, int i, long j, ProgressCallback progressCallback, Task task, TaskCompletionSource taskCompletionSource) {
        executeAsync(parseHttpClient, parseHttpRequest, i + 1, j * 2, progressCallback, task).continueWithTask(new C0821(taskCompletionSource, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$executeAsync$4(final Task task, final int i, final long j, final ParseHttpClient parseHttpClient, final ParseHttpRequest parseHttpRequest, final ProgressCallback progressCallback, Task task2) {
        Exception error = task2.getError();
        if (task2.isFaulted() && (error instanceof ParseException)) {
            if (task != null && task.isCancelled()) {
                return Task.cancelled();
            }
            if ((!(error instanceof ParseRequestException) || !((ParseRequestException) error).isPermanentFailure) && i < maxRetries()) {
                StringBuilder sb = ᵎﹳ.ᐧʻ.ˑי(j, "Request failed. Waiting ", " milliseconds before attempt #");
                sb.append(i + 1);
                PLog.i("com.parse.ParseRequest", sb.toString());
                final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                ParseExecutors.scheduled().schedule(new Runnable() { // from class: com.parse.ˎᵢ
                    @Override // java.lang.Runnable
                    public final void run() {
                        TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                        this.f3744.lambda$executeAsync$3(parseHttpClient, parseHttpRequest, i, j, progressCallback, task, taskCompletionSource2);
                    }
                }, j, TimeUnit.MILLISECONDS);
                return taskCompletionSource.getTask();
            }
        }
        return task2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$sendOneRequestAsync$0(ParseHttpClient parseHttpClient, ParseHttpRequest parseHttpRequest, ProgressCallback progressCallback, Task task) {
        return onResponseAsync(parseHttpClient.execute(parseHttpRequest), progressCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$sendOneRequestAsync$1(Task task) {
        if (!task.isFaulted()) {
            return task;
        }
        Exception error = task.getError();
        return error instanceof IOException ? Task.forError(newTemporaryException("i/o failure", error)) : task;
    }

    private static int maxRetries() {
        if (ParsePlugins.get() == null) {
            return 4;
        }
        return ParsePlugins.get().configuration().maxRetries;
    }

    private static ThreadPoolExecutor newThreadPoolExecutor(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i2, j, timeUnit, blockingQueue, threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    private Task<Response> sendOneRequestAsync(ParseHttpClient parseHttpClient, ParseHttpRequest parseHttpRequest, ProgressCallback progressCallback) {
        return Task.forResult(null).onSuccessTask(new C0837(this, parseHttpClient, parseHttpRequest, progressCallback, 4), NETWORK_EXECUTOR).continueWithTask(new C0798(4, this), Task.BACKGROUND_EXECUTOR);
    }

    public Task<Response> executeAsync(ParseHttpClient parseHttpClient) {
        return executeAsync(parseHttpClient, (ProgressCallback) null, (ProgressCallback) null, (Task<Void>) null);
    }

    public Task<Response> executeAsync(ParseHttpClient parseHttpClient, ProgressCallback progressCallback, ProgressCallback progressCallback2, Task<Void> task) {
        return executeAsync(parseHttpClient, newRequest(this.method, this.url, progressCallback), progressCallback2, task);
    }

    public Task<Response> executeAsync(ParseHttpClient parseHttpClient, Task<Void> task) {
        return executeAsync(parseHttpClient, (ProgressCallback) null, (ProgressCallback) null, task);
    }

    public abstract ParseHttpBody newBody(ProgressCallback progressCallback);

    public ParseException newPermanentException(int i, String str) {
        ParseRequestException parseRequestException = new ParseRequestException(i, str);
        parseRequestException.isPermanentFailure = true;
        return parseRequestException;
    }

    public ParseHttpRequest newRequest(ParseHttpRequest.Method method, String str, ProgressCallback progressCallback) {
        ParseHttpRequest.Builder url = new ParseHttpRequest.Builder().setMethod(method).setUrl(str);
        int i = AnonymousClass2.$SwitchMap$com$parse$http$ParseHttpRequest$Method[method.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                throw new IllegalStateException("Invalid method " + method);
            }
            url.setBody(newBody(progressCallback));
        }
        return url.build();
    }

    public ParseException newTemporaryException(int i, String str) {
        ParseRequestException parseRequestException = new ParseRequestException(i, str);
        parseRequestException.isPermanentFailure = false;
        return parseRequestException;
    }

    public ParseException newTemporaryException(String str, Throwable th) {
        ParseRequestException parseRequestException = new ParseRequestException(100, str, th);
        parseRequestException.isPermanentFailure = false;
        return parseRequestException;
    }

    public abstract Task<Response> onResponseAsync(ParseHttpResponse parseHttpResponse, ProgressCallback progressCallback);
}
