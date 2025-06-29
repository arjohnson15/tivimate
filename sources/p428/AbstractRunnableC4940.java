package p428;

import android.os.Process;

/* renamed from: ﹶˊ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC4940 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(10);
        mo11035();
    }

    /* renamed from: ـﹶ */
    public abstract void mo11035();
}
