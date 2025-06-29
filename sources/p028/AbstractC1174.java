package p028;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

/* renamed from: ʼˋ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC1174 extends InputStream {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final byte[] f4857 = new byte[1];

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final AbstractC1168 f4858;

    public AbstractC1174(AbstractC1168 abstractC1168) {
        this.f4858 = abstractC1168;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f4858.close();
    }

    @Override // java.io.InputStream
    public int read() {
        byte[] bArr = this.f4857;
        if (read(bArr) == -1) {
            return -1;
        }
        return bArr[0];
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        return this.f4858.read(bArr, i, i2);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int mo4228(PushbackInputStream pushbackInputStream) {
        return 0;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public void mo4229(PushbackInputStream pushbackInputStream, int i) {
        this.f4858.mo4224(pushbackInputStream, i);
    }
}
