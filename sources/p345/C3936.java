package p345;

import java.io.Serializable;
import p036.C1259;

/* renamed from: ᵎᴵ.ˋˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3936 extends AbstractC3925 implements Serializable {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C1259 f15287;

    public C3936(C1259 c1259) {
        this.f15287 = c1259;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f15287.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3936) {
            return this.f15287.equals(((C3936) obj).f15287);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15287.hashCode();
    }

    public final String toString() {
        return this.f15287.toString();
    }
}
