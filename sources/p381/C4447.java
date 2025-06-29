package p381;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import ᵢ.ʿʼ;

/* renamed from: ᵢᵎ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C4447 implements InterfaceC4442 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ ScheduledExecutorServiceC4446 f17135;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final /* synthetic */ long f17136;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ Runnable f17137;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final /* synthetic */ long f17138;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f17139;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ TimeUnit f17140;

    public /* synthetic */ C4447(ScheduledExecutorServiceC4446 scheduledExecutorServiceC4446, Runnable runnable, long j, long j2, TimeUnit timeUnit, int i) {
        this.f17139 = i;
        this.f17135 = scheduledExecutorServiceC4446;
        this.f17137 = runnable;
        this.f17138 = j;
        this.f17136 = j2;
        this.f17140 = timeUnit;
    }

    @Override // p381.InterfaceC4442
    /* renamed from: ʽᐧ */
    public final ScheduledFuture mo10063(ʿʼ r9) {
        switch (this.f17139) {
            case 0:
                ScheduledExecutorServiceC4446 scheduledExecutorServiceC4446 = this.f17135;
                scheduledExecutorServiceC4446.getClass();
                return scheduledExecutorServiceC4446.f17133.scheduleAtFixedRate(new RunnableC4439(scheduledExecutorServiceC4446, this.f17137, r9, 0), this.f17138, this.f17136, this.f17140);
            default:
                ScheduledExecutorServiceC4446 scheduledExecutorServiceC44462 = this.f17135;
                scheduledExecutorServiceC44462.getClass();
                return scheduledExecutorServiceC44462.f17133.scheduleWithFixedDelay(new RunnableC4439(scheduledExecutorServiceC44462, this.f17137, r9, 2), this.f17138, this.f17136, this.f17140);
        }
    }
}
