package p188;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

/* renamed from: ˎʾ.ˈٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2614 extends MediaDataSource {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ ByteBuffer f10391;

    public C2614(ByteBuffer byteBuffer) {
        this.f10391 = byteBuffer;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f10391.limit();
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        if (j >= this.f10391.limit()) {
            return -1;
        }
        this.f10391.position((int) j);
        int iMin = Math.min(i2, this.f10391.remaining());
        this.f10391.get(bArr, i, iMin);
        return iMin;
    }
}
