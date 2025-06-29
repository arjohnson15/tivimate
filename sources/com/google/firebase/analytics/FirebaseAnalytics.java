package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.C0367;
import com.google.android.gms.internal.measurement.C0501;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p147.C2250;
import p147.InterfaceC2254;
import p210.C2804;
import p311.C3582;
import p417.AbstractC4753;
import p456.InterfaceC5317;
import ˎˊ.ˏʾ;

/* loaded from: classes.dex */
public final class FirebaseAnalytics {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static volatile FirebaseAnalytics f3649;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C0367 f3650;

    public FirebaseAnalytics(C0367 c0367) {
        AbstractC4753.m10683(c0367);
        this.f3650 = c0367;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f3649 == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f3649 == null) {
                        f3649 = new FirebaseAnalytics(C0367.m2047(context, null));
                    }
                } finally {
                }
            }
        }
        return f3649;
    }

    @Keep
    public static InterfaceC5317 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        C0367 c0367M2047 = C0367.m2047(context, bundle);
        if (c0367M2047 == null) {
            return null;
        }
        return new C3582(c0367M2047);
    }

    @Keep
    public final String getFirebaseInstanceId() {
        try {
            Object obj = C2250.f8952;
            return (String) ˏʾ.ﹳﹳ(((C2250) C2804.m7079().m7082(InterfaceC2254.class)).m6252(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        } catch (ExecutionException e2) {
            throw new IllegalStateException(e2.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @Deprecated
    public final void setCurrentScreen(Activity activity, String str, String str2) {
        C0367 c0367 = this.f3650;
        c0367.getClass();
        c0367.m2048(new C0501(c0367, activity, str, str2));
    }
}
