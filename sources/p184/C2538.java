package p184;

import p010.AbstractC1014;
import p010.C1015;
import p070.C1561;
import p155.EnumC2332;
import p288.C3397;
import p330.InterfaceC3746;

/* renamed from: ˎ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2538 implements InterfaceC2551 {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final InterfaceC2551 f10080;

    public C2538(InterfaceC2551 interfaceC2551) {
        this.f10080 = interfaceC2551;
    }

    @Override // p184.InterfaceC2551
    /* renamed from: ـﹶ */
    public final Object mo3972(InterfaceC2552 interfaceC2552, InterfaceC3746 interfaceC3746) {
        C1561 c1561 = new C1561();
        c1561.f6302 = AbstractC1014.f4386;
        Object objMo3972 = this.f10080.mo3972(new C1015(this, c1561, interfaceC2552, 1), interfaceC3746);
        return objMo3972 == EnumC2332.f9250 ? objMo3972 : C3397.f13249;
    }
}
