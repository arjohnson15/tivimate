package p164;

import p010.C1015;
import p070.C1556;
import p085.C1729;
import p155.EnumC2332;
import p184.InterfaceC2552;
import p185.AbstractC2567;
import p288.C3397;
import p330.InterfaceC3746;
import p338.InterfaceC3864;
import ˈⁱ.ˉⁱ;

/* renamed from: ˊᵔ.ﹳˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2386 extends AbstractC2567 implements InterfaceC3864 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f9423;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public /* synthetic */ Object f9424;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final /* synthetic */ C2363 f9425;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2386(C2363 c2363, InterfaceC3746 interfaceC3746) {
        super(2, interfaceC3746);
        this.f9425 = c2363;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        return ((C2386) mo1056((InterfaceC2552) obj, (InterfaceC3746) obj2)).mo1055(C3397.f13249);
    }

    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) {
        EnumC2332 enumC2332 = EnumC2332.f9250;
        int i = this.f9423;
        C3397 c3397 = C3397.f13249;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ˉⁱ.ˆʿ(obj);
            return c3397;
        }
        ˉⁱ.ˆʿ(obj);
        InterfaceC2552 interfaceC2552 = (InterfaceC2552) this.f9424;
        C2363 c2363 = this.f9425;
        AbstractC2385 abstractC2385 = (AbstractC2385) c2363.f9355.m6676();
        if (!(abstractC2385 instanceof C2359)) {
            c2363.f9352.ᐧˋ(new C2366(abstractC2385));
        }
        C2370 c2370 = new C2370(abstractC2385, null);
        this.f9423 = 1;
        c2363.f9355.mo3972(new C1015(new C1556(), new C1729(interfaceC2552, 1), c2370, 2), this);
        return enumC2332;
    }

    @Override // p185.AbstractC2563
    /* renamed from: ᴵʿ */
    public final InterfaceC3746 mo1056(Object obj, InterfaceC3746 interfaceC3746) {
        C2386 c2386 = new C2386(this.f9425, interfaceC3746);
        c2386.f9424 = obj;
        return c2386;
    }
}
