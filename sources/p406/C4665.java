package p406;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.UUID;
import p107.AbstractC1801;
import p263.C3258;
import p331.C3760;
import p331.C3768;
import p338.InterfaceC3865;
import p414.C4715;
import p414.C4736;
import p447.AbstractC5179;
import p457.C5367;
import p457.C5391;
import ﹶⁱ.ـﹶ;

/* renamed from: ﹳʿ.ﹳˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C4665 implements InterfaceC3865 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ UUID f17796;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ C5367 f17797;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final /* synthetic */ Context f17798;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ C4647 f17799;

    public /* synthetic */ C4665(C4647 c4647, UUID uuid, C5367 c5367, Context context) {
        this.f17799 = c4647;
        this.f17796 = uuid;
        this.f17797 = c5367;
        this.f17798 = context;
    }

    @Override // p338.InterfaceC3865
    /* renamed from: ـﹶ */
    public final Object mo1053() {
        C4647 c4647 = this.f17799;
        UUID uuid = this.f17796;
        C5367 c5367 = this.f17797;
        Context context = this.f17798;
        c4647.getClass();
        String string = uuid.toString();
        C3768 c3768M8822 = c4647.f17764.m8822(string);
        if (c3768M8822 == null || AbstractC5179.m11551(c3768M8822.f14562)) {
            throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
        }
        C4736 c4736 = c4647.f17763;
        synchronized (c4736.f18165) {
            try {
                C5391.m12163().m12169(C4736.f18161, "Moving WorkSpec (" + string + ") to the foreground");
                C4715 c4715 = (C4715) c4736.f18170.remove(string);
                if (c4715 != null) {
                    if (c4736.f18168 == null) {
                        PowerManager.WakeLock wakeLockM10561 = AbstractC4657.m10561(c4736.f18162, "ProcessorForegroundLck");
                        c4736.f18168 = wakeLockM10561;
                        wakeLockM10561.acquire();
                    }
                    c4736.f18169.put(string, c4715);
                    Intent intentM8014 = C3258.m8014(c4736.f18162, ـﹶ.ˋˊ(c4715.f18097), c5367);
                    Context context2 = c4736.f18162;
                    if (Build.VERSION.SDK_INT >= 26) {
                        AbstractC1801.m5537(context2, intentM8014);
                    } else {
                        context2.startService(intentM8014);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C3760 c3760 = ـﹶ.ˋˊ(c3768M8822);
        String str = C3258.f12707;
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", c5367.f20832);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c5367.f20830);
        intent.putExtra("KEY_NOTIFICATION", c5367.f20831);
        intent.putExtra("KEY_WORKSPEC_ID", c3760.f14526);
        intent.putExtra("KEY_GENERATION", c3760.f14525);
        context.startService(intent);
        return null;
    }
}
