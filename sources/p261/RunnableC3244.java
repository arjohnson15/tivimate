package p261;

import p329.AbstractC3740;
import p346.C3993;

/* renamed from: ـ.ᴵʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC3244 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C3993 f12646;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ C3246 f12647;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f12648;

    public /* synthetic */ RunnableC3244(C3246 c3246, C3993 c3993, int i) {
        this.f12648 = i;
        this.f12647 = c3246;
        this.f12646 = c3993;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    private final void m7995() {
        C3993 c3993 = this.f12646;
        c3993.f15398.m5423();
        synchronized (c3993.f15410) {
            synchronized (this.f12647) {
                try {
                    C3239 c3239 = this.f12647.f12669;
                    C3993 c39932 = this.f12646;
                    c3239.getClass();
                    if (c3239.f12635.contains(new C3236(c39932, AbstractC3740.f14499))) {
                        C3246 c3246 = this.f12647;
                        C3993 c39933 = this.f12646;
                        c3246.getClass();
                        try {
                            c39933.m9255(c3246.f12673, 5);
                        } catch (Throwable th) {
                            throw new C3238(th);
                        }
                    }
                    this.f12647.m8006();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12648) {
            case 0:
                m7995();
                return;
            default:
                C3993 c3993 = this.f12646;
                c3993.f15398.m5423();
                synchronized (c3993.f15410) {
                    synchronized (this.f12647) {
                        try {
                            C3239 c3239 = this.f12647.f12669;
                            C3993 c39932 = this.f12646;
                            c3239.getClass();
                            if (c3239.f12635.contains(new C3236(c39932, AbstractC3740.f14499))) {
                                this.f12647.f12672.m7997();
                                C3246 c3246 = this.f12647;
                                C3993 c39933 = this.f12646;
                                c3246.getClass();
                                try {
                                    c39933.m9251(c3246.f12672, c3246.f12675, c3246.f12661);
                                    this.f12647.m8000(this.f12646);
                                } catch (Throwable th) {
                                    throw new C3238(th);
                                }
                            }
                            this.f12647.m8006();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                return;
        }
    }
}
