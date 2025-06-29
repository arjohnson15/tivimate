package com.google.android.gms.internal.measurement;

import android.support.v4.media.session.AbstractC0002;

/* renamed from: com.google.android.gms.internal.measurement.ﾞʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0574 extends C0315 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final int f2938;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final int f2939;

    public C0574(byte[] bArr, int i, int i2) {
        super(bArr);
        C0315.m1832(i, i + i2, bArr.length);
        this.f2938 = i;
        this.f2939 = i2;
    }

    @Override // com.google.android.gms.internal.measurement.C0315
    /* renamed from: ˉי */
    public final int mo1834() {
        return this.f2939;
    }

    @Override // com.google.android.gms.internal.measurement.C0315
    /* renamed from: ˉⁱ */
    public final int mo1835() {
        return this.f2938;
    }

    @Override // com.google.android.gms.internal.measurement.C0315
    /* renamed from: ﹳﹳ */
    public final byte mo1836(int i) {
        int i2 = this.f2939;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.f2432[this.f2938 + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(ـˈ.ˉᵎ.ˉⁱ("Index < 0: ", i));
        }
        throw new ArrayIndexOutOfBoundsException(AbstractC0002.m55(i, i2, "Index > length: ", ", "));
    }

    @Override // com.google.android.gms.internal.measurement.C0315
    /* renamed from: ﹶˆ */
    public final byte mo1837(int i) {
        return this.f2432[this.f2938 + i];
    }
}
