package p122;

import ᵎﹳ.ᐧʻ;

/* renamed from: ˈי.יˋ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1947 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public String f7424;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public byte f7425;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public String f7426;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public C1919 f7427;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public long f7428;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C1905 m5639() {
        C1919 c1919;
        String str;
        String str2;
        if (this.f7425 == 1 && (c1919 = this.f7427) != null && (str = this.f7424) != null && (str2 = this.f7426) != null) {
            return new C1905(c1919, str, str2, this.f7428);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f7427 == null) {
            sb.append(" rolloutVariant");
        }
        if (this.f7424 == null) {
            sb.append(" parameterKey");
        }
        if (this.f7426 == null) {
            sb.append(" parameterValue");
        }
        if ((1 & this.f7425) == 0) {
            sb.append(" templateVersion");
        }
        throw new IllegalStateException(ᐧʻ.ᴵʿ("Missing required properties:", sb));
    }
}
