package p065;

import p072.InterfaceC1594;
import p155.EnumC2332;
import p185.AbstractC2567;
import p288.C3397;
import p330.InterfaceC3746;
import p338.InterfaceC3864;
import ˈⁱ.ˉⁱ;

/* renamed from: ʾᵔ.ˋˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1491 extends AbstractC2567 implements InterfaceC3864 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f6073;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ C1505 f6074;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1491(C1505 c1505, InterfaceC3746 interfaceC3746) {
        super(2, interfaceC3746);
        this.f6074 = c1505;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        return ((C1491) mo1056((InterfaceC1594) obj, (InterfaceC3746) obj2)).mo1055(C3397.f13249);
    }

    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) {
        Object objM5079;
        EnumC2332 enumC2332 = EnumC2332.f9250;
        int i = this.f6073;
        C3397 c3397 = C3397.f13249;
        if (i == 0) {
            ˉⁱ.ˆʿ(obj);
            this.f6073 = 1;
            C1505 c1505 = this.f6074;
            boolean z = c1505.f1290 > 0;
            if (!c1505.f6115.compareAndSet(false, true) || !z || (objM5079 = c1505.m5079(this)) != enumC2332) {
                objM5079 = c3397;
            }
            if (objM5079 == enumC2332) {
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
        return new C1491(this.f6074, interfaceC3746);
    }
}
