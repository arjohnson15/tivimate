package p085;

import androidx.work.impl.workers.ConstraintTrackingWorker;
import p185.AbstractC2562;

/* renamed from: ʿᐧ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1724 extends AbstractC2562 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final /* synthetic */ ConstraintTrackingWorker f6706;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public /* synthetic */ Object f6707;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public int f6708;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1724(ConstraintTrackingWorker constraintTrackingWorker, AbstractC2562 abstractC2562) {
        super(abstractC2562);
        this.f6706 = constraintTrackingWorker;
    }

    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) {
        this.f6707 = obj;
        this.f6708 |= Integer.MIN_VALUE;
        return ConstraintTrackingWorker.m1389(this.f6706, null, null, null, this);
    }
}
