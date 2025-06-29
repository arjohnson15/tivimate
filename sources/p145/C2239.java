package p145;

import p065.AbstractC1484;
import p072.InterfaceC1594;
import p155.EnumC2332;
import p185.AbstractC2567;
import p288.C3397;
import p330.InterfaceC3746;
import p338.InterfaceC3856;
import p338.InterfaceC3864;
import ˈⁱ.ˉⁱ;

/* renamed from: ˉᴵ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2239 extends AbstractC2567 implements InterfaceC3864 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f8919;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final /* synthetic */ boolean f8920;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3856 f8921;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC1484 f8922;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final /* synthetic */ boolean f8923;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2239(AbstractC1484 abstractC1484, InterfaceC3746 interfaceC3746, InterfaceC3856 interfaceC3856, boolean z, boolean z2) {
        super(2, interfaceC3746);
        this.f8922 = abstractC1484;
        this.f8923 = z;
        this.f8920 = z2;
        this.f8921 = interfaceC3856;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        return ((C2239) mo1056((InterfaceC1594) obj, (InterfaceC3746) obj2)).mo1055(C3397.f13249);
    }

    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) {
        EnumC2332 enumC2332 = EnumC2332.f9250;
        int i = this.f8919;
        if (i == 0) {
            ˉⁱ.ˆʿ(obj);
            InterfaceC3856 interfaceC3856 = this.f8921;
            boolean z = this.f8920;
            boolean z2 = this.f8923;
            AbstractC1484 abstractC1484 = this.f8922;
            C2232 c2232 = new C2232(abstractC1484, null, interfaceC3856, z, z2);
            this.f8919 = 1;
            obj = abstractC1484.m5054(z2, c2232, this);
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

    @Override // p185.AbstractC2563
    /* renamed from: ᴵʿ */
    public final InterfaceC3746 mo1056(Object obj, InterfaceC3746 interfaceC3746) {
        return new C2239(this.f8922, interfaceC3746, this.f8921, this.f8923, this.f8920);
    }
}
