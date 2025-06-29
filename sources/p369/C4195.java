package p369;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: ᵢʽ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4195 extends InputStream {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public int f16166;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ C4187 f16167;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public int f16168;

    public C4195(C4187 c4187, C4188 c4188) {
        this.f16167 = c4187;
        this.f16168 = c4187.m9603(c4188.f16152 + 4);
        this.f16166 = c4188.f16151;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f16166 == 0) {
            return -1;
        }
        C4187 c4187 = this.f16167;
        c4187.f16148.seek(this.f16168);
        int i = c4187.f16148.read();
        this.f16168 = c4187.m9603(this.f16168 + 1);
        this.f16166--;
        return i;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        if ((i | i2) < 0 || i2 > bArr.length - i) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i3 = this.f16166;
        if (i3 <= 0) {
            return -1;
        }
        if (i2 > i3) {
            i2 = i3;
        }
        int i4 = this.f16168;
        C4187 c4187 = this.f16167;
        c4187.m9608(i4, i, i2, bArr);
        this.f16168 = c4187.m9603(this.f16168 + i2);
        this.f16166 -= i2;
        return i2;
    }
}
