package p007;

import java.util.concurrent.Executor;
import p236.C3092;

/* renamed from: ʻˉ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class ExecutorC0955 implements Executor {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f4226;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    private final void m3885(Runnable runnable) {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f4226) {
            case 0:
                break;
            case 1:
                runnable.run();
                break;
            default:
                C3092.m7596().f11933.f11929.execute(runnable);
                break;
        }
    }
}
