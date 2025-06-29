package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.lifecycle.AbstractServiceC0257;
import java.util.UUID;
import p023.C1149;
import p065.ExecutorC1522;
import p251.RunnableC3129;
import p263.C3258;
import p395.AbstractC4535;
import p414.C4722;
import p457.C5391;

/* loaded from: classes.dex */
public class SystemForegroundService extends AbstractServiceC0257 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static final String f1781 = C5391.m12164("SystemFgService");

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public boolean f1782;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public C3258 f1783;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public NotificationManager f1784;

    @Override // androidx.lifecycle.AbstractServiceC0257, android.app.Service
    public final void onCreate() {
        super.onCreate();
        m1387();
    }

    @Override // androidx.lifecycle.AbstractServiceC0257, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f1783.m8015();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        boolean z = this.f1782;
        String str = f1781;
        if (z) {
            C5391.m12163().m12169(str, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.f1783.m8015();
            m1387();
            this.f1782 = false;
        }
        if (intent == null) {
            return 3;
        }
        C3258 c3258 = this.f1783;
        c3258.getClass();
        String action = intent.getAction();
        boolean zEquals = "ACTION_START_FOREGROUND".equals(action);
        String str2 = C3258.f12707;
        if (zEquals) {
            C5391.m12163().m12169(str2, "Started foreground service " + intent);
            c3258.f12708.ˏᴵ(new RunnableC3129(c3258, 7, intent.getStringExtra("KEY_WORKSPEC_ID")));
            c3258.m8016(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            c3258.m8016(intent);
            return 3;
        }
        if ("ACTION_CANCEL_WORK".equals(action)) {
            C5391.m12163().m12169(str2, "Stopping foreground work for " + intent);
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
                return 3;
            }
            UUID uuidFromString = UUID.fromString(stringExtra);
            C4722 c4722 = c3258.f12714;
            AbstractC4535.m10339((ExecutorC1522) c4722.f18125.ᐧⁱ, new C1149(c4722, 4, uuidFromString));
            return 3;
        }
        if (!"ACTION_STOP_FOREGROUND".equals(action)) {
            return 3;
        }
        C5391.m12163().m12169(str2, "Stopping foreground service");
        SystemForegroundService systemForegroundService = c3258.f12712;
        if (systemForegroundService == null) {
            return 3;
        }
        systemForegroundService.f1782 = true;
        C5391.m12163().m12168(str, "All commands completed.");
        if (Build.VERSION.SDK_INT >= 26) {
            systemForegroundService.stopForeground(true);
        }
        systemForegroundService.stopSelf();
        return 3;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m1387() {
        this.f1784 = (NotificationManager) getApplicationContext().getSystemService("notification");
        C3258 c3258 = new C3258(getApplicationContext());
        this.f1783 = c3258;
        if (c3258.f12712 != null) {
            C5391.m12163().m12167(C3258.f12707, "A callback already exists.");
        } else {
            c3258.f12712 = this;
        }
    }
}
