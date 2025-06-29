package p121;

import java.util.ArrayList;

/* renamed from: ˈˑ.ﹳˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1895 extends AbstractC1870 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final long f7198;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final String f7199;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C1891 f7200;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final long f7201;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final ArrayList f7202;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final Integer f7203;

    public C1895(long j, long j2, C1891 c1891, Integer num, String str, ArrayList arrayList) {
        EnumC1885 enumC1885 = EnumC1885.f7179;
        this.f7201 = j;
        this.f7198 = j2;
        this.f7200 = c1891;
        this.f7203 = num;
        this.f7199 = str;
        this.f7202 = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1870)) {
            return false;
        }
        C1895 c1895 = (C1895) ((AbstractC1870) obj);
        if (this.f7201 == c1895.f7201) {
            if (this.f7198 == c1895.f7198) {
                if (this.f7200.equals(c1895.f7200)) {
                    Integer num = c1895.f7203;
                    Integer num2 = this.f7203;
                    if (num2 != null ? num2.equals(num) : num == null) {
                        String str = c1895.f7199;
                        String str2 = this.f7199;
                        if (str2 != null ? str2.equals(str) : str == null) {
                            if (this.f7202.equals(c1895.f7202)) {
                                Object obj2 = EnumC1885.f7179;
                                if (obj2.equals(obj2)) {
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
        long j = this.f7201;
        long j2 = this.f7198;
        int iHashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f7200.hashCode()) * 1000003;
        Integer num = this.f7203;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f7199;
        return EnumC1885.f7179.hashCode() ^ ((((iHashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.f7202.hashCode()) * 1000003);
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f7201 + ", requestUptimeMs=" + this.f7198 + ", clientInfo=" + this.f7200 + ", logSource=" + this.f7203 + ", logSourceName=" + this.f7199 + ", logEvents=" + this.f7202 + ", qosTier=" + EnumC1885.f7179 + "}";
    }
}
