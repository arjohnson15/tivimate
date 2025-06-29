package androidx.leanback.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* renamed from: androidx.leanback.widget.ˊᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0150 extends LinearLayout {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public boolean f1064;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final Rect f1065;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Drawable f1066;

    public AbstractC0150(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1065 = new Rect();
        if (context.getApplicationInfo().targetSdkVersion < 23 || Build.VERSION.SDK_INT < 23) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.foreground});
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
            if (drawable != null) {
                int i = Build.VERSION.SDK_INT;
                if (i >= 23) {
                    if (i >= 23) {
                        setForeground(drawable);
                    }
                } else if (this.f1066 != drawable) {
                    this.f1066 = drawable;
                    this.f1064 = true;
                    setWillNotDraw(false);
                    this.f1066.setCallback(this);
                    if (this.f1066.isStateful()) {
                        this.f1066.setState(getDrawableState());
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f1066;
        if (drawable != null) {
            if (this.f1064) {
                this.f1064 = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                Rect rect = this.f1065;
                rect.set(0, 0, right, bottom);
                drawable.setBounds(rect);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1066;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f1066.setState(getDrawableState());
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1066;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f1064 = z | this.f1064;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1066;
    }
}
