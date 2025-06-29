package p128;

import android.media.MediaDataSource;
import java.io.IOException;

/* renamed from: ˈﹳ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2040 extends MediaDataSource {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ C2041 f7716;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public long f7717;

    public C2040(C2041 c2041) {
        this.f7716 = c2041;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        if (j < 0) {
            return -1;
        }
        try {
            long j2 = this.f7717;
            if (j2 != j) {
                if (j2 >= 0 && j >= j2 + this.f7716.f7709.available()) {
                    return -1;
                }
                this.f7716.m5696(j);
                this.f7717 = j;
            }
            if (i2 > this.f7716.f7709.available()) {
                i2 = this.f7716.f7709.available();
            }
            int i3 = this.f7716.read(bArr, i, i2);
            if (i3 >= 0) {
                this.f7717 += i3;
                return i3;
            }
        } catch (IOException unused) {
        }
        this.f7717 = -1L;
        return -1;
    }
}
