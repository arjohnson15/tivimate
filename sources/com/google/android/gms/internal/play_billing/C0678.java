package com.google.android.gms.internal.play_billing;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.play_billing.ﾞˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0678 extends ˎˊ.ˆʿ {

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static final Logger f3096 = Logger.getLogger(C0678.class.getName());

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public static final boolean f3097 = AbstractC0603.f2969;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final byte[] f3098;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public int f3099;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final int f3100;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public C0679 f3101;

    public C0678(int i, byte[] bArr) {
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i)));
        }
        this.f3098 = bArr;
        this.f3099 = 0;
        this.f3100 = i;
    }

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public static int m2745(AbstractC0625 abstractC0625, InterfaceC0638 interfaceC0638) {
        int iMo2639 = abstractC0625.mo2639(interfaceC0638);
        return m2747(iMo2639) + iMo2639;
    }

    /* renamed from: ـˆ, reason: contains not printable characters */
    public static int m2746(String str) {
        int length;
        try {
            length = AbstractC0585.m2548(str);
        } catch (C0623 unused) {
            length = str.getBytes(AbstractC0595.f2962).length;
        }
        return m2747(length) + length;
    }

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public static int m2747(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public static int m2748(int i, AbstractC0625 abstractC0625, InterfaceC0638 interfaceC0638) {
        int iM2747 = m2747(i << 3);
        return abstractC0625.mo2639(interfaceC0638) + iM2747 + iM2747;
    }

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public static int m2749(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final void m2750(int i, C0615 c0615) throws zzbw {
        m2757((i << 3) | 2);
        m2757(c0615.mo2574());
        m2761(c0615.mo2574(), c0615.f2984);
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final void m2751(int i, int i2) {
        m2757((i << 3) | i2);
    }

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final void m2752(int i, long j) throws zzbw {
        m2757(i << 3);
        m2760(j);
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public final void m2753(int i) throws zzbw {
        if (i >= 0) {
            m2757(i);
        } else {
            m2760(i);
        }
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public final void m2754(int i, int i2) throws zzbw {
        m2757((i << 3) | 5);
        m2764(i2);
    }

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final void m2755(int i, int i2) throws zzbw {
        m2757(i << 3);
        m2757(i2);
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public final void m2756(long j) throws zzbw {
        try {
            byte[] bArr = this.f3098;
            int i = this.f3099;
            int i2 = i + 1;
            this.f3099 = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i + 2;
            this.f3099 = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i + 3;
            this.f3099 = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i + 4;
            this.f3099 = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i + 5;
            this.f3099 = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i + 6;
            this.f3099 = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i + 7;
            this.f3099 = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f3099 = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzbw(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f3099), Integer.valueOf(this.f3100), 1), e);
        }
    }

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final void m2757(int i) throws zzbw {
        while (true) {
            int i2 = i & (-128);
            byte[] bArr = this.f3098;
            if (i2 == 0) {
                int i3 = this.f3099;
                this.f3099 = i3 + 1;
                bArr[i3] = (byte) i;
                return;
            } else {
                try {
                    int i4 = this.f3099;
                    this.f3099 = i4 + 1;
                    bArr[i4] = (byte) ((i | 128) & 255);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzbw(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f3099), Integer.valueOf(this.f3100), 1), e);
                }
            }
            throw new zzbw(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f3099), Integer.valueOf(this.f3100), 1), e);
        }
    }

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final void m2758(int i, String str) throws zzbw {
        m2757((i << 3) | 2);
        int i2 = this.f3099;
        try {
            int iM2747 = m2747(str.length() * 3);
            int iM27472 = m2747(str.length());
            byte[] bArr = this.f3098;
            int i3 = this.f3100;
            if (iM27472 == iM2747) {
                int i4 = i2 + iM27472;
                this.f3099 = i4;
                int iM2547 = AbstractC0585.m2547(str, bArr, i4, i3 - i4);
                this.f3099 = i2;
                m2757((iM2547 - i2) - iM27472);
                this.f3099 = iM2547;
            } else {
                m2757(AbstractC0585.m2548(str));
                int i5 = this.f3099;
                this.f3099 = AbstractC0585.m2547(str, bArr, i5, i3 - i5);
            }
        } catch (C0623 e) {
            this.f3099 = i2;
            f3096.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
            byte[] bytes = str.getBytes(AbstractC0595.f2962);
            try {
                int length = bytes.length;
                m2757(length);
                m2761(length, bytes);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzbw(e2);
            }
        } catch (IndexOutOfBoundsException e3) {
            throw new zzbw(e3);
        }
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final void m2759(byte b) throws zzbw {
        try {
            byte[] bArr = this.f3098;
            int i = this.f3099;
            this.f3099 = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new zzbw(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f3099), Integer.valueOf(this.f3100), 1), e);
        }
    }

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final void m2760(long j) throws zzbw {
        byte[] bArr = this.f3098;
        boolean z = f3097;
        int i = this.f3100;
        if (!z || i - this.f3099 < 10) {
            while ((j & (-128)) != 0) {
                try {
                    int i2 = this.f3099;
                    this.f3099 = i2 + 1;
                    bArr[i2] = (byte) ((((int) j) | 128) & 255);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzbw(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f3099), Integer.valueOf(i), 1), e);
                }
            }
            int i3 = this.f3099;
            this.f3099 = i3 + 1;
            bArr[i3] = (byte) j;
            return;
        }
        while (true) {
            int i4 = (int) j;
            if ((j & (-128)) == 0) {
                int i5 = this.f3099;
                this.f3099 = 1 + i5;
                AbstractC0603.f2970.mo2568(bArr, AbstractC0603.f2972 + i5, (byte) i4);
                return;
            }
            int i6 = this.f3099;
            this.f3099 = i6 + 1;
            AbstractC0603.f2970.mo2568(bArr, AbstractC0603.f2972 + i6, (byte) ((i4 | 128) & 255));
            j >>>= 7;
        }
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final void m2761(int i, byte[] bArr) throws zzbw {
        try {
            System.arraycopy(bArr, 0, this.f3098, this.f3099, i);
            this.f3099 += i;
        } catch (IndexOutOfBoundsException e) {
            throw new zzbw(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f3099), Integer.valueOf(this.f3100), Integer.valueOf(i)), e);
        }
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public final void m2762(int i, int i2) throws zzbw {
        m2757(i << 3);
        m2753(i2);
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public final void m2763(int i, long j) throws zzbw {
        m2757((i << 3) | 1);
        m2756(j);
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public final void m2764(int i) throws zzbw {
        try {
            byte[] bArr = this.f3098;
            int i2 = this.f3099;
            int i3 = i2 + 1;
            this.f3099 = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.f3099 = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.f3099 = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f3099 = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzbw(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f3099), Integer.valueOf(this.f3100), 1), e);
        }
    }
}
