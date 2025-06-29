package p023;

import p072.InterfaceC1594;
import p155.EnumC2332;
import p184.InterfaceC2551;
import p185.AbstractC2567;
import p288.C3397;
import p330.InterfaceC3746;
import p331.C3768;
import p338.InterfaceC3864;
import ˈⁱ.ˉⁱ;

/* renamed from: ʼʾ.ˑי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1143 extends AbstractC2567 implements InterfaceC3864 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f4778;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1136 f4779;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ C1147 f4780;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final /* synthetic */ C3768 f4781;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1143(C1147 c1147, C3768 c3768, InterfaceC1136 interfaceC1136, InterfaceC3746 interfaceC3746) {
        super(2, interfaceC3746);
        this.f4780 = c1147;
        this.f4781 = c3768;
        this.f4779 = interfaceC1136;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        return ((C1143) mo1056((InterfaceC1594) obj, (InterfaceC3746) obj2)).mo1055(C3397.f13249);
    }

    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) {
        EnumC2332 enumC2332 = EnumC2332.f9250;
        int i = this.f4778;
        if (i == 0) {
            ˉⁱ.ˆʿ(obj);
            C3768 c3768 = this.f4781;
            InterfaceC2551 interfaceC2551M4166 = this.f4780.m4166(c3768);
            C1140 c1140 = new C1140(this.f4779, 0, c3768);
            this.f4778 = 1;
            if (interfaceC2551M4166.mo3972(c1140, this) == enumC2332) {
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
        return new C1143(this.f4780, this.f4781, this.f4779, interfaceC3746);
    }
}
