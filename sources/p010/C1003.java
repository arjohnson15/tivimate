package p010;

import p155.EnumC2332;
import p184.InterfaceC2552;
import p185.AbstractC2567;
import p288.C3397;
import p330.InterfaceC3746;
import p338.InterfaceC3864;
import ˈⁱ.ˉⁱ;

/* renamed from: ʻˎ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1003 extends AbstractC2567 implements InterfaceC3864 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f4356;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public /* synthetic */ Object f4357;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final /* synthetic */ C1017 f4358;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1003(C1017 c1017, InterfaceC3746 interfaceC3746) {
        super(2, interfaceC3746);
        this.f4358 = c1017;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        return ((C1003) mo1056((InterfaceC2552) obj, (InterfaceC3746) obj2)).mo1055(C3397.f13249);
    }

    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) {
        EnumC2332 enumC2332 = EnumC2332.f9250;
        int i = this.f4356;
        C3397 c3397 = C3397.f13249;
        if (i == 0) {
            ˉⁱ.ˆʿ(obj);
            InterfaceC2552 interfaceC2552 = (InterfaceC2552) this.f4357;
            this.f4356 = 1;
            Object objMo3972 = this.f4358.f4394.mo3972(interfaceC2552, this);
            if (objMo3972 != enumC2332) {
                objMo3972 = c3397;
            }
            if (objMo3972 == enumC2332) {
                return enumC2332;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ˉⁱ.ˆʿ(obj);
        }
        return c3397;
    }

    @Override // p185.AbstractC2563
    /* renamed from: ᴵʿ */
    public final InterfaceC3746 mo1056(Object obj, InterfaceC3746 interfaceC3746) {
        C1003 c1003 = new C1003(this.f4358, interfaceC3746);
        c1003.f4357 = obj;
        return c1003;
    }
}
