package p140;

import p013.C1047;
import p185.AbstractC2567;
import p288.C3397;
import p330.InterfaceC3746;
import p331.CallableC3763;
import p338.InterfaceC3864;
import ˈⁱ.ˉⁱ;

/* renamed from: ˉˏ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2165 extends AbstractC2567 implements InterfaceC3864 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public /* synthetic */ Object f8500;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ C1047 f8501;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2165(InterfaceC3746 interfaceC3746, C1047 c1047) {
        super(2, interfaceC3746);
        this.f8501 = c1047;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        return ((C2165) mo1056((C2180) obj, (InterfaceC3746) obj2)).mo1055(C3397.f13249);
    }

    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) {
        ˉⁱ.ˆʿ(obj);
        ((C2180) this.f8500).mo6107();
        return ((CallableC3763) this.f8501.f4447).call();
    }

    @Override // p185.AbstractC2563
    /* renamed from: ᴵʿ */
    public final InterfaceC3746 mo1056(Object obj, InterfaceC3746 interfaceC3746) {
        C2165 c2165 = new C2165(interfaceC3746, this.f8501);
        c2165.f8500 = obj;
        return c2165;
    }
}
