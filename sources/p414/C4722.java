package p414;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.leanback.widget.ʿˏ;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import com.bumptech.glide.ﹳﹳ;
import com.google.android.gms.internal.play_billing.ᐧʻ;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.logging.Logger;
import p010.C1017;
import p010.InterfaceC1008;
import p013.C1047;
import p023.C1138;
import p023.C1149;
import p065.AbstractC1502;
import p065.C1529;
import p065.ExecutorC1522;
import p072.AbstractC1636;
import p072.AbstractC1642;
import p090.C1743;
import p123.C1995;
import p123.C2010;
import p135.C2095;
import p138.InterfaceC2115;
import p139.C2125;
import p140.C2178;
import p148.C2267;
import p175.C2484;
import p183.InterfaceC2535;
import p184.AbstractC2539;
import p184.C2545;
import p184.C2558;
import p184.InterfaceC2551;
import p306.C3554;
import p330.C3749;
import p331.C3760;
import p331.C3766;
import p331.C3772;
import p331.CallableC3763;
import p395.AbstractC4535;
import p406.RunnableC4666;
import p414.AbstractC4723;
import p414.InterfaceC4728;
import p434.AbstractC5035;
import p434.C5034;
import p437.C5070;
import p457.C5357;
import p457.C5368;
import p457.C5391;
import p457.InterfaceC5377;
import ˈʼ.ʽᐧ;
import ᴵﹳ.ﹶˆ;
import ᵢ.ʿʼ;
import ﾞﹶ.ᵢʿ;

