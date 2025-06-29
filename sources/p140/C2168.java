package p140;

import androidx.work.impl.WorkDatabase_Impl;
import p013.C1047;
import p065.C1508;
import p072.AbstractC1642;
import p072.C1584;
import p072.InterfaceC1594;
import p145.AbstractC2234;
import p155.EnumC2332;
import p184.AbstractC2539;
import p184.InterfaceC2552;
import p185.AbstractC2567;
import p288.C3397;
import p330.InterfaceC3746;
import p330.InterfaceC3747;
import p338.InterfaceC3864;
import p423.C4883;
import p423.InterfaceC4876;
import ˈⁱ.ˉⁱ;
import ˈⁱ.ﹳﹳ;

/* renamed from: ˉˏ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2168 extends AbstractC2567 implements InterfaceC3864 {

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final /* synthetic */ String[] f8516;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public C1508 f8517;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public int f8518;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public final /* synthetic */ C1047 f8519;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public /* synthetic */ Object f8520;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final /* synthetic */ WorkDatabase_Impl f8521;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public C4883 f8522;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public InterfaceC1594 f8523;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2552 f8524;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2168(WorkDatabase_Impl workDatabase_Impl, InterfaceC2552 interfaceC2552, String[] strArr, C1047 c1047, InterfaceC3746 interfaceC3746) {
        super(2, interfaceC3746);
        this.f8521 = workDatabase_Impl;
        this.f8524 = interfaceC2552;
        this.f8516 = strArr;
        this.f8519 = c1047;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        return ((C2168) mo1056((InterfaceC1594) obj, (InterfaceC3746) obj2)).mo1055(C3397.f13249);
    }

    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) {
        InterfaceC1594 interfaceC1594;
        C1508 c1508;
        Object objM6237;
        C4883 c4883;
        InterfaceC4876 interfaceC4876;
        EnumC2332 enumC2332 = EnumC2332.f9250;
        int i = this.f8518;
        C3397 c3397 = C3397.f13249;
        WorkDatabase_Impl workDatabase_Impl = this.f8521;
        if (i == 0) {
            ˉⁱ.ˆʿ(obj);
            interfaceC1594 = (InterfaceC1594) this.f8520;
            C4883 c48832 = ﹳﹳ.ـﹶ(-1, 0, (C1047) null, 6);
            c1508 = new C1508(this.f8516, c48832, 1);
            c48832.mo10958(c3397);
            C4883 c48833 = ﹳﹳ.ـﹶ(0, 0, (C1047) null, 7);
            this.f8520 = c48832;
            this.f8517 = c1508;
            this.f8522 = c48833;
            this.f8523 = interfaceC1594;
            this.f8518 = 1;
            objM6237 = AbstractC2234.m6237(workDatabase_Impl, false, this);
            if (objM6237 == enumC2332) {
                return enumC2332;
            }
            c4883 = c48833;
            interfaceC4876 = c48832;
        } else {
            if (i != 1) {
                if (i == 2) {
                    ˉⁱ.ˆʿ(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC1594 = this.f8523;
            C4883 c48834 = this.f8522;
            c1508 = this.f8517;
            interfaceC4876 = (InterfaceC4876) this.f8520;
            ˉⁱ.ˆʿ(obj);
            objM6237 = obj;
            c4883 = c48834;
        }
        AbstractC1642.m5294(interfaceC1594, ((InterfaceC3747) objM6237).mo3965(C1584.f6341), 0, new C2166(workDatabase_Impl, c1508, interfaceC4876, c4883, this.f8519, null), 2);
        this.f8520 = null;
        this.f8517 = null;
        this.f8522 = null;
        this.f8523 = null;
        this.f8518 = 2;
        Object objM6672 = AbstractC2539.m6672(this.f8524, c4883, true, this);
        if (objM6672 != enumC2332) {
            objM6672 = c3397;
        }
        return objM6672 == enumC2332 ? enumC2332 : c3397;
    }

    @Override // p185.AbstractC2563
    /* renamed from: ᴵʿ */
    public final InterfaceC3746 mo1056(Object obj, InterfaceC3746 interfaceC3746) {
        C2168 c2168 = new C2168(this.f8521, this.f8524, this.f8516, this.f8519, interfaceC3746);
        c2168.f8520 = obj;
        return c2168;
    }
}
