package p121;

import java.util.Arrays;

/* renamed from: ˈˑ.ᵎˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1892 extends AbstractC1889 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Integer f7186;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final byte[] f7187;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final C1875 f7188;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C1880 f7189;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final long f7190;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final String f7191;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final long f7192;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final long f7193;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final C1883 f7194;

    public C1892(long j, Integer num, C1880 c1880, long j2, byte[] bArr, String str, long j3, C1875 c1875, C1883 c1883) {
        this.f7190 = j;
        this.f7186 = num;
        this.f7189 = c1880;
        this.f7193 = j2;
        this.f7187 = bArr;
        this.f7191 = str;
        this.f7192 = j3;
        this.f7188 = c1875;
        this.f7194 = c1883;
    }

    public final boolean equals(Object obj) {
        Integer num;
        C1880 c1880;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1889)) {
            return false;
        }
        AbstractC1889 abstractC1889 = (AbstractC1889) obj;
        C1892 c1892 = (C1892) abstractC1889;
        if (this.f7190 == c1892.f7190 && ((num = this.f7186) != null ? num.equals(c1892.f7186) : c1892.f7186 == null) && ((c1880 = this.f7189) != null ? c1880.equals(c1892.f7189) : c1892.f7189 == null)) {
            if (this.f7193 == c1892.f7193) {
                if (Arrays.equals(this.f7187, abstractC1889 instanceof C1892 ? ((C1892) abstractC1889).f7187 : c1892.f7187)) {
                    String str = c1892.f7191;
                    String str2 = this.f7191;
                    if (str2 != null ? str2.equals(str) : str == null) {
                        if (this.f7192 == c1892.f7192) {
                            C1875 c1875 = c1892.f7188;
                            C1875 c18752 = this.f7188;
                            if (c18752 != null ? c18752.equals(c1875) : c1875 == null) {
                                C1883 c1883 = c1892.f7194;
                                C1883 c18832 = this.f7194;
                                if (c18832 == null) {
                                    if (c1883 == null) {
                                        return true;
                                    }
                                } else if (c18832.equals(c1883)) {
                                    return true;
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
        long j = this.f7190;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f7186;
        int iHashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        C1880 c1880 = this.f7189;
        int iHashCode2 = (iHashCode ^ (c1880 == null ? 0 : c1880.hashCode())) * 1000003;
        long j2 = this.f7193;
        int iHashCode3 = (((iHashCode2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f7187)) * 1000003;
        String str = this.f7191;
        int iHashCode4 = (iHashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.f7192;
        int i2 = (iHashCode4 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        C1875 c1875 = this.f7188;
        int iHashCode5 = (i2 ^ (c1875 == null ? 0 : c1875.hashCode())) * 1000003;
        C1883 c1883 = this.f7194;
        return iHashCode5 ^ (c1883 != null ? c1883.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f7190 + ", eventCode=" + this.f7186 + ", complianceData=" + this.f7189 + ", eventUptimeMs=" + this.f7193 + ", sourceExtension=" + Arrays.toString(this.f7187) + ", sourceExtensionJsonProto3=" + this.f7191 + ", timezoneOffsetSeconds=" + this.f7192 + ", networkConnectionInfo=" + this.f7188 + ", experimentIds=" + this.f7194 + "}";
    }
}
