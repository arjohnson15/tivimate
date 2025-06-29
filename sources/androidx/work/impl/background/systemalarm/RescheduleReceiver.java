package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import p370.C4196;
import p414.C4722;
import p457.C5391;

/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final String f1771 = C5391.m12164("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        C5391.m12163().m12168(f1771, "Received intent " + intent);
        if (Build.VERSION.SDK_INT < 23) {
            String str = C4196.f16169;
            Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent2.setAction("ACTION_RESCHEDULE");
            context.startService(intent2);
            return;
        }
        try {
            C4722 c4722M10635 = C4722.m10635(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            c4722M10635.getClass();
            synchronized (C4722.f18121) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = c4722M10635.f18128;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    c4722M10635.f18128 = pendingResultGoAsync;
                    if (c4722M10635.f18126) {
                        pendingResultGoAsync.finish();
                        c4722M10635.f18128 = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (IllegalStateException e) {
            C5391.m12163().m12170(f1771, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}
