package com.google.crypto.tink.shaded.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC0080;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import p447.AbstractC5179;

/* renamed from: com.google.crypto.tink.shaded.protobuf.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0733 extends AbstractC0080 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f3533;

    /* renamed from: ˉי, reason: contains not printable characters */
    public int f3534 = Integer.MAX_VALUE;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public int f3535;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final ByteArrayInputStream f3536;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public int f3537;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public int f3538;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final byte[] f3539;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public int f3540;

    public C0733(ByteArrayInputStream byteArrayInputStream) {
        Charset charset = AbstractC0731.f3531;
        this.f3536 = byteArrayInputStream;
        this.f3539 = new byte[4096];
        this.f3533 = 0;
        this.f3538 = 0;
        this.f3540 = 0;
    }

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public final void m2955(int i) throws InvalidProtocolBufferException {
        if (m2962(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.f3540) - this.f3538) {
            throw InvalidProtocolBufferException.m2926();
        }
        throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ʽᐧ */
    public final void mo437(int i) throws InvalidProtocolBufferException {
        if (this.f3535 != i) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final int m2956() throws InvalidProtocolBufferException {
        int i = this.f3538;
        if (this.f3533 - i < 4) {
            m2955(4);
            i = this.f3538;
        }
        this.f3538 = i + 4;
        byte[] bArr = this.f3539;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ʿˏ */
    public final long mo439() {
        return m2959();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ˆʿ */
    public final String mo440() throws InvalidProtocolBufferException {
        int iM2958 = m2958();
        byte[] bArr = this.f3539;
        if (iM2958 > 0) {
            int i = this.f3533;
            int i2 = this.f3538;
            if (iM2958 <= i - i2) {
                String str = new String(bArr, i2, iM2958, AbstractC0731.f3531);
                this.f3538 += iM2958;
                return str;
            }
        }
        if (iM2958 == 0) {
            return "";
        }
        if (iM2958 > this.f3533) {
            return new String(m2960(iM2958), AbstractC0731.f3531);
        }
        m2955(iM2958);
        String str2 = new String(bArr, this.f3538, iM2958, AbstractC0731.f3531);
        this.f3538 += iM2958;
        return str2;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ˆᵔ */
    public final int mo441() {
        return m2958();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ˈٴ */
    public final int mo442() {
        return AbstractC0080.m568(m2958());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ˉⁱ */
    public final void mo443(int i) {
        this.f3534 = i;
        m2964();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ˋˊ */
    public final float mo444() {
        return Float.intBitsToFloat(m2956());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ˎˑ */
    public final String mo445() throws IOException {
        int iM2958 = m2958();
        int i = this.f3538;
        int i2 = this.f3533;
        int i3 = i2 - i;
        byte[] bArrM2960 = this.f3539;
        if (iM2958 <= i3 && iM2958 > 0) {
            this.f3538 = i + iM2958;
        } else {
            if (iM2958 == 0) {
                return "";
            }
            i = 0;
            if (iM2958 <= i2) {
                m2955(iM2958);
                this.f3538 = iM2958;
            } else {
                bArrM2960 = m2960(iM2958);
            }
        }
        return AbstractC0778.f3639.mo32(bArrM2960, i, iM2958);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ˎٴ */
    public final double mo446() {
        return Double.longBitsToDouble(m2959());
    }

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public final long m2957() throws InvalidProtocolBufferException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.f3538 == this.f3533) {
                m2955(1);
            }
            int i2 = this.f3538;
            this.f3538 = i2 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((this.f3539[i2] & 128) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferException.m2927();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ˏᴵ */
    public final boolean mo448() {
        return m2965() != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ˑי */
    public final C0762 mo574() throws IOException {
        int iM2958 = m2958();
        int i = this.f3533;
        int i2 = this.f3538;
        int i3 = i - i2;
        byte[] bArr = this.f3539;
        if (iM2958 <= i3 && iM2958 > 0) {
            C0762 c0762M3129 = AbstractC0748.m3129(bArr, i2, iM2958);
            this.f3538 += iM2958;
            return c0762M3129;
        }
        if (iM2958 == 0) {
            return AbstractC0748.f3592;
        }
        byte[] bArrM2961 = m2961(iM2958);
        if (bArrM2961 != null) {
            return AbstractC0748.m3129(bArrM2961, 0, bArrM2961.length);
        }
        int i4 = this.f3538;
        int i5 = this.f3533;
        int length = i5 - i4;
        this.f3540 += i5;
        this.f3538 = 0;
        this.f3533 = 0;
        ArrayList arrayListM2966 = m2966(iM2958 - length);
        byte[] bArr2 = new byte[iM2958];
        System.arraycopy(bArr, i4, bArr2, 0, length);
        Iterator it = arrayListM2966.iterator();
        while (it.hasNext()) {
            byte[] bArr3 = (byte[]) it.next();
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        C0762 c0762 = AbstractC0748.f3592;
        return new C0762(bArr2);
    }

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public final int m2958() {
        int i;
        int i2 = this.f3538;
        int i3 = this.f3533;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f3539;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f3538 = i4;
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
                this.f3538 = i5;
                return i;
            }
        }
        return (int) m2957();
    }

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public final long m2959() throws InvalidProtocolBufferException {
        int i = this.f3538;
        if (this.f3533 - i < 8) {
            m2955(8);
            i = this.f3538;
        }
        this.f3538 = i + 8;
        byte[] bArr = this.f3539;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: יʻ */
    public final int mo451() {
        return m2956();
    }

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final byte[] m2960(int i) throws IOException {
        byte[] bArrM2961 = m2961(i);
        if (bArrM2961 != null) {
            return bArrM2961;
        }
        int i2 = this.f3538;
        int i3 = this.f3533;
        int length = i3 - i2;
        this.f3540 += i3;
        this.f3538 = 0;
        this.f3533 = 0;
        ArrayList arrayListM2966 = m2966(i - length);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f3539, i2, bArr, 0, length);
        Iterator it = arrayListM2966.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ٴˎ */
    public final int mo453() {
        return this.f3540 + this.f3538;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ᐧʻ */
    public final boolean mo454() {
        return this.f3538 == this.f3533 && !m2962(1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ᐧˋ */
    public final int mo455() throws InvalidProtocolBufferException {
        if (mo454()) {
            this.f3535 = 0;
            return 0;
        }
        int iM2958 = m2958();
        this.f3535 = iM2958;
        if ((iM2958 >>> 3) != 0) {
            return iM2958;
        }
        throw InvalidProtocolBufferException.m2924();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ᐧⁱ */
    public final long mo456() {
        return AbstractC0080.m566(m2965());
    }

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final byte[] m2961(int i) throws IOException {
        if (i == 0) {
            return AbstractC0731.f3530;
        }
        if (i < 0) {
            throw InvalidProtocolBufferException.m2922();
        }
        int i2 = this.f3540;
        int i3 = this.f3538;
        int i4 = i2 + i3 + i;
        if (i4 - Integer.MAX_VALUE > 0) {
            throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i5 = this.f3534;
        if (i4 > i5) {
            m2963((i5 - i2) - i3);
            throw InvalidProtocolBufferException.m2926();
        }
        int i6 = this.f3533 - i3;
        int i7 = i - i6;
        ByteArrayInputStream byteArrayInputStream = this.f3536;
        if (i7 >= 4096) {
            try {
                if (i7 > byteArrayInputStream.available()) {
                    return null;
                }
            } catch (InvalidProtocolBufferException e) {
                e.f3520 = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f3539, this.f3538, bArr, 0, i6);
        this.f3540 += this.f3533;
        this.f3538 = 0;
        this.f3533 = 0;
        while (i6 < i) {
            try {
                int i8 = byteArrayInputStream.read(bArr, i6, i - i6);
                if (i8 == -1) {
                    throw InvalidProtocolBufferException.m2926();
                }
                this.f3540 += i8;
                i6 += i8;
            } catch (InvalidProtocolBufferException e2) {
                e2.f3520 = true;
                throw e2;
            }
        }
        return bArr;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ᴵʿ */
    public final int mo458(int i) throws InvalidProtocolBufferException {
        if (i < 0) {
            throw InvalidProtocolBufferException.m2922();
        }
        int i2 = this.f3540 + this.f3538 + i;
        int i3 = this.f3534;
        if (i2 > i3) {
            throw InvalidProtocolBufferException.m2926();
        }
        this.f3534 = i2;
        m2964();
        return i3;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ᵎˏ */
    public final int mo459() {
        return m2958();
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public final boolean m2962(int i) throws IOException {
        int i2 = this.f3538;
        int i3 = i2 + i;
        int i4 = this.f3533;
        if (i3 <= i4) {
            throw new IllegalStateException(AbstractC5179.m11548(i, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i5 = this.f3540;
        if (i > (Integer.MAX_VALUE - i5) - i2 || i5 + i2 + i > this.f3534) {
            return false;
        }
        byte[] bArr = this.f3539;
        if (i2 > 0) {
            if (i4 > i2) {
                System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
            }
            this.f3540 += i2;
            this.f3533 -= i2;
            this.f3538 = 0;
        }
        int i6 = this.f3533;
        int iMin = Math.min(bArr.length - i6, (Integer.MAX_VALUE - this.f3540) - i6);
        ByteArrayInputStream byteArrayInputStream = this.f3536;
        try {
            int i7 = byteArrayInputStream.read(bArr, i6, iMin);
            if (i7 == 0 || i7 < -1 || i7 > bArr.length) {
                throw new IllegalStateException(byteArrayInputStream.getClass() + "#read(byte[]) returned invalid result: " + i7 + "\nThe InputStream implementation is buggy.");
            }
            if (i7 <= 0) {
                return false;
            }
            this.f3533 += i7;
            m2964();
            if (this.f3533 >= i) {
                return true;
            }
            return m2962(i);
        } catch (InvalidProtocolBufferException e) {
            e.f3520 = true;
            throw e;
        }
    }

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public final void m2963(int i) throws InvalidProtocolBufferException {
        int i2 = this.f3533;
        int i3 = this.f3538;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.f3538 = i3 + i;
            return;
        }
        ByteArrayInputStream byteArrayInputStream = this.f3536;
        if (i < 0) {
            throw InvalidProtocolBufferException.m2922();
        }
        int i5 = this.f3540;
        int i6 = i5 + i3;
        int i7 = i6 + i;
        int i8 = this.f3534;
        if (i7 > i8) {
            m2963((i8 - i5) - i3);
            throw InvalidProtocolBufferException.m2926();
        }
        this.f3540 = i6;
        this.f3533 = 0;
        this.f3538 = 0;
        while (i4 < i) {
            long j = i - i4;
            try {
                try {
                    long jSkip = byteArrayInputStream.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        throw new IllegalStateException(byteArrayInputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i4 += (int) jSkip;
                    }
                } catch (InvalidProtocolBufferException e) {
                    e.f3520 = true;
                    throw e;
                }
            } catch (Throwable th) {
                this.f3540 += i4;
                m2964();
                throw th;
            }
        }
        this.f3540 += i4;
        m2964();
        if (i4 >= i) {
            return;
        }
        int i9 = this.f3533;
        int i10 = i9 - this.f3538;
        this.f3538 = i9;
        m2955(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.f3533;
            if (i11 <= i12) {
                this.f3538 = i11;
                return;
            } else {
                i10 += i12;
                this.f3538 = i12;
                m2955(1);
            }
        }
    }

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public final void m2964() {
        int i = this.f3533 + this.f3537;
        this.f3533 = i;
        int i2 = this.f3540 + i;
        int i3 = this.f3534;
        if (i2 <= i3) {
            this.f3537 = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f3537 = i4;
        this.f3533 = i - i4;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ᵢʿ */
    public final long mo464() {
        return m2965();
    }

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public final long m2965() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.f3538;
        int i2 = this.f3533;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f3539;
            byte b = bArr[i];
            if (b >= 0) {
                this.f3538 = i3;
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
                this.f3538 = i4;
                return j;
            }
        }
        return m2957();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ﹳˎ */
    public final int mo466() {
        return m2956();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ﹳˑ */
    public final long mo467() {
        return m2959();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ﾞʽ */
    public final long mo469() {
        return m2965();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ﾞˊ */
    public final int mo470() {
        return m2958();
    }

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final ArrayList m2966(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = this.f3536.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    throw InvalidProtocolBufferException.m2926();
                }
                this.f3540 += i3;
                i2 += i3;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }
}
