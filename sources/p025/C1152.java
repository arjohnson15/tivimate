package p025;

import p072.AbstractC1586;
import p072.AbstractC1642;
import p072.C1578;
import p072.InterfaceC1594;
import p155.EnumC2332;
import p185.AbstractC2567;
import p253.C3150;
import p253.ExecutorC3146;
import p288.C3397;
import p325.C3717;
import p330.InterfaceC3746;
import p338.InterfaceC3864;
import ˈⁱ.ˉⁱ;
import ᴵﹳ.ٴˎ;
import ᵎﹳ.ـﹶ;

/* renamed from: ʼˈ.ˎˑ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1152 extends AbstractC2567 implements InterfaceC3864 {

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final /* synthetic */ ـﹶ f4799;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f4800;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final /* synthetic */ boolean f4801;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public final /* synthetic */ ˆᵔ f4802;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final /* synthetic */ String f4803;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final /* synthetic */ boolean f4804;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ String f4805;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final /* synthetic */ String f4806;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final /* synthetic */ boolean f4807;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1152(String str, String str2, boolean z, String str3, boolean z2, boolean z3, ـﹶ r7, ˆᵔ r8, InterfaceC3746 interfaceC3746) {
        super(2, interfaceC3746);
        this.f4805 = str;
        this.f4806 = str2;
        this.f4801 = z;
        this.f4803 = str3;
        this.f4804 = z2;
        this.f4807 = z3;
        this.f4799 = r7;
        this.f4802 = r8;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        return ((C1152) mo1056((InterfaceC1594) obj, (InterfaceC3746) obj2)).mo1055(C3397.f13249);
    }

    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) throws Throwable {
        EnumC2332 enumC2332 = EnumC2332.f9250;
        int i = this.f4800;
        if (i == 0) {
            ˉⁱ.ˆʿ(obj);
            this.f4800 = 1;
            C3150 c3150 = AbstractC1586.f6345;
            obj = AbstractC1642.m5295(ٴˎ.ˋⁱ(ExecutorC3146.f12150, C1578.f6332), new C3717(this.f4805, this.f4806, this.f4801, this.f4803, this.f4804, this.f4807, this.f4799, null), this);
            if (obj == enumC2332) {
                return enumC2332;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ˉⁱ.ˆʿ(obj);
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        ˆᵔ r0 = this.f4802;
        r0.ʽᐧ.ˏʾ(new ˈٴ(zBooleanValue));
        return C3397.f13249;
    }

    @Override // p185.AbstractC2563
    /* renamed from: ᴵʿ */
    public final InterfaceC3746 mo1056(Object obj, InterfaceC3746 interfaceC3746) {
        return new C1152(this.f4805, this.f4806, this.f4801, this.f4803, this.f4804, this.f4807, this.f4799, this.f4802, interfaceC3746);
    }
}
