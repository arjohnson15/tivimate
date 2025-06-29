package p353;

import java.io.Serializable;
import java.util.Arrays;
import ⁱـ.ˑי;

/* renamed from: ᵔʿ.ˏᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4015 implements InterfaceC4012, Serializable {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Object f15465;

    public C4015(Object obj) {
        this.f15465 = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4015) {
            return ˑי.ﹶˆ(this.f15465, ((C4015) obj).f15465);
        }
        return false;
    }

    @Override // p353.InterfaceC4012
    public final Object get() {
        return this.f15465;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15465});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.f15465 + ")";
    }
}
