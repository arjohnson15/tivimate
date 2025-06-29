package p085;

import p023.AbstractC1142;
import p185.AbstractC2567;
import p288.C3397;
import p330.InterfaceC3746;
import p331.C3768;
import p338.InterfaceC3864;
import p457.C5391;
import ˈⁱ.ˉⁱ;

/* renamed from: ʿᐧ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1722 extends AbstractC2567 implements InterfaceC3864 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final /* synthetic */ C3768 f6702;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1722(C3768 c3768, InterfaceC3746 interfaceC3746) {
        super(2, interfaceC3746);
        this.f6702 = c3768;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        C1722 c1722 = (C1722) mo1056((AbstractC1142) obj, (InterfaceC3746) obj2);
        C3397 c3397 = C3397.f13249;
        c1722.mo1055(c3397);
        return c3397;
    }

    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) {
        ˉⁱ.ˆʿ(obj);
        String str = AbstractC1720.f6700;
        C5391.m12163().m12168(str, "Constraints changed for " + this.f6702);
        return C3397.f13249;
    }

    @Override // p185.AbstractC2563
    /* renamed from: ᴵʿ */
    public final InterfaceC3746 mo1056(Object obj, InterfaceC3746 interfaceC3746) {
        return new C1722(this.f6702, interfaceC3746);
    }
}
