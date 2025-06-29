package p353;

import java.io.Serializable;
import java.util.List;

/* renamed from: ᵔʿ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4023 implements InterfaceC4016, Serializable {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final List f15472;

    public C4023(List list) {
        this.f15472 = list;
    }

    @Override // p353.InterfaceC4016
    public final boolean apply(Object obj) {
        int i = 0;
        while (true) {
            List list = this.f15472;
            if (i >= list.size()) {
                return true;
            }
            if (!((InterfaceC4016) list.get(i)).apply(obj)) {
                return false;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4023) {
            return this.f15472.equals(((C4023) obj).f15472);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15472.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z = true;
        for (Object obj : this.f15472) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
