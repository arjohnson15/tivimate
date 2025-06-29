package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ﾞᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0580 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public boolean f2942;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f2943;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public String f2944;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public byte f2945;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C0327 m2528() {
        if (this.f2945 == 3 && this.f2944 != null && this.f2943 != 0) {
            return new C0327(this.f2944, this.f2942, this.f2943);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f2944 == null) {
            sb.append(" fileOwner");
        }
        if ((this.f2945 & 1) == 0) {
            sb.append(" hasDifferentDmaOwner");
        }
        if ((this.f2945 & 2) == 0) {
            sb.append(" skipChecks");
        }
        if (this.f2943 == 0) {
            sb.append(" filePurpose");
        }
        throw new IllegalStateException("Missing required properties:".concat(String.valueOf(sb)));
    }
}
