package p395;

import ˎˊ.ˏʾ;

/* renamed from: ⁱـ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4539 extends ˏʾ {
    /* renamed from: ˉי, reason: contains not printable characters */
    public final boolean m10401(AbstractC4541 abstractC4541, Object obj, Object obj2) {
        synchronized (abstractC4541) {
            try {
                if (abstractC4541.f17442 != obj) {
                    return false;
                }
                abstractC4541.f17442 = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final C4532 m10402(AbstractC4541 abstractC4541) {
        C4532 c4532;
        C4532 c45322 = C4532.f17419;
        synchronized (abstractC4541) {
            c4532 = abstractC4541.f17441;
            if (c4532 != c45322) {
                abstractC4541.f17441 = c45322;
            }
        }
        return c4532;
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final boolean m10403(AbstractC4541 abstractC4541, C4532 c4532, C4532 c45322) {
        synchronized (abstractC4541) {
            try {
                if (abstractC4541.f17441 != c4532) {
                    return false;
                }
                abstractC4541.f17441 = c45322;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final C4545 m10404(AbstractC4541 abstractC4541) {
        C4545 c4545;
        C4545 c45452 = C4545.f17445;
        synchronized (abstractC4541) {
            c4545 = abstractC4541.f17440;
            if (c4545 != c45452) {
                abstractC4541.f17440 = c45452;
            }
        }
        return c4545;
    }

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final void m10405(C4532 c4532, C4532 c45322) {
        c4532.f17420 = c45322;
    }

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final void m10406(C4532 c4532, Thread thread) {
        c4532.f17421 = thread;
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final boolean m10407(AbstractC4541 abstractC4541, C4545 c4545, C4545 c45452) {
        synchronized (abstractC4541) {
            try {
                if (abstractC4541.f17440 != c4545) {
                    return false;
                }
                abstractC4541.f17440 = c45452;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
