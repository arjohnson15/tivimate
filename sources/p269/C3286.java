package p269;

import p023.C1149;
import p155.EnumC2332;
import p185.AbstractC2567;
import p279.AbstractC3370;
import p279.AbstractC3371;
import p288.C3397;
import p330.InterfaceC3746;
import p338.InterfaceC3864;
import p423.InterfaceC4887;
import p457.C5391;
import ˈⁱ.ˉⁱ;

/* renamed from: ـˑ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3286 extends AbstractC2567 implements InterfaceC3864 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f12817;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public /* synthetic */ Object f12818;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC3288 f12819;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3286(AbstractC3288 abstractC3288, InterfaceC3746 interfaceC3746) {
        super(2, interfaceC3746);
        this.f12819 = abstractC3288;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        return ((C3286) mo1056((InterfaceC4887) obj, (InterfaceC3746) obj2)).mo1055(C3397.f13249);
    }

    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) {
        EnumC2332 enumC2332 = EnumC2332.f9250;
        int i = this.f12817;
        if (i == 0) {
            ˉⁱ.ˆʿ(obj);
            InterfaceC4887 interfaceC4887 = (InterfaceC4887) this.f12818;
            AbstractC3288 abstractC3288 = this.f12819;
            C3289 c3289 = new C3289(abstractC3288, interfaceC4887);
            AbstractC3370 abstractC3370 = abstractC3288.f12820;
            synchronized (abstractC3370.f13192) {
                try {
                    if (abstractC3370.f13194.add(c3289)) {
                        if (abstractC3370.f13194.size() == 1) {
                            abstractC3370.f13191 = abstractC3370.mo8223();
                            C5391.m12163().m12168(AbstractC3371.f13195, abstractC3370.getClass().getSimpleName() + ": initial state = " + abstractC3370.f13191);
                            abstractC3370.mo8225();
                        }
                        c3289.m8103(abstractC3370.f13191);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            C1149 c1149 = new C1149(this.f12819, 1, c3289);
            this.f12817 = 1;
            if (ˉⁱ.ـﹶ(interfaceC4887, c1149, this) == enumC2332) {
                return enumC2332;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ˉⁱ.ˆʿ(obj);
        }
        return C3397.f13249;
    }

    @Override // p185.AbstractC2563
    /* renamed from: ᴵʿ */
    public final InterfaceC3746 mo1056(Object obj, InterfaceC3746 interfaceC3746) {
        C3286 c3286 = new C3286(this.f12819, interfaceC3746);
        c3286.f12818 = obj;
        return c3286;
    }
}
