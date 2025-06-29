package p331;

import p070.AbstractC1549;
import ˆʽ.ᵎˏ;

/* renamed from: ᴵﹳ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3770 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f14588;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int f14589;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f14590;

    public C3770(int i, int i2, String str) {
        this.f14590 = str;
        this.f14588 = i;
        this.f14589 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3770)) {
            return false;
        }
        C3770 c3770 = (C3770) obj;
        return AbstractC1549.m5138(this.f14590, c3770.f14590) && this.f14588 == c3770.f14588 && this.f14589 == c3770.f14589;
    }

    public final int hashCode() {
        return (((this.f14590.hashCode() * 31) + this.f14588) * 31) + this.f14589;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SystemIdInfo(workSpecId=");
        sb.append(this.f14590);
        sb.append(", generation=");
        sb.append(this.f14588);
        sb.append(", systemId=");
        return ᵎˏ.ᵎـ(sb, this.f14589, ')');
    }
}
