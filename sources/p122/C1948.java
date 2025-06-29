package p122;

import java.util.List;
import p447.AbstractC5179;

/* renamed from: ˈי.ـˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1948 extends AbstractC1906 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f7429;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final Long f7430;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final C1944 f7431;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final int f7432;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final List f7433;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final C1949 f7434;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String f7435;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f7436;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final boolean f7437;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final C1959 f7438;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final long f7439;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final C1953 f7440;

    public C1948(String str, String str2, String str3, long j, Long l, boolean z, C1959 c1959, C1949 c1949, C1953 c1953, C1944 c1944, List list, int i) {
        this.f7436 = str;
        this.f7429 = str2;
        this.f7435 = str3;
        this.f7439 = j;
        this.f7430 = l;
        this.f7437 = z;
        this.f7438 = c1959;
        this.f7434 = c1949;
        this.f7440 = c1953;
        this.f7431 = c1944;
        this.f7433 = list;
        this.f7432 = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1906)) {
            return false;
        }
        C1948 c1948 = (C1948) ((AbstractC1906) obj);
        if (this.f7436.equals(c1948.f7436)) {
            if (this.f7429.equals(c1948.f7429)) {
                String str = c1948.f7435;
                String str2 = this.f7435;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.f7439 == c1948.f7439) {
                        Long l = c1948.f7430;
                        Long l2 = this.f7430;
                        if (l2 != null ? l2.equals(l) : l == null) {
                            if (this.f7437 == c1948.f7437 && this.f7438.equals(c1948.f7438)) {
                                C1949 c1949 = c1948.f7434;
                                C1949 c19492 = this.f7434;
                                if (c19492 != null ? c19492.equals(c1949) : c1949 == null) {
                                    C1953 c1953 = c1948.f7440;
                                    C1953 c19532 = this.f7440;
                                    if (c19532 != null ? c19532.equals(c1953) : c1953 == null) {
                                        C1944 c1944 = c1948.f7431;
                                        C1944 c19442 = this.f7431;
                                        if (c19442 != null ? c19442.equals(c1944) : c1944 == null) {
                                            List list = c1948.f7433;
                                            List list2 = this.f7433;
                                            if (list2 != null ? list2.equals(list) : list == null) {
                                                if (this.f7432 == c1948.f7432) {
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
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f7436.hashCode() ^ 1000003) * 1000003) ^ this.f7429.hashCode()) * 1000003;
        String str = this.f7435;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j = this.f7439;
        int i = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Long l = this.f7430;
        int iHashCode3 = (((((i ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (this.f7437 ? 1231 : 1237)) * 1000003) ^ this.f7438.hashCode()) * 1000003;
        C1949 c1949 = this.f7434;
        int iHashCode4 = (iHashCode3 ^ (c1949 == null ? 0 : c1949.hashCode())) * 1000003;
        C1953 c1953 = this.f7440;
        int iHashCode5 = (iHashCode4 ^ (c1953 == null ? 0 : c1953.hashCode())) * 1000003;
        C1944 c1944 = this.f7431;
        int iHashCode6 = (iHashCode5 ^ (c1944 == null ? 0 : c1944.hashCode())) * 1000003;
        List list = this.f7433;
        return ((iHashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003) ^ this.f7432;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Session{generator=");
        sb.append(this.f7436);
        sb.append(", identifier=");
        sb.append(this.f7429);
        sb.append(", appQualitySessionId=");
        sb.append(this.f7435);
        sb.append(", startedAt=");
        sb.append(this.f7439);
        sb.append(", endedAt=");
        sb.append(this.f7430);
        sb.append(", crashed=");
        sb.append(this.f7437);
        sb.append(", app=");
        sb.append(this.f7438);
        sb.append(", user=");
        sb.append(this.f7434);
        sb.append(", os=");
        sb.append(this.f7440);
        sb.append(", device=");
        sb.append(this.f7431);
        sb.append(", events=");
        sb.append(this.f7433);
        sb.append(", generatorType=");
        return AbstractC5179.m11550(sb, this.f7432, "}");
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C1927 m5640() {
        C1927 c1927 = new C1927();
        c1927.f7328 = this.f7436;
        c1927.f7320 = this.f7429;
        c1927.f7327 = this.f7435;
        c1927.f7331 = this.f7439;
        c1927.f7321 = this.f7430;
        c1927.f7329 = this.f7437;
        c1927.f7330 = this.f7438;
        c1927.f7326 = this.f7434;
        c1927.f7332 = this.f7440;
        c1927.f7322 = this.f7431;
        c1927.f7325 = this.f7433;
        c1927.f7323 = this.f7432;
        c1927.f7324 = (byte) 7;
        return c1927;
    }
}
