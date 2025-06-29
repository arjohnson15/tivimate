package com.google.crypto.tink.shaded.protobuf;

import java.util.logging.Logger;

/* renamed from: com.google.crypto.tink.shaded.protobuf.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0735 extends ⁱـ.ˑי {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public C0756 f3547;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public int f3548;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final byte[] f3549;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final int f3550;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static final Logger f3546 = Logger.getLogger(C0735.class.getName());

    /* renamed from: ˉי, reason: contains not printable characters */
    public static final boolean f3545 = AbstractC0768.f3627;

    public C0735(int i, byte[] bArr) {
        if (((bArr.length - i) | i) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i)));
        }
        this.f3549 = bArr;
        this.f3548 = 0;
        this.f3550 = i;
    }

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public static int m3014(String str) {
        int length;
        try {
            length = AbstractC0778.m3216(str);
        } catch (C0750 unused) {
            length = str.getBytes(AbstractC0731.f3531).length;
        }
        return m3035(length) + length;
    }

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public static int m3015(int i, long j) {
        return m3020(j) + m3030(i);
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static int m3016(int i, AbstractC0748 abstractC0748) {
        return m3021(abstractC0748) + m3030(i);
    }

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static int m3017(int i, int i2) {
        return m3036(i2) + m3030(i);
    }

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public static int m3018(int i, long j) {
        return m3020(j) + m3030(i);
    }

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public static int m3019(int i) {
        return m3030(i) + 4;
    }

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public static int m3020(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static int m3021(AbstractC0748 abstractC0748) {
        int size = abstractC0748.size();
        return m3035(size) + size;
    }

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public static int m3022(int i, long j) {
        return m3020((j >> 63) ^ (j << 1)) + m3030(i);
    }

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public static int m3023(int i) {
        return m3030(i) + 8;
    }

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public static int m3024(int i) {
        return m3030(i) + 4;
    }

    /* renamed from: ـˆ, reason: contains not printable characters */
    public static int m3025(int i, AbstractC0758 abstractC0758, InterfaceC0727 interfaceC0727) {
        return abstractC0758.mo3166(interfaceC0727) + (m3030(i) * 2);
    }

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static int m3026(int i) {
        return m3030(i) + 8;
    }

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static int m3027(int i) {
        return m3030(i) + 1;
    }

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public static int m3028(int i, int i2) {
        return m3036(i2) + m3030(i);
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public static int m3029(int i, int i2) {
        return m3035(i2) + m3030(i);
    }

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public static int m3030(int i) {
        return m3035(i << 3);
    }

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public static int m3031(int i, String str) {
        return m3014(str) + m3030(i);
    }

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public static int m3032(int i) {
        return m3030(i) + 4;
    }

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public static int m3033(int i, int i2) {
        return m3035((i2 >> 31) ^ (i2 << 1)) + m3030(i);
    }

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public static int m3034(int i) {
        return m3030(i) + 8;
    }

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public static int m3035(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public static int m3036(int i) {
        if (i >= 0) {
            return m3035(i);
        }
        return 10;
    }

    /* renamed from: ʻﹳ, reason: contains not printable characters */
    public final void m3037(long j) throws CodedOutputStream$OutOfSpaceException {
        try {
            byte[] bArr = this.f3549;
            int i = this.f3548;
            int i2 = i + 1;
            this.f3548 = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i + 2;
            this.f3548 = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i + 3;
            this.f3548 = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i + 4;
            this.f3548 = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i + 5;
            this.f3548 = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i + 6;
            this.f3548 = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i + 7;
            this.f3548 = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f3548 = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f3548), Integer.valueOf(this.f3550), 1), e);
        }
    }

    /* renamed from: ʽˆ, reason: contains not printable characters */
    public final void m3038(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        m3045((i << 3) | i2);
    }

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public final void m3039(byte[] bArr, int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        try {
            System.arraycopy(bArr, i, this.f3549, this.f3548, i2);
            this.f3548 += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f3548), Integer.valueOf(this.f3550), Integer.valueOf(i2)), e);
        }
    }

    /* renamed from: ˈﹳ, reason: contains not printable characters */
    public final void m3040(int i) throws CodedOutputStream$OutOfSpaceException {
        if (i >= 0) {
            m3045(i);
        } else {
            m3044(i);
        }
    }

    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public final void m3041(AbstractC0748 abstractC0748) throws CodedOutputStream$OutOfSpaceException {
        m3045(abstractC0748.size());
        C0762 c0762 = (C0762) abstractC0748;
        m3039(c0762.f3602, c0762.mo3169(), c0762.size());
    }

    /* renamed from: ˎˉ, reason: contains not printable characters */
    public final void m3042(int i) throws CodedOutputStream$OutOfSpaceException {
        try {
            byte[] bArr = this.f3549;
            int i2 = this.f3548;
            int i3 = i2 + 1;
            this.f3548 = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.f3548 = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.f3548 = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f3548 = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f3548), Integer.valueOf(this.f3550), 1), e);
        }
    }

    /* renamed from: יˋ, reason: contains not printable characters */
    public final void m3043(int i, long j) throws CodedOutputStream$OutOfSpaceException {
        m3038(i, 1);
        m3037(j);
    }

    /* renamed from: ـᵎ, reason: contains not printable characters */
    public final void m3044(long j) throws CodedOutputStream$OutOfSpaceException {
        byte[] bArr = this.f3549;
        boolean z = f3545;
        int i = this.f3550;
        if (z && i - this.f3548 >= 10) {
            while ((j & (-128)) != 0) {
                int i2 = this.f3548;
                this.f3548 = i2 + 1;
                AbstractC0768.m3189(bArr, i2, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            int i3 = this.f3548;
            this.f3548 = 1 + i3;
            AbstractC0768.m3189(bArr, i3, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            try {
                int i4 = this.f3548;
                this.f3548 = i4 + 1;
                bArr[i4] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f3548), Integer.valueOf(i), 1), e);
            }
        }
        int i5 = this.f3548;
        this.f3548 = i5 + 1;
        bArr[i5] = (byte) j;
    }

    /* renamed from: ٴᐧ, reason: contains not printable characters */
    public final void m3045(int i) throws CodedOutputStream$OutOfSpaceException {
        while (true) {
            int i2 = i & (-128);
            byte[] bArr = this.f3549;
            if (i2 == 0) {
                int i3 = this.f3548;
                this.f3548 = i3 + 1;
                bArr[i3] = (byte) i;
                return;
            } else {
                try {
                    int i4 = this.f3548;
                    this.f3548 = i4 + 1;
                    bArr[i4] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f3548), Integer.valueOf(this.f3550), 1), e);
                }
            }
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f3548), Integer.valueOf(this.f3550), 1), e);
        }
    }

    /* renamed from: ٴﹶ, reason: contains not printable characters */
    public final void m3046(int i, long j) throws CodedOutputStream$OutOfSpaceException {
        m3038(i, 0);
        m3044(j);
    }

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public final void m3047(byte b) throws CodedOutputStream$OutOfSpaceException {
        try {
            byte[] bArr = this.f3549;
            int i = this.f3548;
            this.f3548 = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f3548), Integer.valueOf(this.f3550), 1), e);
        }
    }

    /* renamed from: ⁱʿ, reason: contains not printable characters */
    public final void m3048(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        m3038(i, 5);
        m3042(i2);
    }
}
