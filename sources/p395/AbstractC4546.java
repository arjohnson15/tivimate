package p395;

import sun.misc.Unsafe;

/* renamed from: ⁱـ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC4546 {
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static /* synthetic */ boolean m10417(Unsafe unsafe, AbstractC4541 abstractC4541, long j, C4545 c4545, C4545 c45452) {
        while (!unsafe.compareAndSwapObject(abstractC4541, j, c4545, c45452)) {
            if (unsafe.getObject(abstractC4541, j) != c4545) {
                return false;
            }
        }
        return true;
    }
}
