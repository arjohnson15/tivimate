package p164;

import p185.AbstractC2567;
import p288.C3397;
import p330.InterfaceC3746;
import p338.InterfaceC3856;
import ˈⁱ.ˉⁱ;

/* renamed from: ˊᵔ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2360 extends AbstractC2567 implements InterfaceC3856 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f9335;

    @Override // p338.InterfaceC3856
    /* renamed from: ʽᐧ */
    public final Object mo4036(Object obj) {
        C2360 c2360 = new C2360(1, (InterfaceC3746) obj);
        C3397 c3397 = C3397.f13249;
        c2360.mo1055(c3397);
        return c3397;
    }

    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) {
        int i = this.f9335;
        if (i == 0) {
            ˉⁱ.ˆʿ(obj);
            this.f9335 = 1;
            throw null;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ˉⁱ.ˆʿ(obj);
        return C3397.f13249;
    }
}
