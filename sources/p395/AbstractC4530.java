package p395;

import sun.misc.Unsafe;

/* renamed from: ⁱـ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC4530 {
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static /* synthetic */ boolean m10312(Unsafe unsafe, AbstractC4541 abstractC4541, long j, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(abstractC4541, j, obj, obj2)) {
            if (unsafe.getObject(abstractC4541, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
