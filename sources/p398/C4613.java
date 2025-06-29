package p398;

import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: ⁱᵔ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4613 extends OutputStream {

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public static final byte[] f17637 = new byte[0];

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public int f17638;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f17639;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public int f17640;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public byte[] f17641;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final ArrayList f17642 = new ArrayList();

    public C4613() {
        synchronized (this) {
            m10494(1024);
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public final String toString() {
        return new String(m10493(), Charset.defaultCharset());
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i) {
        try {
            int i2 = this.f17639;
            int i3 = i2 - this.f17640;
            if (i3 == this.f17641.length) {
                m10494(i2 + 1);
                i3 = 0;
            }
            this.f17641[i3] = (byte) i;
            this.f17639++;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return;
        }
        synchronized (this) {
            try {
                int i4 = this.f17639;
                int i5 = i4 + i2;
                int i6 = i4 - this.f17640;
                while (i2 > 0) {
                    int iMin = Math.min(i2, this.f17641.length - i6);
                    System.arraycopy(bArr, i3 - i2, this.f17641, i6, iMin);
                    i2 -= iMin;
                    if (i2 > 0) {
                        m10494(i5);
                        i6 = 0;
                    }
                }
                this.f17639 = i5;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final synchronized byte[] m10493() {
        int i = this.f17639;
        if (i == 0) {
            return f17637;
        }
        byte[] bArr = new byte[i];
        Iterator it = this.f17642.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            int iMin = Math.min(bArr2.length, i);
            System.arraycopy(bArr2, 0, bArr, i2, iMin);
            i2 += iMin;
            i -= iMin;
            if (i == 0) {
                break;
            }
        }
        return bArr;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m10494(int i) {
        int i2 = this.f17638;
        ArrayList arrayList = this.f17642;
        if (i2 < arrayList.size() - 1) {
            this.f17640 += this.f17641.length;
            int i3 = this.f17638 + 1;
            this.f17638 = i3;
            this.f17641 = (byte[]) arrayList.get(i3);
            return;
        }
        byte[] bArr = this.f17641;
        if (bArr == null) {
            this.f17640 = 0;
        } else {
            i = Math.max(bArr.length << 1, i - this.f17640);
            this.f17640 += this.f17641.length;
        }
        this.f17638++;
        byte[] bArr2 = new byte[i];
        this.f17641 = bArr2;
        arrayList.add(bArr2);
    }
}
