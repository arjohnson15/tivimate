package p052;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: ʾʼ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ExecutorC1321 implements Executor {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final Handler f5378;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f5379;

    public ExecutorC1321(int i) {
        this.f5379 = i;
        switch (i) {
            case 2:
                this.f5378 = new Handler(Looper.getMainLooper());
                break;
            case 3:
                this.f5378 = new Handler(Looper.getMainLooper());
                break;
            default:
                this.f5378 = new Handler(Looper.getMainLooper());
                break;
        }
    }

    public ExecutorC1321(Handler handler) {
        this.f5379 = 0;
        this.f5378 = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f5379) {
            case 0:
                runnable.getClass();
                Handler handler = this.f5378;
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            case 1:
                this.f5378.post(runnable);
                return;
            case 2:
                this.f5378.post(runnable);
                return;
            default:
                this.f5378.post(runnable);
                return;
        }
    }
}
