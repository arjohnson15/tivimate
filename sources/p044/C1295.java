package p044;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import p171.InterfaceC2463;
import p361.C4089;
import p361.InterfaceC4106;

/* renamed from: ʽٴ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1295 extends Drawable implements InterfaceC4106, InterfaceC2463 {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public C1297 f5316;

    public C1295(C1297 c1297) {
        this.f5316 = c1297;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C1297 c1297 = this.f5316;
        if (c1297.f5317) {
            c1297.f5318.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f5316;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        this.f5316.f5318.getClass();
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f5316 = new C1297(this.f5316);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f5316.f5318.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        if (this.f5316.f5318.setState(iArr)) {
            zOnStateChange = true;
        }
        boolean zM4596 = AbstractC1298.m4596(iArr);
        C1297 c1297 = this.f5316;
        if (c1297.f5317 == zM4596) {
            return zOnStateChange;
        }
        c1297.f5317 = zM4596;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f5316.f5318.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f5316.f5318.setColorFilter(colorFilter);
    }

    @Override // p361.InterfaceC4106
    public final void setShapeAppearanceModel(C4089 c4089) {
        this.f5316.f5318.setShapeAppearanceModel(c4089);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        this.f5316.f5318.setTint(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f5316.f5318.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f5316.f5318.setTintMode(mode);
    }
}
