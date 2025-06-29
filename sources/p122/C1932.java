package p122;

import java.util.List;

/* renamed from: ˈי.ˎˑ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1932 extends AbstractC1992 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f7350;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final long f7351;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final String f7352;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int f7353;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f7354;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final long f7355;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final long f7356;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int f7357;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final List f7358;

    public C1932(int i, String str, int i2, int i3, long j, long j2, long j3, String str2, List list) {
        this.f7354 = i;
        this.f7350 = str;
        this.f7353 = i2;
        this.f7357 = i3;
        this.f7351 = j;
        this.f7355 = j2;
        this.f7356 = j3;
        this.f7352 = str2;
        this.f7358 = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1992)) {
            return false;
        }
        AbstractC1992 abstractC1992 = (AbstractC1992) obj;
        if (this.f7354 == ((C1932) abstractC1992).f7354) {
            C1932 c1932 = (C1932) abstractC1992;
            if (this.f7350.equals(c1932.f7350) && this.f7353 == c1932.f7353 && this.f7357 == c1932.f7357 && this.f7351 == c1932.f7351 && this.f7355 == c1932.f7355 && this.f7356 == c1932.f7356) {
                String str = c1932.f7352;
                String str2 = this.f7352;
                if (str2 != null ? str2.equals(str) : str == null) {
                    List list = c1932.f7358;
                    List list2 = this.f7358;
                    if (list2 == null) {
                        if (list == null) {
                            return true;
                        }
                    } else if (list2.equals(list)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f7354 ^ 1000003) * 1000003) ^ this.f7350.hashCode()) * 1000003) ^ this.f7353) * 1000003) ^ this.f7357) * 1000003;
        long j = this.f7351;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f7355;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.f7356;
        int i3 = (i2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        String str = this.f7352;
        int iHashCode2 = (i3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f7358;
        return iHashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f7354 + ", processName=" + this.f7350 + ", reasonCode=" + this.f7353 + ", importance=" + this.f7357 + ", pss=" + this.f7351 + ", rss=" + this.f7355 + ", timestamp=" + this.f7356 + ", traceFile=" + this.f7352 + ", buildIdMappingForArch=" + this.f7358 + "}";
    }
}
