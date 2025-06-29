package p065;

import p072.InterfaceC1594;
import p155.EnumC2332;
import p185.AbstractC2567;
import p288.C3397;
import p330.InterfaceC3746;
import p338.InterfaceC3864;
import ˈⁱ.ˉⁱ;

/* renamed from: ʾᵔ.ⁱʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1525 extends AbstractC2567 implements InterfaceC3864 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f6196;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ C1512 f6197;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final /* synthetic */ C1501 f6198;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1525(C1512 c1512, C1501 c1501, InterfaceC3746 interfaceC3746) {
        super(2, interfaceC3746);
        this.f6197 = c1512;
        this.f6198 = c1501;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        return ((C1525) mo1056((InterfaceC1594) obj, (InterfaceC3746) obj2)).mo1055(C3397.f13249);
    }

    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) {
        EnumC2332 enumC2332 = EnumC2332.f9250;
        int i = this.f6196;
        C1501 c1501 = this.f6198;
        try {
            if (i == 0) {
                ˉⁱ.ˆʿ(obj);
                C1512 c1512 = this.f6197;
                this.f6196 = 1;
                if (C1512.m5082(c1512, this) == enumC2332) {
                    return enumC2332;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ˉⁱ.ˆʿ(obj);
            }
            c1501.mo1053();
            return C3397.f13249;
        } catch (Throwable th) {
            c1501.mo1053();
            throw th;
        }
    }

    @Override // p185.AbstractC2563
    /* renamed from: ᴵʿ */
    public final InterfaceC3746 mo1056(Object obj, InterfaceC3746 interfaceC3746) {
        return new C1525(this.f6197, this.f6198, interfaceC3746);
    }
}
