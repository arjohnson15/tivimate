package p065;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p150.ExecutorC2314;
import p251.RunnableC3129;
import ʻˉ.ᐧˋ;

/* renamed from: ʾᵔ.ᵔﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ExecutorC1522 implements Executor {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final Object f6185;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final Executor f6186;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final ArrayDeque f6187;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public Runnable f6188;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f6189;

    public ExecutorC1522(Executor executor) {
        this.f6189 = 0;
        this.f6186 = executor;
        this.f6187 = new ArrayDeque();
        this.f6185 = new Object();
    }

    public ExecutorC1522(ExecutorService executorService) {
        this.f6189 = 2;
        this.f6186 = executorService;
        this.f6187 = new ArrayDeque();
        this.f6185 = new Object();
    }

    public ExecutorC1522(ExecutorC2314 executorC2314) {
        this.f6189 = 1;
        this.f6185 = new Object();
        this.f6187 = new ArrayDeque();
        this.f6186 = executorC2314;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    private final void m5099(Runnable runnable) {
        synchronized (this.f6185) {
            try {
                this.f6187.add(new ᐧˋ(this, 10, runnable));
                if (this.f6188 == null) {
                    m5103();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    private final void m5100() {
        synchronized (this.f6185) {
            try {
                Runnable runnable = (Runnable) this.f6187.poll();
                this.f6188 = runnable;
                if (runnable != null) {
                    ((ExecutorC2314) this.f6186).execute(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    private final void m5101(Runnable runnable) {
        synchronized (this.f6185) {
            this.f6187.offer(new ᐧˋ(runnable, 6, this));
            if (this.f6188 == null) {
                m5103();
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f6189) {
            case 0:
                m5101(runnable);
                return;
            case 1:
                m5099(runnable);
                return;
            default:
                synchronized (this.f6185) {
                    try {
                        this.f6187.add(new RunnableC3129(22, this, runnable, false));
                        if (this.f6188 == null) {
                            m5103();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public boolean m5102() {
        boolean z;
        synchronized (this.f6185) {
            z = !this.f6187.isEmpty();
        }
        return z;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m5103() {
        switch (this.f6189) {
            case 0:
                synchronized (this.f6185) {
                    Object objPoll = this.f6187.poll();
                    Runnable runnable = (Runnable) objPoll;
                    this.f6188 = runnable;
                    if (objPoll != null) {
                        this.f6186.execute(runnable);
                    }
                }
                return;
            case 1:
                m5100();
                return;
            default:
                Runnable runnable2 = (Runnable) this.f6187.poll();
                this.f6188 = runnable2;
                if (runnable2 != null) {
                    ((ExecutorService) this.f6186).execute(runnable2);
                    return;
                }
                return;
        }
    }
}
