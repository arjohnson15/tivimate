package p322;

import p185.AbstractC2567;
import p288.C3397;
import p330.InterfaceC3746;
import p338.InterfaceC3864;
import ˈⁱ.ˉⁱ;

/* renamed from: ᴵˉ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3674 extends AbstractC2567 implements InterfaceC3864 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public /* synthetic */ Object f14085;

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        C3674 c3674 = (C3674) mo1056((String) obj, (InterfaceC3746) obj2);
        C3397 c3397 = C3397.f13249;
        c3674.mo1055(c3397);
        return c3397;
    }

    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) {
        ˉⁱ.ˆʿ(obj);
        String str = "Error failing to fetch the remote configs: " + ((String) this.f14085);
        return C3397.f13249;
    }

    @Override // p185.AbstractC2563
    /* renamed from: ᴵʿ */
    public final InterfaceC3746 mo1056(Object obj, InterfaceC3746 interfaceC3746) {
        C3674 c3674 = new C3674(2, interfaceC3746);
        c3674.f14085 = obj;
        return c3674;
    }
}
