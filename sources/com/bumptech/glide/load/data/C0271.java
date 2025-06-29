package com.bumptech.glide.load.data;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import ـˈ.ˉᵎ;

/* renamed from: com.bumptech.glide.load.data.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0271 extends FilterInputStream {

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static final byte[] f2308 = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static final int f2309 = 31;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public int f2310;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final byte f2311;

    public C0271(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            throw new IllegalArgumentException(ˉᵎ.ˉⁱ("Cannot add invalid orientation: ", i));
        }
        this.f2311 = (byte) i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int i;
        int i2 = this.f2310;
        int i3 = (i2 < 2 || i2 > (i = f2309)) ? super.read() : i2 == i ? this.f2311 : f2308[i2 - 2] & 255;
        if (i3 != -1) {
            this.f2310++;
        }
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4 = this.f2310;
        int i5 = f2309;
        if (i4 > i5) {
            i3 = super.read(bArr, i, i2);
        } else if (i4 == i5) {
            bArr[i] = this.f2311;
            i3 = 1;
        } else if (i4 < 2) {
            i3 = super.read(bArr, i, 2 - i4);
        } else {
            int iMin = Math.min(i5 - i4, i2);
            System.arraycopy(f2308, this.f2310 - 2, bArr, i, iMin);
            i3 = iMin;
        }
        if (i3 > 0) {
            this.f2310 += i3;
        }
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jSkip = super.skip(j);
        if (jSkip > 0) {
            this.f2310 = (int) (this.f2310 + jSkip);
        }
        return jSkip;
    }
}
