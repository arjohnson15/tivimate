package p065;

import p072.InterfaceC1594;
import p155.EnumC2332;
import p185.AbstractC2567;
import p288.C3397;
import p330.InterfaceC3746;
import p338.InterfaceC3864;
import ˈⁱ.ˉⁱ;

/* renamed from: ʾᵔ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1493 extends AbstractC2567 implements InterfaceC3864 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f6076;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ C1500 f6077;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final /* synthetic */ C1497 f6078;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1493(C1500 c1500, C1497 c1497, InterfaceC3746 interfaceC3746) {
        super(2, interfaceC3746);
        this.f6077 = c1500;
        this.f6078 = c1497;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        return ((C1493) mo1056((InterfaceC1594) obj, (InterfaceC3746) obj2)).mo1055(C3397.f13249);
    }

    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) {
        EnumC2332 enumC2332 = EnumC2332.f9250;
        int i = this.f6076;
        if (i == 0) {
            ˉⁱ.ˆʿ(obj);
            C1512 c1512 = (C1512) this.f6077.f6096;
            this.f6076 = 1;
            if (c1512.m5088(this.f6078, this) == enumC2332) {
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
        return new C1493(this.f6077, this.f6078, interfaceC3746);
    }
}
