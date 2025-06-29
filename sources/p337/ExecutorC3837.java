package p337;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: ᵎˆ.ᐧˋ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class ExecutorC3837 implements Executor {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ Handler f14737;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f14737.post(runnable);
    }
}
