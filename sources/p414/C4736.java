package p414;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkerStoppedException;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import p072.AbstractC1636;
import p072.AbstractC1642;
import p072.C1592;
import p106.ExecutorC1797;
import p141.RunnableC2187;
import p263.C3258;
import p278.AbstractC3362;
import p331.C3760;
import p331.C3768;
import p381.CallableC4445;
import p406.RunnableC4645;
import p410.C4681;
import p433.C5029;
import p457.C5357;
import p457.C5368;
import p457.C5391;
import ᴵﹳ.ٴˎ;
import ᴵﹳ.ﹶˆ;

/* renamed from: ﹳـ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4736 {

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static final String f18161 = C5391.m12164("Processor");

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Context f18162;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final WorkDatabase f18163;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C5357 f18167;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final ﹶˆ f18171;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final HashMap f18170 = new HashMap();

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final HashMap f18169 = new HashMap();

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final HashSet f18172 = new HashSet();

    /* renamed from: ˉי, reason: contains not printable characters */
    public final ArrayList f18164 = new ArrayList();

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public PowerManager.WakeLock f18168 = null;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final Object f18165 = new Object();

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final HashMap f18166 = new HashMap();

    public C4736(Context context, C5357 c5357, ﹶˆ r3, WorkDatabase workDatabase) {
        this.f18162 = context;
        this.f18167 = c5357;
        this.f18171 = r3;
        this.f18163 = workDatabase;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static boolean m10646(String str, C4715 c4715, int i) {
        String str2 = f18161;
        if (c4715 == null) {
            C5391.m12163().m12168(str2, "WorkerWrapper could not be found for " + str);
            return false;
        }
        c4715.f18093.mo5271(new WorkerStoppedException(i));
        C5391.m12163().m12168(str2, "WorkerWrapper interrupted for " + str);
        return true;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C4715 m10647(String str) {
        C4715 c4715 = (C4715) this.f18169.remove(str);
        boolean z = c4715 != null;
        if (!z) {
            c4715 = (C4715) this.f18170.remove(str);
        }
        this.f18166.remove(str);
        if (z) {
            synchronized (this.f18165) {
                try {
                    if (this.f18169.isEmpty()) {
                        Context context = this.f18162;
                        String str2 = C3258.f12707;
                        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                        intent.setAction("ACTION_STOP_FOREGROUND");
                        try {
                            this.f18162.startService(intent);
                        } catch (Throwable th) {
                            C5391.m12163().m12170(f18161, "Unable to stop foreground service", th);
                        }
                        PowerManager.WakeLock wakeLock = this.f18168;
                        if (wakeLock != null) {
                            wakeLock.release();
                            this.f18168 = null;
                        }
                    }
                } finally {
                }
            }
        }
        return c4715;
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final boolean m10648(C4737 c4737, int i) {
        String str = c4737.f18173.f14526;
        synchronized (this.f18165) {
            try {
                if (this.f18169.get(str) == null) {
                    Set set = (Set) this.f18166.get(str);
                    if (set != null && set.contains(c4737)) {
                        return m10646(str, m10647(str), i);
                    }
                    return false;
                }
                C5391.m12163().m12168(f18161, "Ignored stopWork. WorkerWrapper " + str + " is in foreground");
                return false;
            } finally {
            }
        }
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final void m10649(InterfaceC4712 interfaceC4712) {
        synchronized (this.f18165) {
            this.f18164.remove(interfaceC4712);
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C3768 m10650(String str) {
        synchronized (this.f18165) {
            try {
                C4715 c4715M10654 = m10654(str);
                if (c4715M10654 == null) {
                    return null;
                }
                return c4715M10654.f18097;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m10651(InterfaceC4712 interfaceC4712) {
        synchronized (this.f18165) {
            this.f18164.add(interfaceC4712);
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final boolean m10652(String str) {
        boolean zContains;
        synchronized (this.f18165) {
            zContains = this.f18172.contains(str);
        }
        return zContains;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final boolean m10653(String str) {
        boolean z;
        synchronized (this.f18165) {
            z = m10654(str) != null;
        }
        return z;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C4715 m10654(String str) {
        C4715 c4715 = (C4715) this.f18169.get(str);
        return c4715 == null ? (C4715) this.f18170.get(str) : c4715;
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final boolean m10655(C4737 c4737, C5368 c5368) {
        C3760 c3760 = c4737.f18173;
        String str = c3760.f14526;
        ArrayList arrayList = new ArrayList();
        C3768 c3768 = (C3768) this.f18163.m5042(new CallableC4445(this, arrayList, str, 1));
        if (c3768 == null) {
            C5391.m12163().m12166(f18161, "Didn't find WorkSpec for id " + c3760);
            ((ExecutorC1797) this.f18171.ᐧˋ).execute(new RunnableC4645(this, 1, c3760));
            return false;
        }
        synchronized (this.f18165) {
            try {
                if (m10653(str)) {
                    Set set = (Set) this.f18166.get(str);
                    if (((C4737) set.iterator().next()).f18173.f14525 == c3760.f14525) {
                        set.add(c4737);
                        C5391.m12163().m12168(f18161, "Work " + c3760 + " is already enqueued for processing");
                    } else {
                        ((ExecutorC1797) this.f18171.ᐧˋ).execute(new RunnableC4645(this, 1, c3760));
                    }
                    return false;
                }
                if (c3768.f14581 != c3760.f14525) {
                    ((ExecutorC1797) this.f18171.ᐧˋ).execute(new RunnableC4645(this, 1, c3760));
                    return false;
                }
                C4715 c4715 = new C4715(new C5029(this.f18162, this.f18167, this.f18171, this, this.f18163, c3768, arrayList));
                AbstractC1636 abstractC1636 = (AbstractC1636) c4715.f18100.ˆʿ;
                C1592 c1592M5281 = AbstractC1642.m5281();
                abstractC1636.getClass();
                C4681 c4681M8192 = AbstractC3362.m8192(ٴˎ.ˋⁱ(abstractC1636, c1592M5281), new C4739(c4715, null));
                c4681M8192.f17815.mo10415(new RunnableC2187(this, c4681M8192, c4715, 10), (ExecutorC1797) this.f18171.ᐧˋ);
                this.f18170.put(str, c4715);
                HashSet hashSet = new HashSet();
                hashSet.add(c4737);
                this.f18166.put(str, hashSet);
                C5391.m12163().m12168(f18161, C4736.class.getSimpleName() + ": processing " + c3760);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
