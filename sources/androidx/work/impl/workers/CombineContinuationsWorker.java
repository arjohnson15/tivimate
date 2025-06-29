package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import p457.C5385;

/* loaded from: classes.dex */
public final class CombineContinuationsWorker extends Worker {
    public CombineContinuationsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.Worker
    /* renamed from: ʿʼ */
    public final C5385 mo1371() {
        return new C5385(this.f20826.f1753);
    }
}
