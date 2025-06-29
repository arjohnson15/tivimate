package p141;

import android.net.Uri;
import p345.AbstractC3968;
import p345.C3930;
import p345.C3932;
import p383.AbstractC4470;

/* renamed from: ˉˑ.ᐧˋ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2207 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C3932 f8699;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final String f8700;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final String f8701;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final String f8702;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final String f8703;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final String f8704;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String f8705;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3930 f8706;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final int f8707;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final Uri f8708;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final String f8709;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final String f8710;

    public C2207(C2196 c2196) {
        this.f8706 = C3930.m9140(c2196.f8638);
        this.f8699 = c2196.f8631.m9167();
        String str = c2196.f8641;
        int i = AbstractC4470.f17202;
        this.f8705 = str;
        this.f8709 = c2196.f8632;
        this.f8700 = c2196.f8639;
        this.f8708 = c2196.f8640;
        this.f8704 = c2196.f8636;
        this.f8707 = c2196.f8637;
        this.f8710 = c2196.f8642;
        this.f8701 = c2196.f8635;
        this.f8703 = c2196.f8634;
        this.f8702 = c2196.f8633;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2207.class != obj.getClass()) {
            return false;
        }
        C2207 c2207 = (C2207) obj;
        if (this.f8707 == c2207.f8707) {
            C3930 c3930 = this.f8706;
            c3930.getClass();
            if (AbstractC3968.m9186(c3930, c2207.f8706) && this.f8699.equals(c2207.f8699) && AbstractC4470.m10194(this.f8709, c2207.f8709) && AbstractC4470.m10194(this.f8705, c2207.f8705) && AbstractC4470.m10194(this.f8700, c2207.f8700) && AbstractC4470.m10194(this.f8702, c2207.f8702) && AbstractC4470.m10194(this.f8708, c2207.f8708) && AbstractC4470.m10194(this.f8701, c2207.f8701) && AbstractC4470.m10194(this.f8703, c2207.f8703) && AbstractC4470.m10194(this.f8704, c2207.f8704) && AbstractC4470.m10194(this.f8710, c2207.f8710)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f8699.hashCode() + ((this.f8706.hashCode() + 217) * 31)) * 31;
        String str = this.f8709;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f8705;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f8700;
        int iHashCode4 = (((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f8707) * 31;
        String str4 = this.f8702;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Uri uri = this.f8708;
        int iHashCode6 = (iHashCode5 + (uri == null ? 0 : uri.hashCode())) * 31;
        String str5 = this.f8701;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f8703;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f8704;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f8710;
        return iHashCode9 + (str8 != null ? str8.hashCode() : 0);
    }
}
