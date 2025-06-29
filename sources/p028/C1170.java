package p028;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

/* renamed from: ʼˋ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1170 extends InputStream {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public long f4837;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public byte[] f4838;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public long f4839;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public PushbackInputStream f4840;

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f4840.close();
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f4838;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0];
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.f4839;
        if (j != -1) {
            long j2 = this.f4837;
            if (j2 >= j) {
                return -1;
            }
            long j3 = j - j2;
            if (i2 > j3) {
                i2 = (int) j3;
            }
        }
        int i3 = this.f4840.read(bArr, i, i2);
        if (i3 > 0) {
            this.f4837 += i3;
        }
        return i3;
    }
}
