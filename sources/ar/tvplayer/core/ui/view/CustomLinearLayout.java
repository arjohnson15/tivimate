package ar.tvplayer.core.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import p338.InterfaceC3865;
import ᵢˈ.ـˆ;

/* loaded from: classes.dex */
public final class CustomLinearLayout extends LinearLayout {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final /* synthetic */ int f2278 = 0;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public InterfaceC3865 f2279;

    public CustomLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f2279 = new ـˆ(8);
    }

    public final InterfaceC3865 getOnLayoutLockedListener() {
        return this.f2279;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (m1476()) {
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (m1476()) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
        } else {
            super.onMeasure(i, i2);
        }
    }

    public final void setOnLayoutLockedListener(InterfaceC3865 interfaceC3865) {
        this.f2279 = interfaceC3865;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final boolean m1476() {
        return ((Boolean) this.f2279.mo1053()).booleanValue() && getWidth() > 0 && getHeight() > 0;
    }
}
