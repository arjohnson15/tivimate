package p063;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import p131.C2061;

/* renamed from: ʾᐧ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1453 extends Drawable.ConstantState {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Object f5948;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f5949;

    public /* synthetic */ C1453(int i, Object obj) {
        this.f5949 = i;
        this.f5948 = obj;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public boolean canApplyTheme() {
        switch (this.f5949) {
            case 1:
                return ((Drawable.ConstantState) this.f5948).canApplyTheme();
            default:
                return super.canApplyTheme();
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        switch (this.f5949) {
            case 0:
                return 0;
            default:
                return ((Drawable.ConstantState) this.f5948).getChangingConfigurations();
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        switch (this.f5949) {
            case 0:
                return new C1457(this);
            default:
                C2061 c2061 = new C2061(null);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f5948).newDrawable();
                c2061.f7844 = drawableNewDrawable;
                drawableNewDrawable.setCallback(c2061.f7806);
                return c2061;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        switch (this.f5949) {
            case 0:
                return new C1457(this);
            default:
                C2061 c2061 = new C2061(null);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f5948).newDrawable(resources);
                c2061.f7844 = drawableNewDrawable;
                drawableNewDrawable.setCallback(c2061.f7806);
                return c2061;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        switch (this.f5949) {
            case 1:
                C2061 c2061 = new C2061(null);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f5948).newDrawable(resources, theme);
                c2061.f7844 = drawableNewDrawable;
                drawableNewDrawable.setCallback(c2061.f7806);
                return c2061;
            default:
                return super.newDrawable(resources, theme);
        }
    }
}
