package p456;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p417.AbstractC4753;

/* renamed from: ﾞⁱ.ʿˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5247 extends AbstractC5324 {

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public static final AtomicLong f20174 = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final PriorityBlockingQueue f20175;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final C5263 f20176;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public C5338 f20177;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final Object f20178;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public C5338 f20179;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final Semaphore f20180;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final LinkedBlockingQueue f20181;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final C5263 f20182;

    public C5247(C5236 c5236) {
        super(c5236);
        this.f20178 = new Object();
        this.f20180 = new Semaphore(2);
        this.f20175 = new PriorityBlockingQueue();
        this.f20181 = new LinkedBlockingQueue();
        this.f20182 = new C5263(this, "Thread death: Uncaught exception on worker thread");
        this.f20176 = new C5263(this, "Thread death: Uncaught exception on network thread");
    }

    /* renamed from: ʼʼ, reason: contains not printable characters */
    public final void m11739(Runnable runnable) {
        m11997();
        m11744(new C5276(this, runnable, true, "Task exception on worker thread"));
    }

    /* renamed from: ʼᵎ, reason: contains not printable characters */
    public final void m11740() {
        if (Thread.currentThread() != this.f20177) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    /* renamed from: ˉˑ, reason: contains not printable characters */
    public final boolean m11741() {
        return Thread.currentThread() == this.f20177;
    }

    /* renamed from: ˋˏ, reason: contains not printable characters */
    public final void m11742() {
        if (Thread.currentThread() != this.f20179) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    /* renamed from: יˊ, reason: contains not printable characters */
    public final void m11743(Runnable runnable) {
        m11997();
        AbstractC4753.m10683(runnable);
        m11744(new C5276(this, runnable, false, "Task exception on worker thread"));
    }

    /* renamed from: ᴵˋ, reason: contains not printable characters */
    public final void m11744(C5276 c5276) {
        synchronized (this.f20178) {
            try {
                this.f20175.add(c5276);
                C5338 c5338 = this.f20177;
                if (c5338 == null) {
                    C5338 c53382 = new C5338(this, "Measurement Worker", this.f20175);
                    this.f20177 = c53382;
                    c53382.setUncaughtExceptionHandler(this.f20182);
                    this.f20177.start();
                } else {
                    c5338.m12020();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    public final void m11745(Runnable runnable) {
        m11997();
        C5276 c5276 = new C5276(this, runnable, false, "Task exception on network thread");
        synchronized (this.f20178) {
            try {
                this.f20181.add(c5276);
                C5338 c5338 = this.f20179;
                if (c5338 == null) {
                    C5338 c53382 = new C5338(this, "Measurement Network", this.f20181);
                    this.f20179 = c53382;
                    c53382.setUncaughtExceptionHandler(this.f20176);
                    this.f20179.start();
                } else {
                    c5338.m12020();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p456.AbstractC5324
    /* renamed from: ᵔˋ, reason: contains not printable characters */
    public final boolean mo11746() {
        return false;
    }

    /* renamed from: ᵔᵢ, reason: contains not printable characters */
    public final C5276 m11747(Callable callable) {
        m11997();
        C5276 c5276 = new C5276(this, callable, true);
        if (Thread.currentThread() == this.f20177) {
            c5276.run();
        } else {
            m11744(c5276);
        }
        return c5276;
    }

    /* renamed from: ᵢˆ, reason: contains not printable characters */
    public final C5276 m11748(Callable callable) {
        m11997();
        C5276 c5276 = new C5276(this, callable, false);
        if (Thread.currentThread() == this.f20177) {
            if (!this.f20175.isEmpty()) {
                ˏᵢ().f20568.m4533("Callable skipped the worker queue.");
            }
            c5276.run();
        } else {
            m11744(c5276);
        }
        return c5276;
    }

    /* renamed from: ᵢﹶ, reason: contains not printable characters */
    public final Object m11749(AtomicReference atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            ʽᐧ().m11743(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                ˏᵢ().f20568.m4533("Interrupted waiting for ".concat(str));
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            ˏᵢ().f20568.m4533("Timed out waiting for ".concat(str));
        }
        return obj;
    }
}
