package p141;

import p041.C1283;
import p345.AbstractC3968;
import p345.C3930;
import p383.AbstractC4470;
import ˆʽ.ᵎˏ;

/* renamed from: ˉˑ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2186 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f8584;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final int f8585;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final C2204 f8586;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final String f8587;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String f8588;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f8589;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final String f8590;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final String f8591;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int f8592;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final C3930 f8593;

    public C2186(C1283 c1283, C3930 c3930, C2204 c2204) {
        this.f8589 = (String) c1283.f5279;
        this.f8584 = c1283.f5276;
        this.f8588 = (String) c1283.f5273;
        this.f8592 = c1283.f5272;
        this.f8590 = (String) c1283.f5278;
        this.f8591 = (String) c1283.f5274;
        this.f8585 = c1283.f5275;
        this.f8587 = (String) c1283.f5280;
        this.f8593 = c3930;
        this.f8586 = c2204;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2186.class != obj.getClass()) {
            return false;
        }
        C2186 c2186 = (C2186) obj;
        if (this.f8589.equals(c2186.f8589) && this.f8584 == c2186.f8584 && this.f8588.equals(c2186.f8588) && this.f8592 == c2186.f8592 && this.f8585 == c2186.f8585) {
            C3930 c3930 = this.f8593;
            c3930.getClass();
            if (AbstractC3968.m9186(c3930, c2186.f8593) && this.f8586.equals(c2186.f8586) && AbstractC4470.m10194(this.f8590, c2186.f8590) && AbstractC4470.m10194(this.f8591, c2186.f8591) && AbstractC4470.m10194(this.f8587, c2186.f8587)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f8586.hashCode() + ((this.f8593.hashCode() + ((((ᵎˏ.ˏʾ((ᵎˏ.ˏʾ(217, 31, this.f8589) + this.f8584) * 31, 31, this.f8588) + this.f8592) * 31) + this.f8585) * 31)) * 31)) * 31;
        String str = this.f8590;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f8591;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f8587;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
