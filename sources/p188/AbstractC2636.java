package p188;

import android.graphics.Bitmap;
import com.bumptech.glide.C0284;
import com.bumptech.glide.ComponentCallbacks2C0283;
import p137.InterfaceC2105;
import p261.InterfaceC3251;
import p314.InterfaceC3596;
import p329.AbstractC3742;
import ـˈ.ˉᵎ;

/* renamed from: ˎʾ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2636 implements InterfaceC3596 {
    @Override // p314.InterfaceC3596
    /* renamed from: ʽᐧ */
    public final InterfaceC3251 mo5011(C0284 c0284, InterfaceC3251 interfaceC3251, int i, int i2) {
        if (!AbstractC3742.m8717(i, i2)) {
            throw new IllegalArgumentException(ˉᵎ.ˋⁱ("Cannot apply transformation on width: ", i, " or height: ", i2, " less than or equal to zero and not Target.SIZE_ORIGINAL"));
        }
        InterfaceC2105 interfaceC2105 = ComponentCallbacks2C0283.m1550(c0284).f2337;
        Bitmap bitmap = (Bitmap) interfaceC3251.get();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getHeight();
        }
        Bitmap bitmapMo6804 = mo6804(interfaceC2105, bitmap, i, i2);
        return bitmap.equals(bitmapMo6804) ? interfaceC3251 : C2624.m6805(bitmapMo6804, interfaceC2105);
    }

    /* renamed from: ˑʽ */
    public abstract Bitmap mo6804(InterfaceC2105 interfaceC2105, Bitmap bitmap, int i, int i2);
}
