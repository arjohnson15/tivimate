package p188;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import p128.C2039;
import p128.C2042;
import p137.C2106;
import p314.InterfaceC3603;
import p329.AbstractC3731;
import p329.C3739;

/* renamed from: ˎʾ.ˎٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2620 implements InterfaceC3603 {
    @Override // p314.InterfaceC3603
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int mo6795(InputStream inputStream, C2106 c2106) throws Throwable {
        C2042 c2042 = new C2042(inputStream);
        C2039 c2039M5709 = c2042.m5709("Orientation");
        int iM5692 = 1;
        if (c2039M5709 != null) {
            try {
                iM5692 = c2039M5709.m5692(c2042.f7754);
            } catch (NumberFormatException unused) {
            }
        }
        if (iM5692 == 0) {
            return -1;
        }
        return iM5692;
    }

    @Override // p314.InterfaceC3603
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int mo6796(ByteBuffer byteBuffer, C2106 c2106) {
        AtomicReference atomicReference = AbstractC3731.f14482;
        return mo6795(new C3739(byteBuffer), c2106);
    }

    @Override // p314.InterfaceC3603
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ImageHeaderParser$ImageType mo6797(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // p314.InterfaceC3603
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final ImageHeaderParser$ImageType mo6798(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }
}
