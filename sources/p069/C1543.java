package p069;

import ᵎﹳ.ᐧʻ;

/* renamed from: ʾﾞ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1543 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f6270;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public Long f6271;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public String f6272;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public String f6273;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public Long f6274;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public String f6275;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public String f6276;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C1541 m5131() {
        String strConcat = this.f6270 == 0 ? " registrationStatus" : "";
        if (this.f6271 == null) {
            strConcat = strConcat.concat(" expiresInSecs");
        }
        if (this.f6274 == null) {
            strConcat = ᐧʻ.ˉⁱ(strConcat, " tokenCreationEpochInSecs");
        }
        if (strConcat.isEmpty()) {
            return new C1541(this.f6273, this.f6270, this.f6272, this.f6276, this.f6271.longValue(), this.f6274.longValue(), this.f6275);
        }
        throw new IllegalStateException("Missing required properties:".concat(strConcat));
    }
}
