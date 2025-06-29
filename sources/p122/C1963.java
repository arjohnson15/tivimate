package p122;

import ᵎﹳ.ᐧʻ;

/* renamed from: ˈי.ᵎʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1963 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f7493;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public byte f7494;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f7495;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public String f7496;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public boolean f7497;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C1913 m5643() {
        String str;
        if (this.f7494 == 7 && (str = this.f7496) != null) {
            return new C1913(this.f7493, this.f7495, str, this.f7497);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f7496 == null) {
            sb.append(" processName");
        }
        if ((this.f7494 & 1) == 0) {
            sb.append(" pid");
        }
        if ((this.f7494 & 2) == 0) {
            sb.append(" importance");
        }
        if ((this.f7494 & 4) == 0) {
            sb.append(" defaultProcess");
        }
        throw new IllegalStateException(ᐧʻ.ᴵʿ("Missing required properties:", sb));
    }
}
