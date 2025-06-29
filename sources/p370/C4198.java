package p370;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.Iterator;
import p106.ExecutorC1797;
import p222.RunnableC2949;
import p331.C3759;
import p331.C3760;
import p406.AbstractC4657;
import p406.C4658;
import p414.C4722;
import p414.C4736;
import p414.InterfaceC4712;
import p456.C5349;
import p457.C5391;
import ᴵﹳ.ﹶˆ;

/* renamed from: ᵢʾ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4198 implements InterfaceC4712 {

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public static final String f16177 = C5391.m12164("SystemAlarmDispatcher");

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final ﹶˆ f16178;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final C4722 f16179;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public Intent f16180;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final C4658 f16181;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public SystemAlarmService f16182;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final C4736 f16183;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Context f16184;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final C5349 f16185;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final C4196 f16186;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final ArrayList f16187;

    public C4198(SystemAlarmService systemAlarmService) {
        Context applicationContext = systemAlarmService.getApplicationContext();
        this.f16184 = applicationContext;
        C3759 c3759 = new C3759((byte) 0, 17);
        C4722 c4722M10635 = C4722.m10635(systemAlarmService);
        this.f16179 = c4722M10635;
        this.f16186 = new C4196(applicationContext, c4722M10635.f18131.f20795, c3759);
        this.f16181 = new C4658(c4722M10635.f18131.f20794);
        C4736 c4736 = c4722M10635.f18124;
        this.f16183 = c4736;
        ﹶˆ r5 = c4722M10635.f18125;
        this.f16178 = r5;
        this.f16185 = new C5349(17, c4736, r5, false);
        c4736.m10651(this);
        this.f16187 = new ArrayList();
        this.f16180 = null;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static void m9629() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    @Override // p414.InterfaceC4712
    /* renamed from: ʽᐧ */
    public final void mo1386(C3760 c3760, boolean z) {
        ExecutorC1797 executorC1797 = (ExecutorC1797) this.f16178.ᐧˋ;
        String str = C4196.f16169;
        Intent intent = new Intent(this.f16184, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        C4196.m9625(intent, c3760);
        executorC1797.execute(new RunnableC2949(this, intent, 0, 5));
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m9630() {
        m9629();
        PowerManager.WakeLock wakeLockM10561 = AbstractC4657.m10561(this.f16184, "ProcessCommand");
        try {
            wakeLockM10561.acquire();
            this.f16179.f18125.ˏᴵ(new RunnableC4202(this, 0));
        } finally {
            wakeLockM10561.release();
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m9631(Intent intent, int i) {
        C5391 c5391M12163 = C5391.m12163();
        String str = f16177;
        c5391M12163.m12168(str, "Adding command " + intent + " (" + i + ")");
        m9629();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            C5391.m12163().m12166(str, "Unknown command. Ignoring");
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && m9632()) {
            return;
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.f16187) {
            try {
                boolean zIsEmpty = this.f16187.isEmpty();
                this.f16187.add(intent);
                if (zIsEmpty) {
                    m9630();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final boolean m9632() {
        m9629();
        synchronized (this.f16187) {
            try {
                Iterator it = this.f16187.iterator();
                while (it.hasNext()) {
                    if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
