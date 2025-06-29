package p381;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
import p123.RunnableC2003;
import p251.RunnableC3129;
import p417.AbstractC4753;

/* renamed from: ᵢᵎ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ExecutorC4440 implements Executor {

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public static final Logger f17112 = Logger.getLogger(ExecutorC4440.class.getName());

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Executor f17117;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final ArrayDeque f17113 = new ArrayDeque();

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public int f17115 = 1;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public long f17116 = 0;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final RunnableC3129 f17114 = new RunnableC3129(this);

    public ExecutorC4440(Executor executor) {
        AbstractC4753.m10683(executor);
        this.f17117 = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        AbstractC4753.m10683(runnable);
        synchronized (this.f17113) {
            int i = this.f17115;
            if (i != 4 && i != 3) {
                long j = this.f17116;
                RunnableC2003 runnableC2003 = new RunnableC2003(runnable, 2);
                this.f17113.add(runnableC2003);
                this.f17115 = 2;
                try {
                    this.f17117.execute(this.f17114);
                    if (this.f17115 != 2) {
                        return;
                    }
                    synchronized (this.f17113) {
                        try {
                            if (this.f17116 == j && this.f17115 == 2) {
                                this.f17115 = 3;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.f17113) {
                        try {
                            int i2 = this.f17115;
                            boolean z = true;
                            if ((i2 != 1 && i2 != 2) || !this.f17113.removeLastOccurrence(runnableC2003)) {
                                z = false;
                            }
                            if (!(e instanceof RejectedExecutionException) || z) {
                                throw e;
                            }
                        } finally {
                        }
                    }
                    return;
                }
            }
            this.f17113.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f17117 + "}";
    }
}
