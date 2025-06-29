package p188;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import p137.InterfaceC2105;
import p261.InterfaceC3228;
import p261.InterfaceC3251;
import p329.AbstractC3740;
import p329.AbstractC3742;

/* renamed from: ˎʾ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2624 implements InterfaceC3251, InterfaceC3228 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final Object f10410;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final Object f10411;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f10412 = 1;

    public C2624(Resources resources, InterfaceC3251 interfaceC3251) {
        AbstractC3740.m8706(resources, "Argument must not be null");
        this.f10410 = resources;
        AbstractC3740.m8706(interfaceC3251, "Argument must not be null");
        this.f10411 = interfaceC3251;
    }

    public C2624(Bitmap bitmap, InterfaceC2105 interfaceC2105) {
        AbstractC3740.m8706(bitmap, "Bitmap must not be null");
        this.f10410 = bitmap;
        AbstractC3740.m8706(interfaceC2105, "BitmapPool must not be null");
        this.f10411 = interfaceC2105;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static C2624 m6805(Bitmap bitmap, InterfaceC2105 interfaceC2105) {
        if (bitmap == null) {
            return null;
        }
        return new C2624(bitmap, interfaceC2105);
    }

    @Override // p261.InterfaceC3251
    public final Object get() {
        switch (this.f10412) {
            case 0:
                return (Bitmap) this.f10410;
            default:
                return new BitmapDrawable((Resources) this.f10410, (Bitmap) ((InterfaceC3251) this.f10411).get());
        }
    }

    @Override // p261.InterfaceC3251
    /* renamed from: ʽᐧ */
    public final int mo4601() {
        switch (this.f10412) {
            case 0:
                return AbstractC3742.m8712((Bitmap) this.f10410);
            default:
                return ((InterfaceC3251) this.f10411).mo4601();
        }
    }

    @Override // p261.InterfaceC3251
    /* renamed from: ʿʼ */
    public final void mo4602() {
        switch (this.f10412) {
            case 0:
                ((InterfaceC2105) this.f10411).mo5961((Bitmap) this.f10410);
                break;
            default:
                ((InterfaceC3251) this.f10411).mo4602();
                break;
        }
    }

    @Override // p261.InterfaceC3228
    /* renamed from: ـﹶ */
    public final void mo5003() {
        switch (this.f10412) {
            case 0:
                ((Bitmap) this.f10410).prepareToDraw();
                break;
            default:
                InterfaceC3251 interfaceC3251 = (InterfaceC3251) this.f10411;
                if (interfaceC3251 instanceof InterfaceC3228) {
                    ((InterfaceC3228) interfaceC3251).mo5003();
                    break;
                }
                break;
        }
    }

    @Override // p261.InterfaceC3251
    /* renamed from: ﹳﹳ */
    public final Class mo4603() {
        switch (this.f10412) {
            case 0:
                return Bitmap.class;
            default:
                return BitmapDrawable.class;
        }
    }
}
