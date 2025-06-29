package p370;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import p457.C5391;

/* renamed from: ᵢʾ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4199 extends BroadcastReceiver {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final String f16188 = C5391.m12164("ConstraintProxy");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        C5391.m12163().m12168(f16188, "onReceive : " + intent);
        String str = C4196.f16169;
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
        context.startService(intent2);
    }
}
