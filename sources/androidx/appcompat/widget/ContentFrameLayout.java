package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import p222.C2885;
import p222.C2908;
import p222.C2928;
import p222.InterfaceC2925;
import p222.InterfaceC2946;
import p225.C2993;
import p225.LayoutInflaterFactory2C3017;
import p320.MenuC3643;
import p378.C4361;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public TypedValue f152;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public TypedValue f153;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public InterfaceC2925 f154;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public TypedValue f155;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public TypedValue f156;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public TypedValue f157;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public TypedValue f158;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final Rect f159;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f159 = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f153 == null) {
            this.f153 = new TypedValue();
        }
        return this.f153;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f158 == null) {
            this.f158 = new TypedValue();
        }
        return this.f158;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f155 == null) {
            this.f155 = new TypedValue();
        }
        return this.f155;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f156 == null) {
            this.f156 = new TypedValue();
        }
        return this.f156;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f157 == null) {
            this.f157 = new TypedValue();
        }
        return this.f157;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f152 == null) {
            this.f152 = new TypedValue();
        }
        return this.f152;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC2925 interfaceC2925 = this.f154;
        if (interfaceC2925 != null) {
            interfaceC2925.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C2908 c2908;
        super.onDetachedFromWindow();
        InterfaceC2925 interfaceC2925 = this.f154;
        if (interfaceC2925 != null) {
            LayoutInflaterFactory2C3017 layoutInflaterFactory2C3017 = ((C2993) interfaceC2925).f11514;
            InterfaceC2946 interfaceC2946 = layoutInflaterFactory2C3017.f11611;
            if (interfaceC2946 != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC2946;
                actionBarOverlayLayout.m125();
                ActionMenuView actionMenuView = ((C2885) actionBarOverlayLayout.f110).f11179.f235;
                if (actionMenuView != null && (c2908 = actionMenuView.f141) != null) {
                    c2908.m7257();
                    C2928 c2928 = c2908.f11277;
                    if (c2928 != null && c2928.m8618()) {
                        c2928.f14007.dismiss();
                    }
                }
            }
            if (layoutInflaterFactory2C3017.f11625 != null) {
                layoutInflaterFactory2C3017.f11616.getDecorView().removeCallbacks(layoutInflaterFactory2C3017.f11640);
                if (layoutInflaterFactory2C3017.f11625.isShowing()) {
                    try {
                        layoutInflaterFactory2C3017.f11625.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                layoutInflaterFactory2C3017.f11625 = null;
            }
            C4361 c4361 = layoutInflaterFactory2C3017.f11618;
            if (c4361 != null) {
                c4361.m9938();
            }
            MenuC3643 menuC3643 = layoutInflaterFactory2C3017.m7479(0).f11497;
            if (menuC3643 != null) {
                menuC3643.m8591(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00de  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(InterfaceC2925 interfaceC2925) {
        this.f154 = interfaceC2925;
    }
}
