package p004;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.leanback.widget.RunnableC0183;
import p222.C2882;

/* renamed from: ʻʿ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC0920 implements View.OnTouchListener {

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public static final int f4089 = ViewConfiguration.getTapTimeout();

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public boolean f4090;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final AccelerateInterpolator f4091;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final float[] f4092;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final int f4093;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final ListView f4094;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public boolean f4095;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public boolean f4096;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public boolean f4097;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final float[] f4098;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public RunnableC0183 f4099;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C0928 f4100;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final float[] f4101;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public final C2882 f4102;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final float[] f4103;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public boolean f4104;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final int f4105;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final float[] f4106;

    public ViewOnTouchListenerC0920(C2882 c2882) {
        C0928 c0928 = new C0928();
        c0928.f4115 = Long.MIN_VALUE;
        c0928.f4120 = -1L;
        c0928.f4119 = 0L;
        this.f4100 = c0928;
        this.f4091 = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f4092 = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f4103 = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f4098 = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f4101 = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f4106 = fArr5;
        this.f4094 = c2882;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.f4105 = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f4093 = f4089;
        c0928.f4118 = 500;
        c0928.f4114 = 500;
        this.f4102 = c2882;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static float m3757(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.f4095
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r8 = 3
            if (r0 == r8) goto L16
            goto L7c
        L16:
            r7.m3761()
            goto L7c
        L1a:
            r7.f4096 = r2
            r7.f4090 = r1
        L1e:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            android.widget.ListView r4 = r7.f4094
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.m3760(r0, r3, r5, r1)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.m3760(r9, r8, r3, r2)
            ʻʿ.ـﹶ r9 = r7.f4100
            r9.f4117 = r0
            r9.f4121 = r8
            boolean r8 = r7.f4104
            if (r8 != 0) goto L7c
            boolean r8 = r7.m3758()
            if (r8 == 0) goto L7c
            androidx.leanback.widget.ᴵʿ r8 = r7.f4099
            if (r8 != 0) goto L60
            androidx.leanback.widget.ᴵʿ r8 = new androidx.leanback.widget.ᴵʿ
            r9 = 4
            r8.<init>(r9, r7)
            r7.f4099 = r8
        L60:
            r7.f4104 = r2
            r7.f4097 = r2
            boolean r8 = r7.f4090
            if (r8 != 0) goto L75
            int r8 = r7.f4093
            if (r8 <= 0) goto L75
            androidx.leanback.widget.ᴵʿ r9 = r7.f4099
            long r5 = (long) r8
            java.util.WeakHashMap r8 = p378.AbstractC4345.f16838
            r4.postOnAnimationDelayed(r9, r5)
            goto L7a
        L75:
            androidx.leanback.widget.ᴵʿ r8 = r7.f4099
            r8.run()
        L7a:
            r7.f4090 = r2
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p004.ViewOnTouchListenerC0920.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final boolean m3758() {
        C2882 c2882;
        int count;
        C0928 c0928 = this.f4100;
        float f = c0928.f4121;
        int iAbs = (int) (f / Math.abs(f));
        Math.abs(c0928.f4117);
        if (iAbs == 0 || (count = (c2882 = this.f4102).getCount()) == 0) {
            return false;
        }
        int childCount = c2882.getChildCount();
        int firstVisiblePosition = c2882.getFirstVisiblePosition();
        int i = firstVisiblePosition + childCount;
        if (iAbs > 0) {
            if (i >= count && c2882.getChildAt(childCount - 1).getBottom() <= c2882.getHeight()) {
                return false;
            }
        } else {
            if (iAbs >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && c2882.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final float m3759(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.f4105;
        if (i == 0 || i == 1) {
            if (f < f2) {
                if (f >= 0.0f) {
                    return 1.0f - (f / f2);
                }
                if (this.f4104 && i == 1) {
                    return 1.0f;
                }
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
        return 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* renamed from: ـﹶ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float m3760(float r4, float r5, float r6, int r7) {
        /*
            r3 = this;
            float[] r0 = r3.f4092
            r0 = r0[r7]
            float[] r1 = r3.f4103
            r1 = r1[r7]
            float r0 = r0 * r5
            r2 = 0
            float r0 = m3757(r0, r2, r1)
            float r1 = r3.m3759(r4, r0)
            float r5 = r5 - r4
            float r4 = r3.m3759(r5, r0)
            float r4 = r4 - r1
            android.view.animation.AccelerateInterpolator r5 = r3.f4091
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L26
            float r4 = -r4
            float r4 = r5.getInterpolation(r4)
            float r4 = -r4
            goto L2e
        L26:
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L37
            float r4 = r5.getInterpolation(r4)
        L2e:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r4 = m3757(r4, r5, r0)
            goto L38
        L37:
            r4 = 0
        L38:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 != 0) goto L3d
            return r2
        L3d:
            float[] r0 = r3.f4098
            r0 = r0[r7]
            float[] r1 = r3.f4101
            r1 = r1[r7]
            float[] r2 = r3.f4106
            r7 = r2[r7]
            float r0 = r0 * r6
            if (r5 <= 0) goto L54
            float r4 = r4 * r0
            float r4 = m3757(r4, r1, r7)
            return r4
        L54:
            float r4 = -r4
            float r4 = r4 * r0
            float r4 = m3757(r4, r1, r7)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p004.ViewOnTouchListenerC0920.m3760(float, float, float, int):float");
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m3761() {
        int i = 0;
        if (this.f4097) {
            this.f4104 = false;
            return;
        }
        C0928 c0928 = this.f4100;
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i2 = (int) (jCurrentAnimationTimeMillis - c0928.f4115);
        int i3 = c0928.f4114;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        c0928.f4122 = i;
        c0928.f4116 = c0928.m3787(jCurrentAnimationTimeMillis);
        c0928.f4120 = jCurrentAnimationTimeMillis;
    }
}
