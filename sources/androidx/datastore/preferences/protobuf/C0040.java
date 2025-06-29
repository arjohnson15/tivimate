package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import p164.C2372;

/* renamed from: androidx.datastore.preferences.protobuf.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0040 extends AbstractC0072 {

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static final Logger f433 = Logger.getLogger(C0040.class.getName());

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static final boolean f434 = AbstractC0029.f391;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final int f435;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public C0030 f436;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public int f437;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final C2372 f438;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final byte[] f439;

    public C0040(C2372 c2372, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int iMax = Math.max(i, 20);
        this.f439 = new byte[iMax];
        this.f435 = iMax;
        this.f438 = c2372;
    }

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public static int m387(int i) {
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

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public static int m388(C0056 c0056) {
        int size = c0056.size();
        return m387(size) + size;
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static int m389(int i) {
        if (i >= 0) {
            return m387(i);
        }
        return 10;
    }

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static int m390(int i) {
        return m401(i) + 8;
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public static int m391(int i, AbstractC0052 abstractC0052, InterfaceC0025 interfaceC0025) {
        return abstractC0052.m479(interfaceC0025) + (m401(i) * 2);
    }

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public static int m392(int i, String str) {
        return m398(str) + m401(i);
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public static int m393(int i) {
        return m401(i) + 8;
    }

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static int m394(int i, long j) {
        return m395(j) + m401(i);
    }

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public static int m395(long j) {
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

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public static int m396(int i, long j) {
        return m395(j) + m401(i);
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public static int m397(int i) {
        return m401(i) + 8;
    }

    /* renamed from: ـˆ, reason: contains not printable characters */
    public static int m398(String str) {
        int length;
        try {
            length = AbstractC0073.m511(str);
        } catch (C0021 unused) {
            length = str.getBytes(AbstractC0077.f505).length;
        }
        return m387(length) + length;
    }

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static int m399(int i) {
        return m401(i) + 4;
    }

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static int m400(int i, int i2) {
        return m389(i2) + m401(i);
    }

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public static int m401(int i) {
        return m387(i << 3);
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public static int m402(int i) {
        return m401(i) + 1;
    }

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public static int m403(int i, int i2) {
        return m387((i2 >> 31) ^ (i2 << 1)) + m401(i);
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public static int m404(int i, C0056 c0056) {
        return m388(c0056) + m401(i);
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public static int m405(int i) {
        return m401(i) + 4;
    }

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public static int m406(int i, long j) {
        return m395((j >> 63) ^ (j << 1)) + m401(i);
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public static int m407(int i) {
        return m401(i) + 4;
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public static int m408(int i, int i2) {
        return m389(i2) + m401(i);
    }

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public static int m409(int i, int i2) {
        return m387(i2) + m401(i);
    }

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public final void m410(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f437;
        int i4 = this.f435;
        int i5 = i4 - i3;
        byte[] bArr2 = this.f439;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.f437 += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.f437 = i4;
        m433();
        if (i7 > i4) {
            this.f438.write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.f437 = i7;
        }
    }

    /* renamed from: ʻﹳ, reason: contains not printable characters */
    public final void m411(int i, int i2) {
        m412((i << 3) | i2);
    }

    /* renamed from: ʽˆ, reason: contains not printable characters */
    public final void m412(int i) {
        m421(5);
        m429(i);
    }

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public final void m413(long j) throws IOException {
        m421(8);
        m422(j);
    }

    /* renamed from: ˈﹳ, reason: contains not printable characters */
    public final void m414(int i, int i2) {
        m421(20);
        m423(i, 0);
        m429(i2);
    }

    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public final void m415(int i, int i2) {
        m421(20);
        m423(i, 0);
        if (i2 >= 0) {
            m429(i2);
        } else {
            m420(i2);
        }
    }

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public final void m416(int i, int i2) {
        m421(14);
        m423(i, 5);
        m427(i2);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0072
    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final void mo417(byte[] bArr, int i, int i2) throws IOException {
        m410(bArr, i, i2);
    }

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public final void m418(int i) throws IOException {
        m421(4);
        m427(i);
    }

    /* renamed from: ˎˉ, reason: contains not printable characters */
    public final void m419(int i, String str) throws IOException {
        m411(i, 2);
        m424(str);
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final void m420(long j) {
        boolean z = f434;
        byte[] bArr = this.f439;
        if (z) {
            while ((j & (-128)) != 0) {
                int i = this.f437;
                this.f437 = i + 1;
                AbstractC0029.m313(bArr, i, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            int i2 = this.f437;
            this.f437 = i2 + 1;
            AbstractC0029.m313(bArr, i2, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            int i3 = this.f437;
            this.f437 = i3 + 1;
            bArr[i3] = (byte) ((((int) j) & 127) | 128);
            j >>>= 7;
        }
        int i4 = this.f437;
        this.f437 = i4 + 1;
        bArr[i4] = (byte) j;
    }

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public final void m421(int i) throws IOException {
        if (this.f435 - this.f437 < i) {
            m433();
        }
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final void m422(long j) {
        int i = this.f437;
        int i2 = i + 1;
        this.f437 = i2;
        byte[] bArr = this.f439;
        bArr[i] = (byte) (j & 255);
        int i3 = i + 2;
        this.f437 = i3;
        bArr[i2] = (byte) ((j >> 8) & 255);
        int i4 = i + 3;
        this.f437 = i4;
        bArr[i3] = (byte) ((j >> 16) & 255);
        int i5 = i + 4;
        this.f437 = i5;
        bArr[i4] = (byte) (255 & (j >> 24));
        int i6 = i + 5;
        this.f437 = i6;
        bArr[i5] = (byte) (((int) (j >> 32)) & 255);
        int i7 = i + 6;
        this.f437 = i7;
        bArr[i6] = (byte) (((int) (j >> 40)) & 255);
        int i8 = i + 7;
        this.f437 = i8;
        bArr[i7] = (byte) (((int) (j >> 48)) & 255);
        this.f437 = i + 8;
        bArr[i8] = (byte) (((int) (j >> 56)) & 255);
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public final void m423(int i, int i2) {
        m429((i << 3) | i2);
    }

    /* renamed from: יˋ, reason: contains not printable characters */
    public final void m424(String str) throws IOException {
        try {
            int length = str.length() * 3;
            int iM387 = m387(length);
            int i = iM387 + length;
            int i2 = this.f435;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int iMo239 = AbstractC0073.f497.mo239(str, bArr, 0, length);
                m412(iMo239);
                m410(bArr, 0, iMo239);
                return;
            }
            if (i > i2 - this.f437) {
                m433();
            }
            int iM3872 = m387(str.length());
            int i3 = this.f437;
            byte[] bArr2 = this.f439;
            try {
                try {
                    if (iM3872 == iM387) {
                        int i4 = i3 + iM3872;
                        this.f437 = i4;
                        int iMo2392 = AbstractC0073.f497.mo239(str, bArr2, i4, i2 - i4);
                        this.f437 = i3;
                        m429((iMo2392 - i3) - iM3872);
                        this.f437 = iMo2392;
                    } else {
                        int iM511 = AbstractC0073.m511(str);
                        m429(iM511);
                        this.f437 = AbstractC0073.f497.mo239(str, bArr2, this.f437, iM511);
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw new CodedOutputStream$OutOfSpaceException(e);
                }
            } catch (C0021 e2) {
                this.f437 = i3;
                throw e2;
            }
        } catch (C0021 e3) {
            f433.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e3);
            byte[] bytes = str.getBytes(AbstractC0077.f505);
            try {
                m412(bytes.length);
                mo417(bytes, 0, bytes.length);
            } catch (CodedOutputStream$OutOfSpaceException e4) {
                throw e4;
            } catch (IndexOutOfBoundsException e5) {
                throw new CodedOutputStream$OutOfSpaceException(e5);
            }
        }
    }

    /* renamed from: ٴᐧ, reason: contains not printable characters */
    public final void m425(int i, long j) {
        m421(20);
        m423(i, 0);
        m420(j);
    }

    /* renamed from: ٴﹶ, reason: contains not printable characters */
    public final void m426(long j) throws IOException {
        m421(10);
        m420(j);
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final void m427(int i) {
        int i2 = this.f437;
        int i3 = i2 + 1;
        this.f437 = i3;
        byte[] bArr = this.f439;
        bArr[i2] = (byte) (i & 255);
        int i4 = i2 + 2;
        this.f437 = i4;
        bArr[i3] = (byte) ((i >> 8) & 255);
        int i5 = i2 + 3;
        this.f437 = i5;
        bArr[i4] = (byte) ((i >> 16) & 255);
        this.f437 = i2 + 4;
        bArr[i5] = (byte) ((i >> 24) & 255);
    }

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public final void m428(int i, long j) {
        m421(18);
        m423(i, 1);
        m422(j);
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final void m429(int i) {
        boolean z = f434;
        byte[] bArr = this.f439;
        if (z) {
            while ((i & (-128)) != 0) {
                int i2 = this.f437;
                this.f437 = i2 + 1;
                AbstractC0029.m313(bArr, i2, (byte) ((i & 127) | 128));
                i >>>= 7;
            }
            int i3 = this.f437;
            this.f437 = i3 + 1;
            AbstractC0029.m313(bArr, i3, (byte) i);
            return;
        }
        while ((i & (-128)) != 0) {
            int i4 = this.f437;
            this.f437 = i4 + 1;
            bArr[i4] = (byte) ((i & 127) | 128);
            i >>>= 7;
        }
        int i5 = this.f437;
        this.f437 = i5 + 1;
        bArr[i5] = (byte) i;
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public final void m430(int i, C0056 c0056) {
        m411(i, 2);
        m435(c0056);
    }

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public final void m431(int i, boolean z) {
        m421(11);
        m423(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        int i2 = this.f437;
        this.f437 = i2 + 1;
        this.f439[i2] = b;
    }

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public final void m432(byte b) throws IOException {
        if (this.f437 == this.f435) {
            m433();
        }
        int i = this.f437;
        this.f437 = i + 1;
        this.f439[i] = b;
    }

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public final void m433() throws IOException {
        this.f438.write(this.f439, 0, this.f437);
        this.f437 = 0;
    }

    /* renamed from: ⁱʿ, reason: contains not printable characters */
    public final void m434(int i) throws IOException {
        if (i >= 0) {
            m412(i);
        } else {
            m426(i);
        }
    }

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public final void m435(C0056 c0056) {
        m412(c0056.size());
        mo417(c0056.f469, c0056.m485(), c0056.size());
    }
}
