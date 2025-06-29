package p028;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import p080.AbstractC1702;
import p223.AbstractC2978;
import p298.C3500;
import p367.InterfaceC4174;

/* renamed from: ʼˋ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC1168 extends InputStream {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final InterfaceC4174 f4832;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final byte[] f4833;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final byte[] f4834 = new byte[1];

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C1170 f4835;

    public AbstractC1168(C1170 c1170, C3500 c3500, char[] cArr, int i, boolean z) {
        this.f4835 = c1170;
        this.f4832 = mo4222(c3500, cArr, z);
        if (AbstractC1702.m5410(AbstractC2978.m7366(c3500), 2)) {
            this.f4833 = new byte[i];
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f4835.close();
    }

    @Override // java.io.InputStream
    public int read() {
        byte[] bArr = this.f4834;
        if (read(bArr) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int iM7368 = AbstractC2978.m7368(this.f4835, bArr, i, i2);
        if (iM7368 > 0) {
            byte[] bArr2 = this.f4833;
            if (bArr2 != null) {
                System.arraycopy(bArr, 0, bArr2, 0, iM7368);
            }
            this.f4832.mo9591(bArr, i, iM7368);
        }
        return iM7368;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public abstract InterfaceC4174 mo4222(C3500 c3500, char[] cArr, boolean z);

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m4223(byte[] bArr) throws IOException {
        PushbackInputStream pushbackInputStream = this.f4835.f4840;
        int i = pushbackInputStream.read(bArr);
        if (i == -1) {
            throw new IOException("Unexpected EOF reached when trying to read stream");
        }
        if (i != bArr.length) {
            int length = bArr.length - i;
            int i2 = 0;
            for (int i3 = 0; i < bArr.length && i2 != -1 && i3 < 15; i3++) {
                i2 += pushbackInputStream.read(bArr, i, length);
                if (i2 > 0) {
                    i += i2;
                    length -= i2;
                }
            }
            if (i != bArr.length) {
                throw new IOException("Cannot read fully into byte buffer");
            }
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public void mo4224(PushbackInputStream pushbackInputStream, int i) {
    }
}
