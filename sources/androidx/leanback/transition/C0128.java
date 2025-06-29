package androidx.leanback.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Property;
import android.view.View;
import org.lsposed.hiddenapibypass.library.R;

/* renamed from: androidx.leanback.transition.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0128 extends AnimatorListenerAdapter {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public float f758;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final float f759;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final View f760;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public boolean f761 = false;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final int f762;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final Property f763;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final float f764;

    public C0128(View view, Property property, float f, float f2, int i) {
        this.f763 = property;
        this.f760 = view;
        this.f759 = f;
        this.f764 = f2;
        this.f762 = i;
        view.setVisibility(0);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        View view = this.f760;
        view.setTag(R.id._2_res_0x7f0b0249, new float[]{view.getTranslationX(), view.getTranslationY()});
        this.f763.set(view, Float.valueOf(this.f759));
        this.f761 = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        boolean z = this.f761;
        View view = this.f760;
        if (!z) {
            this.f763.set(view, Float.valueOf(this.f759));
        }
        view.setVisibility(this.f762);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        Property property = this.f763;
        View view = this.f760;
        this.f758 = ((Float) property.get(view)).floatValue();
        property.set(view, Float.valueOf(this.f764));
        view.setVisibility(this.f762);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        Float fValueOf = Float.valueOf(this.f758);
        Property property = this.f763;
        View view = this.f760;
        property.set(view, fValueOf);
        view.setVisibility(0);
    }
}
