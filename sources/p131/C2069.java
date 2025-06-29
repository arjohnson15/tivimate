package p131;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* renamed from: ˉʻ.ˑי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2069 extends Drawable.ConstantState {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Drawable.ConstantState f7847;

    public C2069(Drawable.ConstantState constantState) {
        this.f7847 = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f7847.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f7847.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C2074 c2074 = new C2074();
        c2074.f7844 = (VectorDrawable) this.f7847.newDrawable();
        return c2074;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C2074 c2074 = new C2074();
        c2074.f7844 = (VectorDrawable) this.f7847.newDrawable(resources);
        return c2074;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C2074 c2074 = new C2074();
        c2074.f7844 = (VectorDrawable) this.f7847.newDrawable(resources, theme);
        return c2074;
    }
}
