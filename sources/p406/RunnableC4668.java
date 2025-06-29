package p406;

import p331.C3760;
import p370.C4201;
import p370.RunnableC4197;
import p457.C5391;

/* renamed from: ﹳʿ.ﾞʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC4668 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C3760 f17806;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C4658 f17807;

    public RunnableC4668(C4658 c4658, C3760 c3760) {
        this.f17807 = c4658;
        this.f17806 = c3760;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f17807.f17785) {
            try {
                if (((RunnableC4668) this.f17807.f17782.remove(this.f17806)) != null) {
                    InterfaceC4669 interfaceC4669 = (InterfaceC4669) this.f17807.f17783.remove(this.f17806);
                    if (interfaceC4669 != null) {
                        C3760 c3760 = this.f17806;
                        C4201 c4201 = (C4201) interfaceC4669;
                        C5391.m12163().m12168(C4201.f16190, "Exceeded time limits on execution for " + c3760);
                        c4201.f16194.execute(new RunnableC4197(c4201, 0));
                    }
                } else {
                    C5391.m12163().m12168("WrkTimerRunnable", "Timer with " + this.f17806 + " is already marked as complete.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
