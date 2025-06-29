package ar.tvplayer.core.domain2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p070.AbstractC1549;
import ﾞﹶ.ᵢʿ;

/* loaded from: classes.dex */
public final class ScheduleExactAlarmPermissionReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (AbstractC1549.m5138(intent != null ? intent.getAction() : null, "android.app.action.SCHEDULE_EXACT_ALARM_PERMISSION_STATE_CHANGED")) {
            ᵢʿ.יʻ();
        }
    }
}
