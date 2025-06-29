package androidx.lifecycle;

import android.app.Activity;

/* renamed from: androidx.lifecycle.ʾʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0210 extends AbstractC0231 {
    final /* synthetic */ C0234 this$0;

    public C0210(C0234 c0234) {
        this.this$0 = c0234;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        this.this$0.m1033();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        C0234 c0234 = this.this$0;
        int i = c0234.f1265 + 1;
        c0234.f1265 = i;
        if (i == 1 && c0234.f1264) {
            c0234.f1266.m1034(EnumC0247.ON_START);
            c0234.f1264 = false;
        }
    }
}
