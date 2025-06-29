package p122;

import ˆʽ.ᵎˏ;

/* renamed from: ˈי.ᴵʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1959 extends AbstractC1917 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f7481;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final String f7482;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String f7483;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f7484;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final String f7485;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final String f7486;

    public C1959(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f7484 = str;
        this.f7481 = str2;
        this.f7483 = str3;
        this.f7486 = str4;
        this.f7482 = str5;
        this.f7485 = str6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1917)) {
            return false;
        }
        AbstractC1917 abstractC1917 = (AbstractC1917) obj;
        if (this.f7484.equals(((C1959) abstractC1917).f7484)) {
            C1959 c1959 = (C1959) abstractC1917;
            if (this.f7481.equals(c1959.f7481)) {
                String str = c1959.f7483;
                String str2 = this.f7483;
                if (str2 != null ? str2.equals(str) : str == null) {
                    String str3 = c1959.f7486;
                    String str4 = this.f7486;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        String str5 = c1959.f7482;
                        String str6 = this.f7482;
                        if (str6 != null ? str6.equals(str5) : str5 == null) {
                            String str7 = c1959.f7485;
                            String str8 = this.f7485;
                            if (str8 == null) {
                                if (str7 == null) {
                                    return true;
                                }
                            } else if (str8.equals(str7)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f7484.hashCode() ^ 1000003) * 1000003) ^ this.f7481.hashCode()) * 1000003;
        String str = this.f7483;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * (-721379959);
        String str2 = this.f7486;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f7482;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f7485;
        return iHashCode4 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{identifier=");
        sb.append(this.f7484);
        sb.append(", version=");
        sb.append(this.f7481);
        sb.append(", displayVersion=");
        sb.append(this.f7483);
        sb.append(", organization=null, installationUuid=");
        sb.append(this.f7486);
        sb.append(", developmentPlatform=");
        sb.append(this.f7482);
        sb.append(", developmentPlatformVersion=");
        return ᵎˏ.ˎٴ(sb, this.f7485, "}");
    }
}
