package p007;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.media3.common.util.GlUtil$GlException;
import java.util.Locale;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p383.RunnableC4454;

/* renamed from: ʻˉ.ˑי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class HandlerThreadC0953 extends HandlerThread implements Handler.Callback {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public Handler f4221;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public C0961 f4222;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public Error f4223;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public RuntimeException f4224;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public RunnableC4454 f4225;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        try {
            if (i != 1) {
                if (i != 2) {
                    return true;
                }
                try {
                    m3882();
                } finally {
                    try {
                        return true;
                    } finally {
                    }
                }
                return true;
            }
            try {
                m3883(message.arg1);
                synchronized (this) {
                    notify();
                }
            } catch (GlUtil$GlException e) {
                AbstractC4464.m10147("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                this.f4224 = new IllegalStateException(e);
                synchronized (this) {
                    notify();
                }
            } catch (Error e2) {
                AbstractC4464.m10147("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                this.f4223 = e2;
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e3) {
                AbstractC4464.m10147("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                this.f4224 = e3;
                synchronized (this) {
                    notify();
                }
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m3882() {
        this.f4225.getClass();
        RunnableC4454 runnableC4454 = this.f4225;
        runnableC4454.f17154.removeCallbacks(runnableC4454);
        try {
            SurfaceTexture surfaceTexture = runnableC4454.f17155;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, runnableC4454.f17150, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = runnableC4454.f17152;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = runnableC4454.f17152;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = runnableC4454.f17151;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(runnableC4454.f17152, runnableC4454.f17151);
            }
            EGLContext eGLContext = runnableC4454.f17153;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(runnableC4454.f17152, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = runnableC4454.f17152;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(runnableC4454.f17152);
            }
            runnableC4454.f17152 = null;
            runnableC4454.f17153 = null;
            runnableC4454.f17151 = null;
            runnableC4454.f17155 = null;
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m3883(int i) throws GlUtil$GlException {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        this.f4225.getClass();
        RunnableC4454 runnableC4454 = this.f4225;
        runnableC4454.getClass();
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        AbstractC4464.m10137("eglGetDisplay failed", eGLDisplayEglGetDisplay != null);
        int[] iArr = new int[2];
        AbstractC4464.m10137("eglInitialize failed", EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1));
        runnableC4454.f17152 = eGLDisplayEglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, RunnableC4454.f17149, 0, eGLConfigArr, 0, 1, iArr2, 0);
        boolean z = zEglChooseConfig && iArr2[0] > 0 && eGLConfigArr[0] != null;
        Object[] objArr = {Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]};
        int i2 = AbstractC4470.f17202;
        AbstractC4464.m10137(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(runnableC4454.f17152, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        AbstractC4464.m10137("eglCreateContext failed", eGLContextEglCreateContext != null);
        runnableC4454.f17153 = eGLContextEglCreateContext;
        EGLDisplay eGLDisplay = runnableC4454.f17152;
        if (i == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            AbstractC4464.m10137("eglCreatePbufferSurface failed", eGLSurfaceEglCreatePbufferSurface != null);
        }
        AbstractC4464.m10137("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext));
        runnableC4454.f17151 = eGLSurfaceEglCreatePbufferSurface;
        int[] iArr3 = runnableC4454.f17150;
        GLES20.glGenTextures(1, iArr3, 0);
        AbstractC4464.m10143();
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr3[0]);
        runnableC4454.f17155 = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(runnableC4454);
        SurfaceTexture surfaceTexture2 = this.f4225.f17155;
        surfaceTexture2.getClass();
        this.f4222 = new C0961(this, surfaceTexture2, i != 0);
    }
}
