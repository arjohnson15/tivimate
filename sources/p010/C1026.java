package p010;

import p185.InterfaceC2566;
import p330.InterfaceC3746;
import p330.InterfaceC3747;

/* renamed from: ʻˎ.ﾞˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1026 implements InterfaceC3746, InterfaceC2566 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final InterfaceC3747 f4413;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final InterfaceC3746 f4414;

    public C1026(InterfaceC3746 interfaceC3746, InterfaceC3747 interfaceC3747) {
        this.f4414 = interfaceC3746;
        this.f4413 = interfaceC3747;
    }

    @Override // p330.InterfaceC3746
    /* renamed from: ˉי */
    public final void mo3974(Object obj) {
        this.f4414.mo3974(obj);
    }

    @Override // p185.InterfaceC2566
    /* renamed from: ٴˎ */
    public final InterfaceC2566 mo3962() {
        InterfaceC3746 interfaceC3746 = this.f4414;
        if (interfaceC3746 instanceof InterfaceC2566) {
            return (InterfaceC2566) interfaceC3746;
        }
        return null;
    }

    @Override // p330.InterfaceC3746
    /* renamed from: ᐧʻ */
    public final InterfaceC3747 mo3963() {
        return this.f4413;
    }
}
