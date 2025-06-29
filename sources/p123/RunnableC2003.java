package p123;

import android.os.Process;
import ˈⁱ.ﹳﹳ;

/* renamed from: ˈـ.ˑי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC2003 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final Runnable f7622;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f7623;

    public /* synthetic */ RunnableC2003(Runnable runnable, int i) {
        this.f7623 = i;
        this.f7622 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        switch (this.f7623) {
            case 0:
                try {
                    this.f7622.run();
                    break;
                } catch (Exception e) {
                    ﹳﹳ.ᴵʿ("Executor", "Background execution failure.", e);
                    return;
                }
            case 1:
                Process.setThreadPriority(10);
                this.f7622.run();
                break;
            default:
                this.f7622.run();
                break;
        }
    }

    public String toString() {
        switch (this.f7623) {
            case 2:
                return this.f7622.toString();
            default:
                return super.toString();
        }
    }
}
