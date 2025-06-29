package p405;

import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

/* renamed from: ﹳʽ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4641 extends FilterInputStream {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public long f17756;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public long f17757;

    public C4641(ByteArrayInputStream byteArrayInputStream) {
        super(byteArrayInputStream);
        this.f17756 = -1L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        ((FilterInputStream) this).in.mark(i);
        this.f17756 = this.f17757;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = ((FilterInputStream) this).in.read();
        if (i != -1) {
            this.f17757++;
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (i3 != -1) {
            this.f17757 += i3;
        }
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.f17756 == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.f17757 = this.f17756;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jSkip = ((FilterInputStream) this).in.skip(j);
        this.f17757 += jSkip;
        return jSkip;
    }
}
