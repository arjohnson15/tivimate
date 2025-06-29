package p140;

import p070.C1561;
import p072.InterfaceC1594;
import p155.EnumC2332;
import p185.AbstractC2567;
import p288.C3397;
import p330.InterfaceC3746;
import p338.InterfaceC3864;
import ˈⁱ.ˉⁱ;

/* renamed from: ˉˏ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2177 extends AbstractC2567 implements InterfaceC3864 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f8552;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3864 f8553;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final /* synthetic */ C1561 f8554;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2177(InterfaceC3864 interfaceC3864, C1561 c1561, InterfaceC3746 interfaceC3746) {
        super(2, interfaceC3746);
        this.f8553 = interfaceC3864;
        this.f8554 = c1561;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        return ((C2177) mo1056((InterfaceC1594) obj, (InterfaceC3746) obj2)).mo1055(C3397.f13249);
    }

    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) {
        EnumC2332 enumC2332 = EnumC2332.f9250;
        int i = this.f8552;
        if (i == 0) {
            ˉⁱ.ˆʿ(obj);
            Object obj2 = this.f8554.f6302;
            this.f8552 = 1;
            obj = this.f8553.mo1054(obj2, this);
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
        return new C2177(this.f8553, this.f8554, interfaceC3746);
    }
}
