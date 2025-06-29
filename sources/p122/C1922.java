package p122;

import ᵎﹳ.ᐧʻ;

/* renamed from: ˈי.ˉᵎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1922 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f7302;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public long f7303;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public boolean f7304;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public Double f7305;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public long f7306;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public byte f7307;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int f7308;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C1979 m5635() {
        if (this.f7307 == 31) {
            return new C1979(this.f7305, this.f7302, this.f7304, this.f7308, this.f7303, this.f7306);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f7307 & 1) == 0) {
            sb.append(" batteryVelocity");
        }
        if ((this.f7307 & 2) == 0) {
            sb.append(" proximityOn");
        }
        if ((this.f7307 & 4) == 0) {
            sb.append(" orientation");
        }
        if ((this.f7307 & 8) == 0) {
            sb.append(" ramUsed");
        }
        if ((this.f7307 & 16) == 0) {
            sb.append(" diskUsed");
        }
        throw new IllegalStateException(ᐧʻ.ᴵʿ("Missing required properties:", sb));
    }
}
