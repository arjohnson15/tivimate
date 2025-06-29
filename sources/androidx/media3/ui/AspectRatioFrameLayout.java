package androidx.media3.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p009.RunnableC0997;
import p272.AbstractC3337;
import p272.InterfaceC3315;

/* loaded from: classes.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static final /* synthetic */ int f1448 = 0;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public float f1449;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public int f1450;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public ValueAnimator f1451;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final RunnableC0997 f1452;

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1450 = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC3337.f13031, 0, 0);
            try {
                this.f1450 = typedArrayObtainStyledAttributes.getInt(0, 0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        this.f1452 = new RunnableC0997(this);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static void m1148(View view, int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        if (layoutParams.width == i && layoutParams.height == i2) {
            return;
        }
        layoutParams.gravity = 17;
        layoutParams.width = i;
        layoutParams.height = i2;
        view.setLayoutParams(layoutParams);
    }

    public int getResizeMode() {
        return this.f1450;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f1451 == null) {
            m1149(false);
        }
    }

    public void setAspectRatio(float f) {
        if (this.f1449 != f) {
            this.f1449 = f;
            m1149(false);
        }
    }

    public void setAspectRatioListener(InterfaceC3315 interfaceC3315) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        if (r9 != 5) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ed  */
    /* renamed from: ـﹶ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1149(boolean r15) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.AspectRatioFrameLayout.m1149(boolean):void");
    }
}
