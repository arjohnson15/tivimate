package p148;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: ˊʻ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C2259 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8985 = AtomicReferenceFieldUpdater.newUpdater(C2259.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new C2260(8, false);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m6262() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8985;
            C2260 c2260 = (C2260) atomicReferenceFieldUpdater.get(this);
            if (c2260.m6266()) {
                return;
            }
            C2260 c2260M6267 = c2260.m6267();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c2260, c2260M6267) && atomicReferenceFieldUpdater.get(this) == c2260) {
            }
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int m6263() {
        C2260 c2260 = (C2260) f8985.get(this);
        c2260.getClass();
        long j = C2260.f8987.get(c2260);
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j)));
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final boolean m6264(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8985;
            C2260 c2260 = (C2260) atomicReferenceFieldUpdater.get(this);
            int iM6268 = c2260.m6268(runnable);
            if (iM6268 == 0) {
                return true;
            }
            if (iM6268 == 1) {
                C2260 c2260M6267 = c2260.m6267();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, c2260, c2260M6267) && atomicReferenceFieldUpdater.get(this) == c2260) {
                }
            } else if (iM6268 == 2) {
                return false;
            }
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final Object m6265() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8985;
            C2260 c2260 = (C2260) atomicReferenceFieldUpdater.get(this);
            Object objM6269 = c2260.m6269();
            if (objM6269 != C2260.f8988) {
                return objM6269;
            }
            C2260 c2260M6267 = c2260.m6267();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c2260, c2260M6267) && atomicReferenceFieldUpdater.get(this) == c2260) {
            }
        }
    }
}
