package p122;

/* renamed from: ˈי.ᐧⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1958 extends AbstractC1920 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f7469;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final String f7470;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final String f7471;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final C1974 f7472;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final C1932 f7473;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final C1948 f7474;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final String f7475;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String f7476;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final String f7477;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final String f7478;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int f7479;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final String f7480;

    public C1958(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, C1948 c1948, C1974 c1974, C1932 c1932) {
        this.f7469 = str;
        this.f7476 = str2;
        this.f7479 = i;
        this.f7470 = str3;
        this.f7477 = str4;
        this.f7478 = str5;
        this.f7475 = str6;
        this.f7480 = str7;
        this.f7471 = str8;
        this.f7474 = c1948;
        this.f7472 = c1974;
        this.f7473 = c1932;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1920)) {
            return false;
        }
        C1958 c1958 = (C1958) ((AbstractC1920) obj);
        if (this.f7469.equals(c1958.f7469)) {
            if (this.f7476.equals(c1958.f7476) && this.f7479 == c1958.f7479 && this.f7470.equals(c1958.f7470)) {
                String str = c1958.f7477;
                String str2 = this.f7477;
                if (str2 != null ? str2.equals(str) : str == null) {
                    String str3 = c1958.f7478;
                    String str4 = this.f7478;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        String str5 = c1958.f7475;
                        String str6 = this.f7475;
                        if (str6 != null ? str6.equals(str5) : str5 == null) {
                            if (this.f7480.equals(c1958.f7480) && this.f7471.equals(c1958.f7471)) {
                                C1948 c1948 = c1958.f7474;
                                C1948 c19482 = this.f7474;
                                if (c19482 != null ? c19482.equals(c1948) : c1948 == null) {
                                    C1974 c1974 = c1958.f7472;
                                    C1974 c19742 = this.f7472;
                                    if (c19742 != null ? c19742.equals(c1974) : c1974 == null) {
                                        C1932 c1932 = c1958.f7473;
                                        C1932 c19322 = this.f7473;
                                        if (c19322 == null) {
                                            if (c1932 == null) {
                                                return true;
                                            }
                                        } else if (c19322.equals(c1932)) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f7469.hashCode() ^ 1000003) * 1000003) ^ this.f7476.hashCode()) * 1000003) ^ this.f7479) * 1000003) ^ this.f7470.hashCode()) * 1000003;
        String str = this.f7477;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f7478;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f7475;
        int iHashCode4 = (((((iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.f7480.hashCode()) * 1000003) ^ this.f7471.hashCode()) * 1000003;
        C1948 c1948 = this.f7474;
        int iHashCode5 = (iHashCode4 ^ (c1948 == null ? 0 : c1948.hashCode())) * 1000003;
        C1974 c1974 = this.f7472;
        int iHashCode6 = (iHashCode5 ^ (c1974 == null ? 0 : c1974.hashCode())) * 1000003;
        C1932 c1932 = this.f7473;
        return iHashCode6 ^ (c1932 != null ? c1932.hashCode() : 0);
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f7469 + ", gmpAppId=" + this.f7476 + ", platform=" + this.f7479 + ", installationUuid=" + this.f7470 + ", firebaseInstallationId=" + this.f7477 + ", firebaseAuthenticationToken=" + this.f7478 + ", appQualitySessionId=" + this.f7475 + ", buildVersion=" + this.f7480 + ", displayVersion=" + this.f7471 + ", session=" + this.f7474 + ", ndkPayload=" + this.f7472 + ", appExitInfo=" + this.f7473 + "}";
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C1918 m5642() {
        C1918 c1918 = new C1918();
        c1918.f7281 = this.f7469;
        c1918.f7273 = this.f7476;
        c1918.f7280 = this.f7479;
        c1918.f7284 = this.f7470;
        c1918.f7274 = this.f7477;
        c1918.f7282 = this.f7478;
        c1918.f7283 = this.f7475;
        c1918.f7279 = this.f7480;
        c1918.f7285 = this.f7471;
        c1918.f7275 = this.f7474;
        c1918.f7278 = this.f7472;
        c1918.f7276 = this.f7473;
        c1918.f7277 = (byte) 1;
        return c1918;
    }
}
