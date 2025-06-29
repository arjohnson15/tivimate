package p122;

import java.util.List;
import ᵎﹳ.ᐧʻ;

/* renamed from: ˈי.ˋˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1927 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public String f7320;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public Long f7321;

    /* renamed from: ˉי, reason: contains not printable characters */
    public C1944 f7322;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public int f7323;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public byte f7324;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public List f7325;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public C1949 f7326;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public String f7327;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public String f7328;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public boolean f7329;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public C1959 f7330;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public long f7331;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public C1953 f7332;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C1948 m5637() {
        String str;
        String str2;
        C1959 c1959;
        if (this.f7324 == 7 && (str = this.f7328) != null && (str2 = this.f7320) != null && (c1959 = this.f7330) != null) {
            return new C1948(str, str2, this.f7327, this.f7331, this.f7321, this.f7329, c1959, this.f7326, this.f7332, this.f7322, this.f7325, this.f7323);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f7328 == null) {
            sb.append(" generator");
        }
        if (this.f7320 == null) {
            sb.append(" identifier");
        }
        if ((this.f7324 & 1) == 0) {
            sb.append(" startedAt");
        }
        if ((this.f7324 & 2) == 0) {
            sb.append(" crashed");
        }
        if (this.f7330 == null) {
            sb.append(" app");
        }
        if ((this.f7324 & 4) == 0) {
            sb.append(" generatorType");
        }
        throw new IllegalStateException(ᐧʻ.ᴵʿ("Missing required properties:", sb));
    }
}
