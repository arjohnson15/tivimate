package p164;

import p072.InterfaceC1594;
import p155.EnumC2332;
import p185.AbstractC2567;
import p288.C3397;
import p330.InterfaceC3746;
import p338.InterfaceC3864;
import ˈⁱ.ˉⁱ;

/* renamed from: ˊᵔ.ˎˑ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2369 extends AbstractC2567 implements InterfaceC3864 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f9380;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2567 f9381;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final /* synthetic */ Object f9382;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2369(InterfaceC3864 interfaceC3864, Object obj, InterfaceC3746 interfaceC3746) {
        super(2, interfaceC3746);
        this.f9381 = (AbstractC2567) interfaceC3864;
        this.f9382 = obj;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        return ((C2369) mo1056((InterfaceC1594) obj, (InterfaceC3746) obj2)).mo1055(C3397.f13249);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [ˎʻ.ﹶˆ, ᵎˈ.ˑי] */
    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) {
        EnumC2332 enumC2332 = EnumC2332.f9250;
        int i = this.f9380;
        if (i == 0) {
            ˉⁱ.ˆʿ(obj);
            this.f9380 = 1;
            obj = this.f9381.mo1054(this.f9382, this);
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
        return new C2369(this.f9381, this.f9382, interfaceC3746);
    }
}
