package p061;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: ʾـ.ᵢٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C1425 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public RecyclerView f5804;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public boolean f5805;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final DecelerateInterpolator f5806;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final DisplayMetrics f5807;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public boolean f5808;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public PointF f5809;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public int f5810;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public boolean f5811;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public AbstractC1402 f5812;

    /* renamed from: ˑי, reason: contains not printable characters */
    public int f5813;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public int f5814 = -1;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public View f5815;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final C1364 f5816;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public float f5817;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public boolean f5818;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final LinearInterpolator f5819;

    public C1425(Context context) {
        C1364 c1364 = new C1364();
        c1364.f5537 = -1;
        c1364.f5535 = false;
        c1364.f5536 = 0;
        c1364.f5534 = 0;
        c1364.f5531 = 0;
        c1364.f5533 = Integer.MIN_VALUE;
        c1364.f5532 = null;
        this.f5816 = c1364;
        this.f5819 = new LinearInterpolator();
        this.f5806 = new DecelerateInterpolator();
        this.f5808 = false;
        this.f5810 = 0;
        this.f5813 = 0;
        this.f5807 = context.getResources().getDisplayMetrics();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static int m4945(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            if (i5 == 1) {
                return i4 - i2;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 < 0) {
            return i7;
        }
        return 0;
    }

    /* renamed from: ʽᐧ */
    public int mo4911(View view, int i) {
        AbstractC1402 abstractC1402 = this.f5812;
        if (abstractC1402 == null || !abstractC1402.mo797()) {
            return 0;
        }
        C1398 c1398 = (C1398) view.getLayoutParams();
        return m4945(abstractC1402.mo801(view) - ((ViewGroup.MarginLayoutParams) c1398).leftMargin, abstractC1402.mo805(view) + ((ViewGroup.MarginLayoutParams) c1398).rightMargin, abstractC1402.m4835(), abstractC1402.f5729 - abstractC1402.m4848(), i);
    }

    /* renamed from: ʿʼ */
    public int mo961(int i) {
        float fAbs = Math.abs(i);
        if (!this.f5808) {
            this.f5817 = mo963(this.f5807);
            this.f5808 = true;
        }
        return (int) Math.ceil(fAbs * this.f5817);
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final void m4946() {
        if (this.f5805) {
            this.f5805 = false;
            mo962();
            this.f5804.f1705.f5830 = -1;
            this.f5815 = null;
            this.f5814 = -1;
            this.f5818 = false;
            AbstractC1402 abstractC1402 = this.f5812;
            if (abstractC1402.f5718 == this) {
                abstractC1402.f5718 = null;
            }
            this.f5812 = null;
            this.f5804 = null;
        }
    }

    /* renamed from: ˏᵢ */
    public void mo962() {
        this.f5813 = 0;
        this.f5810 = 0;
        this.f5809 = null;
    }

    /* renamed from: ˑʽ */
    public int mo4912(View view, int i) {
        AbstractC1402 abstractC1402 = this.f5812;
        if (abstractC1402 == null || !abstractC1402.mo828()) {
            return 0;
        }
        C1398 c1398 = (C1398) view.getLayoutParams();
        return m4945(abstractC1402.mo842(view) - ((ViewGroup.MarginLayoutParams) c1398).topMargin, abstractC1402.mo807(view) + ((ViewGroup.MarginLayoutParams) c1398).bottomMargin, abstractC1402.m4824(), abstractC1402.f5723 - abstractC1402.m4833(), i);
    }

    /* renamed from: ٴˎ */
    public PointF mo944(int i) {
        Object obj = this.f5812;
        if (obj instanceof InterfaceC1369) {
            return ((InterfaceC1369) obj).mo1258(i);
        }
        String str = "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + InterfaceC1369.class.getCanonicalName();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00ff  */
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m4947(int r9, int r10) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p061.C1425.m4947(int, int):void");
    }

    /* renamed from: ﹳﹳ */
    public float mo963(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015  */
    /* renamed from: ﹶˆ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo964(android.view.View r7, p061.C1364 r8) {
        /*
            r6 = this;
            android.graphics.PointF r0 = r6.f5809
            r1 = 1
            r2 = 0
            r3 = -1
            r4 = 0
            if (r0 == 0) goto L15
            float r0 = r0.x
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto Lf
            goto L15
        Lf:
            if (r0 <= 0) goto L13
            r0 = 1
            goto L16
        L13:
            r0 = -1
            goto L16
        L15:
            r0 = 0
        L16:
            int r0 = r6.mo4911(r7, r0)
            android.graphics.PointF r5 = r6.f5809
            if (r5 == 0) goto L2a
            float r5 = r5.y
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 != 0) goto L25
            goto L2a
        L25:
            if (r4 <= 0) goto L29
            r2 = 1
            goto L2a
        L29:
            r2 = -1
        L2a:
            int r7 = r6.mo4912(r7, r2)
            int r2 = r0 * r0
            int r3 = r7 * r7
            int r3 = r3 + r2
            double r2 = (double) r3
            double r2 = java.lang.Math.sqrt(r2)
            int r2 = (int) r2
            int r2 = r6.mo961(r2)
            double r2 = (double) r2
            r4 = 4599717252057688074(0x3fd57a786c22680a, double:0.3356)
            double r2 = r2 / r4
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            if (r2 <= 0) goto L59
            int r0 = -r0
            int r7 = -r7
            android.view.animation.DecelerateInterpolator r3 = r6.f5806
            r8.f5534 = r0
            r8.f5531 = r7
            r8.f5533 = r2
            r8.f5532 = r3
            r8.f5535 = r1
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p061.C1425.mo964(android.view.View, ʾـ.ʾˈ):void");
    }
}
