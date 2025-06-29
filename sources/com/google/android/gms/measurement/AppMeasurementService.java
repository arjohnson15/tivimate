package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.SparseArray;
import p061.RunnableC1432;
import p400.AbstractC4616;
import p456.BinderC5240;
import p456.C5236;
import p456.C5273;
import p456.C5301;
import p456.InterfaceC5252;
import p456.RunnableC5242;
import ᵢ.ʿʼ;

/* loaded from: classes.dex */
public final class AppMeasurementService extends Service implements InterfaceC5252 {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public ʿʼ f3109;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        ʿʼ r0 = m2788();
        if (intent == null) {
            r0.ﾞˊ().f20571.m4533("onBind called with null intent");
            return null;
        }
        r0.getClass();
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new BinderC5240(C5273.m11789((Service) r0.ˆʿ));
        }
        r0.ﾞˊ().f20568.m4531(action, "onBind received unknown action");
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        C5301 c5301 = C5236.m11645((Service) m2788().ˆʿ, null, null).f20110;
        C5236.m11647(c5301);
        c5301.f20566.m4533("Local AppMeasurementService is starting up");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        C5301 c5301 = C5236.m11645((Service) m2788().ˆʿ, null, null).f20110;
        C5236.m11647(c5301);
        c5301.f20566.m4533("Local AppMeasurementService is shutting down");
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        ʿʼ r0 = m2788();
        if (intent == null) {
            r0.ﾞˊ().f20571.m4533("onRebind called with null intent");
            return;
        }
        r0.getClass();
        r0.ﾞˊ().f20566.m4531(intent.getAction(), "onRebind called. action");
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        ʿʼ r7 = m2788();
        C5301 c5301 = C5236.m11645((Service) r7.ˆʿ, null, null).f20110;
        C5236.m11647(c5301);
        if (intent == null) {
            c5301.f20568.m4533("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        c5301.f20566.m4529(Integer.valueOf(i2), action, "Local AppMeasurementService called. startId, action");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        RunnableC1432 runnableC1432 = new RunnableC1432(3);
        runnableC1432.f5862 = r7;
        runnableC1432.f5865 = i2;
        runnableC1432.f5864 = c5301;
        runnableC1432.f5863 = intent;
        C5273 c5273M11789 = C5273.m11789((Service) r7.ˆʿ);
        c5273M11789.mo11648().m11743(new RunnableC5242(7, runnableC1432, c5273M11789));
        return 2;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        ʿʼ r0 = m2788();
        if (intent == null) {
            r0.ﾞˊ().f20571.m4533("onUnbind called with null intent");
            return true;
        }
        r0.getClass();
        r0.ﾞˊ().f20566.m4531(intent.getAction(), "onUnbind called for intent. action");
        return true;
    }

    @Override // p456.InterfaceC5252
    /* renamed from: ʽᐧ */
    public final boolean mo2784(int i) {
        return stopSelfResult(i);
    }

    @Override // p456.InterfaceC5252
    /* renamed from: ˑʽ */
    public final void mo2785(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    @Override // p456.InterfaceC5252
    /* renamed from: ـﹶ */
    public final void mo2786(Intent intent) {
        SparseArray sparseArray = AbstractC4616.f17652;
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return;
        }
        SparseArray sparseArray2 = AbstractC4616.f17652;
        synchronized (sparseArray2) {
            try {
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) sparseArray2.get(intExtra);
                if (wakeLock != null) {
                    wakeLock.release();
                    sparseArray2.remove(intExtra);
                } else {
                    String str = "No active wake lock id #" + intExtra;
                }
            } finally {
            }
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final ʿʼ m2788() {
        if (this.f3109 == null) {
            this.f3109 = new ʿʼ(25, this);
        }
        return this.f3109;
    }
}
