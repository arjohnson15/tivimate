package com.google.android.gms.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import p396.C4554;
import p400.AbstractC4616;
import p456.C5236;
import p456.C5301;

/* loaded from: classes.dex */
public final class AppMeasurementReceiver extends AbstractC4616 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public C4554 f3108;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f3108 == null) {
            this.f3108 = new C4554(this);
        }
        C4554 c4554 = this.f3108;
        c4554.getClass();
        C5301 c5301 = C5236.m11645(context, null, null).f20110;
        C5236.m11647(c5301);
        if (intent == null) {
            c5301.f20568.m4533("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        c5301.f20566.m4531(action, "Local receiver got");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                c5301.f20568.m4533("Install Referrer Broadcasts are deprecated");
                return;
            }
            return;
        }
        Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        c5301.f20566.m4533("Starting wakeful intent.");
        ((AppMeasurementReceiver) c4554.f17462).getClass();
        SparseArray sparseArray = AbstractC4616.f17652;
        synchronized (sparseArray) {
            try {
                int i = AbstractC4616.f17651;
                int i2 = i + 1;
                AbstractC4616.f17651 = i2;
                if (i2 <= 0) {
                    AbstractC4616.f17651 = 1;
                }
                className.putExtra("androidx.contentpager.content.wakelockid", i);
                ComponentName componentNameStartService = context.startService(className);
                if (componentNameStartService == null) {
                    return;
                }
                PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + componentNameStartService.flattenToShortString());
                wakeLockNewWakeLock.setReferenceCounted(false);
                wakeLockNewWakeLock.acquire(60000L);
                sparseArray.put(i, wakeLockNewWakeLock);
            } finally {
            }
        }
    }
}
