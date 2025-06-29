package p164;

import p185.AbstractC2567;
import p288.C3397;
import p330.InterfaceC3746;
import p338.InterfaceC3864;
import ˈⁱ.ˉⁱ;

/* renamed from: ˊᵔ.ˎٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2370 extends AbstractC2567 implements InterfaceC3864 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public /* synthetic */ Object f9383;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2385 f9384;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2370(AbstractC2385 abstractC2385, InterfaceC3746 interfaceC3746) {
        super(2, interfaceC3746);
        this.f9384 = abstractC2385;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        return ((C2370) mo1056((AbstractC2385) obj, (InterfaceC3746) obj2)).mo1055(C3397.f13249);
    }

    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) {
        ˉⁱ.ˆʿ(obj);
        AbstractC2385 abstractC2385 = (AbstractC2385) this.f9383;
        AbstractC2385 abstractC23852 = this.f9384;
        boolean z = false;
        if (!(abstractC23852 instanceof C2359) && !(abstractC23852 instanceof C2373) && abstractC2385 == abstractC23852) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // p185.AbstractC2563
    /* renamed from: ᴵʿ */
    public final InterfaceC3746 mo1056(Object obj, InterfaceC3746 interfaceC3746) {
        C2370 c2370 = new C2370(this.f9384, interfaceC3746);
        c2370.f9383 = obj;
        return c2370;
    }
}
