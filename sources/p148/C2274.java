package p148;

import p072.AbstractC1614;
import p072.AbstractC1642;
import p185.InterfaceC2566;
import p330.InterfaceC3746;
import p330.InterfaceC3747;
import ⁱـ.ˑי;

/* renamed from: ˊʻ.ᵎـ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C2274 extends AbstractC1614 implements InterfaceC2566 {

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final InterfaceC3746 f9019;

    public C2274(InterfaceC3746 interfaceC3746, InterfaceC3747 interfaceC3747) {
        super(interfaceC3747, true, true);
        this.f9019 = interfaceC3746;
    }

    @Override // p185.InterfaceC2566
    /* renamed from: ٴˎ */
    public final InterfaceC2566 mo3962() {
        InterfaceC3746 interfaceC3746 = this.f9019;
        if (interfaceC3746 instanceof InterfaceC2566) {
            return (InterfaceC2566) interfaceC3746;
        }
        return null;
    }

    @Override // p072.C1634
    /* renamed from: ᵎˏ */
    public void mo5176(Object obj) {
        AbstractC2269.m6278(AbstractC1642.m5289(obj), ˑי.ˏᴵ(this.f9019));
    }

    @Override // p072.C1634
    /* renamed from: ᵔﹳ */
    public final boolean mo5265() {
        return true;
    }

    @Override // p072.C1634
    /* renamed from: ﹳˎ */
    public void mo5177(Object obj) {
        this.f9019.mo3974(AbstractC1642.m5289(obj));
    }
}
