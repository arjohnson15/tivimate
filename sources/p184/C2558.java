package p184;

import p010.C1011;
import p072.InterfaceC1594;
import p155.EnumC2332;
import p185.AbstractC2567;
import p288.C3397;
import p330.InterfaceC3746;
import p338.InterfaceC3864;
import ˈⁱ.ˉⁱ;

/* renamed from: ˎ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2558 extends AbstractC2567 implements InterfaceC3864 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f10140;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ C2545 f10141;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2558(C2545 c2545, InterfaceC3746 interfaceC3746) {
        super(2, interfaceC3746);
        this.f10141 = c2545;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        return ((C2558) mo1056((InterfaceC1594) obj, (InterfaceC3746) obj2)).mo1055(C3397.f13249);
    }

    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) throws Throwable {
        EnumC2332 enumC2332 = EnumC2332.f9250;
        int i = this.f10140;
        C3397 c3397 = C3397.f13249;
        if (i == 0) {
            ˉⁱ.ˆʿ(obj);
            this.f10140 = 1;
            Object objMo3972 = this.f10141.mo3972(C1011.f4379, this);
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
        return new C2558(this.f10141, interfaceC3746);
    }
}
