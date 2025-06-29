package androidx.lifecycle;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;

/* renamed from: androidx.lifecycle.ˑﾞ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0235 extends AbstractC0231 {
    final /* synthetic */ C0234 this$0;

    public C0235(C0234 c0234) {
        this.this$0 = c0234;
    }

    @Override // androidx.lifecycle.AbstractC0231, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 29) {
            int i = FragmentC0206.f1216;
            ((FragmentC0206) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag")).f1217 = this.this$0.f1262;
        }
    }

    @Override // androidx.lifecycle.AbstractC0231, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        C0234 c0234 = this.this$0;
        int i = c0234.f1260 - 1;
        c0234.f1260 = i;
        if (i == 0) {
            c0234.f1261.postDelayed(c0234.f1267, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        AbstractC0264.m1094(activity, new C0210(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC0231, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        C0234 c0234 = this.this$0;
        int i = c0234.f1265 - 1;
        c0234.f1265 = i;
        if (i == 0 && c0234.f1263) {
            c0234.f1266.m1034(EnumC0247.ON_STOP);
            c0234.f1264 = true;
        }
    }
}
