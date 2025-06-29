package p345;

import java.io.Serializable;
import java.util.Arrays;
import p353.InterfaceC4019;

/* renamed from: ᵎᴵ.ˑי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3949 extends AbstractC3925 implements Serializable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final AbstractC3925 f15307;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final InterfaceC4019 f15308;

    public C3949(InterfaceC4019 interfaceC4019, AbstractC3925 abstractC3925) {
        this.f15308 = interfaceC4019;
        abstractC3925.getClass();
        this.f15307 = abstractC3925;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        InterfaceC4019 interfaceC4019 = this.f15308;
        return this.f15307.compare(interfaceC4019.apply(obj), interfaceC4019.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3949)) {
            return false;
        }
        C3949 c3949 = (C3949) obj;
        return this.f15308.equals(c3949.f15308) && this.f15307.equals(c3949.f15307);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15308, this.f15307});
    }

    public final String toString() {
        return this.f15307 + ".onResultOf(" + this.f15308 + ")";
    }
}
