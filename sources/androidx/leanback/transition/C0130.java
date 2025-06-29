package androidx.leanback.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.transition.Transition;
import android.view.View;
import org.lsposed.hiddenapibypass.library.R;

/* renamed from: androidx.leanback.transition.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0130 extends AnimatorListenerAdapter implements Transition.TransitionListener {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final View f766;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int[] f767;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final float f768;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int f769;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final View f770;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public float f771;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public float f772;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int f773;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final float f774;

    public C0130(View view, View view2, int i, int i2, float f, float f2) {
        this.f766 = view;
        this.f770 = view2;
        this.f769 = i - Math.round(view.getTranslationX());
        this.f773 = i2 - Math.round(view.getTranslationY());
        this.f768 = f;
        this.f774 = f2;
        int[] iArr = (int[]) view2.getTag(R.id._2_res_0x7f0b03a7);
        this.f767 = iArr;
        if (iArr != null) {
            view2.setTag(R.id._2_res_0x7f0b03a7, null);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (this.f767 == null) {
            this.f767 = new int[2];
        }
        int[] iArr = this.f767;
        float f = this.f769;
        View view = this.f766;
        iArr[0] = Math.round(view.getTranslationX() + f);
        this.f767[1] = Math.round(view.getTranslationY() + this.f773);
        this.f770.setTag(R.id._2_res_0x7f0b03a7, this.f767);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        View view = this.f766;
        this.f771 = view.getTranslationX();
        this.f772 = view.getTranslationY();
        view.setTranslationX(this.f768);
        view.setTranslationY(this.f774);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        float f = this.f771;
        View view = this.f766;
        view.setTranslationX(f);
        view.setTranslationY(this.f772);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        float f = this.f768;
        View view = this.f766;
        view.setTranslationX(f);
        view.setTranslationY(this.f774);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
    }
}
