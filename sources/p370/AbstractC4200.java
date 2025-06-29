package p370;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import p331.C3760;
import p331.C3770;
import p369.CallableC4193;
import p396.C4554;
import p457.C5391;
import ᴵﹳ.ﹶˆ;

/* renamed from: ᵢʾ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4200 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final String f16189 = C5391.m12164("Alarms");

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static void m9633(Context context, WorkDatabase workDatabase, C3760 c3760, long j) {
        ﹶˆ r0 = workDatabase.mo1373();
        C3770 c3770 = r0.ﹳˎ(c3760);
        if (c3770 != null) {
            int i = c3770.f14589;
            m9635(context, c3760, i);
            m9634(context, c3760, i, j);
        } else {
            int iIntValue = ((Number) workDatabase.m5042(new CallableC4193(1, new C4554(workDatabase)))).intValue();
            r0.ˋˊ(new C3770(c3760.f14525, iIntValue, c3760.f14526));
            m9634(context, c3760, iIntValue, j);
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static void m9634(Context context, C3760 c3760, int i, long j) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i2 = Build.VERSION.SDK_INT >= 23 ? 201326592 : 134217728;
        String str = C4196.f16169;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        C4196.m9625(intent, c3760);
        PendingIntent service = PendingIntent.getService(context, i, intent, i2);
        if (alarmManager != null) {
            alarmManager.setExact(0, j, service);
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m9635(Context context, C3760 c3760, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        String str = C4196.f16169;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        C4196.m9625(intent, c3760);
        PendingIntent service = PendingIntent.getService(context, i, intent, Build.VERSION.SDK_INT >= 23 ? 603979776 : 536870912);
        if (service == null || alarmManager == null) {
            return;
        }
        C5391.m12163().m12168(f16189, "Cancelling existing alarm with (workSpecId, systemId) (" + c3760 + ", " + i + ")");
        alarmManager.cancel(service);
    }
}
