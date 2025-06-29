package p007;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.Surface;
import p383.AbstractC4464;
import p383.AbstractC4470;

/* renamed from: ʻˉ.ᐧⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0958 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C0964 f4239;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public Surface f4240;

    /* renamed from: ˉי, reason: contains not printable characters */
    public int f4241;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public long f4242;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public long f4243;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public long f4244;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public long f4245;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public float f4246;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final ChoreographerFrameCallbackC0942 f4247;

    /* renamed from: ˑי, reason: contains not printable characters */
    public long f4248;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C0943 f4249;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public float f4250;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public float f4251;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public long f4252;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public long f4253;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public boolean f4254;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public float f4255;

    public C0958(Context context) {
        DisplayManager displayManager;
        C0943 c0943 = new C0943();
        c0943.f4152 = new C0967();
        c0943.f4149 = new C0967();
        c0943.f4153 = -9223372036854775807L;
        this.f4249 = c0943;
        C0964 c0964 = (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : new C0964(this, displayManager);
        this.f4239 = c0964;
        this.f4247 = c0964 != null ? ChoreographerFrameCallbackC0942.f4144 : null;
        this.f4244 = -9223372036854775807L;
        this.f4242 = -9223372036854775807L;
        this.f4250 = -1.0f;
        this.f4255 = 1.0f;
        this.f4241 = 0;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m3891(C0958 c0958, Display display) {
        c0958.getClass();
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            c0958.f4244 = refreshRate;
            c0958.f4242 = (refreshRate * 80) / 100;
        } else {
            AbstractC4464.m10144("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            c0958.f4244 = -9223372036854775807L;
            c0958.f4242 = -9223372036854775807L;
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m3892() {
        Surface surface;
        if (AbstractC4470.f17202 < 30 || (surface = this.f4240) == null || this.f4241 == Integer.MIN_VALUE || this.f4246 == 0.0f) {
            return;
        }
        this.f4246 = 0.0f;
        AbstractC0954.m3884(surface, 0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* renamed from: ˑʽ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m3893() {
        /*
            r9 = this;
            int r0 = p383.AbstractC4470.f17202
            r1 = 30
            if (r0 < r1) goto L8e
            android.view.Surface r0 = r9.f4240
            if (r0 != 0) goto Lc
            goto L8e
        Lc:
            ʻˉ.ˉי r0 = r9.f4249
            ʻˉ.ﹶˆ r2 = r0.f4152
            boolean r2 = r2.m3902()
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r2 == 0) goto L3a
            ʻˉ.ﹶˆ r2 = r0.f4152
            boolean r2 = r2.m3902()
            if (r2 == 0) goto L37
            ʻˉ.ﹶˆ r2 = r0.f4152
            long r4 = r2.f4269
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L2b
            goto L2e
        L2b:
            long r6 = r2.f4273
            long r6 = r6 / r4
        L2e:
            double r4 = (double) r6
            r6 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            double r6 = r6 / r4
            float r2 = (float) r6
            goto L3c
        L37:
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L3c
        L3a:
            float r2 = r9.f4250
        L3c:
            float r4 = r9.f4251
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 != 0) goto L43
            return
        L43:
            int r5 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r5 == 0) goto L81
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 == 0) goto L81
            ʻˉ.ﹶˆ r1 = r0.f4152
            boolean r1 = r1.m3902()
            if (r1 == 0) goto L72
            ʻˉ.ﹶˆ r1 = r0.f4152
            boolean r1 = r1.m3902()
            if (r1 == 0) goto L60
            ʻˉ.ﹶˆ r0 = r0.f4152
            long r0 = r0.f4273
            goto L65
        L60:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L65:
            r3 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 < 0) goto L72
            r0 = 1017370378(0x3ca3d70a, float:0.02)
            goto L74
        L72:
            r0 = 1065353216(0x3f800000, float:1.0)
        L74:
            float r1 = r9.f4251
            float r1 = r2 - r1
            float r1 = java.lang.Math.abs(r1)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L8e
            goto L88
        L81:
            if (r5 == 0) goto L84
            goto L88
        L84:
            int r0 = r0.f4150
            if (r0 < r1) goto L8e
        L88:
            r9.f4251 = r2
            r0 = 0
            r9.m3894(r0)
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p007.C0958.m3893():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m3894(boolean r4) {
        /*
            r3 = this;
            int r0 = p383.AbstractC4470.f17202
            r1 = 30
            if (r0 < r1) goto L31
            android.view.Surface r0 = r3.f4240
            if (r0 == 0) goto L31
            int r1 = r3.f4241
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r2) goto L11
            goto L31
        L11:
            boolean r1 = r3.f4254
            if (r1 == 0) goto L22
            float r1 = r3.f4251
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto L22
            float r2 = r3.f4255
            float r1 = r1 * r2
            goto L23
        L22:
            r1 = 0
        L23:
            if (r4 != 0) goto L2c
            float r4 = r3.f4246
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 != 0) goto L2c
            return
        L2c:
            r3.f4246 = r1
            p007.AbstractC0954.m3884(r0, r1)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p007.C0958.m3894(boolean):void");
    }
}
