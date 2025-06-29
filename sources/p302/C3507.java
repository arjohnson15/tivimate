package p302;

import java.io.OutputStream;

/* renamed from: ᐧʽ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3507 extends OutputStream {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public long f13602;

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f13602++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f13602 += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f13602 += i2;
    }
}
