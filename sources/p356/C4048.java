package p356;

import p383.AbstractC4470;

/* renamed from: ᵔˋ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4048 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f15576;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final String f15577;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String f15578;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f15579;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final String f15580;

    public C4048(String str, String str2, String str3, String str4, String str5) {
        this.f15579 = str;
        this.f15576 = str2;
        this.f15578 = str3;
        this.f15580 = str4;
        this.f15577 = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4048)) {
            return false;
        }
        C4048 c4048 = (C4048) obj;
        return AbstractC4470.m10194(this.f15579, c4048.f15579) && AbstractC4470.m10194(this.f15576, c4048.f15576) && AbstractC4470.m10194(this.f15578, c4048.f15578) && AbstractC4470.m10194(this.f15580, c4048.f15580) && AbstractC4470.m10194(this.f15577, c4048.f15577);
    }

    public final int hashCode() {
        String str = this.f15579;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f15576;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f15578;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f15580;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f15577;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