/* renamed from: ﹳـ.ˏᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4722 extends ᵢʿ {

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public static C4722 f18119;

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public static C4722 f18120;

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public static final Object f18121;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final WorkDatabase f18122;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final List f18123;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final C4736 f18124;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final ﹶˆ f18125;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public boolean f18126 = false;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final Context f18127;

    /* renamed from: ˑי, reason: contains not printable characters */
    public BroadcastReceiver.PendingResult f18128;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final ʿʼ f18129;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final ʿˏ f18130;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final C5357 f18131;

    static {
        C5391.m12164("WorkManagerImpl");
        f18119 = null;
        f18120 = null;
        f18121 = new Object();
    }

    public C4722(Context context, final C5357 c5357, ﹶˆ r7, final WorkDatabase workDatabase, final List list, C4736 c4736, ʿˏ r11) {
        int i = 1;
        Context applicationContext = context.getApplicationContext();
        if (Build.VERSION.SDK_INT >= 24 && AbstractC4731.m10645(applicationContext)) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        C5391 c5391 = new C5391(c5357.f20790);
        synchronized (C5391.f20865) {
            C5391.f20866 = c5391;
        }
        this.f18127 = applicationContext;
        this.f18125 = r7;
        this.f18122 = workDatabase;
        this.f18124 = c4736;
        this.f18130 = r11;
        this.f18131 = c5357;
        this.f18123 = list;
        C2267 c2267M5296 = AbstractC1642.m5296((AbstractC1636) r7.ˆʿ);
        this.f18129 = new ʿʼ(11, workDatabase);
        final ExecutorC1522 executorC1522 = (ExecutorC1522) r7.ᐧⁱ;
        String str = AbstractC4723.f18132;
        c4736.m10651(new InterfaceC4712() { // from class: ﹳـ.ᐧʻ
            @Override // p414.InterfaceC4712
            /* renamed from: ʽᐧ */
            public final void mo1386(final C3760 c3760, boolean z) {
                final List list2 = list;
                final C5357 c53572 = c5357;
                final WorkDatabase workDatabase2 = workDatabase;
                final int i2 = 1;
                executorC1522.execute(new Runnable() { // from class: ᵢˎ.ᐧˋ
                    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, ᵢˎ.ᵢʿ] */
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i2) {
                            case 0:
                                c3760.mo2481(((ᐧʻ) list2).ˆʿ, (C4290) c53572, (C2484) workDatabase2);
                                break;
                            case 1:
                                List list3 = (List) list2;
                                Iterator it = list3.iterator();
                                while (it.hasNext()) {
                                    ((InterfaceC4728) it.next()).mo7033(((C3760) c3760).f14526);
                                }
                                AbstractC4723.m10640((C5357) c53572, (WorkDatabase) workDatabase2, list3);
                                break;
                            default:
                                C1995 c1995 = (C1995) c3760;
                                InterfaceC2535 interfaceC2535 = (InterfaceC2535) c53572;
                                C2010 c2010 = (C2010) workDatabase2;
                                C5070 c5070 = (C5070) list2;
                                c5070.getClass();
                                Logger logger = C5070.f19223;
                                try {
                                    InterfaceC2115 interfaceC2115M5976 = c5070.f19226.m5976(c1995.f7594);
                                    if (interfaceC2115M5976 == null) {
                                        String str2 = "Transport backend '" + c1995.f7594 + "' is not registered";
                                        logger.warning(str2);
                                        interfaceC2535.mo4232(new IllegalArgumentException(str2));
                                    } else {
                                        ((C3554) c5070.f19225).m8436(new C2125(c5070, c1995, ((C2095) interfaceC2115M5976).m5942(c2010), 4));
                                        interfaceC2535.mo4232(null);
                                    }
                                    break;
                                } catch (Exception e) {
                                    logger.warning("Error scheduling event " + e.getMessage());
                                    interfaceC2535.mo4232(e);
                                    return;
                                }
                        }
                    }
                });
            }
        });
        r7.ˏᴵ(new RunnableC4666(applicationContext, this));
        C3772 c3772Mo1374 = workDatabase.mo1374();
        c3772Mo1374.getClass();
        TreeMap treeMap = C1529.f6210;
        InterfaceC2551 c1138 = new C1138(new C2178(c3772Mo1374.f14601, new String[]{"workspec"}, new C1047(i, new CallableC3763(c3772Mo1374, AbstractC1502.m5069(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1"), i)), null));
        boolean z = c1138 instanceof InterfaceC1008;
        C3749 c3749 = C3749.f14510;
        AbstractC1642.m5294(c2267M5296, null, 0, new C2558(new C2545(AbstractC2539.m6671(z ? ((InterfaceC1008) c1138).mo3960(c3749, 0, 2) : new C1017(c1138, c3749, 0, 2)), new C4716(applicationContext, null)), null), 3);
    }

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static C4722 m10634() {
        synchronized (f18121) {
            try {
                C4722 c4722 = f18119;
                if (c4722 != null) {
                    return c4722;
                }
                return f18120;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public static C4722 m10635(Context context) {
        C4722 c4722M10634;
        synchronized (f18121) {
            try {
                c4722M10634 = m10634();
                if (c4722M10634 == null) {
                    ʽᐧ applicationContext = context.getApplicationContext();
                    if (!(applicationContext instanceof InterfaceC5377)) {
                        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                    }
                    ((InterfaceC5377) applicationContext).getClass();
                    m10636(applicationContext, new C5357());
                    c4722M10634 = m10635(applicationContext);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4722M10634;
    }

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public static void m10636(Context context, C5357 c5357) {
        synchronized (f18121) {
            try {
                C4722 c4722 = f18119;
                if (c4722 != null && f18120 != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (c4722 == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (f18120 == null) {
                        f18120 = ﹳﹳ.ˉⁱ(applicationContext, c5357);
                    }
                    f18119 = f18120;
                }
            } finally {
            }
        }
    }

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final void m10637() {
        synchronized (f18121) {
            try {
                this.f18126 = true;
                BroadcastReceiver.PendingResult pendingResult = this.f18128;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f18128 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final void m10638() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            String str = C5034.f19106;
            Context context = this.f18127;
            if (i >= 34) {
                AbstractC5035.m11152(context).cancelAll();
            }
            JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
            ArrayList arrayListM11149 = C5034.m11149(context, jobScheduler);
            if (arrayListM11149 != null && !arrayListM11149.isEmpty()) {
                Iterator it = arrayListM11149.iterator();
                while (it.hasNext()) {
                    C5034.m11147(jobScheduler, ((JobInfo) it.next()).getId());
                }
            }
        }
        WorkDatabase workDatabase = this.f18122;
        C3772 c3772Mo1374 = workDatabase.mo1374();
        WorkDatabase_Impl workDatabase_Impl = c3772Mo1374.f14601;
        workDatabase_Impl.m5041();
        C3766 c3766 = c3772Mo1374.f14597;
        C1743 c1743M5108 = c3766.m5108();
        try {
            workDatabase_Impl.m5048();
            try {
                c1743M5108.m5462();
                workDatabase_Impl.m5055();
                c3766.m5105(c1743M5108);
                AbstractC4723.m10640(this.f18131, workDatabase, this.f18123);
            } finally {
                workDatabase_Impl.m5046();
            }
        } catch (Throwable th) {
            c3766.m5105(c1743M5108);
            throw th;
        }
    }

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final C5368 m10639(String str) {
        return AbstractC4535.m10339((ExecutorC1522) this.f18125.ᐧⁱ, new C1149(str, 5, this));
    }
}
