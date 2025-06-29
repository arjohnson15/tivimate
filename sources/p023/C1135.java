package p023;

import android.support.v4.media.session.AbstractC0002;
import p072.AbstractC1642;
import p072.InterfaceC1594;
import p155.EnumC2332;
import p185.AbstractC2567;
import p288.C3397;
import p330.InterfaceC3746;
import p338.InterfaceC3864;
import p423.AbstractC4872;
import p423.InterfaceC4887;
import p457.C5391;
import ˈⁱ.ˉⁱ;

/* renamed from: ʼʾ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1135 extends AbstractC2567 implements InterfaceC3864 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f4763;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ C1141 f4764;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC4887 f4765;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1135(C1141 c1141, InterfaceC4887 interfaceC4887, InterfaceC3746 interfaceC3746) {
        super(2, interfaceC3746);
        this.f4764 = c1141;
        this.f4765 = interfaceC4887;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        return ((C1135) mo1056((InterfaceC1594) obj, (InterfaceC3746) obj2)).mo1055(C3397.f13249);
    }

    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) {
        EnumC2332 enumC2332 = EnumC2332.f9250;
        int i = this.f4763;
        C1141 c1141 = this.f4764;
        if (i == 0) {
            ˉⁱ.ˆʿ(obj);
            long j = c1141.f4776;
            this.f4763 = 1;
            if (AbstractC1642.m5297(j, this) == enumC2332) {
                return enumC2332;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ˉⁱ.ˆʿ(obj);
        }
        C5391.m12163().m12168(AbstractC1148.f4791, AbstractC0002.m42(new StringBuilder("NetworkRequestConstraintController didn't receive neither  onCapabilitiesChanged/onLost callback, sending `ConstraintsNotMet` after "), c1141.f4776, " ms"));
        ((AbstractC4872) this.f4765).mo10958(new C1134(7));
        return C3397.f13249;
    }

    @Override // p185.AbstractC2563
    /* renamed from: ᴵʿ */
    public final InterfaceC3746 mo1056(Object obj, InterfaceC3746 interfaceC3746) {
        return new C1135(this.f4764, this.f4765, interfaceC3746);
    }
}
