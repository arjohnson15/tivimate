package p063;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.ComponentCallbacks2C0294;
import p137.C2106;
import p137.InterfaceC2105;
import p156.C2337;
import p261.InterfaceC3228;
import p261.InterfaceC3251;
import p329.AbstractC3740;
import p331.C3758;

/* renamed from: ʾᐧ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1447 implements InterfaceC3251, InterfaceC3228 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ int f5923;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Drawable f5924;

    public C1447(Drawable drawable, int i) {
        this.f5923 = i;
        AbstractC3740.m8706(drawable, "Argument must not be null");
        this.f5924 = drawable;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    private final void m5002() {
    }

    @Override // p261.InterfaceC3251
    public final Object get() {
        Drawable drawable = this.f5924;
        Drawable.ConstantState constantState = drawable.getConstantState();
        return constantState == null ? drawable : constantState.newDrawable();
    }

    @Override // p261.InterfaceC3251
    /* renamed from: ʽᐧ */
    public final int mo4601() {
        switch (this.f5923) {
            case 0:
                C1448 c1448 = (C1448) ((C1457) this.f5924).f5965.f5948;
                C2337 c2337 = c1448.f5935;
                return (c2337.f9279.length * 4) + c2337.f9295.limit() + c2337.f9296.length + c1448.f5938;
            default:
                Drawable drawable = this.f5924;
                return Math.max(1, drawable.getIntrinsicHeight() * drawable.getIntrinsicWidth() * 4);
        }
    }

    @Override // p261.InterfaceC3251
    /* renamed from: ʿʼ */
    public final void mo4602() {
        C2106 c2106;
        C2106 c21062;
        C2106 c21063;
        switch (this.f5923) {
            case 0:
                C1457 c1457 = (C1457) this.f5924;
                c1457.stop();
                c1457.f5964 = true;
                C1448 c1448 = (C1448) c1457.f5965.f5948;
                c1448.f5933.clear();
                Bitmap bitmap = c1448.f5928;
                if (bitmap != null) {
                    c1448.f5926.mo5961(bitmap);
                    c1448.f5928 = null;
                }
                c1448.f5936 = false;
                C1456 c1456 = c1448.f5940;
                ComponentCallbacks2C0294 componentCallbacks2C0294 = c1448.f5939;
                if (c1456 != null) {
                    componentCallbacks2C0294.m1595(c1456);
                    c1448.f5940 = null;
                }
                C1456 c14562 = c1448.f5930;
                if (c14562 != null) {
                    componentCallbacks2C0294.m1595(c14562);
                    c1448.f5930 = null;
                }
                C1456 c14563 = c1448.f5929;
                if (c14563 != null) {
                    componentCallbacks2C0294.m1595(c14563);
                    c1448.f5929 = null;
                }
                C2337 c2337 = c1448.f5935;
                c2337.f9280 = null;
                byte[] bArr = c2337.f9296;
                C3758 c3758 = c2337.f9286;
                if (bArr != null && (c21063 = (C2106) c3758.f14520) != null) {
                    c21063.m5966(bArr);
                }
                int[] iArr = c2337.f9279;
                if (iArr != null && (c21062 = (C2106) c3758.f14520) != null) {
                    c21062.m5966(iArr);
                }
                Bitmap bitmap2 = c2337.f9281;
                if (bitmap2 != null) {
                    ((InterfaceC2105) c3758.f14519).mo5961(bitmap2);
                }
                c2337.f9281 = null;
                c2337.f9295 = null;
                c2337.f9292 = null;
                byte[] bArr2 = c2337.f9278;
                if (bArr2 != null && (c2106 = (C2106) c3758.f14520) != null) {
                    c2106.m5966(bArr2);
                }
                c1448.f5927 = true;
                break;
        }
    }

    @Override // p261.InterfaceC3228
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public void mo5003() {
        switch (this.f5923) {
            case 0:
                ((C1448) ((C1457) this.f5924).f5965.f5948).f5928.prepareToDraw();
                break;
            default:
                Drawable drawable = this.f5924;
                if (!(drawable instanceof BitmapDrawable)) {
                    if (drawable instanceof C1457) {
                        ((C1448) ((C1457) drawable).f5965.f5948).f5928.prepareToDraw();
                        break;
                    }
                } else {
                    ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
                    break;
                }
                break;
        }
    }

    @Override // p261.InterfaceC3251
    /* renamed from: ﹳﹳ */
    public final Class mo4603() {
        switch (this.f5923) {
            case 0:
                return C1457.class;
            default:
                return this.f5924.getClass();
        }
    }
}
