package p272;

import android.os.Handler;
import android.view.SurfaceView;
import android.window.SurfaceSyncGroup;
import p141.RunnableC2187;

/* renamed from: ـᐧ.ˆᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3302 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public SurfaceSyncGroup f12850;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public void m8106(Handler handler, SurfaceView surfaceView, Runnable runnable) {
        handler.post(new RunnableC2187(this, surfaceView, runnable, 2));
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public void m8107() {
        SurfaceSyncGroup surfaceSyncGroup = this.f12850;
        if (surfaceSyncGroup != null) {
            surfaceSyncGroup.markSyncReady();
            this.f12850 = null;
        }
    }
}
