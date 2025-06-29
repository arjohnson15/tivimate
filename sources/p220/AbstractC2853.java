package p220;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import p222.AbstractC2891;
import p239.AbstractC3098;

/* renamed from: ˏٴ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2853 extends AbstractC2891 {

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public final Rect f11089;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public Drawable f11090;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public final boolean f11091;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public int f11092;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public final Rect f11093;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public boolean f11094;

    public AbstractC2853(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11093 = new Rect();
        this.f11089 = new Rect();
        this.f11092 = 119;
        this.f11091 = true;
        this.f11094 = false;
        int[] iArr = AbstractC3098.f11965;
        AbstractC2845.m7131(context, attributeSet, 0, 0);
        AbstractC2845.m7128(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.f11092 = typedArrayObtainStyledAttributes.getInt(1, this.f11092);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f11091 = typedArrayObtainStyledAttributes.getBoolean(2, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f11090;
        if (drawable != null) {
            if (this.f11094) {
                this.f11094 = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z = this.f11091;
                Rect rect = this.f11093;
                if (z) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i = this.f11092;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f11089;
                Gravity.apply(i, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f11090;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f11090;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f11090.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f11090;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f11092;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f11090;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // p222.AbstractC2891, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f11094 = z | this.f11094;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f11094 = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f11090;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f11090);
            }
            this.f11090 = drawable;
            this.f11094 = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f11092 == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i) {
        if (this.f11092 != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f11092 = i;
            if (i == 119 && this.f11090 != null) {
                this.f11090.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f11090;
    }
}
