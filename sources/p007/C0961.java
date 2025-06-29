package p007;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.view.Surface;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p383.RunnableC4454;

/* renamed from: ʻˉ.ᵎـ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0961 extends Surface {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static boolean f4260;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static int f4261;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final HandlerThreadC0953 f4262;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public boolean f4263;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final boolean f4264;

    public C0961(HandlerThreadC0953 handlerThreadC0953, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.f4262 = handlerThreadC0953;
        this.f4264 = z;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static C0961 m3896(Context context, boolean z) {
        boolean z2 = false;
        AbstractC4464.m10132(!z || m3897(context));
        HandlerThreadC0953 handlerThreadC0953 = new HandlerThreadC0953("ExoPlayer:PlaceholderSurface");
        int i = z ? f4261 : 0;
        handlerThreadC0953.start();
        Handler handler = new Handler(handlerThreadC0953.getLooper(), handlerThreadC0953);
        handlerThreadC0953.f4221 = handler;
        handlerThreadC0953.f4225 = new RunnableC4454(handler);
        synchronized (handlerThreadC0953) {
            handlerThreadC0953.f4221.obtainMessage(1, i, 0).sendToTarget();
            while (handlerThreadC0953.f4222 == null && handlerThreadC0953.f4224 == null && handlerThreadC0953.f4223 == null) {
                try {
                    handlerThreadC0953.wait();
                } catch (InterruptedException unused) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = handlerThreadC0953.f4224;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = handlerThreadC0953.f4223;
        if (error != null) {
            throw error;
        }
        C0961 c0961 = handlerThreadC0953.f4222;
        c0961.getClass();
        return c0961;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static synchronized boolean m3897(Context context) {
        String strEglQueryString;
        int i;
        try {
            if (!f4260) {
                int i2 = AbstractC4470.f17202;
                if (i2 >= 24 && ((i2 >= 26 || !("samsung".equals(AbstractC4470.f17200) || "XT1650".equals(AbstractC4470.f17206))) && ((i2 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_EXT_protected_content")))) {
                    String strEglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                    i = strEglQueryString2 != null && strEglQueryString2.contains("EGL_KHR_surfaceless_context") ? 1 : 2;
                } else {
                    i = 0;
                }
                f4261 = i;
                f4260 = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f4261 != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f4262) {
            try {
                if (!this.f4263) {
                    HandlerThreadC0953 handlerThreadC0953 = this.f4262;
                    handlerThreadC0953.f4221.getClass();
                    handlerThreadC0953.f4221.sendEmptyMessage(2);
                    this.f4263 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
