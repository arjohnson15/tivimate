package p171;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import java.lang.reflect.Method;
import ˆˑ.ﹳﹳ;

/* renamed from: ˋˉ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2467 extends Drawable implements Drawable.Callback, InterfaceC2465, InterfaceC2463 {

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public static Method f9803;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public static final PorterDuff.Mode f9804 = PorterDuff.Mode.SRC_IN;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public PorterDuff.Mode f9805;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public boolean f9806;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public boolean f9807;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public C2464 f9808;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public int f9809;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public Drawable f9810;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m6588() {
        if (f9803 == null) {
            try {
                f9803 = Drawable.class.getDeclaredMethod("isProjected", null);
            } catch (Exception e) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.f9810.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        C2464 c2464 = this.f9808;
        return changingConfigurations | (c2464 != null ? c2464.getChangingConfigurations() : 0) | this.f9810.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        C2464 c2464 = this.f9808;
        if (c2464 == null || c2464.f9799 == null) {
            return null;
        }
        c2464.f9801 = getChangingConfigurations();
        return this.f9808;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f9810.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        return this.f9810.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f9810.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f9810.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getLayoutDirection() {
        return ﹳﹳ.ᴵʿ(this.f9810);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.f9810.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.f9810.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f9810.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        this.f9810.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return this.f9810.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        return this.f9810.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        return this.f9810.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f9810.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isProjected() {
        Method method;
        Drawable drawable = this.f9810;
        if (drawable == null || (method = f9803) == null) {
            return false;
        }
        try {
            return ((Boolean) method.invoke(drawable, null)).booleanValue();
        } catch (Exception e) {
            return false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        C2464 c2464;
        ColorStateList colorStateList = (!m6589() || (c2464 = this.f9808) == null) ? null : c2464.f9800;
        return (colorStateList != null && colorStateList.isStateful()) || this.f9810.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f9810.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f9806 && super.mutate() == this) {
            this.f9808 = m6592();
            Drawable drawable = this.f9810;
            if (drawable != null) {
                drawable.mutate();
            }
            C2464 c2464 = this.f9808;
            if (c2464 != null) {
                Drawable drawable2 = this.f9810;
                c2464.f9799 = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f9806 = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f9810;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        return ﹳﹳ.ˈٴ(this.f9810, i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        return this.f9810.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f9810.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        this.f9810.setAutoMirrored(z);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i) {
        this.f9810.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f9810.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        this.f9810.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z) {
        this.f9810.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        this.f9810.setHotspot(f, f2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f9810.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (!m6595(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        if (m6589()) {
            m6590(i);
        } else {
            this.f9810.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (m6589()) {
            m6593(colorStateList);
        } else {
            this.f9810.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (m6589()) {
            m6594(mode);
        } else {
            this.f9810.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f9810.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean m6589() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f9810;
        return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m6590(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final void m6591(Drawable drawable) {
        Drawable drawable2 = this.f9810;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f9810 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            C2464 c2464 = this.f9808;
            if (c2464 != null) {
                c2464.f9799 = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C2464 m6592() {
        C2464 c2464 = this.f9808;
        C2464 c24642 = new C2464();
        c24642.f9800 = null;
        c24642.f9802 = f9804;
        if (c2464 != null) {
            c24642.f9801 = c2464.f9801;
            c24642.f9799 = c2464.f9799;
            c24642.f9800 = c2464.f9800;
            c24642.f9802 = c2464.f9802;
        }
        return c24642;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m6593(ColorStateList colorStateList) {
        this.f9808.f9800 = colorStateList;
        m6596(this.f9810.getState());
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m6594(PorterDuff.Mode mode) {
        this.f9808.f9802 = mode;
        m6596(this.f9810.getState());
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final boolean m6595(int[] iArr) {
        return m6596(iArr) || this.f9810.setState(iArr);
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final boolean m6596(int[] iArr) {
        if (!m6589()) {
            return false;
        }
        C2464 c2464 = this.f9808;
        ColorStateList colorStateList = c2464.f9800;
        PorterDuff.Mode mode = c2464.f9802;
        if (colorStateList == null || mode == null) {
            this.f9807 = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.f9807 || colorForState != this.f9809 || mode != this.f9805) {
                setColorFilter(colorForState, mode);
                this.f9809 = colorForState;
                this.f9805 = mode;
                this.f9807 = true;
                return true;
            }
        }
        return false;
    }
}
