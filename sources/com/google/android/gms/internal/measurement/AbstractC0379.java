package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.StrictMode;
import java.util.Iterator;
import p200.C2741;
import p200.C2758;

/* renamed from: com.google.android.gms.internal.measurement.ˉˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0379 implements InterfaceC0387 {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static final C2741 f2643 = new C2741(0);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static synchronized void m2084() {
        Iterator it = ((C2758) f2643.values()).iterator();
        if (it.hasNext()) {
            ((AbstractC0379) it.next()).getClass();
            throw null;
        }
        f2643.clear();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static AbstractC0379 m2085(Context context, RunnableC0332 runnableC0332) {
        if (AbstractC0549.m2471()) {
            throw null;
        }
        synchronized (AbstractC0379.class) {
            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
            try {
                throw null;
            } finally {
            }
        }
    }
}
