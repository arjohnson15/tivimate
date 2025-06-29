package p007;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.SystemClock;
import p383.AbstractC4470;
import p383.C4460;

/* renamed from: ʻˉ.ﾞˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0969 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C0958 f4276;

    /* renamed from: ˉי, reason: contains not printable characters */
    public boolean f4278;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final long f4282;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final AbstractC0950 f4283;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public long f4285;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public boolean f4286;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f4277 = 0;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public long f4284 = -9223372036854775807L;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public long f4281 = -9223372036854775807L;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public long f4287 = -9223372036854775807L;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public float f4280 = 1.0f;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public C4460 f4279 = C4460.f17177;

    public C0969(Context context, AbstractC0950 abstractC0950, long j) {
        this.f4283 = abstractC0950;
        this.f4282 = j;
        this.f4276 = new C0958(context);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m3933(boolean z) {
        long jElapsedRealtime;
        this.f4278 = z;
        long j = this.f4282;
        if (j > 0) {
            this.f4279.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime() + j;
        } else {
            jElapsedRealtime = -9223372036854775807L;
        }
        this.f4287 = jElapsedRealtime;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m3934() {
        this.f4286 = false;
        this.f4287 = -9223372036854775807L;
        C0958 c0958 = this.f4276;
        c0958.f4254 = false;
        C0964 c0964 = c0958.f4239;
        if (c0964 != null) {
            c0964.f4266.unregisterDisplayListener(c0964);
            ChoreographerFrameCallbackC0942 choreographerFrameCallbackC0942 = c0958.f4247;
            choreographerFrameCallbackC0942.getClass();
            choreographerFrameCallbackC0942.f4145.sendEmptyMessage(3);
        }
        c0958.m3892();
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m3935(int i) {
        this.f4277 = Math.min(this.f4277, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e6  */
    /* renamed from: ـﹶ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m3936(long r25, long r27, long r29, long r31, boolean r33, p007.C0945 r34) {
        /*
            Method dump skipped, instructions count: 615
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p007.C0969.m3936(long, long, long, long, boolean, ʻˉ.ˋˊ):int");
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m3937(float f) {
        C0958 c0958 = this.f4276;
        c0958.f4250 = f;
        C0943 c0943 = c0958.f4249;
        c0943.f4152.m3901();
        c0943.f4149.m3901();
        c0943.f4151 = false;
        c0943.f4153 = -9223372036854775807L;
        c0943.f4150 = 0;
        c0958.m3893();
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m3938() {
        this.f4286 = true;
        this.f4279.getClass();
        this.f4285 = AbstractC4470.m10206(SystemClock.elapsedRealtime());
        C0958 c0958 = this.f4276;
        c0958.f4254 = true;
        c0958.f4243 = 0L;
        c0958.f4248 = -1L;
        c0958.f4252 = -1L;
        C0964 c0964 = c0958.f4239;
        if (c0964 != null) {
            ChoreographerFrameCallbackC0942 choreographerFrameCallbackC0942 = c0958.f4247;
            choreographerFrameCallbackC0942.getClass();
            choreographerFrameCallbackC0942.f4145.sendEmptyMessage(2);
            Handler handlerM10200 = AbstractC4470.m10200(null);
            DisplayManager displayManager = c0964.f4266;
            displayManager.registerDisplayListener(c0964, handlerM10200);
            C0958.m3891(c0964.f4265, displayManager.getDisplay(0));
        }
        c0958.m3894(false);
    }
}
