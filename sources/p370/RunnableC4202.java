package p370;

import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import p065.ExecutorC1522;
import p106.ExecutorC1797;
import p406.AbstractC4657;
import p457.C5391;

/* renamed from: ᵢʾ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC4202 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C4198 f16205;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f16206;

    public /* synthetic */ RunnableC4202(C4198 c4198, int i) {
        this.f16206 = i;
        this.f16205 = c4198;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    private final void m9641() {
        ExecutorC1797 executorC1797;
        RunnableC4202 runnableC4202;
        synchronized (this.f16205.f16187) {
            C4198 c4198 = this.f16205;
            c4198.f16180 = (Intent) c4198.f16187.get(0);
        }
        Intent intent = this.f16205.f16180;
        if (intent != null) {
            String action = intent.getAction();
            int intExtra = this.f16205.f16180.getIntExtra("KEY_START_ID", 0);
            C5391 c5391M12163 = C5391.m12163();
            String str = C4198.f16177;
            c5391M12163.m12168(str, "Processing command " + this.f16205.f16180 + ", " + intExtra);
            PowerManager.WakeLock wakeLockM10561 = AbstractC4657.m10561(this.f16205.f16184, action + " (" + intExtra + ")");
            try {
                C5391.m12163().m12168(str, "Acquiring operation wake lock (" + action + ") " + wakeLockM10561);
                wakeLockM10561.acquire();
                C4198 c41982 = this.f16205;
                c41982.f16186.m9627(c41982.f16180, intExtra, c41982);
                C5391.m12163().m12168(str, "Releasing operation wake lock (" + action + ") " + wakeLockM10561);
                wakeLockM10561.release();
                C4198 c41983 = this.f16205;
                executorC1797 = (ExecutorC1797) c41983.f16178.ᐧˋ;
                runnableC4202 = new RunnableC4202(c41983, 1);
            } catch (Throwable th) {
                try {
                    C5391 c5391M121632 = C5391.m12163();
                    String str2 = C4198.f16177;
                    c5391M121632.m12170(str2, "Unexpected error in onHandleIntent", th);
                    C5391.m12163().m12168(str2, "Releasing operation wake lock (" + action + ") " + wakeLockM10561);
                    wakeLockM10561.release();
                    C4198 c41984 = this.f16205;
                    executorC1797 = (ExecutorC1797) c41984.f16178.ᐧˋ;
                    runnableC4202 = new RunnableC4202(c41984, 1);
                } catch (Throwable th2) {
                    C5391.m12163().m12168(C4198.f16177, "Releasing operation wake lock (" + action + ") " + wakeLockM10561);
                    wakeLockM10561.release();
                    C4198 c41985 = this.f16205;
                    ((ExecutorC1797) c41985.f16178.ᐧˋ).execute(new RunnableC4202(c41985, 1));
                    throw th2;
                }
            }
            executorC1797.execute(runnableC4202);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16206) {
            case 0:
                m9641();
                return;
            default:
                C4198 c4198 = this.f16205;
                c4198.getClass();
                C5391 c5391M12163 = C5391.m12163();
                String str = C4198.f16177;
                c5391M12163.m12168(str, "Checking if commands are complete.");
                C4198.m9629();
                synchronized (c4198.f16187) {
                    try {
                        if (c4198.f16180 != null) {
                            C5391.m12163().m12168(str, "Removing command " + c4198.f16180);
                            if (!((Intent) c4198.f16187.remove(0)).equals(c4198.f16180)) {
                                throw new IllegalStateException("Dequeue-d command is not the first.");
                            }
                            c4198.f16180 = null;
                        }
                        ExecutorC1522 executorC1522 = (ExecutorC1522) c4198.f16178.ᐧⁱ;
                        if (!c4198.f16186.m9628() && c4198.f16187.isEmpty() && !executorC1522.m5102()) {
                            C5391.m12163().m12168(str, "No more commands & intents.");
                            SystemAlarmService systemAlarmService = c4198.f16182;
                            if (systemAlarmService != null) {
                                systemAlarmService.m1384();
                            }
                        } else if (!c4198.f16187.isEmpty()) {
                            c4198.m9630();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
