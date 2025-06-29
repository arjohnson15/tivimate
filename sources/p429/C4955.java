package p429;

import p072.InterfaceC1594;
import p155.EnumC2332;
import p184.C2545;
import p184.C2546;
import p185.AbstractC2567;
import p288.C3397;
import p330.InterfaceC3746;
import p338.InterfaceC3864;
import ˈⁱ.ˉⁱ;

/* renamed from: ﹶˎ.ˋˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4955 extends AbstractC2567 implements InterfaceC3864 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f18739;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ C4949 f18740;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4955(C4949 c4949, InterfaceC3746 interfaceC3746) {
        super(2, interfaceC3746);
        this.f18740 = c4949;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        return ((C4955) mo1056((InterfaceC1594) obj, (InterfaceC3746) obj2)).mo1055(C3397.f13249);
    }

    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) {
        EnumC2332 enumC2332 = EnumC2332.f9250;
        int i = this.f18739;
        if (i == 0) {
            ˉⁱ.ˆʿ(obj);
            C4949 c4949 = this.f18740;
            C2545 c2545 = c4949.f18723;
            C2546 c2546 = new C2546(1, c4949);
            this.f18739 = 1;
            if (c2545.mo3972(c2546, this) == enumC2332) {
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
        return new C4955(this.f18740, interfaceC3746);
    }
}
