package p007;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import p383.AbstractC4464;
import p383.AbstractC4470;

/* renamed from: ʻˉ.ˈٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ChoreographerFrameCallbackC0942 implements Choreographer.FrameCallback, Handler.Callback {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static final ChoreographerFrameCallbackC0942 f4144 = new ChoreographerFrameCallbackC0942();

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final Handler f4145;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public Choreographer f4146;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public int f4147;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public volatile long f4148 = -9223372036854775807L;

    public ChoreographerFrameCallbackC0942() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        int i = AbstractC4470.f17202;
        Handler handler = new Handler(looper, this);
        this.f4145 = handler;
        handler.sendEmptyMessage(1);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.f4148 = j;
        Choreographer choreographer = this.f4146;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            try {
                this.f4146 = Choreographer.getInstance();
            } catch (RuntimeException e) {
                AbstractC4464.m10127("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
            }
            return true;
        }
        if (i == 2) {
            Choreographer choreographer = this.f4146;
            if (choreographer != null) {
                int i2 = this.f4147 + 1;
                this.f4147 = i2;
                if (i2 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
            return true;
        }
        if (i != 3) {
            return false;
        }
        Choreographer choreographer2 = this.f4146;
        if (choreographer2 != null) {
            int i3 = this.f4147 - 1;
            this.f4147 = i3;
            if (i3 == 0) {
                choreographer2.removeFrameCallback(this);
                this.f4148 = -9223372036854775807L;
            }
        }
        return true;
    }
}
