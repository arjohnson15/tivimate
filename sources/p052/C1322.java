package p052;

import android.os.Process;

/* renamed from: ʾʼ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1322 extends Thread {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int f5380;

    public C1322(Runnable runnable, String str, int i) {
        super(runnable, str);
        this.f5380 = i;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(this.f5380);
        super.run();
    }
}
