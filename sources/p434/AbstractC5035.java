package p434;

import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import p457.C5391;

/* renamed from: ﹶᵎ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC5035 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final String f19112 = C5391.m12164("SystemJobScheduler");

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final JobScheduler m11152(Context context) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        return Build.VERSION.SDK_INT >= 34 ? jobScheduler.forNamespace("androidx.work.systemjobscheduler") : jobScheduler;
    }
}
