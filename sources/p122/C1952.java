package p122;

import ᵎﹳ.ᐧʻ;

/* renamed from: ˈי.ٴᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1952 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public String f7449;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public byte f7450;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public String f7451;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public int f7452;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public boolean f7453;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C1953 m5641() {
        String str;
        String str2;
        if (this.f7450 == 3 && (str = this.f7449) != null && (str2 = this.f7451) != null) {
            return new C1953(this.f7452, str, str2, this.f7453);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f7450 & 1) == 0) {
            sb.append(" platform");
        }
        if (this.f7449 == null) {
            sb.append(" version");
        }
        if (this.f7451 == null) {
            sb.append(" buildVersion");
        }
        if ((this.f7450 & 2) == 0) {
            sb.append(" jailbroken");
        }
        throw new IllegalStateException(ᐧʻ.ᴵʿ("Missing required properties:", sb));
    }
}
