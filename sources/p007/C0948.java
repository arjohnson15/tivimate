package p007;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import androidx.media3.common.util.GlUtil$GlException;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import p061.C1389;
import p383.AbstractC4464;
import ᵎﹳ.ᐧʻ;

/* renamed from: ʻˉ.ˎٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0948 implements GLSurfaceView.Renderer {

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public static final String[] f4161 = {"y_tex", "u_tex", "v_tex"};

    /* renamed from: ـˆ, reason: contains not printable characters */
    public static final FloatBuffer f4162 = AbstractC4464.m10139(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C0960 f4167;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public C1389 f4169;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final int[] f4163 = new int[3];

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final int[] f4165 = new int[3];

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final int[] f4166 = new int[3];

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final int[] f4164 = new int[3];

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final AtomicReference f4168 = new AtomicReference();

    public C0948(C0960 c0960) {
        this.f4167 = c0960;
        for (int i = 0; i < 3; i++) {
            int[] iArr = this.f4166;
            this.f4164[i] = -1;
            iArr[i] = -1;
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        ᐧʻ.ᵎˏ(this.f4168.getAndSet(null));
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        int[] iArr = this.f4165;
        try {
            C1389 c1389 = new C1389("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
            this.f4169 = c1389;
            GLES20.glVertexAttribPointer(c1389.m4799("in_pos"), 2, 5126, false, 0, (Buffer) f4162);
            iArr[0] = this.f4169.m4799("in_tc_y");
            iArr[1] = this.f4169.m4799("in_tc_u");
            iArr[2] = this.f4169.m4799("in_tc_v");
            GLES20.glGetUniformLocation(this.f4169.f5664, "mColorConversion");
            AbstractC4464.m10143();
            m3812();
            AbstractC4464.m10143();
        } catch (GlUtil$GlException e) {
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m3812() {
        int[] iArr = this.f4163;
        try {
            GLES20.glGenTextures(3, iArr, 0);
            for (int i = 0; i < 3; i++) {
                C1389 c1389 = this.f4169;
                GLES20.glUniform1i(GLES20.glGetUniformLocation(c1389.f5664, f4161[i]), i);
                GLES20.glActiveTexture(33984 + i);
                AbstractC4464.m10123(3553, iArr[i]);
            }
            AbstractC4464.m10143();
        } catch (GlUtil$GlException e) {
        }
    }
}
