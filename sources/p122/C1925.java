package p122;

import ᵎﹳ.ᐧʻ;

/* renamed from: ˈי.ˊᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1925 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public String f7314;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f7315;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public String f7316;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public long f7317;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public byte f7318;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public long f7319;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C1930 m5636() {
        String str;
        if (this.f7318 == 7 && (str = this.f7314) != null) {
            return new C1930(this.f7317, str, this.f7316, this.f7319, this.f7315);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f7318 & 1) == 0) {
            sb.append(" pc");
        }
        if (this.f7314 == null) {
            sb.append(" symbol");
        }
        if ((this.f7318 & 2) == 0) {
            sb.append(" offset");
        }
        if ((this.f7318 & 4) == 0) {
            sb.append(" importance");
        }
        throw new IllegalStateException(ᐧʻ.ᴵʿ("Missing required properties:", sb));
    }
}
