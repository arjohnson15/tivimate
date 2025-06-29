package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import org.lsposed.hiddenapibypass.library.R;
import p034.AbstractC1227;
import p061.AbstractC1402;
import p061.C1398;
import p061.C1418;
import p061.C1426;
import p061.C1429;
import p061.InterfaceC1369;
import p162.C2352;
import p162.C2354;
import p162.C2355;
import p239.AbstractC3098;
import ˆٴ.ˎᵢ;
import ـˈ.ˉᵎ;

/* loaded from: classes.dex */
public class CarouselLayoutManager extends AbstractC1402 implements InterfaceC1369 {

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final View.OnLayoutChangeListener f3229;

    /* renamed from: ˑי, reason: contains not printable characters */
    public final C2355 f3230;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public AbstractC1227 f3231;

    public CarouselLayoutManager() {
        C2355 c2355 = new C2355();
        new C2354();
        this.f3229 = new ˎᵢ(1, this);
        this.f3230 = c2355;
        m4838();
        m2839(0);
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        new C2354();
        this.f3229 = new ˎᵢ(1, this);
        this.f3230 = new C2355();
        m4838();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3098.f11954);
            typedArrayObtainStyledAttributes.getInt(0, 0);
            m4838();
            m2839(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // p061.AbstractC1402
    /* renamed from: ʻʿ */
    public final boolean mo1234() {
        return true;
    }

    /* renamed from: ʻˉ, reason: contains not printable characters */
    public final void m2839(int i) {
        C2352 c2352;
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(ˉᵎ.ˉⁱ("invalid orientation:", i));
        }
        mo1250(null);
        AbstractC1227 abstractC1227 = this.f3231;
        if (abstractC1227 == null || i != abstractC1227.f5033) {
            if (i == 0) {
                c2352 = new C2352(this, 1);
            } else {
                if (i != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                c2352 = new C2352(this, 0);
            }
            this.f3231 = c2352;
            m4838();
        }
    }

    @Override // p061.AbstractC1402
    /* renamed from: ʼᵎ, reason: contains not printable characters */
    public final boolean mo2840(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    /* renamed from: ʼﹶ, reason: contains not printable characters */
    public final float m2841(float f, float f2) {
        return m2844() ? f - f2 : f + f2;
    }

    @Override // p061.AbstractC1402
    /* renamed from: ʿʼ */
    public final boolean mo797() {
        return m2842();
    }

    /* renamed from: ʿˉ, reason: contains not printable characters */
    public final boolean m2842() {
        return this.f3231.f5033 == 0;
    }

    @Override // p061.AbstractC1402
    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public final void mo2843(RecyclerView recyclerView) throws Resources.NotFoundException {
        C2355 c2355 = this.f3230;
        Context context = recyclerView.getContext();
        float dimension = c2355.f9324;
        if (dimension <= 0.0f) {
            dimension = context.getResources().getDimension(R.dimen._2_res_0x7f070228);
        }
        c2355.f9324 = dimension;
        float dimension2 = c2355.f9323;
        if (dimension2 <= 0.0f) {
            dimension2 = context.getResources().getDimension(R.dimen._2_res_0x7f070227);
        }
        c2355.f9323 = dimension2;
        m4838();
        recyclerView.addOnLayoutChangeListener(this.f3229);
    }

    @Override // p061.AbstractC1402
    /* renamed from: ˉⁱ */
    public final int mo1215(C1426 c1426) {
        return 0;
    }

    @Override // p061.AbstractC1402
    /* renamed from: ˋⁱ */
    public final int mo1217(C1426 c1426) {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0052  */
    @Override // p061.AbstractC1402
    /* renamed from: ˎˉ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View mo1218(android.view.View r5, int r6, p061.C1429 r7, p061.C1426 r8) {
        /*
            r4 = this;
            int r7 = r4.m4846()
            r8 = 0
            if (r7 != 0) goto L8
            return r8
        L8:
            ʼᵔ.ˑʽ r7 = r4.f3231
            int r7 = r7.f5033
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = -1
            r2 = 1
            if (r6 == r2) goto L52
            r3 = 2
            if (r6 == r3) goto L50
            r3 = 17
            if (r6 == r3) goto L48
            r3 = 33
            if (r6 == r3) goto L45
            r3 = 66
            if (r6 == r3) goto L3c
            r3 = 130(0x82, float:1.82E-43)
            if (r6 == r3) goto L39
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r3 = "Unknown focus request:"
            r7.<init>(r3)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "CarouselLayoutManager"
        L36:
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L53
        L39:
            if (r7 != r2) goto L36
            goto L50
        L3c:
            if (r7 != 0) goto L36
            boolean r6 = r4.m2844()
            if (r6 == 0) goto L50
            goto L52
        L45:
            if (r7 != r2) goto L36
            goto L52
        L48:
            if (r7 != 0) goto L36
            boolean r6 = r4.m2844()
            if (r6 == 0) goto L52
        L50:
            r6 = 1
            goto L53
        L52:
            r6 = -1
        L53:
            if (r6 != r0) goto L56
            return r8
        L56:
            r7 = 0
            if (r6 != r1) goto L8a
            int r5 = p061.AbstractC1402.m4815(r5)
            if (r5 != 0) goto L60
            return r8
        L60:
            android.view.View r5 = r4.m4847(r7)
            int r5 = p061.AbstractC1402.m4815(r5)
            int r5 = r5 - r2
            if (r5 < 0) goto L79
            int r6 = r4.m4844()
            if (r5 < r6) goto L72
            goto L79
        L72:
            ʼᵔ.ˑʽ r5 = r4.f3231
            r5.mo4413()
            r5 = 0
            throw r5
        L79:
            boolean r5 = r4.m2844()
            if (r5 == 0) goto L85
            int r5 = r4.m4846()
            int r7 = r5 + (-1)
        L85:
            android.view.View r5 = r4.m4847(r7)
            goto Lc5
        L8a:
            int r5 = p061.AbstractC1402.m4815(r5)
            int r6 = r4.m4844()
            int r6 = r6 - r2
            if (r5 != r6) goto L96
            return r8
        L96:
            int r5 = r4.m4846()
            int r5 = r5 - r2
            android.view.View r5 = r4.m4847(r5)
            int r5 = p061.AbstractC1402.m4815(r5)
            int r5 = r5 + r2
            if (r5 < 0) goto Lb4
            int r6 = r4.m4844()
            if (r5 < r6) goto Lad
            goto Lb4
        Lad:
            ʼᵔ.ˑʽ r5 = r4.f3231
            r5.mo4413()
            r5 = 0
            throw r5
        Lb4:
            boolean r5 = r4.m2844()
            if (r5 == 0) goto Lbb
            goto Lc1
        Lbb:
            int r5 = r4.m4846()
            int r7 = r5 + (-1)
        Lc1:
            android.view.View r5 = r4.m4847(r7)
        Lc5:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.mo1218(android.view.View, int, ʾـ.ⁱⁱ, ʾـ.ᵢᵢ):android.view.View");
    }

    /* renamed from: ˎי, reason: contains not printable characters */
    public final boolean m2844() {
        return m2842() && m4829() == 1;
    }

    @Override // p061.AbstractC1402
    /* renamed from: ˏʾ */
    public final int mo1249(C1426 c1426) {
        m4846();
        return 0;
    }

    @Override // p061.AbstractC1402
    /* renamed from: ˏᴵ */
    public final int mo1219(C1426 c1426) {
        return 0;
    }

    @Override // p061.AbstractC1402
    /* renamed from: ˑי */
    public final int mo1222(C1426 c1426) {
        return 0;
    }

    @Override // p061.AbstractC1402
    /* renamed from: יˋ */
    public final void mo1255(AccessibilityEvent accessibilityEvent) {
        super.mo1255(accessibilityEvent);
        if (m4846() > 0) {
            accessibilityEvent.setFromIndex(AbstractC1402.m4815(m4847(0)));
            accessibilityEvent.setToIndex(AbstractC1402.m4815(m4847(m4846() - 1)));
        }
    }

    @Override // p061.InterfaceC1369
    /* renamed from: ـﹶ */
    public final PointF mo1258(int i) {
        return null;
    }

    @Override // p061.AbstractC1402
    /* renamed from: ٴˎ */
    public final boolean mo828() {
        return !m2842();
    }

    @Override // p061.AbstractC1402
    /* renamed from: ٴﹶ */
    public final void mo831(int i, int i2) {
        m4844();
    }

    @Override // p061.AbstractC1402
    /* renamed from: ᐧⁱ */
    public final void mo834(View view, Rect rect) {
        super.mo834(view, rect);
        rect.centerY();
        if (m2842()) {
            rect.centerX();
        }
        throw null;
    }

    @Override // p061.AbstractC1402
    /* renamed from: ᴵʿ */
    public final int mo1260(C1426 c1426) {
        m4846();
        return 0;
    }

    @Override // p061.AbstractC1402
    /* renamed from: ᵎʾ */
    public final void mo837(int i, int i2) {
        m4844();
    }

    @Override // p061.AbstractC1402
    /* renamed from: ᵔˋ */
    public final int mo841(int i, C1429 c1429, C1426 c1426) {
        if (!m2842() || m4846() == 0 || i == 0) {
            return 0;
        }
        c1429.m4969(0);
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // p061.AbstractC1402
    /* renamed from: ᵢˆ */
    public final int mo843(int i, C1429 c1429, C1426 c1426) {
        if (!mo828() || m4846() == 0 || i == 0) {
            return 0;
        }
        c1429.m4969(0);
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // p061.AbstractC1402
    /* renamed from: ᵢˎ */
    public final void mo844(RecyclerView recyclerView, int i) {
        C1418 c1418 = new C1418(this, recyclerView.getContext(), 1);
        c1418.f5814 = i;
        mo823(c1418);
    }

    @Override // p061.AbstractC1402
    /* renamed from: ᵢﹶ */
    public final void mo848(int i) {
    }

    @Override // p061.AbstractC1402
    /* renamed from: ⁱʿ */
    public final void mo1265(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.f3229);
    }

    @Override // p061.AbstractC1402
    /* renamed from: ⁱⁱ */
    public final void mo851(C1429 c1429, C1426 c1426) {
        if (c1426.m4948() > 0) {
            if ((m2842() ? this.f5729 : this.f5723) > 0.0f) {
                m2844();
                c1429.m4969(0);
                throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
            }
        }
        mo818(c1429);
    }

    @Override // p061.AbstractC1402
    /* renamed from: ﹳˎ */
    public final C1398 mo856() {
        return new C1398(-2, -2);
    }

    @Override // p061.AbstractC1402
    /* renamed from: ﾞﾞ */
    public final void mo863(C1426 c1426) {
        if (m4846() == 0) {
            return;
        }
        AbstractC1402.m4815(m4847(0));
    }
}
