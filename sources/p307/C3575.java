package p307;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import p251.RunnableC3129;

/* renamed from: ᐧˋ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3575 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public Activity f13759;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final int f13761;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public Object f13763;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public boolean f13762 = false;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public boolean f13760 = false;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public boolean f13764 = false;

    public C3575(Activity activity) {
        this.f13759 = activity;
        this.f13761 = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f13759 == activity) {
            this.f13759 = null;
            this.f13760 = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f13760 || this.f13764 || this.f13762) {
            return;
        }
        Object obj = this.f13763;
        try {
            Object obj2 = AbstractC3556.f13726.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f13761) {
                AbstractC3556.f13729.postAtFrontOfQueue(new RunnableC3129(15, AbstractC3556.f13724.get(activity), obj2, false));
                this.f13764 = true;
                this.f13763 = null;
            }
        } catch (Throwable th) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f13759 == activity) {
            this.f13762 = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
