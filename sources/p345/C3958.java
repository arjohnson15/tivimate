package p345;

import java.io.Serializable;

/* renamed from: ᵎᴵ.ٴᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3958 extends AbstractC3925 implements Serializable {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static final C3958 f15329 = new C3958();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }

    @Override // p345.AbstractC3925
    /* renamed from: ـﹶ */
    public final AbstractC3925 mo9123() {
        return C3965.f15337;
    }
}
