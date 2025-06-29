package p230;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import androidx.media3.common.util.GlUtil$GlException;
import com.bumptech.glide.C0295;
import com.bumptech.glide.ﹳﹳ;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import p007.InterfaceC0939;
import p166.C2431;
import p383.AbstractC4464;
import p383.C4457;

/* renamed from: ˑˈ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3064 implements InterfaceC0939, InterfaceC3070 {

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public int f11795;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final C3071 f11797;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final float[] f11798;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public byte[] f11800;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public int f11801;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final C0295 f11802;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public SurfaceTexture f11804;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final C3071 f11805;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final float[] f11806;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public volatile int f11807;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final AtomicBoolean f11803 = new AtomicBoolean();

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final AtomicBoolean f11796 = new AtomicBoolean(true);

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final C3068 f11799 = new C3068();

    public C3064() {
        C0295 c0295 = new C0295();
        c0295.f2402 = new float[16];
        c0295.f2403 = new float[16];
        c0295.f2405 = new C3071();
        this.f11802 = c0295;
        this.f11797 = new C3071();
        this.f11805 = new C3071();
        this.f11806 = new float[16];
        this.f11798 = new float[16];
        this.f11807 = 0;
        this.f11795 = -1;
    }

    @Override // p007.InterfaceC0939
    /* renamed from: ʽᐧ */
    public final void mo3808(long j, long j2, C2431 c2431, MediaFormat mediaFormat) {
        int i;
        int i2;
        int i3;
        ArrayList arrayList;
        int iM10092;
        int i4 = 1;
        this.f11797.m7566(j2, Long.valueOf(j));
        byte[] bArr = c2431.f9692;
        int i5 = c2431.f9675;
        byte[] bArr2 = this.f11800;
        int i6 = this.f11795;
        this.f11800 = bArr;
        if (i5 == -1) {
            i5 = this.f11807;
        }
        this.f11795 = i5;
        if (i6 == i5 && Arrays.equals(bArr2, this.f11800)) {
            return;
        }
        byte[] bArr3 = this.f11800;
        C3072 c3072 = null;
        if (bArr3 != null) {
            int i7 = this.f11795;
            C4457 c4457 = new C4457(bArr3);
            try {
                c4457.m10085(4);
                iM10092 = c4457.m10092();
                c4457.m10108(0);
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            if (iM10092 == 1886547818) {
                c4457.m10085(8);
                int i8 = c4457.f17169;
                int i9 = c4457.f17170;
                while (i8 < i9) {
                    int iM100922 = c4457.m10092() + i8;
                    if (iM100922 > i8 && iM100922 <= i9) {
                        int iM100923 = c4457.m10092();
                        if (iM100923 != 2037673328 && iM100923 != 1836279920) {
                            c4457.m10108(iM100922);
                            i8 = iM100922;
                        }
                        c4457.m10104(iM100922);
                        arrayList = ﹳﹳ.ﾞʽ(c4457);
                        break;
                    }
                    break;
                }
                arrayList = null;
            } else {
                arrayList = ﹳﹳ.ﾞʽ(c4457);
            }
            if (arrayList != null) {
                int size = arrayList.size();
                if (size == 1) {
                    C3063 c3063 = (C3063) arrayList.get(0);
                    c3072 = new C3072(c3063, c3063, i7);
                } else if (size == 2) {
                    c3072 = new C3072((C3063) arrayList.get(0), (C3063) arrayList.get(1), i7);
                }
            }
        }
        if (c3072 == null || !C3068.m7560(c3072)) {
            int i10 = this.f11795;
            float radians = (float) Math.toRadians(180.0f);
            float radians2 = (float) Math.toRadians(360.0f);
            float f = radians / 36;
            float f2 = radians2 / 72;
            float[] fArr = new float[15984];
            float[] fArr2 = new float[10656];
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 36; i11 < i14; i14 = 36) {
                float f3 = radians / 2.0f;
                float f4 = (i11 * f) - f3;
                int i15 = i11 + 1;
                float f5 = (i15 * f) - f3;
                int i16 = 0;
                while (i16 < 73) {
                    float f6 = f5;
                    float f7 = f4;
                    int i17 = i15;
                    int i18 = i12;
                    int i19 = i13;
                    int i20 = 0;
                    int i21 = 2;
                    while (i20 < i21) {
                        float f8 = i16 * f2;
                        float f9 = f2;
                        int i22 = i16;
                        float f10 = radians;
                        double d = 50.0f;
                        int i23 = i10;
                        double d2 = (3.1415927f + f8) - (radians2 / 2.0f);
                        double d3 = i20 == 0 ? f7 : f6;
                        int i24 = i20;
                        float f11 = f;
                        fArr[i18] = -((float) (Math.cos(d3) * Math.sin(d2) * d));
                        int i25 = i11;
                        float[] fArr3 = fArr2;
                        fArr[i18 + 1] = (float) (Math.sin(d3) * d);
                        int i26 = i18 + 3;
                        fArr[i18 + 2] = (float) (Math.cos(d3) * Math.cos(d2) * d);
                        fArr3[i19] = f8 / radians2;
                        int i27 = i19 + 2;
                        fArr3[i19 + 1] = ((i25 + i24) * f11) / f10;
                        if (i22 == 0 && i24 == 0) {
                            i2 = i24;
                            i = i22;
                            i3 = 3;
                        } else {
                            i = i22;
                            i2 = i24;
                            i3 = 3;
                            if (i != 72 || i2 != 1) {
                                i19 = i27;
                                i18 = i26;
                            }
                            int i28 = i2 + 1;
                            i16 = i;
                            fArr2 = fArr3;
                            f2 = f9;
                            radians = f10;
                            i10 = i23;
                            i11 = i25;
                            f = f11;
                            i21 = 2;
                            i20 = i28;
                        }
                        System.arraycopy(fArr, i18, fArr, i26, i3);
                        i18 += 6;
                        System.arraycopy(fArr3, i19, fArr3, i27, 2);
                        i19 += 4;
                        int i282 = i2 + 1;
                        i16 = i;
                        fArr2 = fArr3;
                        f2 = f9;
                        radians = f10;
                        i10 = i23;
                        i11 = i25;
                        f = f11;
                        i21 = 2;
                        i20 = i282;
                    }
                    i16++;
                    i13 = i19;
                    i12 = i18;
                    f4 = f7;
                    i15 = i17;
                    radians = radians;
                    i10 = i10;
                    f = f;
                    f5 = f6;
                }
                i11 = i15;
                i4 = 1;
            }
            int i29 = i10;
            C3071[] c3071Arr = new C3071[i4];
            c3071Arr[0] = new C3071(0, fArr, fArr2, i4);
            C3063 c30632 = new C3063(c3071Arr);
            c3072 = new C3072(c30632, c30632, i29);
        }
        this.f11805.m7566(j2, c3072);
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final SurfaceTexture m7554() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            AbstractC4464.m10143();
            this.f11799.m7561();
            AbstractC4464.m10143();
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            AbstractC4464.m10143();
            int i = iArr[0];
            AbstractC4464.m10123(36197, i);
            this.f11801 = i;
        } catch (GlUtil$GlException e) {
            AbstractC4464.m10147("SceneRenderer", "Failed to initialize the renderer", e);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f11801);
        this.f11804 = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: ˑˈ.ﹶˆ
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.f11863.f11803.set(true);
            }
        });
        return this.f11804;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m7555(float[] fArr) {
        Object objM7568;
        GLES20.glClear(16384);
        try {
            AbstractC4464.m10143();
        } catch (GlUtil$GlException e) {
            AbstractC4464.m10147("SceneRenderer", "Failed to draw a frame", e);
        }
        if (this.f11803.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = this.f11804;
            surfaceTexture.getClass();
            surfaceTexture.updateTexImage();
            try {
                AbstractC4464.m10143();
            } catch (GlUtil$GlException e2) {
                AbstractC4464.m10147("SceneRenderer", "Failed to draw a frame", e2);
            }
            if (this.f11796.compareAndSet(true, false)) {
                Matrix.setIdentityM(this.f11806, 0);
            }
            long timestamp = this.f11804.getTimestamp();
            C3071 c3071 = this.f11797;
            synchronized (c3071) {
                objM7568 = c3071.m7568(false, timestamp);
            }
            Long l = (Long) objM7568;
            if (l != null) {
                C0295 c0295 = this.f11802;
                float[] fArr2 = this.f11806;
                float[] fArr3 = (float[]) ((C3071) c0295.f2405).m7565(l.longValue());
                if (fArr3 != null) {
                    float f = fArr3[0];
                    float f2 = -fArr3[1];
                    float f3 = -fArr3[2];
                    float length = Matrix.length(f, f2, f3);
                    float[] fArr4 = (float[]) c0295.f2403;
                    if (length != 0.0f) {
                        Matrix.setRotateM(fArr4, 0, (float) Math.toDegrees(length), f / length, f2 / length, f3 / length);
                    } else {
                        Matrix.setIdentityM(fArr4, 0);
                    }
                    if (!c0295.f2404) {
                        C0295.m1601((float[]) c0295.f2402, (float[]) c0295.f2403);
                        c0295.f2404 = true;
                    }
                    Matrix.multiplyMM(fArr2, 0, (float[]) c0295.f2402, 0, (float[]) c0295.f2403, 0);
                }
            }
            C3072 c3072 = (C3072) this.f11805.m7565(timestamp);
            if (c3072 != null) {
                C3068 c3068 = this.f11799;
                c3068.getClass();
                if (C3068.m7560(c3072)) {
                    c3068.f11844 = c3072.f11853;
                    c3068.f11840 = new C3071(c3072.f11854.f11794[0]);
                    if (!c3072.f11855) {
                        new C3071(c3072.f11852.f11794[0]);
                    }
                }
            }
        }
        Matrix.multiplyMM(this.f11798, 0, fArr, 0, this.f11806, 0);
        C3068 c30682 = this.f11799;
        int i = this.f11801;
        float[] fArr5 = this.f11798;
        C3071 c30712 = c30682.f11840;
        if (c30712 == null) {
            return;
        }
        int i2 = c30682.f11844;
        GLES20.glUniformMatrix3fv(c30682.f11841, 1, false, i2 == 1 ? C3068.f11837 : i2 == 2 ? C3068.f11838 : C3068.f11839, 0);
        GLES20.glUniformMatrix4fv(c30682.f11847, 1, false, fArr5, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        GLES20.glUniform1i(c30682.f11842, 0);
        try {
            AbstractC4464.m10143();
        } catch (GlUtil$GlException e3) {
        }
        GLES20.glVertexAttribPointer(c30682.f11845, 3, 5126, false, 12, (Buffer) c30712.f11849);
        try {
            AbstractC4464.m10143();
        } catch (GlUtil$GlException e4) {
        }
        GLES20.glVertexAttribPointer(c30682.f11846, 2, 5126, false, 8, (Buffer) c30712.f11850);
        try {
            AbstractC4464.m10143();
        } catch (GlUtil$GlException e5) {
        }
        GLES20.glDrawArrays(c30712.f11848, 0, c30712.f11851);
        try {
            AbstractC4464.m10143();
        } catch (GlUtil$GlException e6) {
        }
    }

    @Override // p230.InterfaceC3070
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void mo7556(long j, float[] fArr) {
        ((C3071) this.f11802.f2405).m7566(j, fArr);
    }

    @Override // p230.InterfaceC3070
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void mo7557() {
        this.f11797.m7570();
        C0295 c0295 = this.f11802;
        ((C3071) c0295.f2405).m7570();
        c0295.f2404 = false;
        this.f11796.set(true);
    }
}
