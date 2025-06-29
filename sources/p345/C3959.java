package p345;

import java.io.Serializable;

/* renamed from: ᵎᴵ.ٴﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3959 extends AbstractC3925 implements Serializable {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final AbstractC3925 f15330;

    public C3959(AbstractC3925 abstractC3925) {
        this.f15330 = abstractC3925;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f15330.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3959) {
            return this.f15330.equals(((C3959) obj).f15330);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f15330.hashCode();
    }

    public final String toString() {
        return this.f15330 + ".reverse()";
    }

    @Override // p345.AbstractC3925
    /* renamed from: ـﹶ */
    public final AbstractC3925 mo9123() {
        return this.f15330;
    }
}
