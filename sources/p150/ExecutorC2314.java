package p150;

import androidx.lifecycle.RunnableC0246;
import java.util.concurrent.Executor;
import p236.C3092;
import p329.AbstractC3742;

/* renamed from: ˊʿ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class ExecutorC2314 implements Executor {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f9136;

    public /* synthetic */ ExecutorC2314(int i) {
        this.f9136 = i;
    }

    public /* synthetic */ ExecutorC2314(boolean z) {
        this.f9136 = 3;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f9136) {
            case 0:
                runnable.run();
                break;
            case 1:
                new Thread(runnable).start();
                break;
            case 2:
                runnable.run();
                break;
            case 3:
                C3092.m7596().f11933.f11929.execute(new RunnableC0246(12, runnable));
                break;
            case 4:
                AbstractC3742.m8714().post(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
