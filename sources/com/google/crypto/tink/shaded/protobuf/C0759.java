package com.google.crypto.tink.shaded.protobuf;

import android.support.v4.media.session.AbstractC0002;

/* renamed from: com.google.crypto.tink.shaded.protobuf.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0759 extends C0762 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final int f3599;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final int f3600;

    public C0759(byte[] bArr, int i, int i2) {
        super(bArr);
        AbstractC0748.m3128(i, i + i2, bArr.length);
        this.f3599 = i;
        this.f3600 = i2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C0762, com.google.crypto.tink.shaded.protobuf.AbstractC0748
    public final int size() {
        return this.f3600;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C0762
    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final int mo3169() {
        return this.f3599;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C0762
    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final byte mo3170(int i) {
        return this.f3602[this.f3599 + i];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C0762, com.google.crypto.tink.shaded.protobuf.AbstractC0748
    /* renamed from: ﹳﹳ */
    public final byte mo3131(int i) {
        int i2 = this.f3600;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.f3602[this.f3599 + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(ـˈ.ˉᵎ.ˉⁱ("Index < 0: ", i));
        }
        throw new ArrayIndexOutOfBoundsException(AbstractC0002.m55(i, i2, "Index > length: ", ", "));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C0762, com.google.crypto.tink.shaded.protobuf.AbstractC0748
    /* renamed from: ﹶˆ */
    public final void mo3132(int i, byte[] bArr) {
        System.arraycopy(this.f3602, this.f3599, bArr, 0, i);
    }
}
