package p370;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p090.C1743;
import p106.ExecutorC1797;
import p222.RunnableC2949;
import p331.C3759;
import p331.C3760;
import p331.C3766;
import p331.C3768;
import p331.C3770;
import p414.C4737;
import p414.InterfaceC4712;
import p447.AbstractC5179;
import p457.C5358;
import p457.C5368;
import p457.C5391;
import ˆʽ.ᵎˏ;
import ᴵﹳ.ﹶˆ;
import ᵎﹳ.ᐧʻ;
import ﹶⁱ.ـﹶ;

/* renamed from: ᵢʾ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4196 implements InterfaceC4712 {

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public static final String f16169 = C5391.m12164("CommandHandler");

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final C3759 f16171;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final C5368 f16173;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Context f16174;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final HashMap f16170 = new HashMap();

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final Object f16172 = new Object();

    public C4196(Context context, C5368 c5368, C3759 c3759) {
        this.f16174 = context;
        this.f16173 = c5368;
        this.f16171 = c3759;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static void m9625(Intent intent, C3760 c3760) {
        intent.putExtra("KEY_WORKSPEC_ID", c3760.f14526);
        intent.putExtra("KEY_WORKSPEC_GENERATION", c3760.f14525);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static C3760 m9626(Intent intent) {
        return new C3760(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    @Override // p414.InterfaceC4712
    /* renamed from: ʽᐧ */
    public final void mo1386(C3760 c3760, boolean z) {
        synchronized (this.f16172) {
            try {
                C4201 c4201 = (C4201) this.f16170.remove(c3760);
                this.f16171.m8753(c3760);
                if (c4201 != null) {
                    c4201.m9639(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m9627(Intent intent, int i, C4198 c4198) {
        List<C4737> listM8759;
        int i2 = 5;
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            C5391.m12163().m12168(f16169, "Handling constraints changed " + intent);
            C4203 c4203 = new C4203(this.f16174, this.f16173, i, c4198);
            ArrayList arrayListM8827 = c4198.f16179.f18122.mo1374().m8827();
            String str = AbstractC4199.f16188;
            Iterator it = arrayListM8827.iterator();
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            while (it.hasNext()) {
                C5358 c5358 = ((C3768) it.next()).f14565;
                z |= c5358.f20799;
                z2 |= c5358.f20801;
                z3 |= c5358.f20803;
                z4 |= c5358.f20802 != 1;
                if (z && z2 && z3 && z4) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.f1770;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            Context context = c4203.f16210;
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z2).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z4);
            context.sendBroadcast(intent2);
            ArrayList arrayList = new ArrayList(arrayListM8827.size());
            c4203.f16208.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator it2 = arrayListM8827.iterator();
            while (it2.hasNext()) {
                C3768 c3768 = (C3768) it2.next();
                if (jCurrentTimeMillis >= c3768.m8818() && (!c3768.m8817() || c4203.f16211.m4171(c3768))) {
                    arrayList.add(c3768);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                C3768 c37682 = (C3768) it3.next();
                String str3 = c37682.f14575;
                C3760 c3760 = ـﹶ.ˋˊ(c37682);
                Intent intent3 = new Intent(context, (Class<?>) SystemAlarmService.class);
                intent3.setAction("ACTION_DELAY_MET");
                m9625(intent3, c3760);
                C5391.m12163().m12168(C4203.f16207, ᵎˏ.ˑי("Creating a delay_met command for workSpec with id (", str3, ")"));
                ((ExecutorC1797) c4198.f16178.ᐧˋ).execute(new RunnableC2949(c4198, intent3, c4203.f16209, i2));
            }
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            C5391.m12163().m12168(f16169, "Handling reschedule " + intent + ", " + i);
            c4198.f16179.m10638();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            C5391.m12163().m12167(f16169, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            C3760 c3760M9626 = m9626(intent);
            String str4 = f16169;
            C5391.m12163().m12168(str4, "Handling schedule work for " + c3760M9626);
            WorkDatabase workDatabase = c4198.f16179.f18122;
            workDatabase.m5048();
            try {
                C3768 c3768M8822 = workDatabase.mo1374().m8822(c3760M9626.f14526);
                if (c3768M8822 == null) {
                    C5391.m12163().m12166(str4, "Skipping scheduling " + c3760M9626 + " because it's no longer in the DB");
                } else if (AbstractC5179.m11551(c3768M8822.f14562)) {
                    C5391.m12163().m12166(str4, "Skipping scheduling " + c3760M9626 + "because it is finished.");
                } else {
                    long jM8818 = c3768M8822.m8818();
                    boolean zM8817 = c3768M8822.m8817();
                    Context context2 = this.f16174;
                    if (zM8817) {
                        C5391.m12163().m12168(str4, "Opportunistically setting an alarm for " + c3760M9626 + "at " + jM8818);
                        AbstractC4200.m9633(context2, workDatabase, c3760M9626, jM8818);
                        Intent intent4 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                        intent4.setAction("ACTION_CONSTRAINTS_CHANGED");
                        ((ExecutorC1797) c4198.f16178.ᐧˋ).execute(new RunnableC2949(c4198, intent4, i, i2));
                    } else {
                        C5391.m12163().m12168(str4, "Setting up Alarms for " + c3760M9626 + "at " + jM8818);
                        AbstractC4200.m9633(context2, workDatabase, c3760M9626, jM8818);
                    }
                    workDatabase.m5055();
                }
                return;
            } finally {
                workDatabase.m5046();
            }
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            synchronized (this.f16172) {
                try {
                    C3760 c3760M96262 = m9626(intent);
                    C5391 c5391M12163 = C5391.m12163();
                    String str5 = f16169;
                    c5391M12163.m12168(str5, "Handing delay met for " + c3760M96262);
                    if (this.f16170.containsKey(c3760M96262)) {
                        C5391.m12163().m12168(str5, "WorkSpec " + c3760M96262 + " is is already being handled for ACTION_DELAY_MET");
                    } else {
                        C4201 c4201 = new C4201(this.f16174, i, c4198, this.f16171.m8758(c3760M96262));
                        this.f16170.put(c3760M96262, c4201);
                        c4201.m9638();
                    }
                } finally {
                }
            }
            return;
        }
        if (!"ACTION_STOP_WORK".equals(action)) {
            if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                C5391.m12163().m12166(f16169, "Ignoring intent " + intent);
                return;
            }
            C3760 c3760M96263 = m9626(intent);
            boolean z5 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
            C5391.m12163().m12168(f16169, "Handling onExecutionCompleted " + intent + ", " + i);
            mo1386(c3760M96263, z5);
            return;
        }
        Bundle extras2 = intent.getExtras();
        String string = extras2.getString("KEY_WORKSPEC_ID");
        boolean zContainsKey = extras2.containsKey("KEY_WORKSPEC_GENERATION");
        C3759 c3759 = this.f16171;
        if (zContainsKey) {
            int i3 = extras2.getInt("KEY_WORKSPEC_GENERATION");
            ArrayList arrayList2 = new ArrayList(1);
            C4737 c4737M8753 = c3759.m8753(new C3760(string, i3));
            listM8759 = arrayList2;
            if (c4737M8753 != null) {
                arrayList2.add(c4737M8753);
                listM8759 = arrayList2;
            }
        } else {
            listM8759 = c3759.m8759(string);
        }
        for (C4737 c4737 : listM8759) {
            C5391.m12163().m12168(f16169, ᐧʻ.ﾞˊ("Handing stopWork work for ", string));
            c4198.f16185.m12103(c4737, -512);
            WorkDatabase workDatabase2 = c4198.f16179.f18122;
            C3760 c37602 = c4737.f18173;
            String str6 = AbstractC4200.f16189;
            ﹶˆ r1 = workDatabase2.mo1373();
            C3770 c3770 = r1.ﹳˎ(c37602);
            if (c3770 != null) {
                AbstractC4200.m9635(this.f16174, c37602, c3770.f14589);
                C5391.m12163().m12168(AbstractC4200.f16189, "Removing SystemIdInfo for workSpecId (" + c37602 + ")");
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) r1.ᐧⁱ;
                workDatabase_Impl.m5041();
                C3766 c3766 = (C3766) r1.ˎˑ;
                C1743 c1743M5108 = c3766.m5108();
                c1743M5108.mo4420(1, c37602.f14526);
                c1743M5108.mo4419(2, c37602.f14525);
                try {
                    workDatabase_Impl.m5048();
                    try {
                        c1743M5108.m5462();
                        workDatabase_Impl.m5055();
                        workDatabase_Impl.m5046();
                    } catch (Throwable th) {
                        workDatabase_Impl.m5046();
                        throw th;
                    }
                } finally {
                    c3766.m5105(c1743M5108);
                }
            }
            c4198.mo1386(c4737.f18173, false);
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final boolean m9628() {
        boolean z;
        synchronized (this.f16172) {
            z = !this.f16170.isEmpty();
        }
        return z;
    }
}
