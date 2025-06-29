package p434;

import android.app.job.JobParameters;
import androidx.work.impl.background.systemjob.SystemJobService;
import p334.C3789;

/* renamed from: ﹶᵎ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC5036 {
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static int m11153(JobParameters jobParameters) {
        int stopReason = jobParameters.getStopReason();
        String str = SystemJobService.f1775;
        switch (stopReason) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return stopReason;
            default:
                return -512;
        }
    }
}
