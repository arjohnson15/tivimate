package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import androidx.lifecycle.AbstractServiceC0257;
import java.util.LinkedHashMap;
import java.util.Map;
import p370.C4198;
import p406.AbstractC4657;
import p406.C4664;
import p457.C5391;

/* loaded from: classes.dex */
public class SystemAlarmService extends AbstractServiceC0257 {

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static final String f1772 = C5391.m12164("SystemAlarmService");

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public C4198 f1773;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public boolean f1774;

    @Override // androidx.lifecycle.AbstractServiceC0257, android.app.Service
    public final void onCreate() {
        super.onCreate();
        C4198 c4198 = new C4198(this);
        this.f1773 = c4198;
        if (c4198.f16182 != null) {
            C5391.m12163().m12167(C4198.f16177, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            c4198.f16182 = this;
        }
        this.f1774 = false;
    }

    @Override // androidx.lifecycle.AbstractServiceC0257, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f1774 = true;
        C4198 c4198 = this.f1773;
        c4198.getClass();
        C5391.m12163().m12168(C4198.f16177, "Destroying SystemAlarmDispatcher");
        c4198.f16183.m10649(c4198);
        c4198.f16182 = null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.f1774) {
            C5391.m12163().m12169(f1772, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            C4198 c4198 = this.f1773;
            c4198.getClass();
            C5391 c5391M12163 = C5391.m12163();
            String str = C4198.f16177;
            c5391M12163.m12168(str, "Destroying SystemAlarmDispatcher");
            c4198.f16183.m10649(c4198);
            c4198.f16182 = null;
            C4198 c41982 = new C4198(this);
            this.f1773 = c41982;
            if (c41982.f16182 != null) {
                C5391.m12163().m12167(str, "A completion listener for SystemAlarmDispatcher already exists.");
            } else {
                c41982.f16182 = this;
            }
            this.f1774 = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f1773.m9631(intent, i2);
        return 3;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m1384() {
        this.f1774 = true;
        C5391.m12163().m12168(f1772, "All commands completed in dispatcher");
        String str = AbstractC4657.f17780;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (C4664.f17795) {
            linkedHashMap.putAll(C4664.f17794);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str2 = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                C5391.m12163().m12166(AbstractC4657.f17780, "WakeLock held for " + str2);
            }
        }
        stopSelf();
    }
}
