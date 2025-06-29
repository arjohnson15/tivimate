package p010;

import p013.C1047;
import p072.AbstractC1642;
import p072.InterfaceC1594;
import p155.EnumC2332;
import p184.AbstractC2539;
import p184.InterfaceC2552;
import p185.AbstractC2567;
import p288.C3397;
import p330.InterfaceC3746;
import p338.InterfaceC3864;
import p423.C4885;
import ˈⁱ.ˉⁱ;
import ˈⁱ.ﹳﹳ;

/* renamed from: ʻˎ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1002 extends AbstractC2567 implements InterfaceC3864 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f4352;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC1023 f4353;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public /* synthetic */ Object f4354;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2552 f4355;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1002(InterfaceC2552 interfaceC2552, AbstractC1023 abstractC1023, InterfaceC3746 interfaceC3746) {
        super(2, interfaceC3746);
        this.f4355 = interfaceC2552;
        this.f4353 = abstractC1023;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        return ((C1002) mo1056((InterfaceC1594) obj, (InterfaceC3746) obj2)).mo1055(C3397.f13249);
    }

    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) {
        EnumC2332 enumC2332 = EnumC2332.f9250;
        int i = this.f4352;
        C3397 c3397 = C3397.f13249;
        if (i == 0) {
            ˉⁱ.ˆʿ(obj);
            InterfaceC1594 interfaceC1594 = (InterfaceC1594) this.f4354;
            AbstractC1023 abstractC1023 = this.f4353;
            int i2 = abstractC1023.f4402;
            if (i2 == -3) {
                i2 = -2;
            }
            InterfaceC3864 c1013 = new C1013(abstractC1023, null);
            C4885 c4885 = new C4885(AbstractC1642.m5301(interfaceC1594, abstractC1023.f4404), ﹳﹳ.ـﹶ(i2, abstractC1023.f4403, (C1047) null, 4), true, true);
            c4885.m5239(3, c4885, c1013);
            this.f4352 = 1;
            Object objM6672 = AbstractC2539.m6672(this.f4355, c4885, true, this);
            if (objM6672 != enumC2332) {
                objM6672 = c3397;
            }
            if (objM6672 == enumC2332) {
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
        C1002 c1002 = new C1002(this.f4355, this.f4353, interfaceC3746);
        c1002.f4354 = obj;
        return c1002;
    }
}
