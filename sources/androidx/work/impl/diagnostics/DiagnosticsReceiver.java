package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import java.util.Collections;
import java.util.List;
import p414.C4721;
import p414.C4722;
import p457.C5375;
import p457.C5390;
import p457.C5391;

/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final String f1780 = C5391.m12164("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        C5391 c5391M12163 = C5391.m12163();
        String str = f1780;
        c5391M12163.m12168(str, "Requesting diagnostics");
        try {
            C4722 c4722M10635 = C4722.m10635(context);
            List listSingletonList = Collections.singletonList((C5375) new C5390(DiagnosticsWorker.class).m5104());
            if (listSingletonList.isEmpty()) {
                throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
            }
            new C4721(c4722M10635, null, 2, listSingletonList).m10633();
        } catch (IllegalStateException e) {
            C5391.m12163().m12170(str, "WorkManager is not initialized", e);
        }
    }
}
