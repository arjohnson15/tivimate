package p063;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;
import p137.InterfaceC2105;
import p149.AbstractC2293;
import p156.C2337;
import p188.C2624;
import p261.InterfaceC3251;
import p304.C3521;
import p314.C3598;
import p314.InterfaceC3595;
import ﹳᴵ.ˉי;

/* renamed from: ʾᐧ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1451 implements InterfaceC3595 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final InterfaceC2105 f5946;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f5947;

    public C1451() {
        this.f5947 = 1;
        this.f5946 = new ˉי(17);
    }

    public C1451(InterfaceC2105 interfaceC2105) {
        this.f5947 = 0;
        this.f5946 = interfaceC2105;
    }

    @Override // p314.InterfaceC3595
    /* renamed from: ʽᐧ */
    public final /* bridge */ /* synthetic */ boolean mo4999(Object obj, C3598 c3598) {
        switch (this.f5947) {
            case 0:
                break;
            default:
                AbstractC2293.m6318(obj);
                break;
        }
        return true;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public C2624 m5007(ImageDecoder.Source source, int i, int i2, C3598 c3598) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new C3521(i, i2, c3598));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            String str = "Decoded [" + bitmapDecodeBitmap.getWidth() + "x" + bitmapDecodeBitmap.getHeight() + "] for [" + i + "x" + i2 + "]";
        }
        return new C2624(bitmapDecodeBitmap, (InterfaceC2105) this.f5946);
    }

    @Override // p314.InterfaceC3595
    /* renamed from: ـﹶ */
    public final InterfaceC3251 mo5001(Object obj, int i, int i2, C3598 c3598) {
        switch (this.f5947) {
            case 0:
                return C2624.m6805(((C2337) obj).m6422(), this.f5946);
            default:
                return m5007(AbstractC2293.m6312(obj), i, i2, c3598);
        }
    }
}
