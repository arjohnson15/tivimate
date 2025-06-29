package com.google.android.gms.internal.measurement;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.os.Build;
import android.os.UserHandle;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: com.google.android.gms.internal.measurement.ˑⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0433 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final Method f2732;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final Method f2733;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final JobScheduler f2734;

    static {
        Method declaredMethod;
        Method declaredMethod2 = null;
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                declaredMethod = JobScheduler.class.getDeclaredMethod("scheduleAsPackage", JobInfo.class, String.class, Integer.TYPE, String.class);
            } catch (NoSuchMethodException unused) {
                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                }
            }
        } else {
            declaredMethod = null;
        }
        f2732 = declaredMethod;
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                declaredMethod2 = UserHandle.class.getDeclaredMethod("myUserId", null);
            } catch (NoSuchMethodException unused2) {
                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                }
            }
        }
        f2733 = declaredMethod2;
    }

    public C0433(JobScheduler jobScheduler) {
        this.f2734 = jobScheduler;
    }
}
