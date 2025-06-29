package p028;

import java.io.IOException;
import p298.C3493;

/* renamed from: ʼˋ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1176 extends AbstractC1173 {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public C1177 f4867;

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        C1177 c1177 = this.f4867;
        if (c1177 != null) {
            c1177.close();
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        return this.f4867.read();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return this.f4867.read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        return this.f4867.read(bArr, i, i2);
    }

    @Override // p028.AbstractC1173
    /* renamed from: ـﹶ */
    public final void mo4226(C3493 c3493) throws IOException {
        this.f4867.seek(c3493.f13512);
    }
}
