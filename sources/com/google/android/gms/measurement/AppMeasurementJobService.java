package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import p029.RunnableC1181;
import p456.C5236;
import p456.C5273;
import p456.C5301;
import p456.InterfaceC5252;
import p456.RunnableC5242;
import ᵢ.ʿʼ;

@TargetApi(24)
/* loaded from: classes.dex */
public final class AppMeasurementJobService extends JobService implements InterfaceC5252 {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public ʿʼ f3107;

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        C5301 c5301 = C5236.m11645((Service) m2787().ˆʿ, null, null).f20110;
        C5236.m11647(c5301);
        c5301.f20566.m4533("Local AppMeasurementService is starting up");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        C5301 c5301 = C5236.m11645((Service) m2787().ˆʿ, null, null).f20110;
        C5236.m11647(c5301);
        c5301.f20566.m4533("Local AppMeasurementService is shutting down");
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        ʿʼ r0 = m2787();
        if (intent == null) {
            r0.ﾞˊ().f20571.m4533("onRebind called with null intent");
            return;
        }
        r0.getClass();
        r0.ﾞˊ().f20566.m4531(intent.getAction(), "onRebind called. action");
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        ʿʼ r0 = m2787();
        C5301 c5301 = C5236.m11645((Service) r0.ˆʿ, null, null).f20110;
        C5236.m11647(c5301);
        String string = jobParameters.getExtras().getString("action");
        c5301.f20566.m4531(string, "Local AppMeasurementJobService called. action");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        RunnableC1181 runnableC1181 = new RunnableC1181(14);
        runnableC1181.f4882 = r0;
        runnableC1181.f4883 = c5301;
        runnableC1181.f4884 = jobParameters;
        C5273 c5273M11789 = C5273.m11789((Service) r0.ˆʿ);
        c5273M11789.mo11648().m11743(new RunnableC5242(7, runnableC1181, c5273M11789));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        ʿʼ r0 = m2787();
        if (intent == null) {
            r0.ﾞˊ().f20571.m4533("onUnbind called with null intent");
            return true;
        }
        r0.getClass();
        r0.ﾞˊ().f20566.m4531(intent.getAction(), "onUnbind called for intent. action");
        return true;
    }

    @Override // p456.InterfaceC5252
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean mo2784(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // p456.InterfaceC5252
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void mo2785(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    @Override // p456.InterfaceC5252
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void mo2786(Intent intent) {
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final ʿʼ m2787() {
        if (this.f3107 == null) {
            this.f3107 = new ʿʼ(25, this);
        }
        return this.f3107;
    }
}
