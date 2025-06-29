package p329;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import ᵎﹳ.ᐧʻ;

/* renamed from: ᴵᵢ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3743 extends FilterInputStream {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public int f14504;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final long f14505;

    public C3743(InputStream inputStream, long j) {
        super(inputStream);
        this.f14505 = j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        return (int) Math.max(this.f14505 - this.f14504, ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        int i;
        i = super.read();
        m8718(i >= 0 ? 1 : -1);
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        int i3;
        i3 = super.read(bArr, i, i2);
        m8718(i3);
        return i3;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m8718(int i) throws IOException {
        if (i >= 0) {
            this.f14504 += i;
            return;
        }
        long j = this.f14504;
        long j2 = this.f14505;
        if (j2 - j <= 0) {
            return;
        }
        StringBuilder sb = ᐧʻ.ˑי(j2, "Failed to read all expected data, expected: ", ", but read: ");
        sb.append(this.f14504);
        throw new IOException(sb.toString());
    }
}
