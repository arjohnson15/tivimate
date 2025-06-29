package p434;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import p090.C1743;
import p331.C3760;
import p331.C3766;
import p331.C3768;
import p331.C3770;
import p331.C3775;
import p396.C4554;
import p414.InterfaceC4728;
import p457.C5357;
import p457.C5391;
import ᴵﹳ.ﹶˆ;
import ﹶⁱ.ـﹶ;

/* renamed from: ﹶᵎ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5034 implements InterfaceC4728 {

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public static final String f19106 = C5391.m12164("SystemJobScheduler");

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final JobScheduler f19107;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final C5357 f19108;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final C5032 f19109;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final WorkDatabase f19110;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Context f19111;

    public C5034(Context context, WorkDatabase workDatabase, C5357 c5357) {
        JobScheduler jobSchedulerM11152 = AbstractC5035.m11152(context);
        C5032 c5032 = new C5032(context, c5357.f20795, c5357.f20787);
        this.f19111 = context;
        this.f19107 = jobSchedulerM11152;
        this.f19109 = c5032;
        this.f19110 = workDatabase;
        this.f19108 = c5357;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static void m11147(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            C5391.m12163().m12170(f19106, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static ArrayList m11148(Context context, JobScheduler jobScheduler, String str) {
        ArrayList arrayListM11149 = m11149(context, jobScheduler);
        if (arrayListM11149 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        Iterator it = arrayListM11149.iterator();
        while (it.hasNext()) {
            JobInfo jobInfo = (JobInfo) it.next();
            C3760 c3760M11150 = m11150(jobInfo);
            if (c3760M11150 != null && str.equals(c3760M11150.f14526)) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static ArrayList m11149(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        String str = AbstractC5035.f19112;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            C5391.m12163().m12170(AbstractC5035.f19112, "getAllPendingJobs() is not reliable on this device.", th);
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static C3760 m11150(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new C3760(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // p414.InterfaceC4728
    /* renamed from: ʿʼ */
    public final void mo7032(C3768... c3768Arr) {
        int iIntValue;
        ArrayList arrayListM11148;
        int iIntValue2;
        WorkDatabase workDatabase = this.f19110;
        final C4554 c4554 = new C4554(workDatabase);
        for (C3768 c3768 : c3768Arr) {
            workDatabase.m5048();
            try {
                C3768 c3768M8822 = workDatabase.mo1374().m8822(c3768.f14575);
                String str = f19106;
                String str2 = c3768.f14575;
                if (c3768M8822 == null) {
                    C5391.m12163().m12166(str, "Skipping scheduling " + str2 + " because it's no longer in the DB");
                    workDatabase.m5055();
                } else if (c3768M8822.f14562 != 1) {
                    C5391.m12163().m12166(str, "Skipping scheduling " + str2 + " because it is no longer enqueued");
                    workDatabase.m5055();
                } else {
                    C3760 c3760 = ـﹶ.ˋˊ(c3768);
                    C3770 c3770 = workDatabase.mo1373().ﹳˎ(c3760);
                    WorkDatabase workDatabase2 = (WorkDatabase) c4554.f17462;
                    C5357 c5357 = this.f19108;
                    if (c3770 != null) {
                        iIntValue = c3770.f14589;
                    } else {
                        c5357.getClass();
                        final int i = c5357.f20796;
                        iIntValue = ((Number) workDatabase2.m5042(new Callable() { // from class: ﹳʿ.ʿʼ
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                WorkDatabase workDatabase3 = (WorkDatabase) c4554.f17462;
                                Long lM8743 = workDatabase3.mo1378().m8743("next_job_scheduler_id");
                                int i2 = 0;
                                int iLongValue = lM8743 != null ? (int) lM8743.longValue() : 0;
                                workDatabase3.mo1378().m8725(new C3775("next_job_scheduler_id", Long.valueOf(iLongValue == Integer.MAX_VALUE ? 0 : iLongValue + 1)));
                                if (iLongValue < 0 || iLongValue > i) {
                                    workDatabase3.mo1378().m8725(new C3775("next_job_scheduler_id", Long.valueOf(1)));
                                } else {
                                    i2 = iLongValue;
                                }
                                return Integer.valueOf(i2);
                            }
                        })).intValue();
                    }
                    if (c3770 == null) {
                        workDatabase.mo1373().ˋˊ(new C3770(c3760.f14525, iIntValue, c3760.f14526));
                    }
                    m11151(c3768, iIntValue);
                    if (Build.VERSION.SDK_INT == 23 && (arrayListM11148 = m11148(this.f19111, this.f19107, str2)) != null) {
                        int iIndexOf = arrayListM11148.indexOf(Integer.valueOf(iIntValue));
                        if (iIndexOf >= 0) {
                            arrayListM11148.remove(iIndexOf);
                        }
                        if (arrayListM11148.isEmpty()) {
                            c5357.getClass();
                            final int i2 = c5357.f20796;
                            iIntValue2 = ((Number) workDatabase2.m5042(new Callable() { // from class: ﹳʿ.ʿʼ
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    WorkDatabase workDatabase3 = (WorkDatabase) c4554.f17462;
                                    Long lM8743 = workDatabase3.mo1378().m8743("next_job_scheduler_id");
                                    int i22 = 0;
                                    int iLongValue = lM8743 != null ? (int) lM8743.longValue() : 0;
                                    workDatabase3.mo1378().m8725(new C3775("next_job_scheduler_id", Long.valueOf(iLongValue == Integer.MAX_VALUE ? 0 : iLongValue + 1)));
                                    if (iLongValue < 0 || iLongValue > i2) {
                                        workDatabase3.mo1378().m8725(new C3775("next_job_scheduler_id", Long.valueOf(1)));
                                    } else {
                                        i22 = iLongValue;
                                    }
                                    return Integer.valueOf(i22);
                                }
                            })).intValue();
                        } else {
                            iIntValue2 = ((Integer) arrayListM11148.get(0)).intValue();
                        }
                        m11151(c3768, iIntValue2);
                    }
                    workDatabase.m5055();
                }
            } finally {
                workDatabase.m5046();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0081, code lost:
    
        if (r9 < 26) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0084, code lost:
    
        if (r9 >= 24) goto L28;
     */
    /* renamed from: ˏᵢ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m11151(p331.C3768 r19, int r20) {
        /*
            Method dump skipped, instructions count: 732
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p434.C5034.m11151(ᴵﹳ.ˑי, int):void");
    }

    @Override // p414.InterfaceC4728
    /* renamed from: ـﹶ */
    public final void mo7033(String str) {
        Context context = this.f19111;
        JobScheduler jobScheduler = this.f19107;
        ArrayList arrayListM11148 = m11148(context, jobScheduler, str);
        if (arrayListM11148 == null || arrayListM11148.isEmpty()) {
            return;
        }
        Iterator it = arrayListM11148.iterator();
        while (it.hasNext()) {
            m11147(jobScheduler, ((Integer) it.next()).intValue());
        }
        ﹶˆ r0 = this.f19110.mo1373();
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) r0.ᐧⁱ;
        workDatabase_Impl.m5041();
        C3766 c3766 = (C3766) r0.ᐧˋ;
        C1743 c1743M5108 = c3766.m5108();
        c1743M5108.mo4420(1, str);
        try {
            workDatabase_Impl.m5048();
            try {
                c1743M5108.m5462();
                workDatabase_Impl.m5055();
            } finally {
                workDatabase_Impl.m5046();
            }
        } finally {
            c3766.m5105(c1743M5108);
        }
    }

    @Override // p414.InterfaceC4728
    /* renamed from: ﹳﹳ */
    public final boolean mo7036() {
        return true;
    }
}
