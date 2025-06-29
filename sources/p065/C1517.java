package p065;

import p140.C2180;
import p155.EnumC2332;
import p185.AbstractC2567;
import p288.C3397;
import p330.InterfaceC3746;
import p338.InterfaceC3864;
import ˈⁱ.ˉⁱ;

/* renamed from: ʾᵔ.ᵎʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1517 extends AbstractC2567 implements InterfaceC3864 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f6176;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public /* synthetic */ Object f6177;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final /* synthetic */ C1512 f6178;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1517(C1512 c1512, InterfaceC3746 interfaceC3746) {
        super(2, interfaceC3746);
        this.f6178 = c1512;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        return ((C1517) mo1056((C2180) obj, (InterfaceC3746) obj2)).mo1055(C3397.f13249);
    }

    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) {
        EnumC2332 enumC2332 = EnumC2332.f9250;
        int i = this.f6176;
        if (i == 0) {
            ˉⁱ.ˆʿ(obj);
            C2180 c2180 = (C2180) this.f6177;
            this.f6176 = 1;
            obj = C1512.m5084(this.f6178, c2180, this);
            if (obj == enumC2332) {
                return enumC2332;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ˉⁱ.ˆʿ(obj);
        }
        return obj;
    }

    @Override // p185.AbstractC2563
    /* renamed from: ᴵʿ */
    public final InterfaceC3746 mo1056(Object obj, InterfaceC3746 interfaceC3746) {
        C1517 c1517 = new C1517(this.f6178, interfaceC3746);
        c1517.f6177 = obj;
        return c1517;
    }
}
