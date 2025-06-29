package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import p081.AbstractC1705;
import p123.C1995;
import p123.C1998;
import p266.C3262;
import p406.RunnableC4645;
import p444.C5152;
import p444.RunnableC5147;

/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static final /* synthetic */ int f2407 = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        C1998.m5647(getApplicationContext());
        C3262 c3262M5645 = C1995.m5645();
        c3262M5645.m8036(string);
        c3262M5645.f12725 = AbstractC1705.m5420(i);
        if (string2 != null) {
            c3262M5645.f12724 = Base64.decode(string2, 0);
        }
        C5152 c5152 = C1998.m5648().f7601;
        C1995 c1995M8038 = c3262M5645.m8038();
        RunnableC4645 runnableC4645 = new RunnableC4645(this, 4, jobParameters);
        c5152.getClass();
        c5152.f19690.execute(new RunnableC5147(c5152, c1995M8038, i2, runnableC4645));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
