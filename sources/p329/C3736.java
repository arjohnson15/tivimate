package p329;

import java.io.FilterInputStream;
import java.io.IOException;

/* renamed from: ᴵᵢ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3736 extends FilterInputStream {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public int f14493;

    public C3736(C3732 c3732) {
        super(c3732);
        this.f14493 = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        int i = this.f14493;
        return i == Integer.MIN_VALUE ? super.available() : Math.min(i, super.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        super.mark(i);
        this.f14493 = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (m8703(1L) == -1) {
            return -1;
        }
        int i = super.read();
        m8702(1L);
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int iM8703 = (int) m8703(i2);
        if (iM8703 == -1) {
            return -1;
        }
        int i3 = super.read(bArr, i, iM8703);
        m8702(i3);
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        super.reset();
        this.f14493 = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jM8703 = m8703(j);
        if (jM8703 == -1) {
            return 0L;
        }
        long jSkip = super.skip(jM8703);
        m8702(jSkip);
        return jSkip;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m8702(long j) {
        int i = this.f14493;
        if (i == Integer.MIN_VALUE || j == -1) {
            return;
        }
        this.f14493 = (int) (i - j);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final long m8703(long j) {
        int i = this.f14493;
        if (i == 0) {
            return -1L;
        }
        return (i == Integer.MIN_VALUE || j <= ((long) i)) ? j : i;
    }
}
