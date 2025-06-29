package p085;

import androidx.work.impl.workers.ConstraintTrackingWorker;
import p072.InterfaceC1594;
import p155.EnumC2332;
import p185.AbstractC2567;
import p288.C3397;
import p330.InterfaceC3746;
import p338.InterfaceC3864;
import ˈⁱ.ˉⁱ;

/* renamed from: ʿᐧ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1717 extends AbstractC2567 implements InterfaceC3864 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f6689;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ ConstraintTrackingWorker f6690;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1717(ConstraintTrackingWorker constraintTrackingWorker, InterfaceC3746 interfaceC3746) {
        super(2, interfaceC3746);
        this.f6690 = constraintTrackingWorker;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        return ((C1717) mo1056((InterfaceC1594) obj, (InterfaceC3746) obj2)).mo1055(C3397.f13249);
    }

    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) {
        EnumC2332 enumC2332 = EnumC2332.f9250;
        int i = this.f6689;
        if (i == 0) {
            ˉⁱ.ˆʿ(obj);
            this.f6689 = 1;
            obj = ConstraintTrackingWorker.m1388(this.f6690, this);
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
        return new C1717(this.f6690, interfaceC3746);
    }
}
