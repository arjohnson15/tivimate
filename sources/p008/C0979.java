package p008;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: ʻˊ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0979 extends OutputStream implements InterfaceC0978 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public long f4319;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public C0974 f4320;

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f4320.close();
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
        this.f4320.write(bArr, i, i2);
        this.f4319 += i2;
    }

    @Override // p008.InterfaceC0978
    /* renamed from: ʽᐧ */
    public final long mo3944() {
        C0974 c0974 = this.f4320;
        return c0974 instanceof C0974 ? c0974.f4313.getFilePointer() : this.f4319;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final boolean m3947() {
        C0974 c0974 = this.f4320;
        return (c0974 instanceof C0974) && c0974.f4309 != -1;
    }

    @Override // p008.InterfaceC0978
    /* renamed from: ـﹶ */
    public final int mo3946() {
        if (m3947()) {
            return this.f4320.f4312;
        }
        return 0;
    }
}
