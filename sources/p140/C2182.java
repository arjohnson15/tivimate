package p140;

import p070.C1561;
import p072.InterfaceC1594;
import p155.EnumC2332;
import p185.AbstractC2567;
import p288.C3397;
import p330.InterfaceC3746;
import p338.InterfaceC3864;
import p423.C4874;
import p423.C4883;
import p423.C4884;
import ˈⁱ.ˉⁱ;

/* renamed from: ˉˏ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2182 extends AbstractC2567 implements InterfaceC3864 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public C1561 f8574;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final /* synthetic */ C2171 f8575;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public int f8576;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final /* synthetic */ C1561 f8577;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2182(C1561 c1561, C2171 c2171, InterfaceC3746 interfaceC3746) {
        super(2, interfaceC3746);
        this.f8577 = c1561;
        this.f8575 = c2171;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        return ((C2182) mo1056((InterfaceC1594) obj, (InterfaceC3746) obj2)).mo1055(C3397.f13249);
    }

    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) throws Throwable {
        Object objM10982;
        C1561 c1561;
        Throwable th;
        EnumC2332 enumC2332 = EnumC2332.f9250;
        int i = this.f8576;
        if (i == 0) {
            ˉⁱ.ˆʿ(obj);
            C1561 c15612 = this.f8577;
            this.f8574 = c15612;
            this.f8576 = 1;
            C2171 c2171 = this.f8575;
            C4883 c4883 = c2171.f8532;
            Object objMo10957 = c4883.mo10957();
            boolean z = objMo10957 instanceof C4884;
            if (z) {
                c2171.m6092();
                objM10982 = c4883.m10982(this);
            } else {
                if (z) {
                    if ((objMo10957 instanceof C4874) && (th = ((C4874) objMo10957).f18392) != null) {
                        throw th;
                    }
                    throw new IllegalStateException(("Trying to call 'getOrThrow' on a failed channel result: " + objMo10957).toString());
                }
                objM10982 = (C2183) objMo10957;
            }
            if (objM10982 == enumC2332) {
                return enumC2332;
            }
            c1561 = c15612;
            obj = objM10982;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1561 = this.f8574;
            ˉⁱ.ˆʿ(obj);
        }
        c1561.f6302 = obj;
        return C3397.f13249;
    }

    @Override // p185.AbstractC2563
    /* renamed from: ᴵʿ */
    public final InterfaceC3746 mo1056(Object obj, InterfaceC3746 interfaceC3746) {
        return new C2182(this.f8577, this.f8575, interfaceC3746);
    }
}
