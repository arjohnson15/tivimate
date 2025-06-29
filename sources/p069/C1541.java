package p069;

import p080.AbstractC1702;
import ˆʽ.ᵎˏ;

/* renamed from: ʾﾞ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1541 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f6260;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final long f6261;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String f6262;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f6263;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final long f6264;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final String f6265;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final String f6266;

    public C1541(String str, int i, String str2, String str3, long j, long j2, String str4) {
        this.f6263 = str;
        this.f6260 = i;
        this.f6262 = str2;
        this.f6266 = str3;
        this.f6261 = j;
        this.f6264 = j2;
        this.f6265 = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1541)) {
            return false;
        }
        C1541 c1541 = (C1541) obj;
        String str = this.f6263;
        if (str != null ? str.equals(c1541.f6263) : c1541.f6263 == null) {
            if (AbstractC1702.m5410(this.f6260, c1541.f6260)) {
                String str2 = c1541.f6262;
                String str3 = this.f6262;
                if (str3 != null ? str3.equals(str2) : str2 == null) {
                    String str4 = c1541.f6266;
                    String str5 = this.f6266;
                    if (str5 != null ? str5.equals(str4) : str4 == null) {
                        if (this.f6261 == c1541.f6261 && this.f6264 == c1541.f6264) {
                            String str6 = c1541.f6265;
                            String str7 = this.f6265;
                            if (str7 == null) {
                                if (str6 == null) {
                                    return true;
                                }
                            } else if (str7.equals(str6)) {
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
        String str = this.f6263;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ AbstractC1702.m5411(this.f6260)) * 1000003;
        String str2 = this.f6262;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f6266;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j = this.f6261;
        int i = (iHashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f6264;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.f6265;
        return (str4 != null ? str4.hashCode() : 0) ^ i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.f6263);
        sb.append(", registrationStatus=");
        int i = this.f6260;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "REGISTER_ERROR" : "REGISTERED" : "UNREGISTERED" : "NOT_GENERATED" : "ATTEMPT_MIGRATION");
        sb.append(", authToken=");
        sb.append(this.f6262);
        sb.append(", refreshToken=");
        sb.append(this.f6266);
        sb.append(", expiresInSecs=");
        sb.append(this.f6261);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.f6264);
        sb.append(", fisError=");
        return ᵎˏ.ˎٴ(sb, this.f6265, "}");
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C1543 m5128() {
        C1543 c1543 = new C1543();
        c1543.f6273 = this.f6263;
        c1543.f6270 = this.f6260;
        c1543.f6272 = this.f6262;
        c1543.f6276 = this.f6266;
        c1543.f6271 = Long.valueOf(this.f6261);
        c1543.f6274 = Long.valueOf(this.f6264);
        c1543.f6275 = this.f6265;
        return c1543;
    }
}
