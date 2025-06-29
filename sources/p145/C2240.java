package p145;

import p140.C2180;
import p185.AbstractC2567;
import p288.C3397;
import p330.InterfaceC3746;
import p338.InterfaceC3856;
import p338.InterfaceC3864;
import ˈⁱ.ˉⁱ;

/* renamed from: ˉᴵ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2240 extends AbstractC2567 implements InterfaceC3864 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public /* synthetic */ Object f8924;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3856 f8925;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2240(InterfaceC3746 interfaceC3746, InterfaceC3856 interfaceC3856) {
        super(2, interfaceC3746);
        this.f8925 = interfaceC3856;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        return ((C2240) mo1056((C2180) obj, (InterfaceC3746) obj2)).mo1055(C3397.f13249);
    }

    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) {
        ˉⁱ.ˆʿ(obj);
        return this.f8925.mo4036(((C2180) this.f8924).mo6107());
    }

    @Override // p185.AbstractC2563
    /* renamed from: ᴵʿ */
    public final InterfaceC3746 mo1056(Object obj, InterfaceC3746 interfaceC3746) {
        C2240 c2240 = new C2240(interfaceC3746, this.f8925);
        c2240.f8924 = obj;
        return c2240;
    }
}
