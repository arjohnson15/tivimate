package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import java.util.Arrays;
import java.util.HashMap;
import p141.RunnableC2187;
import p331.C3759;
import p331.C3760;
import p414.C4722;
import p414.C4736;
import p414.C4737;
import p414.InterfaceC4712;
import p434.AbstractC5033;
import p434.AbstractC5036;
import p434.AbstractC5037;
import p456.C5349;
import p457.C5368;
import p457.C5391;
import ᴵﹳ.ﹶˆ;

/* loaded from: classes.dex */
public class SystemJobService extends JobService implements InterfaceC4712 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static final String f1775 = C5391.m12164("SystemJobService");

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final HashMap f1776 = new HashMap();

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final C3759 f1777 = new C3759((byte) 0, 17);

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public C5349 f1778;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public C4722 f1779;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C3760 m1385(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new C3760(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            C4722 c4722M10635 = C4722.m10635(getApplicationContext());
            this.f1779 = c4722M10635;
            C4736 c4736 = c4722M10635.f18124;
            this.f1778 = new C5349(17, c4736, c4722M10635.f18125, false);
            c4736.m10651(this);
        } catch (IllegalStateException e) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
            }
            C5391.m12163().m12166(f1775, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        C4722 c4722 = this.f1779;
        if (c4722 != null) {
            c4722.f18124.m10649(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        C5368 c5368;
        if (this.f1779 == null) {
            C5391.m12163().m12168(f1775, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        C3760 c3760M1385 = m1385(jobParameters);
        if (c3760M1385 == null) {
            C5391.m12163().m12167(f1775, "WorkSpec id not found!");
            return false;
        }
        synchronized (this.f1776) {
            try {
                if (this.f1776.containsKey(c3760M1385)) {
                    C5391.m12163().m12168(f1775, "Job is already being executed by SystemJobService: " + c3760M1385);
                    return false;
                }
                C5391.m12163().m12168(f1775, "onStartJob for " + c3760M1385);
                this.f1776.put(c3760M1385, jobParameters);
                int i = Build.VERSION.SDK_INT;
                if (i >= 24) {
                    c5368 = new C5368();
                    if (AbstractC5037.m11154(jobParameters) != null) {
                        Arrays.asList(AbstractC5037.m11154(jobParameters));
                    }
                    if (AbstractC5037.m11155(jobParameters) != null) {
                        Arrays.asList(AbstractC5037.m11155(jobParameters));
                    }
                    if (i >= 28) {
                        AbstractC5033.m11146(jobParameters);
                    }
                } else {
                    c5368 = null;
                }
                C5349 c5349 = this.f1778;
                C4737 c4737M8758 = this.f1777.m8758(c3760M1385);
                c5349.getClass();
                ((ﹶˆ) c5349.f20757).ˏᴵ(new RunnableC2187(c5349, c4737M8758, c5368, 11));
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        if (this.f1779 == null) {
            C5391.m12163().m12168(f1775, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        C3760 c3760M1385 = m1385(jobParameters);
        if (c3760M1385 == null) {
            C5391.m12163().m12167(f1775, "WorkSpec id not found!");
            return false;
        }
        C5391.m12163().m12168(f1775, "onStopJob for " + c3760M1385);
        synchronized (this.f1776) {
            this.f1776.remove(c3760M1385);
        }
        C4737 c4737M8753 = this.f1777.m8753(c3760M1385);
        if (c4737M8753 != null) {
            this.f1778.m12103(c4737M8753, Build.VERSION.SDK_INT >= 31 ? AbstractC5036.m11153(jobParameters) : -512);
        }
        return !this.f1779.f18124.m10652(c3760M1385.f14526);
    }

    @Override // p414.InterfaceC4712
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void mo1386(C3760 c3760, boolean z) {
        JobParameters jobParameters;
        C5391.m12163().m12168(f1775, c3760.f14526 + " executed on JobScheduler");
        synchronized (this.f1776) {
            jobParameters = (JobParameters) this.f1776.remove(c3760);
        }
        this.f1777.m8753(c3760);
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }
}
