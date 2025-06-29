package com.google.android.gms.internal.measurement;

import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.measurement.ʿﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0346 extends AbstractC0543 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final int f2470;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public C0355 f2471;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public int f2472;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final byte[] f2473;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static final Logger f2469 = Logger.getLogger(C0346.class.getName());

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static final boolean f2468 = AbstractC0547.f2889;

    public C0346(int i, byte[] bArr) {
        if (((bArr.length - i) | i) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i)));
        }
        this.f2473 = bArr;
        this.f2472 = 0;
        this.f2470 = i;
    }

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public static int m1910(int i, long j) {
        return m1922(j) + m1913(i << 3);
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public static int m1911(int i, String str) {
        return m1919(str) + m1913(i << 3);
    }

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public static int m1912(int i, int i2) {
        return m1913((i2 >> 31) ^ (i2 << 1)) + m1913(i << 3);
    }

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public static int m1913(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public static int m1914(int i, long j) {
        return m1922((j >> 63) ^ (j << 1)) + m1913(i << 3);
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public static int m1915(int i) {
        return m1913(i << 3) + 4;
    }

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public static int m1916(int i, int i2) {
        return m1922(i2) + m1913(i << 3);
    }

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public static int m1917(int i) {
        return m1913(i << 3) + 8;
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public static int m1918(int i) {
        return m1913(i << 3) + 1;
    }

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static int m1919(String str) {
        int length;
        try {
            length = AbstractC0446.m2233(str);
        } catch (C0564 unused) {
            length = str.getBytes(AbstractC0412.f2705).length;
        }
        return m1913(length) + length;
    }

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public static int m1920(int i, int i2) {
        return m1913(i2) + m1913(i << 3);
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public static int m1921(int i) {
        return m1913(i << 3) + 4;
    }

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public static int m1922(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public static int m1923(int i, int i2) {
        return m1922(i2) + m1913(i << 3);
    }

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public static int m1924(int i) {
        return m1913(i << 3) + 8;
    }

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public static int m1925(int i) {
        return m1913(i << 3) + 4;
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public static int m1926(int i, AbstractC0563 abstractC0563, InterfaceC0494 interfaceC0494) {
        return abstractC0563.mo2513(interfaceC0494) + (m1913(i << 3) << 1);
    }

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public static int m1927(int i, C0315 c0315) {
        int iM1913 = m1913(i << 3);
        int iMo1834 = c0315.mo1834();
        return m1913(iMo1834) + iMo1834 + iM1913;
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public static int m1928(int i) {
        return m1913(i << 3) + 8;
    }

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public static int m1929(int i) {
        return m1913(i << 3);
    }

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public static int m1930(int i, long j) {
        return m1922(j) + m1913(i << 3);
    }

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final void m1931(int i, int i2) throws zzkl$zzb {
        m1939(i, 0);
        m1935(i2);
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final void m1932(long j) throws zzkl$zzb {
        try {
            byte[] bArr = this.f2473;
            int i = this.f2472;
            int i2 = i + 1;
            this.f2472 = i2;
            bArr[i] = (byte) j;
            int i3 = i + 2;
            this.f2472 = i3;
            bArr[i2] = (byte) (j >> 8);
            int i4 = i + 3;
            this.f2472 = i4;
            bArr[i3] = (byte) (j >> 16);
            int i5 = i + 4;
            this.f2472 = i5;
            bArr[i4] = (byte) (j >> 24);
            int i6 = i + 5;
            this.f2472 = i6;
            bArr[i5] = (byte) (j >> 32);
            int i7 = i + 6;
            this.f2472 = i7;
            bArr[i6] = (byte) (j >> 40);
            int i8 = i + 7;
            this.f2472 = i8;
            bArr[i7] = (byte) (j >> 48);
            this.f2472 = i + 8;
            bArr[i8] = (byte) (j >> 56);
        } catch (IndexOutOfBoundsException e) {
            throw new zzkl$zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2472), Integer.valueOf(this.f2470), 1), e);
        }
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final void m1933(int i) throws zzkl$zzb {
        if (i >= 0) {
            m1935(i);
        } else {
            m1934(i);
        }
    }

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final void m1934(long j) throws zzkl$zzb {
        byte[] bArr = this.f2473;
        if (!f2468 || m1945() < 10) {
            while ((j & (-128)) != 0) {
                try {
                    int i = this.f2472;
                    this.f2472 = i + 1;
                    bArr[i] = (byte) (((int) j) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzkl$zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2472), Integer.valueOf(this.f2470), 1), e);
                }
            }
            int i2 = this.f2472;
            this.f2472 = i2 + 1;
            bArr[i2] = (byte) j;
            return;
        }
        while ((j & (-128)) != 0) {
            int i3 = this.f2472;
            this.f2472 = i3 + 1;
            AbstractC0547.f2890.mo2300(bArr, AbstractC0547.f2892 + i3, (byte) (((int) j) | 128));
            j >>>= 7;
        }
        int i4 = this.f2472;
        this.f2472 = 1 + i4;
        AbstractC0547.f2890.mo2300(bArr, AbstractC0547.f2892 + i4, (byte) j);
    }

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final void m1935(int i) throws zzkl$zzb {
        while (true) {
            int i2 = i & (-128);
            byte[] bArr = this.f2473;
            if (i2 == 0) {
                int i3 = this.f2472;
                this.f2472 = i3 + 1;
                bArr[i3] = (byte) i;
                return;
            } else {
                try {
                    int i4 = this.f2472;
                    this.f2472 = i4 + 1;
                    bArr[i4] = (byte) (i | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzkl$zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2472), Integer.valueOf(this.f2470), 1), e);
                }
            }
            throw new zzkl$zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2472), Integer.valueOf(this.f2470), 1), e);
        }
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public final void m1936(C0315 c0315) throws zzkl$zzb {
        m1935(c0315.mo1834());
        m1941(c0315.f2432, c0315.mo1835(), c0315.mo1834());
    }

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final void m1937(int i, int i2) throws zzkl$zzb {
        m1939(i, 0);
        m1933(i2);
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final void m1938(int i) throws zzkl$zzb {
        try {
            byte[] bArr = this.f2473;
            int i2 = this.f2472;
            int i3 = i2 + 1;
            this.f2472 = i3;
            bArr[i2] = (byte) i;
            int i4 = i2 + 2;
            this.f2472 = i4;
            bArr[i3] = (byte) (i >> 8);
            int i5 = i2 + 3;
            this.f2472 = i5;
            bArr[i4] = (byte) (i >> 16);
            this.f2472 = i2 + 4;
            bArr[i5] = (byte) (i >>> 24);
        } catch (IndexOutOfBoundsException e) {
            throw new zzkl$zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2472), Integer.valueOf(this.f2470), 1), e);
        }
    }

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final void m1939(int i, int i2) {
        m1935((i << 3) | i2);
    }

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final void m1940(int i, long j) throws zzkl$zzb {
        m1939(i, 0);
        m1934(j);
    }

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final void m1941(byte[] bArr, int i, int i2) throws zzkl$zzb {
        try {
            System.arraycopy(bArr, i, this.f2473, this.f2472, i2);
            this.f2472 += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzkl$zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2472), Integer.valueOf(this.f2470), Integer.valueOf(i2)), e);
        }
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final void m1942(int i, int i2) throws zzkl$zzb {
        m1939(i, 5);
        m1938(i2);
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final void m1943(byte b) throws zzkl$zzb {
        try {
            byte[] bArr = this.f2473;
            int i = this.f2472;
            this.f2472 = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new zzkl$zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2472), Integer.valueOf(this.f2470), 1), e);
        }
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final void m1944(int i, long j) throws zzkl$zzb {
        m1939(i, 1);
        m1932(j);
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public final int m1945() {
        return this.f2470 - this.f2472;
    }
}
