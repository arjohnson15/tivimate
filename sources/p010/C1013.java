package p010;

import p155.EnumC2332;
import p185.AbstractC2567;
import p288.C3397;
import p330.InterfaceC3746;
import p338.InterfaceC3864;
import p423.InterfaceC4887;
import ˈⁱ.ˉⁱ;

/* renamed from: ʻˎ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1013 extends AbstractC2567 implements InterfaceC3864 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f4382;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public /* synthetic */ Object f4383;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC1023 f4384;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1013(AbstractC1023 abstractC1023, InterfaceC3746 interfaceC3746) {
        super(2, interfaceC3746);
        this.f4384 = abstractC1023;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        return ((C1013) mo1056((InterfaceC4887) obj, (InterfaceC3746) obj2)).mo1055(C3397.f13249);
    }

    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) {
        EnumC2332 enumC2332 = EnumC2332.f9250;
        int i = this.f4382;
        if (i == 0) {
            ˉⁱ.ˆʿ(obj);
            InterfaceC4887 interfaceC4887 = (InterfaceC4887) this.f4383;
            this.f4382 = 1;
            if (this.f4384.mo3971(interfaceC4887, this) == enumC2332) {
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
        C1013 c1013 = new C1013(this.f4384, interfaceC3746);
        c1013.f4383 = obj;
        return c1013;
    }
}
