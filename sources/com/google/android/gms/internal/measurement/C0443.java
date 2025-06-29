package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.measurement.יˋ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0443 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ C0367 f2750;

    public C0443(C0367 c0367) {
        this.f2750 = c0367;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f2750.m2048(new C0471(this, bundle, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f2750.m2048(new C0297(this, activity, 4));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f2750.m2048(new C0297(this, activity, 1));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.f2750.m2048(new C0297(this, activity, 2));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        BinderC0519 binderC0519 = new BinderC0519();
        this.f2750.m2048(new C0471(this, activity, binderC0519));
        Bundle bundleM2380 = binderC0519.m2380(50L);
        if (bundleM2380 != null) {
            bundle.putAll(bundleM2380);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.f2750.m2048(new C0297(this, activity, 0));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.f2750.m2048(new C0297(this, activity, 3));
    }
}
