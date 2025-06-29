package p438;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import ʻˋ.ˋˊ;

/* renamed from: ﹶﾞ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC5098 extends BroadcastReceiver implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final Handler f19399;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ ˋˊ f19400;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final SurfaceHolderCallbackC5075 f19401;

    public RunnableC5098(ˋˊ r1, Handler handler, SurfaceHolderCallbackC5075 surfaceHolderCallbackC5075) {
        this.f19400 = r1;
        this.f19399 = handler;
        this.f19401 = surfaceHolderCallbackC5075;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f19399.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f19400.ˆʿ) {
            this.f19401.f19247.m11370(-1, false, 3);
        }
    }
}
