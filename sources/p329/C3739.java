package p329;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: ᴵᵢ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3739 extends InputStream {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public int f14497 = -1;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final ByteBuffer f14498;

    public C3739(ByteBuffer byteBuffer) {
        this.f14498 = byteBuffer;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f14498.remaining();
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i) {
        this.f14497 = this.f14498.position();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        ByteBuffer byteBuffer = this.f14498;
        if (byteBuffer.hasRemaining()) {
            return byteBuffer.get() & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        ByteBuffer byteBuffer = this.f14498;
        if (!byteBuffer.hasRemaining()) {
            return -1;
        }
        int iMin = Math.min(i2, byteBuffer.remaining());
        byteBuffer.get(bArr, i, iMin);
        return iMin;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        int i = this.f14497;
        if (i == -1) {
            throw new IOException("Cannot reset to unset mark position");
        }
        this.f14498.position(i);
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        ByteBuffer byteBuffer = this.f14498;
        if (!byteBuffer.hasRemaining()) {
            return -1L;
        }
        long jMin = Math.min(j, byteBuffer.remaining());
        byteBuffer.position((int) (byteBuffer.position() + jMin));
        return jMin;
    }
}
