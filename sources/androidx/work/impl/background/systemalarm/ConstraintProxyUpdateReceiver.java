package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p029.RunnableC1181;
import p414.C4722;
import p457.C5391;
import ᵎﹳ.ᐧʻ;

/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final String f1770 = C5391.m12164("ConstrntProxyUpdtRecvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            C4722.m10635(context).f18125.ˏᴵ(new RunnableC1181(intent, context, goAsync(), 4, false));
        } else {
            C5391.m12163().m12168(f1770, ᐧʻ.ﾞˊ("Ignoring unknown action ", action));
        }
    }
}
