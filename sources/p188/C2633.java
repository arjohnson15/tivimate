package p188;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.C0284;
import com.bumptech.glide.ComponentCallbacks2C0283;
import java.security.MessageDigest;
import p137.InterfaceC2105;
import p261.InterfaceC3251;
import p314.InterfaceC3596;

/* renamed from: ˎʾ.ᵎـ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2633 implements InterfaceC3596 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final InterfaceC3596 f10435;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final boolean f10436;

    public C2633(InterfaceC3596 interfaceC3596, boolean z) {
        this.f10435 = interfaceC3596;
        this.f10436 = z;
    }

    @Override // p314.InterfaceC3594
    public final boolean equals(Object obj) {
        if (obj instanceof C2633) {
            return this.f10435.equals(((C2633) obj).f10435);
        }
        return false;
    }

    @Override // p314.InterfaceC3594
    public final int hashCode() {
        return this.f10435.hashCode();
    }

    @Override // p314.InterfaceC3596
    /* renamed from: ʽᐧ */
    public final InterfaceC3251 mo5011(C0284 c0284, InterfaceC3251 interfaceC3251, int i, int i2) {
        InterfaceC2105 interfaceC2105 = ComponentCallbacks2C0283.m1550(c0284).f2337;
        Drawable drawable = (Drawable) interfaceC3251.get();
        C2624 c2624M6806 = AbstractC2625.m6806(interfaceC2105, drawable, i, i2);
        if (c2624M6806 != null) {
            InterfaceC3251 interfaceC3251Mo5011 = this.f10435.mo5011(c0284, c2624M6806, i, i2);
            if (!interfaceC3251Mo5011.equals(c2624M6806)) {
                return new C2624(c0284.getResources(), interfaceC3251Mo5011);
            }
            interfaceC3251Mo5011.mo4602();
            return interfaceC3251;
        }
        if (!this.f10436) {
            return interfaceC3251;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // p314.InterfaceC3594
    /* renamed from: ـﹶ */
    public final void mo3713(MessageDigest messageDigest) {
        this.f10435.mo3713(messageDigest);
    }
}
