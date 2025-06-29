package p065;

import p155.EnumC2332;
import p185.AbstractC2567;
import p288.C3397;
import p330.InterfaceC3746;
import p338.InterfaceC3864;
import ˈⁱ.ˉⁱ;

/* renamed from: ʾᵔ.ٴᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1511 extends AbstractC2567 implements InterfaceC3864 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f6149;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public /* synthetic */ Object f6150;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final /* synthetic */ C1512 f6151;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1511(C1512 c1512, InterfaceC3746 interfaceC3746) {
        super(2, interfaceC3746);
        this.f6151 = c1512;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        return ((C1511) mo1056((InterfaceC1521) obj, (InterfaceC3746) obj2)).mo1055(C3397.f13249);
    }

    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) {
        InterfaceC1521 interfaceC1521;
        EnumC2332 enumC2332 = EnumC2332.f9250;
        int i = this.f6149;
        C3397 c3397 = C3397.f13249;
        if (i == 0) {
            ˉⁱ.ˆʿ(obj);
            interfaceC1521 = (InterfaceC1521) this.f6150;
            this.f6150 = interfaceC1521;
            this.f6149 = 1;
            obj = interfaceC1521.mo5098(this);
            if (obj == enumC2332) {
                return enumC2332;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    ˉⁱ.ˆʿ(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC1521 = (InterfaceC1521) this.f6150;
            ˉⁱ.ˆʿ(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            return c3397;
        }
        EnumC1475 enumC1475 = EnumC1475.f6003;
        C1477 c1477 = new C1477(this.f6151, interfaceC1521, null);
        this.f6150 = null;
        this.f6149 = 2;
        return interfaceC1521.mo5097(enumC1475, c1477, this) == enumC2332 ? enumC2332 : c3397;
    }

    @Override // p185.AbstractC2563
    /* renamed from: ᴵʿ */
    public final InterfaceC3746 mo1056(Object obj, InterfaceC3746 interfaceC3746) {
        C1511 c1511 = new C1511(this.f6151, interfaceC3746);
        c1511.f6150 = obj;
        return c1511;
    }
}
