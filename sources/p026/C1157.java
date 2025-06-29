package p026;

import android.os.Process;
import java.util.concurrent.locks.ReentrantLock;
import p366.C4169;
import ـˊ.ʿʼ;

/* renamed from: ʼˉ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1157 extends Thread {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f4816 = 2;

    public /* synthetic */ C1157(Runnable runnable) {
        super(runnable);
    }

    public /* synthetic */ C1157(String str) {
        super(str);
    }

    public /* synthetic */ C1157(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        ReentrantLock reentrantLock;
        switch (this.f4816) {
            case 0:
                Process.setThreadPriority(19);
                synchronized (this) {
                    while (true) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                }
            case 1:
                break;
            default:
                Process.setThreadPriority(9);
                super.run();
                return;
        }
        while (true) {
            try {
                ReentrantLock reentrantLock2 = C4169.f16088;
                reentrantLock = C4169.f16088;
                reentrantLock.lock();
            } catch (InterruptedException unused2) {
                continue;
            }
            try {
                C4169 c4169 = ʿʼ.ٴˎ();
                if (c4169 == C4169.f16086) {
                    C4169.f16086 = null;
                    reentrantLock.unlock();
                    return;
                } else {
                    reentrantLock.unlock();
                    if (c4169 != null) {
                        c4169.mo4579();
                    }
                }
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }
}
