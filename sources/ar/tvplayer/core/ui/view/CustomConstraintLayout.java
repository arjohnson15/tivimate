package ar.tvplayer.core.ui.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import p338.InterfaceC3864;
import p338.InterfaceC3865;
import ˈʼ.ʿʼ;
import ᵢˈ.ـˆ;

/* loaded from: classes.dex */
public class CustomConstraintLayout extends ConstraintLayout {

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public static final /* synthetic */ int f2268 = 0;

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public InterfaceC3864 f2269;

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public Drawable f2270;

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public float f2271;

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public Path f2272;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public boolean f2273;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public InterfaceC3864 f2274;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public InterfaceC3864 f2275;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public InterfaceC3865 f2276;

    public CustomConstraintLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CustomConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2276 = new ـˆ(7);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ʿʼ.ـﹶ, i, 0);
        setForegroundDrawable(typedArrayObtainStyledAttributes.getDrawable(1));
        this.f2271 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void setForegroundDrawable(Drawable drawable) {
        Drawable drawable2 = this.f2270;
        if (drawable2 == drawable) {
            return;
        }
        if (drawable2 != null) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            unscheduleDrawable(this.f2270);
        }
        this.f2270 = drawable;
        if (drawable != null) {
            setWillNotDraw(false);
            drawable.setCallback(this);
            if (drawable.isStateful()) {
                drawable.setState(getDrawableState());
            }
        } else {
            setWillNotDraw(true);
        }
        requestLayout();
        invalidate();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Path path = this.f2272;
        if (path != null) {
            int iSave = canvas.save();
            canvas.clipPath(path);
            try {
                super.draw(canvas);
            } finally {
                canvas.restoreToCount(iSave);
            }
        } else {
            super.draw(canvas);
        }
        Drawable drawable = this.f2270;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f2270;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        Drawable drawable;
        super.drawableStateChanged();
        Drawable drawable2 = this.f2270;
        if (drawable2 == null || !drawable2.isStateful() || (drawable = this.f2270) == null) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        View view2;
        InterfaceC3864 interfaceC3864 = this.f2269;
        return (interfaceC3864 == null || (view2 = (View) interfaceC3864.mo1054(view, Integer.valueOf(i))) == null) ? super.focusSearch(view, i) : view2;
    }

    public final InterfaceC3864 getOnChildFocusListener() {
        return this.f2275;
    }

    public final InterfaceC3864 getOnFocusSearchListener() {
        return this.f2269;
    }

    public final InterfaceC3865 getOnLayoutLockedListener() {
        return this.f2276;
    }

    public final InterfaceC3864 getOnRequestFocusInDescendantsListener() {
        return this.f2274;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2270;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (m1472()) {
            m1475(i, i2, i3, i4);
        } else {
            super.onLayout(z, i, i2, i3, i4);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) throws Resources.NotFoundException, NumberFormatException {
        if (m1472()) {
            m1473(i, i2);
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        InterfaceC3864 interfaceC3864 = this.f2274;
        return interfaceC3864 != null ? ((Boolean) interfaceC3864.mo1054(Integer.valueOf(i), rect)).booleanValue() : super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.f2270;
        if (drawable != null) {
            drawable.setBounds(0, 0, i, i2);
        }
        m1474();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        InterfaceC3864 interfaceC3864 = this.f2275;
        if (interfaceC3864 != null) {
            interfaceC3864.mo1054(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public final void setCornerRadius(float f) {
        if (this.f2271 == f) {
            return;
        }
        this.f2271 = f;
        m1474();
        invalidate();
    }

    public final void setLayoutLocked(boolean z) {
        this.f2273 = z;
    }

    public final void setOnChildFocusListener(InterfaceC3864 interfaceC3864) {
        this.f2275 = interfaceC3864;
    }

    public final void setOnFocusSearchListener(InterfaceC3864 interfaceC3864) {
        this.f2269 = interfaceC3864;
    }

    public final void setOnLayoutLockedListener(InterfaceC3865 interfaceC3865) {
        this.f2276 = interfaceC3865;
    }

    public final void setOnRequestFocusInDescendantsListener(InterfaceC3864 interfaceC3864) {
        this.f2274 = interfaceC3864;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f2270;
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final boolean m1472() {
        return (this.f2273 || ((Boolean) this.f2276.mo1053()).booleanValue()) && getWidth() > 0 && getHeight() > 0;
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public void m1473(int i, int i2) {
        setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public final void m1474() {
        if (this.f2271 <= 0.0f) {
            this.f2272 = null;
            return;
        }
        Path path = this.f2272;
        if (path == null) {
            this.f2272 = new Path();
        } else if (path != null) {
            path.reset();
        }
        RectF rectF = new RectF(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        Path path2 = this.f2272;
        if (path2 != null) {
            float f = this.f2271;
            path2.addRoundRect(rectF, f, f, Path.Direction.CW);
        }
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public void m1475(int i, int i2, int i3, int i4) {
    }
}
