package p263;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p023.AbstractC1142;
import p023.C1134;
import p023.C1147;
import p023.InterfaceC1136;
import p072.InterfaceC1643;
import p331.C3760;
import p331.C3768;
import p406.RunnableC4654;
import p414.C4722;
import p414.C4737;
import p414.InterfaceC4712;
import p447.AbstractC5179;
import p457.C5367;
import p457.C5391;
import ᴵﹳ.ﹶˆ;
import ﹶⁱ.ـﹶ;

/* renamed from: ـʽ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3258 implements InterfaceC1136, InterfaceC4712 {

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public static final String f12707 = C5391.m12164("SystemFgDispatcher");

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final ﹶˆ f12708;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final LinkedHashMap f12709;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final C1147 f12710;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final Object f12711 = new Object();

    /* renamed from: ـˆ, reason: contains not printable characters */
    public SystemForegroundService f12712;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public C3760 f12713;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C4722 f12714;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final HashMap f12715;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final HashMap f12716;

    public C3258(Context context) {
        C4722 c4722M10635 = C4722.m10635(context);
        this.f12714 = c4722M10635;
        this.f12708 = c4722M10635.f18125;
        this.f12713 = null;
        this.f12709 = new LinkedHashMap();
        this.f12716 = new HashMap();
        this.f12715 = new HashMap();
        this.f12710 = new C1147(c4722M10635.f18130);
        c4722M10635.f18124.m10651(this);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static Intent m8014(Context context, C3760 c3760, C5367 c5367) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", c3760.f14526);
        intent.putExtra("KEY_GENERATION", c3760.f14525);
        intent.putExtra("KEY_NOTIFICATION_ID", c5367.f20832);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c5367.f20830);
        intent.putExtra("KEY_NOTIFICATION", c5367.f20831);
        return intent;
    }

    @Override // p414.InterfaceC4712
    /* renamed from: ʽᐧ */
    public final void mo1386(C3760 c3760, boolean z) {
        Map.Entry entry;
        synchronized (this.f12711) {
            try {
                InterfaceC1643 interfaceC1643 = ((C3768) this.f12715.remove(c3760)) != null ? (InterfaceC1643) this.f12716.remove(c3760) : null;
                if (interfaceC1643 != null) {
                    interfaceC1643.mo5172(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C5367 c5367 = (C5367) this.f12709.remove(c3760);
        if (c3760.equals(this.f12713)) {
            if (this.f12709.size() > 0) {
                Iterator it = this.f12709.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.f12713 = (C3760) entry.getKey();
                if (this.f12712 != null) {
                    C5367 c53672 = (C5367) entry.getValue();
                    SystemForegroundService systemForegroundService = this.f12712;
                    int i = c53672.f20832;
                    int i2 = c53672.f20830;
                    Notification notification = c53672.f20831;
                    systemForegroundService.getClass();
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 31) {
                        AbstractC3257.m8013(systemForegroundService, i, notification, i2);
                    } else if (i3 >= 29) {
                        AbstractC3256.m8012(systemForegroundService, i, notification, i2);
                    } else {
                        systemForegroundService.startForeground(i, notification);
                    }
                    this.f12712.f1784.cancel(c53672.f20832);
                }
            } else {
                this.f12713 = null;
            }
        }
        SystemForegroundService systemForegroundService2 = this.f12712;
        if (c5367 == null || systemForegroundService2 == null) {
            return;
        }
        C5391.m12163().m12168(f12707, "Removing Notification (id: " + c5367.f20832 + ", workSpecId: " + c3760 + ", notificationType: " + c5367.f20830);
        systemForegroundService2.f1784.cancel(c5367.f20832);
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m8015() {
        this.f12712 = null;
        synchronized (this.f12711) {
            try {
                Iterator it = this.f12716.values().iterator();
                while (it.hasNext()) {
                    ((InterfaceC1643) it.next()).mo5172(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f12714.f18124.m10649(this);
    }

    @Override // p023.InterfaceC1136
    /* renamed from: ˑʽ */
    public final void mo4159(C3768 c3768, AbstractC1142 abstractC1142) {
        if (abstractC1142 instanceof C1134) {
            C5391.m12163().m12168(f12707, "Constraints unmet for WorkSpec " + c3768.f14575);
            C3760 c3760 = ـﹶ.ˋˊ(c3768);
            C4722 c4722 = this.f12714;
            c4722.getClass();
            c4722.f18125.ˏᴵ(new RunnableC4654(c4722.f18124, new C4737(c3760), true, -512));
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m8016(Intent intent) {
        if (this.f12712 == null) {
            throw new IllegalStateException("handleNotify was called on the destroyed dispatcher");
        }
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        C3760 c3760 = new C3760(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        C5391 c5391M12163 = C5391.m12163();
        StringBuilder sb = new StringBuilder("Notifying with (id:");
        sb.append(intExtra);
        sb.append(", workSpecId: ");
        sb.append(stringExtra);
        sb.append(", notificationType :");
        c5391M12163.m12168(f12707, AbstractC5179.m11550(sb, intExtra2, ")"));
        if (notification == null) {
            throw new IllegalArgumentException("Notification passed in the intent was null.");
        }
        C5367 c5367 = new C5367(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.f12709;
        linkedHashMap.put(c3760, c5367);
        C5367 c53672 = (C5367) linkedHashMap.get(this.f12713);
        if (c53672 == null) {
            this.f12713 = c3760;
        } else {
            this.f12712.f1784.notify(intExtra, notification);
            if (Build.VERSION.SDK_INT >= 29) {
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    i |= ((C5367) ((Map.Entry) it.next()).getValue()).f20830;
                }
                c5367 = new C5367(c53672.f20832, c53672.f20831, i);
            } else {
                c5367 = c53672;
            }
        }
        SystemForegroundService systemForegroundService = this.f12712;
        Notification notification2 = c5367.f20831;
        systemForegroundService.getClass();
        int i2 = Build.VERSION.SDK_INT;
        int i3 = c5367.f20832;
        int i4 = c5367.f20830;
        if (i2 >= 31) {
            AbstractC3257.m8013(systemForegroundService, i3, notification2, i4);
        } else if (i2 >= 29) {
            AbstractC3256.m8012(systemForegroundService, i3, notification2, i4);
        } else {
            systemForegroundService.startForeground(i3, notification2);
        }
    }
}
