package p188;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import p137.C2106;

/* renamed from: ˎʾ.ﾞˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2639 extends FilterInputStream {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public int f10447;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f10448;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public int f10449;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public int f10450;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public volatile byte[] f10451;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final C2106 f10452;

    public C2639(InputStream inputStream, C2106 c2106) {
        super(inputStream);
        this.f10450 = -1;
        this.f10452 = c2106;
        this.f10451 = (byte[]) c2106.m5971(65536, byte[].class);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static void m6821() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f10451 == null || inputStream == null) {
            m6821();
            throw null;
        }
        return (this.f10447 - this.f10448) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f10451 != null) {
            this.f10452.m5966(this.f10451);
            this.f10451 = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        this.f10449 = Math.max(this.f10449, i);
        this.f10450 = this.f10448;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = this.f10451;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            m6821();
            throw null;
        }
        if (this.f10448 >= this.f10447 && m6823(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f10451 && (bArr = this.f10451) == null) {
            m6821();
            throw null;
        }
        int i = this.f10447;
        int i2 = this.f10448;
        if (i - i2 <= 0) {
            return -1;
        }
        this.f10448 = i2 + 1;
        return bArr[i2] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        byte[] bArr2 = this.f10451;
        if (bArr2 == null) {
            m6821();
            throw null;
        }
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            m6821();
            throw null;
        }
        int i5 = this.f10448;
        int i6 = this.f10447;
        if (i5 < i6) {
            int i7 = i6 - i5;
            if (i7 >= i2) {
                i7 = i2;
            }
            System.arraycopy(bArr2, i5, bArr, i, i7);
            this.f10448 += i7;
            if (i7 == i2 || inputStream.available() == 0) {
                return i7;
            }
            i += i7;
            i3 = i2 - i7;
        } else {
            i3 = i2;
        }
        while (true) {
            if (this.f10450 == -1 && i3 >= bArr2.length) {
                i4 = inputStream.read(bArr, i, i3);
                if (i4 == -1) {
                    return i3 != i2 ? i2 - i3 : -1;
                }
            } else {
                if (m6823(inputStream, bArr2) == -1) {
                    return i3 != i2 ? i2 - i3 : -1;
                }
                if (bArr2 != this.f10451 && (bArr2 = this.f10451) == null) {
                    m6821();
                    throw null;
                }
                int i8 = this.f10447;
                int i9 = this.f10448;
                i4 = i8 - i9;
                if (i4 >= i3) {
                    i4 = i3;
                }
                System.arraycopy(bArr2, i9, bArr, i, i4);
                this.f10448 += i4;
            }
            i3 -= i4;
            if (i3 == 0) {
                return i2;
            }
            if (inputStream.available() == 0) {
                return i2 - i3;
            }
            i += i4;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (this.f10451 == null) {
            throw new IOException("Stream is closed");
        }
        int i = this.f10450;
        if (-1 == i) {
            throw new C2617("Mark has been invalidated, pos: " + this.f10448 + " markLimit: " + this.f10449);
        }
        this.f10448 = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j) {
        if (j < 1) {
            return 0L;
        }
        byte[] bArr = this.f10451;
        if (bArr == null) {
            m6821();
            throw null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            m6821();
            throw null;
        }
        int i = this.f10447;
        int i2 = this.f10448;
        if (i - i2 >= j) {
            this.f10448 = (int) (i2 + j);
            return j;
        }
        long j2 = i - i2;
        this.f10448 = i;
        if (this.f10450 == -1 || j > this.f10449) {
            long jSkip = inputStream.skip(j - j2);
            if (jSkip > 0) {
                this.f10450 = -1;
            }
            return j2 + jSkip;
        }
        if (m6823(inputStream, bArr) == -1) {
            return j2;
        }
        int i3 = this.f10447;
        int i4 = this.f10448;
        if (i3 - i4 >= j - j2) {
            this.f10448 = (int) ((i4 + j) - j2);
            return j;
        }
        long j3 = (j2 + i3) - i4;
        this.f10448 = i3;
        return j3;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final synchronized void m6822() {
        if (this.f10451 != null) {
            this.f10452.m5966(this.f10451);
            this.f10451 = null;
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int m6823(InputStream inputStream, byte[] bArr) throws IOException {
        int i = this.f10450;
        if (i != -1) {
            int i2 = this.f10448 - i;
            int i3 = this.f10449;
            if (i2 < i3) {
                if (i == 0 && i3 > bArr.length && this.f10447 == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i3) {
                        i3 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f10452.m5971(i3, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f10451 = bArr2;
                    this.f10452.m5966(bArr);
                    bArr = bArr2;
                } else if (i > 0) {
                    System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                }
                int i4 = this.f10448 - this.f10450;
                this.f10448 = i4;
                this.f10450 = 0;
                this.f10447 = 0;
                int i5 = inputStream.read(bArr, i4, bArr.length - i4);
                int i6 = this.f10448;
                if (i5 > 0) {
                    i6 += i5;
                }
                this.f10447 = i6;
                return i5;
            }
        }
        int i7 = inputStream.read(bArr);
        if (i7 > 0) {
            this.f10450 = -1;
            this.f10448 = 0;
            this.f10447 = i7;
        }
        return i7;
    }
}
