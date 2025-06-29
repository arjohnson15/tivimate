package p395;

import sun.misc.Unsafe;

/* renamed from: ⁱـ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC4536 {
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static /* synthetic */ boolean m10400(Unsafe unsafe, AbstractC4541 abstractC4541, long j, C4532 c4532, C4532 c45322) {
        while (!unsafe.compareAndSwapObject(abstractC4541, j, c4532, c45322)) {
            if (unsafe.getObject(abstractC4541, j) != c4532) {
                return false;
            }
        }
        return true;
    }
}
