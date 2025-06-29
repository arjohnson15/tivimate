package p122;

import java.util.List;
import ᵎﹳ.ᐧʻ;

/* renamed from: ˈי.ˆʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1915 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public String f7261;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public long f7262;

    /* renamed from: ˉי, reason: contains not printable characters */
    public byte f7263;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public String f7264;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f7265;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public int f7266;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public long f7267;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public long f7268;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int f7269;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public List f7270;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C1932 m5633() {
        String str;
        if (this.f7263 == 63 && (str = this.f7261) != null) {
            return new C1932(this.f7266, str, this.f7265, this.f7269, this.f7262, this.f7267, this.f7268, this.f7264, this.f7270);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f7263 & 1) == 0) {
            sb.append(" pid");
        }
        if (this.f7261 == null) {
            sb.append(" processName");
        }
        if ((this.f7263 & 2) == 0) {
            sb.append(" reasonCode");
        }
        if ((this.f7263 & 4) == 0) {
            sb.append(" importance");
        }
        if ((this.f7263 & 8) == 0) {
            sb.append(" pss");
        }
        if ((this.f7263 & 16) == 0) {
            sb.append(" rss");
        }
        if ((this.f7263 & 32) == 0) {
            sb.append(" timestamp");
        }
        throw new IllegalStateException(ᐧʻ.ᴵʿ("Missing required properties:", sb));
    }
}
