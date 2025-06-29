package p131;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import p189.C2641;
import p189.C2642;

/* renamed from: ˉʻ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2060 extends Animatable2.AnimationCallback {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ C2642 f7800;

    public C2060(C2642 c2642) {
        this.f7800 = c2642;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.f7800.f10478.f10474;
        if (colorStateList != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        C2641 c2641 = this.f7800.f10478;
        ColorStateList colorStateList = c2641.f10474;
        if (colorStateList != null) {
            drawable.setTint(colorStateList.getColorForState(c2641.f10471, colorStateList.getDefaultColor()));
        }
    }
}
