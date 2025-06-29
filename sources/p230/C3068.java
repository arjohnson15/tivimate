package p230;

import android.opengl.GLES20;
import androidx.media3.common.util.GlUtil$GlException;
import p061.C1389;

/* renamed from: ˑˈ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3068 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public C3071 f11840;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f11841;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public int f11842;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public C1389 f11843;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public int f11844;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public int f11845;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public int f11846;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int f11847;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static final float[] f11839 = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: ˉי, reason: contains not printable characters */
    public static final float[] f11837 = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static final float[] f11838 = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static boolean m7560(C3072 c3072) {
        C3071[] c3071Arr = c3072.f11854.f11794;
        if (c3071Arr.length != 1 || c3071Arr[0].f11851 != 0) {
            return false;
        }
        C3071[] c3071Arr2 = c3072.f11852.f11794;
        return c3071Arr2.length == 1 && c3071Arr2[0].f11851 == 0;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m7561() {
        try {
            C1389 c1389 = new C1389("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.f11843 = c1389;
            this.f11847 = GLES20.glGetUniformLocation(c1389.f5664, "uMvpMatrix");
            this.f11841 = GLES20.glGetUniformLocation(this.f11843.f5664, "uTexMatrix");
            this.f11845 = this.f11843.m4799("aPosition");
            this.f11846 = this.f11843.m4799("aTexCoords");
            this.f11842 = GLES20.glGetUniformLocation(this.f11843.f5664, "uTexture");
        } catch (GlUtil$GlException e) {
        }
    }
}
