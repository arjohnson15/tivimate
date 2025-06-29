package p122;

import ᵎﹳ.ᐧʻ;

/* renamed from: ˈי.ʾʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1911 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public String f7242;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public long f7243;

    /* renamed from: ˉי, reason: contains not printable characters */
    public byte f7244;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public String f7245;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f7246;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public int f7247;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public boolean f7248;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public int f7249;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public long f7250;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public String f7251;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C1944 m5632() {
        String str;
        String str2;
        String str3;
        if (this.f7244 == 63 && (str = this.f7242) != null && (str2 = this.f7245) != null && (str3 = this.f7251) != null) {
            return new C1944(this.f7247, str, this.f7246, this.f7250, this.f7243, this.f7248, this.f7249, str2, str3);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f7244 & 1) == 0) {
            sb.append(" arch");
        }
        if (this.f7242 == null) {
            sb.append(" model");
        }
        if ((this.f7244 & 2) == 0) {
            sb.append(" cores");
        }
        if ((this.f7244 & 4) == 0) {
            sb.append(" ram");
        }
        if ((this.f7244 & 8) == 0) {
            sb.append(" diskSpace");
        }
        if ((this.f7244 & 16) == 0) {
            sb.append(" simulator");
        }
        if ((this.f7244 & 32) == 0) {
            sb.append(" state");
        }
        if (this.f7245 == null) {
            sb.append(" manufacturer");
        }
        if (this.f7251 == null) {
            sb.append(" modelClass");
        }
        throw new IllegalStateException(ᐧʻ.ᴵʿ("Missing required properties:", sb));
    }
}
