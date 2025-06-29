package p322;

import p070.AbstractC1549;
import ـˈ.ˉᵎ;

/* renamed from: ᴵˉ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3676 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Double f14091;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final Long f14092;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Integer f14093;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Boolean f14094;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final Integer f14095;

    public C3676(Boolean bool, Double d, Integer num, Integer num2, Long l) {
        this.f14094 = bool;
        this.f14091 = d;
        this.f14093 = num;
        this.f14095 = num2;
        this.f14092 = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3676)) {
            return false;
        }
        C3676 c3676 = (C3676) obj;
        return AbstractC1549.m5138(this.f14094, c3676.f14094) && AbstractC1549.m5138(this.f14091, c3676.f14091) && AbstractC1549.m5138(this.f14093, c3676.f14093) && AbstractC1549.m5138(this.f14095, c3676.f14095) && AbstractC1549.m5138(this.f14092, c3676.f14092);
    }

    public final int hashCode() {
        Boolean bool = this.f14094;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d = this.f14091;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.f14093;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f14095;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.f14092;
        return iHashCode4 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionConfigs(sessionEnabled=");
        sb.append(this.f14094);
        sb.append(", sessionSamplingRate=");
        sb.append(this.f14091);
        sb.append(", sessionRestartTimeout=");
        sb.append(this.f14093);
        sb.append(", cacheDuration=");
        sb.append(this.f14095);
        sb.append(", cacheUpdatedTime=");
        return ˉᵎ.ˏᴵ(sb, this.f14092, ')');
    }
}
