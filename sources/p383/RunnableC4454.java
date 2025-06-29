package p383;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;

/* renamed from: ᵢᵢ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC4454 implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public static final int[] f17149 = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final int[] f17150 = new int[1];

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public EGLSurface f17151;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public EGLDisplay f17152;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public EGLContext f17153;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Handler f17154;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public SurfaceTexture f17155;

    public RunnableC4454(Handler handler) {
        this.f17154 = handler;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f17154.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f17155;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
