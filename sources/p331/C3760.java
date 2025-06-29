package p331;

import p070.AbstractC1549;
import ˆʽ.ᵎˏ;

/* renamed from: ᴵﹳ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3760 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f14525;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f14526;

    public C3760(String str, int i) {
        this.f14526 = str;
        this.f14525 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3760)) {
            return false;
        }
        C3760 c3760 = (C3760) obj;
        return AbstractC1549.m5138(this.f14526, c3760.f14526) && this.f14525 == c3760.f14525;
    }

    public final int hashCode() {
        return (this.f14526.hashCode() * 31) + this.f14525;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb.append(this.f14526);
        sb.append(", generation=");
        return ᵎˏ.ᵎـ(sb, this.f14525, ')');
    }
}
