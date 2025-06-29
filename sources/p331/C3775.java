package p331;

import p070.AbstractC1549;
import ـˈ.ˉᵎ;

/* renamed from: ᴵﹳ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3775 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Long f14611;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f14612;

    public C3775(String str, Long l) {
        this.f14612 = str;
        this.f14611 = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3775)) {
            return false;
        }
        C3775 c3775 = (C3775) obj;
        return AbstractC1549.m5138(this.f14612, c3775.f14612) && AbstractC1549.m5138(this.f14611, c3775.f14611);
    }

    public final int hashCode() {
        int iHashCode = this.f14612.hashCode() * 31;
        Long l = this.f14611;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Preference(key=");
        sb.append(this.f14612);
        sb.append(", value=");
        return ˉᵎ.ˏᴵ(sb, this.f14611, ')');
    }
}
