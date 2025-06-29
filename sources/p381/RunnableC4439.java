package p381;

import ᵢ.ʿʼ;

/* renamed from: ᵢᵎ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC4439 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ ScheduledExecutorServiceC4446 f17108;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ Runnable f17109;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final /* synthetic */ ʿʼ f17110;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f17111;

    public /* synthetic */ RunnableC4439(ScheduledExecutorServiceC4446 scheduledExecutorServiceC4446, Runnable runnable, ʿʼ r3, int i) {
        this.f17111 = i;
        this.f17108 = scheduledExecutorServiceC4446;
        this.f17109 = runnable;
        this.f17110 = r3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17111) {
            case 0:
                ScheduledExecutorServiceC4446 scheduledExecutorServiceC4446 = this.f17108;
                scheduledExecutorServiceC4446.getClass();
                final Runnable runnable = this.f17109;
                final ʿʼ r3 = this.f17110;
                final int i = 0;
                scheduledExecutorServiceC4446.f17134.execute(new Runnable() { // from class: ᵢᵎ.ˑʽ
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e) {
                                    ((ScheduledFutureC4448) r3.ˆʿ).mo10583(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e2) {
                                    ((ScheduledFutureC4448) r3.ˆʿ).mo10583(e2);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                ScheduledFutureC4448 scheduledFutureC4448 = (ScheduledFutureC4448) r3.ˆʿ;
                                try {
                                    runnable2.run();
                                    scheduledFutureC4448.m10591(null);
                                    return;
                                } catch (Exception e3) {
                                    scheduledFutureC4448.mo10583(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                ScheduledExecutorServiceC4446 scheduledExecutorServiceC44462 = this.f17108;
                scheduledExecutorServiceC44462.getClass();
                final Runnable runnable2 = this.f17109;
                final ʿʼ r32 = this.f17110;
                final int i2 = 2;
                scheduledExecutorServiceC44462.f17134.execute(new Runnable() { // from class: ᵢᵎ.ˑʽ
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i2) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((ScheduledFutureC4448) r32.ˆʿ).mo10583(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ((ScheduledFutureC4448) r32.ˆʿ).mo10583(e2);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                ScheduledFutureC4448 scheduledFutureC4448 = (ScheduledFutureC4448) r32.ˆʿ;
                                try {
                                    runnable22.run();
                                    scheduledFutureC4448.m10591(null);
                                    return;
                                } catch (Exception e3) {
                                    scheduledFutureC4448.mo10583(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                ScheduledExecutorServiceC4446 scheduledExecutorServiceC44463 = this.f17108;
                scheduledExecutorServiceC44463.getClass();
                final Runnable runnable3 = this.f17109;
                final ʿʼ r33 = this.f17110;
                final int i3 = 1;
                scheduledExecutorServiceC44463.f17134.execute(new Runnable() { // from class: ᵢᵎ.ˑʽ
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i3) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e) {
                                    ((ScheduledFutureC4448) r33.ˆʿ).mo10583(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e2) {
                                    ((ScheduledFutureC4448) r33.ˆʿ).mo10583(e2);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                ScheduledFutureC4448 scheduledFutureC4448 = (ScheduledFutureC4448) r33.ˆʿ;
                                try {
                                    runnable22.run();
                                    scheduledFutureC4448.m10591(null);
                                    return;
                                } catch (Exception e3) {
                                    scheduledFutureC4448.mo10583(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
