package p077;

import p155.EnumC2332;
import p185.AbstractC2567;
import p288.C3397;
import p330.InterfaceC3746;
import p338.InterfaceC3864;
import ˈⁱ.ˉⁱ;

/* renamed from: ʿˊ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1675 extends AbstractC2567 implements InterfaceC3864 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f6526;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public /* synthetic */ Object f6527;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2567 f6528;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1675(InterfaceC3864 interfaceC3864, InterfaceC3746 interfaceC3746) {
        super(2, interfaceC3746);
        this.f6528 = (AbstractC2567) interfaceC3864;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        return ((C1675) mo1056((C1672) obj, (InterfaceC3746) obj2)).mo1055(C3397.f13249);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ˎʻ.ﹶˆ, ᵎˈ.ˑי] */
    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) {
        EnumC2332 enumC2332 = EnumC2332.f9250;
        int i = this.f6526;
        if (i == 0) {
            ˉⁱ.ˆʿ(obj);
            C1672 c1672 = (C1672) this.f6527;
            this.f6526 = 1;
            obj = this.f6528.mo1054(c1672, this);
            if (obj == enumC2332) {
                return enumC2332;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ˉⁱ.ˆʿ(obj);
        }
        C1672 c16722 = (C1672) obj;
        c16722.f6522.set(true);
        return c16722;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ˎʻ.ﹶˆ, ᵎˈ.ˑי] */
    @Override // p185.AbstractC2563
    /* renamed from: ᴵʿ */
    public final InterfaceC3746 mo1056(Object obj, InterfaceC3746 interfaceC3746) {
        C1675 c1675 = new C1675(this.f6528, interfaceC3746);
        c1675.f6527 = obj;
        return c1675;
    }
}
