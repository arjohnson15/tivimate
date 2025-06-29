package p230;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import ʻˉ.ᐧˋ;

/* renamed from: ˑˈ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3067 implements GLSurfaceView.Renderer, InterfaceC3069 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final float[] f11827;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public float f11828;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final float[] f11831;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C3064 f11832;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final float[] f11834;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public float f11835;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final /* synthetic */ C3065 f11836;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final float[] f11826 = new float[16];

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final float[] f11829 = new float[16];

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final float[] f11830 = new float[16];

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final float[] f11833 = new float[16];

    public C3067(C3065 c3065, C3064 c3064) {
        this.f11836 = c3065;
        float[] fArr = new float[16];
        this.f11831 = fArr;
        float[] fArr2 = new float[16];
        this.f11827 = fArr2;
        float[] fArr3 = new float[16];
        this.f11834 = fArr3;
        this.f11832 = c3064;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
        this.f11828 = 3.1415927f;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        synchronized (this) {
            Matrix.multiplyMM(this.f11833, 0, this.f11831, 0, this.f11834, 0);
            Matrix.multiplyMM(this.f11830, 0, this.f11827, 0, this.f11833, 0);
        }
        Matrix.multiplyMM(this.f11829, 0, this.f11826, 0, this.f11830, 0);
        this.f11832.m7555(this.f11829);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
        float f = i / i2;
        Matrix.perspectiveM(this.f11826, 0, f > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f)) * 2.0d) : 90.0f, f, 0.1f, 100.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        C3065 c3065 = this.f11836;
        c3065.f11810.post(new ᐧˋ(c3065, 11, this.f11832.m7554()));
    }

    @Override // p230.InterfaceC3069
    /* renamed from: ـﹶ */
    public final synchronized void mo7559(float[] fArr, float f) {
        float[] fArr2 = this.f11831;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        float f2 = -f;
        this.f11828 = f2;
        Matrix.setRotateM(this.f11827, 0, -this.f11835, (float) Math.cos(f2), (float) Math.sin(this.f11828), 0.0f);
    }
}
