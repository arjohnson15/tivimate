package p370;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.PowerManager;
import androidx.leanback.widget.ʿˏ;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import p023.AbstractC1142;
import p023.AbstractC1148;
import p023.C1144;
import p023.C1147;
import p023.InterfaceC1136;
import p065.ExecutorC1522;
import p072.AbstractC1636;
import p072.C1592;
import p080.AbstractC1702;
import p106.ExecutorC1797;
import p222.RunnableC2949;
import p331.C3760;
import p331.C3768;
import p406.AbstractC4657;
import p406.C4658;
import p406.InterfaceC4669;
import p406.RunnableC4668;
import p414.C4737;
import p457.C5391;
import ᴵﹳ.ﹶˆ;

/* renamed from: ᵢʾ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4201 implements InterfaceC1136, InterfaceC4669 {

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public static final String f16190 = C5391.m12164("DelayMetCommandHandler");

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final C4737 f16191;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final int f16192;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final C1147 f16193;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final ExecutorC1522 f16194;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final C3760 f16195;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public volatile C1592 f16196;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public final AbstractC1636 f16197;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final ExecutorC1797 f16198;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final C4198 f16199;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Context f16200;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public PowerManager.WakeLock f16201;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final Object f16202;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public int f16203;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public boolean f16204;

    public C4201(Context context, int i, C4198 c4198, C4737 c4737) {
        this.f16200 = context;
        this.f16192 = i;
        this.f16199 = c4198;
        this.f16195 = c4737.f18173;
        this.f16191 = c4737;
        ʿˏ r1 = c4198.f16179.f18130;
        ﹶˆ r2 = c4198.f16178;
        this.f16194 = (ExecutorC1522) r2.ᐧⁱ;
        this.f16198 = (ExecutorC1797) r2.ᐧˋ;
        this.f16197 = (AbstractC1636) r2.ˆʿ;
        this.f16193 = new C1147(r1);
        this.f16204 = false;
        this.f16203 = 0;
        this.f16202 = new Object();
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static void m9636(C4201 c4201) {
        if (c4201.f16203 != 0) {
            C5391.m12163().m12168(f16190, "Already started work for " + c4201.f16195);
            return;
        }
        c4201.f16203 = 1;
        C5391.m12163().m12168(f16190, "onAllConstraintsMet for " + c4201.f16195);
        if (!c4201.f16199.f16183.m10655(c4201.f16191, null)) {
            c4201.m9640();
            return;
        }
        C4658 c4658 = c4201.f16199.f16181;
        C3760 c3760 = c4201.f16195;
        synchronized (c4658.f17785) {
            C5391.m12163().m12168(C4658.f17781, "Starting timer for " + c3760);
            c4658.m10562(c3760);
            RunnableC4668 runnableC4668 = new RunnableC4668(c4658, c3760);
            c4658.f17782.put(c3760, runnableC4668);
            c4658.f17783.put(c3760, c4201);
            ((Handler) c4658.f17784.ˆʿ).postDelayed(runnableC4668, 600000L);
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m9637(C4201 c4201) {
        C3760 c3760 = c4201.f16195;
        int i = c4201.f16203;
        String str = c3760.f14526;
        String str2 = f16190;
        if (i >= 2) {
            C5391.m12163().m12168(str2, "Already stopped work for " + str);
            return;
        }
        c4201.f16203 = 2;
        C5391.m12163().m12168(str2, "Stopping work for WorkSpec " + str);
        Context context = c4201.f16200;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        C4196.m9625(intent, c3760);
        C4198 c4198 = c4201.f16199;
        int i2 = c4201.f16192;
        RunnableC2949 runnableC2949 = new RunnableC2949(c4198, intent, i2, 5);
        ExecutorC1797 executorC1797 = c4201.f16198;
        executorC1797.execute(runnableC2949);
        if (!c4198.f16183.m10653(str)) {
            C5391.m12163().m12168(str2, "Processor does not have WorkSpec " + str + ". No need to reschedule");
            return;
        }
        C5391.m12163().m12168(str2, "WorkSpec " + str + " needs to be rescheduled");
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_SCHEDULE_WORK");
        C4196.m9625(intent2, c3760);
        executorC1797.execute(new RunnableC2949(c4198, intent2, i2, 5));
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m9638() {
        String str = this.f16195.f14526;
        Context context = this.f16200;
        StringBuilder sbM5409 = AbstractC1702.m5409(str, " (");
        sbM5409.append(this.f16192);
        sbM5409.append(")");
        this.f16201 = AbstractC4657.m10561(context, sbM5409.toString());
        C5391 c5391M12163 = C5391.m12163();
        String str2 = "Acquiring wakelock " + this.f16201 + "for WorkSpec " + str;
        String str3 = f16190;
        c5391M12163.m12168(str3, str2);
        this.f16201.acquire();
        C3768 c3768M8822 = this.f16199.f16179.f18122.mo1374().m8822(str);
        if (c3768M8822 == null) {
            this.f16194.execute(new RunnableC4197(this, 0));
            return;
        }
        boolean zM8817 = c3768M8822.m8817();
        this.f16204 = zM8817;
        if (zM8817) {
            this.f16196 = AbstractC1148.m4175(this.f16193, c3768M8822, this.f16197, this);
            return;
        }
        C5391.m12163().m12168(str3, "No constraints for " + str);
        this.f16194.execute(new RunnableC4197(this, 1));
    }

    @Override // p023.InterfaceC1136
    /* renamed from: ˑʽ */
    public final void mo4159(C3768 c3768, AbstractC1142 abstractC1142) {
        boolean z = abstractC1142 instanceof C1144;
        ExecutorC1522 executorC1522 = this.f16194;
        if (z) {
            executorC1522.execute(new RunnableC4197(this, 1));
        } else {
            executorC1522.execute(new RunnableC4197(this, 0));
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m9639(boolean z) {
        C5391 c5391M12163 = C5391.m12163();
        StringBuilder sb = new StringBuilder("onExecuted ");
        C3760 c3760 = this.f16195;
        sb.append(c3760);
        sb.append(", ");
        sb.append(z);
        c5391M12163.m12168(f16190, sb.toString());
        m9640();
        int i = this.f16192;
        C4198 c4198 = this.f16199;
        ExecutorC1797 executorC1797 = this.f16198;
        Context context = this.f16200;
        if (z) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_SCHEDULE_WORK");
            C4196.m9625(intent, c3760);
            executorC1797.execute(new RunnableC2949(c4198, intent, i, 5));
        }
        if (this.f16204) {
            Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
            executorC1797.execute(new RunnableC2949(c4198, intent2, i, 5));
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m9640() {
        synchronized (this.f16202) {
            try {
                if (this.f16196 != null) {
                    this.f16196.mo5172(null);
                }
                this.f16199.f16181.m10562(this.f16195);
                PowerManager.WakeLock wakeLock = this.f16201;
                if (wakeLock != null && wakeLock.isHeld()) {
                    C5391.m12163().m12168(f16190, "Releasing wakelock " + this.f16201 + "for WorkSpec " + this.f16195);
                    this.f16201.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
