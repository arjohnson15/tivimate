package p061;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: ʾـ.ᵎˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1415 extends AnimatorListenerAdapter {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC1375 f5773;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final /* synthetic */ C1438 f5774;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ View f5775;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f5776 = 1;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final /* synthetic */ ViewPropertyAnimator f5777;

    public C1415(C1438 c1438, AbstractC1375 abstractC1375, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f5774 = c1438;
        this.f5773 = abstractC1375;
        this.f5775 = view;
        this.f5777 = viewPropertyAnimator;
    }

    public C1415(C1438 c1438, AbstractC1375 abstractC1375, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f5774 = c1438;
        this.f5773 = abstractC1375;
        this.f5777 = viewPropertyAnimator;
        this.f5775 = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f5776) {
            case 1:
                this.f5775.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5776) {
            case 0:
                this.f5777.setListener(null);
                this.f5775.setAlpha(1.0f);
                C1438 c1438 = this.f5774;
                AbstractC1375 abstractC1375 = this.f5773;
                c1438.m4753(abstractC1375);
                c1438.f5891.remove(abstractC1375);
                c1438.m4974();
                break;
            default:
                this.f5777.setListener(null);
                C1438 c14382 = this.f5774;
                AbstractC1375 abstractC13752 = this.f5773;
                c14382.m4753(abstractC13752);
                c14382.f5895.remove(abstractC13752);
                c14382.m4974();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f5776) {
            case 0:
                this.f5774.getClass();
                break;
            default:
                this.f5774.getClass();
                break;
        }
    }
}
