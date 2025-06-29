package p166;

import java.util.Collections;
import java.util.List;
import p345.AbstractC3980;
import p383.AbstractC4470;

/* renamed from: ˊﹶ.ᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2432 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AbstractC3980 f9694;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C2433 f9695;

    static {
        AbstractC4470.m10164(0);
        AbstractC4470.m10164(1);
    }

    public C2432(C2433 c2433, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= c2433.f9699)) {
            throw new IndexOutOfBoundsException();
        }
        this.f9695 = c2433;
        this.f9694 = AbstractC3980.m9209(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2432.class != obj.getClass()) {
            return false;
        }
        C2432 c2432 = (C2432) obj;
        return this.f9695.equals(c2432.f9695) && this.f9694.equals(c2432.f9694);
    }

    public final int hashCode() {
        return (this.f9694.hashCode() * 31) + this.f9695.hashCode();
    }
}
