package p085;

import androidx.work.impl.workers.ConstraintTrackingWorker;
import p023.C1147;
import p072.InterfaceC1594;
import p155.EnumC2332;
import p185.AbstractC2567;
import p288.C3397;
import p330.InterfaceC3746;
import p331.C3768;
import p338.InterfaceC3864;
import p457.AbstractC5366;
import ˈⁱ.ˉⁱ;

/* renamed from: ʿᐧ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1727 extends AbstractC2567 implements InterfaceC3864 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f6715;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final /* synthetic */ C1147 f6716;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final /* synthetic */ C3768 f6717;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ ConstraintTrackingWorker f6718;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC5366 f6719;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1727(ConstraintTrackingWorker constraintTrackingWorker, AbstractC5366 abstractC5366, C1147 c1147, C3768 c3768, InterfaceC3746 interfaceC3746) {
        super(2, interfaceC3746);
        this.f6718 = constraintTrackingWorker;
        this.f6719 = abstractC5366;
        this.f6716 = c1147;
        this.f6717 = c3768;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        return ((C1727) mo1056((InterfaceC1594) obj, (InterfaceC3746) obj2)).mo1055(C3397.f13249);
    }

    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) {
        EnumC2332 enumC2332 = EnumC2332.f9250;
        int i = this.f6715;
        if (i == 0) {
            ˉⁱ.ˆʿ(obj);
            this.f6715 = 1;
            obj = ConstraintTrackingWorker.m1389(this.f6718, this.f6719, this.f6716, this.f6717, this);
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
        return new C1727(this.f6718, this.f6719, this.f6716, this.f6717, interfaceC3746);
    }
}
