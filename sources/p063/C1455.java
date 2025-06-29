package p063;

import android.graphics.Bitmap;
import com.bumptech.glide.C0284;
import com.bumptech.glide.ComponentCallbacks2C0283;
import java.security.MessageDigest;
import p188.C2624;
import p261.InterfaceC3251;
import p314.InterfaceC3596;
import p329.AbstractC3740;

/* renamed from: ʾᐧ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1455 implements InterfaceC3596 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final InterfaceC3596 f5951;

    public C1455(InterfaceC3596 interfaceC3596) {
        AbstractC3740.m8706(interfaceC3596, "Argument must not be null");
        this.f5951 = interfaceC3596;
    }

    @Override // p314.InterfaceC3594
    public final boolean equals(Object obj) {
        if (obj instanceof C1455) {
            return this.f5951.equals(((C1455) obj).f5951);
        }
        return false;
    }

    @Override // p314.InterfaceC3594
    public final int hashCode() {
        return this.f5951.hashCode();
    }

    @Override // p314.InterfaceC3596
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final InterfaceC3251 mo5011(C0284 c0284, InterfaceC3251 interfaceC3251, int i, int i2) {
        C1457 c1457 = (C1457) interfaceC3251.get();
        InterfaceC3251 c2624 = new C2624(((C1448) c1457.f5965.f5948).f5928, ComponentCallbacks2C0283.m1550(c0284).f2337);
        InterfaceC3596 interfaceC3596 = this.f5951;
        InterfaceC3251 interfaceC3251Mo5011 = interfaceC3596.mo5011(c0284, c2624, i, i2);
        if (!c2624.equals(interfaceC3251Mo5011)) {
            c2624.mo4602();
        }
        ((C1448) c1457.f5965.f5948).m5005(interfaceC3596, (Bitmap) interfaceC3251Mo5011.get());
        return interfaceC3251;
    }

    @Override // p314.InterfaceC3594
    /* renamed from: ـﹶ */
    public final void mo3713(MessageDigest messageDigest) {
        this.f5951.mo3713(messageDigest);
    }
}
