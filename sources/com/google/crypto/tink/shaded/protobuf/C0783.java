package com.google.crypto.tink.shaded.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC0080;

/* renamed from: com.google.crypto.tink.shaded.protobuf.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0783 extends AbstractC0080 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f3642;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public int f3643;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final byte[] f3644;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public int f3645;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final int f3646;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int f3647;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public int f3648 = Integer.MAX_VALUE;

    public C0783(byte[] bArr, int i, int i2, boolean z) {
        this.f3644 = bArr;
        this.f3647 = i2 + i;
        this.f3645 = i;
        this.f3646 = i;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ʽᐧ */
    public final void mo437(int i) throws InvalidProtocolBufferException {
        if (this.f3643 != i) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final long m3224() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.f3645;
        int i2 = this.f3647;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f3644;
            byte b = bArr[i];
            if (b >= 0) {
                this.f3645 = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                        i4 = i6;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            j4 = (-2080896) ^ i9;
                        } else {
                            long j5 = i9;
                            i4 = i + 5;
                            long j6 = j5 ^ (bArr[i8] << 28);
                            if (j6 >= 0) {
                                j3 = 266354560;
                            } else {
                                i8 = i + 6;
                                long j7 = j6 ^ (bArr[i4] << 35);
                                if (j7 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j6 = j7 ^ (bArr[i8] << 42);
                                    if (j6 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i8 = i + 8;
                                        j7 = j6 ^ (bArr[i4] << 49);
                                        if (j7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            long j8 = (j7 ^ (bArr[i8] << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                int i10 = i + 10;
                                                if (bArr[i4] >= 0) {
                                                    i4 = i10;
                                                }
                                            }
                                            j = j8;
                                        }
                                    }
                                }
                                j4 = j2 ^ j7;
                            }
                            j = j3 ^ j6;
                        }
                        i4 = i8;
                        j = j4;
                    }
                }
                this.f3645 = i4;
                return j;
            }
        }
        return m3226();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ʿˏ */
    public final long mo439() {
        return m3228();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ˆʿ */
    public final String mo440() throws InvalidProtocolBufferException {
        int iM3229 = m3229();
        if (iM3229 > 0) {
            int i = this.f3647;
            int i2 = this.f3645;
            if (iM3229 <= i - i2) {
                String str = new String(this.f3644, i2, iM3229, AbstractC0731.f3531);
                this.f3645 += iM3229;
                return str;
            }
        }
        if (iM3229 == 0) {
            return "";
        }
        if (iM3229 < 0) {
            throw InvalidProtocolBufferException.m2922();
        }
        throw InvalidProtocolBufferException.m2926();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ˆᵔ */
    public final int mo441() {
        return m3229();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ˈٴ */
    public final int mo442() {
        return AbstractC0080.m568(m3229());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ˉⁱ */
    public final void mo443(int i) {
        this.f3648 = i;
        m3225();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ˋˊ */
    public final float mo444() {
        return Float.intBitsToFloat(m3227());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ˎˑ */
    public final String mo445() throws InvalidProtocolBufferException {
        int iM3229 = m3229();
        if (iM3229 > 0) {
            int i = this.f3647;
            int i2 = this.f3645;
            if (iM3229 <= i - i2) {
                String strMo32 = AbstractC0778.f3639.mo32(this.f3644, i2, iM3229);
                this.f3645 += iM3229;
                return strMo32;
            }
        }
        if (iM3229 == 0) {
            return "";
        }
        if (iM3229 <= 0) {
            throw InvalidProtocolBufferException.m2922();
        }
        throw InvalidProtocolBufferException.m2926();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ˎٴ */
    public final double mo446() {
        return Double.longBitsToDouble(m3228());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ˏᴵ */
    public final boolean mo448() {
        return m3224() != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ˑי */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.crypto.tink.shaded.protobuf.C0762 mo574() throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        /*
            r4 = this;
            int r0 = r4.m3229()
            byte[] r1 = r4.f3644
            if (r0 <= 0) goto L19
            int r2 = r4.f3647
            int r3 = r4.f3645
            int r2 = r2 - r3
            if (r0 > r2) goto L19
            com.google.crypto.tink.shaded.protobuf.ᐧʻ r1 = com.google.crypto.tink.shaded.protobuf.AbstractC0748.m3129(r1, r3, r0)
            int r2 = r4.f3645
            int r2 = r2 + r0
            r4.f3645 = r2
            return r1
        L19:
            if (r0 != 0) goto L1e
            com.google.crypto.tink.shaded.protobuf.ᐧʻ r0 = com.google.crypto.tink.shaded.protobuf.AbstractC0748.f3592
            return r0
        L1e:
            if (r0 <= 0) goto L2f
            int r2 = r4.f3647
            int r3 = r4.f3645
            int r2 = r2 - r3
            if (r0 > r2) goto L2f
            int r0 = r0 + r3
            r4.f3645 = r0
            byte[] r0 = java.util.Arrays.copyOfRange(r1, r3, r0)
            goto L35
        L2f:
            if (r0 > 0) goto L42
            if (r0 != 0) goto L3d
            byte[] r0 = com.google.crypto.tink.shaded.protobuf.AbstractC0731.f3530
        L35:
            com.google.crypto.tink.shaded.protobuf.ᐧʻ r1 = com.google.crypto.tink.shaded.protobuf.AbstractC0748.f3592
            com.google.crypto.tink.shaded.protobuf.ᐧʻ r1 = new com.google.crypto.tink.shaded.protobuf.ᐧʻ
            r1.<init>(r0)
            return r1
        L3d:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.m2922()
            throw r0
        L42:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.m2926()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C0783.mo574():com.google.crypto.tink.shaded.protobuf.ᐧʻ");
    }

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public final void m3225() {
        int i = this.f3647 + this.f3642;
        this.f3647 = i;
        int i2 = i - this.f3646;
        int i3 = this.f3648;
        if (i2 <= i3) {
            this.f3642 = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f3642 = i4;
        this.f3647 = i - i4;
    }

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public final long m3226() throws InvalidProtocolBufferException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.f3645;
            if (i2 == this.f3647) {
                throw InvalidProtocolBufferException.m2926();
            }
            this.f3645 = i2 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((this.f3644[i2] & 128) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferException.m2927();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: יʻ */
    public final int mo451() {
        return m3227();
    }

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final int m3227() throws InvalidProtocolBufferException {
        int i = this.f3645;
        if (this.f3647 - i < 4) {
            throw InvalidProtocolBufferException.m2926();
        }
        this.f3645 = i + 4;
        byte[] bArr = this.f3644;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ٴˎ */
    public final int mo453() {
        return this.f3645 - this.f3646;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ᐧʻ */
    public final boolean mo454() {
        return this.f3645 == this.f3647;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ᐧˋ */
    public final int mo455() throws InvalidProtocolBufferException {
        if (mo454()) {
            this.f3643 = 0;
            return 0;
        }
        int iM3229 = m3229();
        this.f3643 = iM3229;
        if ((iM3229 >>> 3) != 0) {
            return iM3229;
        }
        throw InvalidProtocolBufferException.m2924();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ᐧⁱ */
    public final long mo456() {
        return AbstractC0080.m566(m3224());
    }

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final long m3228() throws InvalidProtocolBufferException {
        int i = this.f3645;
        if (this.f3647 - i < 8) {
            throw InvalidProtocolBufferException.m2926();
        }
        this.f3645 = i + 8;
        byte[] bArr = this.f3644;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ᴵʿ */
    public final int mo458(int i) {
        if (i < 0) {
            throw InvalidProtocolBufferException.m2922();
        }
        int iMo453 = mo453() + i;
        if (iMo453 < 0) {
            throw InvalidProtocolBufferException.m2925();
        }
        int i2 = this.f3648;
        if (iMo453 > i2) {
            throw InvalidProtocolBufferException.m2926();
        }
        this.f3648 = iMo453;
        m3225();
        return i2;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ᵎˏ */
    public final int mo459() {
        return m3229();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ᵢʿ */
    public final long mo464() {
        return m3224();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ﹳˎ */
    public final int mo466() {
        return m3227();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ﹳˑ */
    public final long mo467() {
        return m3228();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ﾞʽ */
    public final long mo469() {
        return m3224();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ﾞˊ */
    public final int mo470() {
        return m3229();
    }

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final int m3229() {
        int i;
        int i2 = this.f3645;
        int i3 = this.f3647;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f3644;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f3645 = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.f3645 = i5;
                return i;
            }
        }
        return (int) m3226();
    }
}
