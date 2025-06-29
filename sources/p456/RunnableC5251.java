package p456;

import p331.C3759;
import p413.RunnableC4710;

/* renamed from: ﾞⁱ.ˆˋ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC5251 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final long f20311;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ C3759 f20312;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final long f20313;

    public RunnableC5251(C3759 c3759, long j, long j2) {
        this.f20312 = c3759;
        this.f20313 = j;
        this.f20311 = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5247 c5247 = ((C5255) this.f20312.f14523).ʽᐧ();
        RunnableC4710 runnableC4710 = new RunnableC4710(4);
        runnableC4710.f18078 = this;
        c5247.m11743(runnableC4710);
    }
}
