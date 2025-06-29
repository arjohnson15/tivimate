package p351;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import p065.C1500;
import p141.RunnableC2187;
import p251.C3136;
import p428.AbstractC4939;
import p428.C4925;
import p428.CallableC4922;

/* renamed from: ᵔʼ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class CallableC4004 implements Callable {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ C4925 f15439;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ C1500 f15440;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ boolean f15441;

    public CallableC4004(boolean z, C4925 c4925, C1500 c1500) {
        this.f15441 = z;
        this.f15439 = c4925;
        this.f15440 = c1500;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (!this.f15441) {
            return null;
        }
        C4925 c4925 = this.f15439;
        CallableC4922 callableC4922 = new CallableC4922(c4925, 2, this.f15440);
        ExecutorService executorService = AbstractC4939.f18686;
        C3136 c3136 = new C3136();
        ExecutorService executorService2 = c4925.f18614;
        executorService2.execute(new RunnableC2187(callableC4922, executorService2, c3136, 12));
        return null;
    }
}
