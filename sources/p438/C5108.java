package p438;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;
import p166.AbstractC2394;
import p383.AbstractC4464;
import p383.C4460;

/* renamed from: ﹶﾞ.ᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5108 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final InterfaceC5071 f19438;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public Object f19439;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public boolean f19440;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C4460 f19441;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final InterfaceC5109 f19442;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final Looper f19443;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public boolean f19444;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int f19445;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public boolean f19446;

    public C5108(InterfaceC5071 interfaceC5071, InterfaceC5109 interfaceC5109, AbstractC2394 abstractC2394, int i, C4460 c4460, Looper looper) {
        this.f19438 = interfaceC5071;
        this.f19442 = interfaceC5109;
        this.f19443 = looper;
        this.f19441 = c4460;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final synchronized void m11320(boolean z) {
        this.f19440 = z | this.f19440;
        this.f19446 = true;
        notifyAll();
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m11321() {
        AbstractC4464.m10132(!this.f19444);
        this.f19444 = true;
        C5076 c5076 = (C5076) this.f19438;
        synchronized (c5076) {
            if (!c5076.f19259 && c5076.f19279.getThread().isAlive()) {
                c5076.f19262.m10159(14, this).m10121();
                return;
            }
            AbstractC4464.m10144("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            m11320(false);
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final synchronized void m11322(long j) {
        boolean z;
        AbstractC4464.m10132(this.f19444);
        AbstractC4464.m10132(this.f19443.getThread() != Thread.currentThread());
        this.f19441.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j;
        while (true) {
            z = this.f19446;
            if (z || j <= 0) {
                break;
            }
            this.f19441.getClass();
            wait(j);
            this.f19441.getClass();
            j = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (!z) {
            throw new TimeoutException("Message delivery timed out.");
        }
    }
}
