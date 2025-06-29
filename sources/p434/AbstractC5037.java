package p434;

import android.app.job.JobParameters;
import android.net.Uri;

/* renamed from: ﹶᵎ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC5037 {
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static Uri[] m11154(JobParameters jobParameters) {
        return jobParameters.getTriggeredContentUris();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static String[] m11155(JobParameters jobParameters) {
        return jobParameters.getTriggeredContentAuthorities();
    }
}
