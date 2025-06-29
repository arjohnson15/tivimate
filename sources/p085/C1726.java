package p085;

import androidx.work.impl.workers.ConstraintTrackingWorker;
import p185.AbstractC2562;
import p457.AbstractC5366;

/* renamed from: ʿᐧ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1726 extends AbstractC2562 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public AbstractC5366 f6710;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public int f6711;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public ConstraintTrackingWorker f6712;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public /* synthetic */ Object f6713;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final /* synthetic */ ConstraintTrackingWorker f6714;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1726(ConstraintTrackingWorker constraintTrackingWorker, AbstractC2562 abstractC2562) {
        super(abstractC2562);
        this.f6714 = constraintTrackingWorker;
    }

    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) {
        this.f6713 = obj;
        this.f6711 |= Integer.MIN_VALUE;
        return ConstraintTrackingWorker.m1388(this.f6714, this);
    }
}
