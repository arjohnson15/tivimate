package p406;

import p414.C4715;
import p414.C4736;
import p414.C4737;
import p457.C5391;

/* renamed from: ﹳʿ.ˏᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC4654 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C4737 f17775;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final boolean f17776;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final int f17777;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C4736 f17778;

    public RunnableC4654(C4736 c4736, C4737 c4737, boolean z, int i) {
        this.f17778 = c4736;
        this.f17775 = c4737;
        this.f17776 = z;
        this.f17777 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zM10648;
        C4715 c4715M10647;
        if (this.f17776) {
            C4736 c4736 = this.f17778;
            C4737 c4737 = this.f17775;
            int i = this.f17777;
            c4736.getClass();
            String str = c4737.f18173.f14526;
            synchronized (c4736.f18165) {
                c4715M10647 = c4736.m10647(str);
            }
            zM10648 = C4736.m10646(str, c4715M10647, i);
        } else {
            zM10648 = this.f17778.m10648(this.f17775, this.f17777);
        }
        C5391.m12163().m12168(C5391.m12164("StopWorkRunnable"), "StopWorkRunnable for " + this.f17775.f18173.f14526 + "; Processor.stopWork = " + zM10648);
    }
}
