package com.google.android.gms.internal.play_billing;

import android.support.v4.media.session.AbstractC0002;

/* renamed from: com.google.android.gms.internal.play_billing.ʿˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0599 extends C0615 {

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final int f2965;

    public C0599(int i, byte[] bArr) {
        super(bArr);
        C0615.m2622(0, i, bArr.length);
        this.f2965 = i;
    }

    @Override // com.google.android.gms.internal.play_billing.C0615
    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final byte mo2573(int i) {
        return this.f2984[i];
    }

    @Override // com.google.android.gms.internal.play_billing.C0615
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final int mo2574() {
        return this.f2965;
    }

    @Override // com.google.android.gms.internal.play_billing.C0615
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final byte mo2575(int i) {
        int i2 = this.f2965;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.f2984[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(ـˈ.ˉᵎ.ˉⁱ("Index < 0: ", i));
        }
        throw new ArrayIndexOutOfBoundsException(AbstractC0002.m55(i, i2, "Index > length: ", ", "));
    }
}
