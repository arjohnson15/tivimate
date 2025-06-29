package p122;

import ᵎﹳ.ᐧʻ;

/* renamed from: ˈי.ˈٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1918 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public String f7273;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public String f7274;

    /* renamed from: ˉי, reason: contains not printable characters */
    public C1948 f7275;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public C1932 f7276;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public byte f7277;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public C1974 f7278;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public String f7279;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f7280;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public String f7281;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public String f7282;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public String f7283;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public String f7284;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public String f7285;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C1958 m5634() {
        if (this.f7277 == 1 && this.f7281 != null && this.f7273 != null && this.f7284 != null && this.f7279 != null && this.f7285 != null) {
            return new C1958(this.f7281, this.f7273, this.f7280, this.f7284, this.f7274, this.f7282, this.f7283, this.f7279, this.f7285, this.f7275, this.f7278, this.f7276);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f7281 == null) {
            sb.append(" sdkVersion");
        }
        if (this.f7273 == null) {
            sb.append(" gmpAppId");
        }
        if ((1 & this.f7277) == 0) {
            sb.append(" platform");
        }
        if (this.f7284 == null) {
            sb.append(" installationUuid");
        }
        if (this.f7279 == null) {
            sb.append(" buildVersion");
        }
        if (this.f7285 == null) {
            sb.append(" displayVersion");
        }
        throw new IllegalStateException(ᐧʻ.ᴵʿ("Missing required properties:", sb));
    }
}
