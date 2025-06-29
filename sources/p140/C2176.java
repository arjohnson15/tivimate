package p140;

import p072.InterfaceC1594;
import p155.EnumC2332;
import p185.AbstractC2567;
import p288.C3397;
import p330.InterfaceC3746;
import p338.InterfaceC3864;
import ˈⁱ.ˉⁱ;

/* renamed from: ˉˏ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2176 extends AbstractC2567 implements InterfaceC3864 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f8549;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2567 f8550;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final /* synthetic */ C2185 f8551;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2176(InterfaceC3864 interfaceC3864, C2185 c2185, InterfaceC3746 interfaceC3746) {
        super(2, interfaceC3746);
        this.f8550 = (AbstractC2567) interfaceC3864;
        this.f8551 = c2185;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        return ((C2176) mo1056((InterfaceC1594) obj, (InterfaceC3746) obj2)).mo1055(C3397.f13249);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [ˎʻ.ﹶˆ, ᵎˈ.ˑי] */
    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) {
        EnumC2332 enumC2332 = EnumC2332.f9250;
        int i = this.f8549;
        if (i == 0) {
            ˉⁱ.ˆʿ(obj);
            this.f8549 = 1;
            obj = this.f8550.mo1054(this.f8551, this);
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

    /* JADX WARN: Type inference failed for: r0v0, types: [ˎʻ.ﹶˆ, ᵎˈ.ˑי] */
    @Override // p185.AbstractC2563
    /* renamed from: ᴵʿ */
    public final InterfaceC3746 mo1056(Object obj, InterfaceC3746 interfaceC3746) {
        return new C2176(this.f8550, this.f8551, interfaceC3746);
    }
}
