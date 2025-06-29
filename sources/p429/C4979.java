package p429;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import p288.C3397;
import ﹶˋ.ـﹶ;

/* renamed from: ﹶˎ.ᵔٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4979 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static boolean f18815;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static ـﹶ f18816;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static final C4979 f18817 = new C4979();

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        ـﹶ r2 = f18816;
        if (r2 != null) {
            r2.ʿˏ(2);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        C3397 c3397;
        ـﹶ r2 = f18816;
        if (r2 != null) {
            r2.ʿˏ(1);
            c3397 = C3397.f13249;
        } else {
            c3397 = null;
        }
        if (c3397 == null) {
            f18815 = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
