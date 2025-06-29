package p000;

import java.io.InputStream;
import p383.AbstractC4464;

/* renamed from: ʻ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0876 extends InputStream {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C0882 f3976;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final InterfaceC0875 f3980;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public boolean f3979 = false;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public boolean f3977 = false;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final byte[] f3978 = new byte[1];

    public C0876(InterfaceC0875 interfaceC0875, C0882 c0882) {
        this.f3980 = interfaceC0875;
        this.f3976 = c0882;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3977) {
            return;
        }
        this.f3980.close();
        this.f3977 = true;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f3978;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        AbstractC4464.m10132(!this.f3977);
        m3690();
        int iMo3679 = this.f3980.mo3679(bArr, i, i2);
        if (iMo3679 == -1) {
            return -1;
        }
        return iMo3679;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m3690() {
        if (this.f3979) {
            return;
        }
        this.f3980.mo3680(this.f3976);
        this.f3979 = true;
    }
}
