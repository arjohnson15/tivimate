package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.lsposed.hiddenapibypass.library.R;
import p222.AbstractC2876;
import p222.C2927;
import p300.AbstractC3505;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public View f74;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public Drawable f75;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public boolean f76;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public View f77;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final int f78;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public Drawable f79;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public boolean f80;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public Drawable f81;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final boolean f82;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C2927(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3505.f13588);
        boolean z = false;
        this.f79 = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f75 = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f78 = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id._2_res_0x7f0b035c) {
            this.f82 = true;
            this.f81 = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f82 ? !(this.f79 != null || this.f75 != null) : this.f81 == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f79;
        if (drawable != null && drawable.isStateful()) {
            this.f79.setState(getDrawableState());
        }
        Drawable drawable2 = this.f75;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f75.setState(getDrawableState());
        }
        Drawable drawable3 = this.f81;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f81.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f79;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f75;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f81;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f74 = findViewById(R.id._2_res_0x7f0b003b);
        this.f77 = findViewById(R.id._2_res_0x7f0b0043);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f80 || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (this.f82) {
            Drawable drawable = this.f81;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f79 == null) {
                z2 = false;
            } else if (this.f74.getVisibility() == 0) {
                this.f79.setBounds(this.f74.getLeft(), this.f74.getTop(), this.f74.getRight(), this.f74.getBottom());
            } else {
                View view = this.f77;
                if (view == null || view.getVisibility() != 0) {
                    this.f79.setBounds(0, 0, 0, 0);
                } else {
                    this.f79.setBounds(this.f77.getLeft(), this.f77.getTop(), this.f77.getRight(), this.f77.getBottom());
                }
            }
            this.f76 = false;
        }
        if (z2) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.f74 == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.f78) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f74 == null) {
            return;
        }
        View.MeasureSpec.getMode(i2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f79;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f79);
        }
        this.f79 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f74;
            if (view != null) {
                this.f79.setBounds(view.getLeft(), this.f74.getTop(), this.f74.getRight(), this.f74.getBottom());
            }
        }
        boolean z = false;
        if (!this.f82 ? !(this.f79 != null || this.f75 != null) : this.f81 == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f81;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f81);
        }
        this.f81 = drawable;
        boolean z = this.f82;
        boolean z2 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z && (drawable2 = this.f81) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z ? !(this.f79 != null || this.f75 != null) : this.f81 == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f75;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f75);
        }
        this.f75 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f76 && this.f75 != null) {
                throw null;
            }
        }
        boolean z = false;
        if (!this.f82 ? !(this.f79 != null || this.f75 != null) : this.f81 == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(AbstractC2876 abstractC2876) {
    }

    public void setTransitioning(boolean z) {
        this.f80 = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f79;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f75;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f81;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f79;
        boolean z = this.f82;
        return (drawable == drawable2 && !z) || (drawable == this.f75 && this.f76) || ((drawable == this.f81 && z) || super.verifyDrawable(drawable));
    }
}
