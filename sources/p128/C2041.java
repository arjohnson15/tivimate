package p128;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: ˈﹳ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2041 extends C2036 {
    public C2041(InputStream inputStream) {
        super(inputStream);
        if (!inputStream.markSupported()) {
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
        this.f7709.mark(Integer.MAX_VALUE);
    }

    public C2041(byte[] bArr) {
        super(bArr);
        this.f7709.mark(Integer.MAX_VALUE);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m5696(long j) throws IOException {
        int i = this.f7707;
        if (i > j) {
            this.f7707 = 0;
            this.f7709.reset();
        } else {
            j -= i;
        }
        m5685((int) j);
    }
}
