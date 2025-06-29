package androidx.work.impl.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p406.RunnableC4666;
import p457.C5391;

/* loaded from: classes.dex */
public class ForceStopRunnable$BroadcastReceiver extends BroadcastReceiver {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final String f1785 = C5391.m12164("ForceStopRunnable$Rcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
            return;
        }
        if (C5391.m12163().f20867 <= 2) {
            String str = f1785;
        }
        RunnableC4666.m10568(context);
    }
}
