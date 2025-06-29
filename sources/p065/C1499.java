package p065;

import p072.InterfaceC1594;
import p155.EnumC2332;
import p185.AbstractC2567;
import p288.C3397;
import p330.InterfaceC3746;
import p338.InterfaceC3864;
import ˈⁱ.ˉⁱ;

/* renamed from: ʾᵔ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1499 extends AbstractC2567 implements InterfaceC3864 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f6091;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ C1489 f6092;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1499(C1489 c1489, InterfaceC3746 interfaceC3746) {
        super(2, interfaceC3746);
        this.f6092 = c1489;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        return ((C1499) mo1056((InterfaceC1594) obj, (InterfaceC3746) obj2)).mo1055(C3397.f13249);
    }

    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) {
        EnumC2332 enumC2332 = EnumC2332.f9250;
        int i = this.f6091;
        C3397 c3397 = C3397.f13249;
        if (i == 0) {
            ˉⁱ.ˆʿ(obj);
            C1489 c1489 = this.f6092;
            C1500 c1500 = c1489.f6066;
            this.f6091 = 1;
            Object objM5088 = ((C1512) c1500.f6096).m5088(c1489, this);
            if (objM5088 != enumC2332) {
                objM5088 = c3397;
            }
            if (objM5088 == enumC2332) {
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
        return new C1499(this.f6092, interfaceC3746);
    }
}
