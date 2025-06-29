package p188;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;
import p137.InterfaceC2105;
import p314.InterfaceC3594;

/* renamed from: ˎʾ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2629 extends AbstractC2636 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final byte[] f10421 = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(InterfaceC3594.f13813);

    @Override // p314.InterfaceC3594
    public final boolean equals(Object obj) {
        return obj instanceof C2629;
    }

    @Override // p314.InterfaceC3594
    public final int hashCode() {
        return -599754482;
    }

    @Override // p188.AbstractC2636
    /* renamed from: ˑʽ */
    public final Bitmap mo6804(InterfaceC2105 interfaceC2105, Bitmap bitmap, int i, int i2) {
        float width;
        float height;
        Paint paint = AbstractC2626.f10415;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width2 = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            width = i2 / bitmap.getHeight();
            width2 = (i - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i / bitmap.getWidth();
            height = (i2 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (width2 + 0.5f), (int) (height + 0.5f));
        Bitmap bitmapMo5960 = interfaceC2105.mo5960(i, i2, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        bitmapMo5960.setHasAlpha(bitmap.hasAlpha());
        AbstractC2626.m6808(bitmap, bitmapMo5960, matrix);
        return bitmapMo5960;
    }

    @Override // p314.InterfaceC3594
    /* renamed from: ـﹶ */
    public final void mo3713(MessageDigest messageDigest) {
        messageDigest.update(f10421);
    }
}
