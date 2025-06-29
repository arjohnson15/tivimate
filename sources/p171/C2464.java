package p171;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* renamed from: ˋˉ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2464 extends Drawable.ConstantState {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public Drawable.ConstantState f9799;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public ColorStateList f9800;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public int f9801;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public PorterDuff.Mode f9802;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        int i = this.f9801;
        Drawable.ConstantState constantState = this.f9799;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C2467 c2467 = new C2467();
        c2467.f9808 = this;
        Drawable.ConstantState constantState = this.f9799;
        if (constantState != null) {
            c2467.m6591(constantState.newDrawable(resources));
        }
        C2467.m6588();
        return c2467;
    }
}
