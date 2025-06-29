package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: androidx.lifecycle.ᵔﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0253 implements Application.ActivityLifecycleCallbacks {
    public static final C0228 Companion = new C0228();

    public static final void registerIn(Activity activity) {
        Companion.getClass();
        activity.registerActivityLifecycleCallbacks(new C0253());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        int i = FragmentC0206.f1216;
        AbstractC0224.m1020(activity, EnumC0247.ON_CREATE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        int i = FragmentC0206.f1216;
        AbstractC0224.m1020(activity, EnumC0247.ON_RESUME);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        int i = FragmentC0206.f1216;
        AbstractC0224.m1020(activity, EnumC0247.ON_START);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreDestroyed(Activity activity) {
        int i = FragmentC0206.f1216;
        AbstractC0224.m1020(activity, EnumC0247.ON_DESTROY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPrePaused(Activity activity) {
        int i = FragmentC0206.f1216;
        AbstractC0224.m1020(activity, EnumC0247.ON_PAUSE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStopped(Activity activity) {
        int i = FragmentC0206.f1216;
        AbstractC0224.m1020(activity, EnumC0247.ON_STOP);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}
