package p216;

import android.graphics.ImageDecoder;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import p137.C2106;
import p261.InterfaceC3251;
import p314.C3598;
import p314.InterfaceC3595;
import p329.AbstractC3731;
import p331.C3767;
import ⁱـ.ˑי;

/* renamed from: ˏˋ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2823 implements InterfaceC3595 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C3767 f10971;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f10972;

    public /* synthetic */ C2823(C3767 c3767, int i) {
        this.f10972 = i;
        this.f10971 = c3767;
    }

    @Override // p314.InterfaceC3595
    /* renamed from: ʽᐧ */
    public final boolean mo4999(Object obj, C3598 c3598) {
        switch (this.f10972) {
            case 0:
                ImageHeaderParser$ImageType imageHeaderParser$ImageType = ˑי.ᴵʿ((ArrayList) this.f10971.f14557, (ByteBuffer) obj);
                if (imageHeaderParser$ImageType == ImageHeaderParser$ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && imageHeaderParser$ImageType == ImageHeaderParser$ImageType.ANIMATED_AVIF)) {
                }
                break;
            default:
                C3767 c3767 = this.f10971;
                ImageHeaderParser$ImageType imageHeaderParser$ImageType2 = ˑי.ˋⁱ((ArrayList) c3767.f14557, (InputStream) obj, (C2106) c3767.f14558);
                if (imageHeaderParser$ImageType2 == ImageHeaderParser$ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && imageHeaderParser$ImageType2 == ImageHeaderParser$ImageType.ANIMATED_AVIF)) {
                }
                break;
        }
        return true;
    }

    @Override // p314.InterfaceC3595
    /* renamed from: ـﹶ */
    public final InterfaceC3251 mo5001(Object obj, int i, int i2, C3598 c3598) {
        switch (this.f10972) {
            case 0:
                return C3767.m8799(ImageDecoder.createSource((ByteBuffer) obj), i, i2, c3598);
            default:
                return C3767.m8799(ImageDecoder.createSource(AbstractC3731.m8693((InputStream) obj)), i, i2, c3598);
        }
    }
}
