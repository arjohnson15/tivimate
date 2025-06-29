package p406;

import p070.AbstractC1549;

/* renamed from: ﹳʿ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4649 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Object f17767;

    public C4649(Object obj) {
        this.f17767 = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4649) && AbstractC1549.m5138(this.f17767, ((C4649) obj).f17767);
    }

    public final int hashCode() {
        Object obj = this.f17767;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "NetworkRequestCompat(wrapped=" + this.f17767 + ')';
    }
}
