package p396;

import p072.C1602;
import p155.EnumC2332;
import p207.C2789;
import p330.InterfaceC3746;
import p430.InterfaceC5019;
import ⁱـ.ˑי;

/* renamed from: ⁱᴵ.ᵎـ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4583 extends AbstractC4582 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final InterfaceC4575 f17534;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final /* synthetic */ int f17535;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4583(C4564 c4564, InterfaceC5019 interfaceC5019, InterfaceC4560 interfaceC4560, InterfaceC4575 interfaceC4575, int i) {
        super(c4564, interfaceC5019, interfaceC4560);
        this.f17535 = i;
        this.f17534 = interfaceC4575;
    }

    @Override // p396.AbstractC4582
    /* renamed from: ـﹶ */
    public final Object mo10435(C4590 c4590, Object[] objArr) {
        switch (this.f17535) {
            case 0:
                return this.f17534.mo2484(c4590);
            default:
                InterfaceC4591 interfaceC4591 = (InterfaceC4591) this.f17534.mo2484(c4590);
                InterfaceC3746 interfaceC3746 = (InterfaceC3746) objArr[objArr.length - 1];
                try {
                    C1602 c1602 = new C1602(1, ˑי.ˏᴵ(interfaceC3746));
                    c1602.m5205();
                    c1602.m5219(new C4551(interfaceC4591, 2));
                    interfaceC4591.mo10461(new C2789(c1602, 2));
                    return c1602.m5203();
                } catch (Exception e) {
                    AbstractC4581.m10470(e, interfaceC3746);
                    return EnumC2332.f9250;
                }
        }
    }
}
