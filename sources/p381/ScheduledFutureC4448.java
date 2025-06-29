package p381;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p410.AbstractC4686;
import p410.C4684;
import ᵢ.ʿʼ;

/* renamed from: ᵢᵎ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ScheduledFutureC4448 extends AbstractC4686 implements ScheduledFuture {

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final ScheduledFuture f17141;

    public ScheduledFutureC4448(InterfaceC4442 interfaceC4442) {
        this.f17141 = interfaceC4442.mo10063(new ʿʼ(6, this));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f17141.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f17141.getDelay(timeUnit);
    }

    @Override // p410.AbstractC4686
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void mo10064() {
        ScheduledFuture scheduledFuture = this.f17141;
        Object obj = this.f17838;
        scheduledFuture.cancel((obj instanceof C4684) && ((C4684) obj).f17828);
    }
}
