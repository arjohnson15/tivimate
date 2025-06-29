package p456;

import android.os.Process;
import java.util.AbstractQueue;
import java.util.concurrent.BlockingQueue;
import p417.AbstractC4753;
import ᵎﹳ.ᐧʻ;

/* renamed from: ﾞⁱ.ⁱʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5338 extends Thread {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final AbstractQueue f20699;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public boolean f20700 = false;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final /* synthetic */ C5247 f20701;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Object f20702;

    /* JADX WARN: Multi-variable type inference failed */
    public C5338(C5247 c5247, String str, BlockingQueue blockingQueue) {
        this.f20701 = c5247;
        AbstractC4753.m10683(blockingQueue);
        this.f20702 = new Object();
        this.f20699 = (AbstractQueue) blockingQueue;
        setName(str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws InterruptedException {
        boolean z = false;
        while (!z) {
            try {
                this.f20701.f20180.acquire();
                z = true;
            } catch (InterruptedException e) {
                m12018(e);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                C5276 c5276 = (C5276) this.f20699.poll();
                if (c5276 != null) {
                    Process.setThreadPriority(c5276.f20453 ? threadPriority : 10);
                    c5276.run();
                } else {
                    synchronized (this.f20702) {
                        if (this.f20699.peek() == null) {
                            this.f20701.getClass();
                            try {
                                this.f20702.wait(30000L);
                            } catch (InterruptedException e2) {
                                m12018(e2);
                            }
                        }
                    }
                    synchronized (this.f20701.f20178) {
                        if (this.f20699.peek() == null) {
                            m12019();
                            m12019();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            m12019();
            throw th;
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m12018(InterruptedException interruptedException) {
        C5301 c5301 = this.f20701.ˏᵢ();
        c5301.f20568.m4531(interruptedException, ᐧʻ.ˉⁱ(getName(), " was interrupted"));
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m12019() {
        synchronized (this.f20701.f20178) {
            try {
                if (!this.f20700) {
                    this.f20701.f20180.release();
                    this.f20701.f20178.notifyAll();
                    C5247 c5247 = this.f20701;
                    if (this == c5247.f20177) {
                        c5247.f20177 = null;
                    } else if (this == c5247.f20179) {
                        c5247.f20179 = null;
                    } else {
                        c5247.ˏᵢ().f20571.m4533("Current scheduler thread is neither worker nor network");
                    }
                    this.f20700 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m12020() {
        synchronized (this.f20702) {
            this.f20702.notifyAll();
        }
    }
}
