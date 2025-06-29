package p122;

import ᵎﹳ.ᐧʻ;

/* renamed from: ˈי.ˑⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1943 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public String f7403;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public C1931 f7404;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public C1934 f7405;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public long f7406;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public C1908 f7407;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public byte f7408;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public C1979 f7409;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C1976 m5638() {
        String str;
        C1934 c1934;
        C1979 c1979;
        if (this.f7408 == 1 && (str = this.f7403) != null && (c1934 = this.f7405) != null && (c1979 = this.f7409) != null) {
            return new C1976(this.f7406, str, c1934, c1979, this.f7404, this.f7407);
        }
        StringBuilder sb = new StringBuilder();
        if ((1 & this.f7408) == 0) {
            sb.append(" timestamp");
        }
        if (this.f7403 == null) {
            sb.append(" type");
        }
        if (this.f7405 == null) {
            sb.append(" app");
        }
        if (this.f7409 == null) {
            sb.append(" device");
        }
        throw new IllegalStateException(ᐧʻ.ᴵʿ("Missing required properties:", sb));
    }
}
