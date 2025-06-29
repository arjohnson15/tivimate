package com.google.android.gms.internal.measurement;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.google.android.gms.internal.measurement.ˎᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class HandlerC0413 extends Handler {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC0413(Looper looper, int i) {
        super(looper);
        switch (i) {
            case 1:
                super(looper);
                Looper.getMainLooper();
                break;
            case 2:
            default:
                Looper.getMainLooper();
                break;
            case 3:
                super(looper);
                Looper.getMainLooper();
                break;
        }
    }
}
