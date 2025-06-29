package p261;

import com.bumptech.glide.C0292;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import p082.C1707;
import p082.InterfaceC1706;
import p150.ExecutorC2314;
import p260.C3222;
import p329.AbstractC3740;
import p329.AbstractC3742;
import p346.C3993;
import p377.ExecutorServiceC4328;
import ᵔʼ.ˑʽ;

/* renamed from: ـ.ᵎـ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3246 implements InterfaceC1706 {

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public static final ˑʽ f12656 = new ˑʽ();

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public boolean f12657;

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public boolean f12658;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C1707 f12659;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final ˑʽ f12660;

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public boolean f12661;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final ExecutorServiceC4328 f12662;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final C3233 f12663;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public boolean f12664;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public InterfaceC3251 f12665;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public boolean f12666;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final ExecutorServiceC4328 f12667;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final C3222 f12668;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C3239 f12669;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final AtomicInteger f12670;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public RunnableC3230 f12671;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public C3245 f12672;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public GlideException f12673;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final C3233 f12674;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public int f12675;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final ExecutorServiceC4328 f12676;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public volatile boolean f12677;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public C3234 f12678;

    public C3246(ExecutorServiceC4328 executorServiceC4328, ExecutorServiceC4328 executorServiceC43282, ExecutorServiceC4328 executorServiceC43283, ExecutorServiceC4328 executorServiceC43284, C3233 c3233, C3233 c32332, C3222 c3222) {
        ˑʽ r6 = f12656;
        this.f12669 = new C3239(new ArrayList(2));
        this.f12659 = new C1707();
        this.f12670 = new AtomicInteger();
        this.f12676 = executorServiceC4328;
        this.f12662 = executorServiceC43282;
        this.f12667 = executorServiceC43284;
        this.f12674 = c3233;
        this.f12663 = c32332;
        this.f12668 = c3222;
        this.f12660 = r6;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m7998() {
        if (m8004()) {
            return;
        }
        this.f12677 = true;
        RunnableC3230 runnableC3230 = this.f12671;
        runnableC3230.f12581 = true;
        InterfaceC3243 interfaceC3243 = runnableC3230.f12557;
        if (interfaceC3243 != null) {
            interfaceC3243.cancel();
        }
        C3233 c3233 = this.f12674;
        C3234 c3234 = this.f12678;
        synchronized (c3233) {
            C0292 c0292 = c3233.f12597;
            c0292.getClass();
            HashMap map = c0292.f2385;
            if (equals(map.get(c3234))) {
                map.remove(c3234);
            }
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final synchronized void m7999(int i) {
        C3245 c3245;
        AbstractC3740.m8707("Not yet complete!", m8004());
        if (this.f12670.getAndAdd(i) == 0 && (c3245 = this.f12672) != null) {
            c3245.m7997();
        }
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final synchronized void m8000(C3993 c3993) {
        try {
            this.f12659.m5423();
            C3239 c3239 = this.f12669;
            c3239.f12635.remove(new C3236(c3993, AbstractC3740.f14499));
            if (this.f12669.f12635.isEmpty()) {
                m7998();
                if (this.f12664 || this.f12657) {
                    if (this.f12670.get() == 0) {
                        m8007();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final synchronized void m8001(RunnableC3230 runnableC3230) {
        this.f12671 = runnableC3230;
        int iM7970 = runnableC3230.m7970(1);
        ((iM7970 == 2 || iM7970 == 3) ? this.f12676 : this.f12666 ? this.f12667 : this.f12662).execute(runnableC3230);
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final void m8002() {
        synchronized (this) {
            try {
                this.f12659.m5423();
                if (this.f12677) {
                    this.f12665.mo4602();
                    m8007();
                    return;
                }
                if (this.f12669.f12635.isEmpty()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                if (this.f12664) {
                    throw new IllegalStateException("Already have resource");
                }
                ˑʽ r0 = this.f12660;
                InterfaceC3251 interfaceC3251 = this.f12665;
                boolean z = this.f12658;
                C3234 c3234 = this.f12678;
                C3233 c3233 = this.f12663;
                r0.getClass();
                this.f12672 = new C3245(interfaceC3251, z, true, c3234, c3233);
                this.f12664 = true;
                C3239 c3239 = this.f12669;
                c3239.getClass();
                ArrayList arrayList = new ArrayList(c3239.f12635);
                m7999(arrayList.size() + 1);
                this.f12674.m7983(this, this.f12678, this.f12672);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C3236 c3236 = (C3236) it.next();
                    c3236.f12615.execute(new RunnableC3244(this, c3236.f12616, 1));
                }
                m8006();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p082.InterfaceC1706
    /* renamed from: ˑʽ */
    public final C1707 mo5422() {
        return this.f12659;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final synchronized void m8003(C3993 c3993, ExecutorC2314 executorC2314) {
        try {
            this.f12659.m5423();
            C3239 c3239 = this.f12669;
            c3239.getClass();
            c3239.f12635.add(new C3236(c3993, executorC2314));
            if (this.f12664) {
                m7999(1);
                RunnableC3244 runnableC3244 = new RunnableC3244(this, c3993, 1);
                executorC2314.getClass();
                AbstractC3742.m8710(runnableC3244);
            } else if (this.f12657) {
                m7999(1);
                RunnableC3244 runnableC32442 = new RunnableC3244(this, c3993, 0);
                executorC2314.getClass();
                AbstractC3742.m8710(runnableC32442);
            } else {
                AbstractC3740.m8707("Cannot add callbacks to a cancelled EngineJob", !this.f12677);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final boolean m8004() {
        return this.f12657 || this.f12664 || this.f12677;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m8005() {
        synchronized (this) {
            try {
                this.f12659.m5423();
                if (this.f12677) {
                    m8007();
                    return;
                }
                if (this.f12669.f12635.isEmpty()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (this.f12657) {
                    throw new IllegalStateException("Already failed once");
                }
                this.f12657 = true;
                C3234 c3234 = this.f12678;
                C3239 c3239 = this.f12669;
                c3239.getClass();
                ArrayList arrayList = new ArrayList(c3239.f12635);
                m7999(arrayList.size() + 1);
                this.f12674.m7983(this, c3234, null);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C3236 c3236 = (C3236) it.next();
                    c3236.f12615.execute(new RunnableC3244(this, c3236.f12616, 0));
                }
                m8006();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m8006() {
        C3245 c3245;
        synchronized (this) {
            try {
                this.f12659.m5423();
                AbstractC3740.m8707("Not yet complete!", m8004());
                int iDecrementAndGet = this.f12670.decrementAndGet();
                AbstractC3740.m8707("Can't decrement below 0", iDecrementAndGet >= 0);
                if (iDecrementAndGet == 0) {
                    c3245 = this.f12672;
                    m8007();
                } else {
                    c3245 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c3245 != null) {
            c3245.m7996();
        }
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final synchronized void m8007() {
        if (this.f12678 == null) {
            throw new IllegalArgumentException();
        }
        this.f12669.f12635.clear();
        this.f12678 = null;
        this.f12672 = null;
        this.f12665 = null;
        this.f12657 = false;
        this.f12677 = false;
        this.f12664 = false;
        this.f12661 = false;
        this.f12671.m7966();
        this.f12671 = null;
        this.f12673 = null;
        this.f12675 = 0;
        this.f12668.m7946(this);
    }
}
