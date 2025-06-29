package p008;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: ʻˊ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0975 extends OutputStream {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final AbstractC0970 f4315;

    public AbstractC0975(AbstractC0970 abstractC0970) {
        this.f4315 = abstractC0970;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f4315.close();
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        write(new byte[]{(byte) i});
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.f4315.write(bArr, i, i2);
    }

    /* renamed from: ـﹶ */
    public void mo3941() {
        this.f4315.mo3940();
    }
}
