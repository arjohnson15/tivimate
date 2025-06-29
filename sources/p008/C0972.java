package p008;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: ʻˊ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0972 extends OutputStream {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public OutputStream f4292;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public boolean f4293;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public long f4294;

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        write(new byte[]{(byte) i}, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if (this.f4293) {
            throw new IllegalStateException("ZipEntryOutputStream is closed");
        }
        this.f4292.write(bArr, i, i2);
        this.f4294 += i2;
    }
}
