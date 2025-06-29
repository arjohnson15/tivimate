package p061;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: ʾـ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1374 extends AnimatorListenerAdapter {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC1375 f5599;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final /* synthetic */ int f5600;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ int f5601;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f5602;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final /* synthetic */ ViewPropertyAnimator f5603;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final /* synthetic */ C1438 f5604;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final /* synthetic */ View f5605;

    public /* synthetic */ C1374(C1438 c1438, AbstractC1375 abstractC1375, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator, int i3) {
        this.f5602 = i3;
        this.f5604 = c1438;
        this.f5599 = abstractC1375;
        this.f5601 = i;
        this.f5605 = view;
        this.f5600 = i2;
        this.f5603 = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f5602) {
            case 0:
                int i = this.f5601;
                View view = this.f5605;
                if (i != 0) {
                    view.setTranslationX(0.0f);
                }
                if (this.f5600 != 0) {
                    view.setTranslationY(0.0f);
                    break;
                }
                break;
            default:
                int i2 = this.f5601;
                View view2 = this.f5605;
                if (i2 != 0) {
                    view2.setTranslationX(0.0f);
                }
                if (this.f5600 != 0) {
                    view2.setTranslationY(0.0f);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5602) {
            case 0:
                this.f5603.setListener(null);
                C1438 c1438 = this.f5604;
                AbstractC1375 abstractC1375 = this.f5599;
                c1438.m4753(abstractC1375);
                c1438.f5899.remove(abstractC1375);
                c1438.m4974();
                break;
            default:
                this.f5603.setListener(null);
                C1438 c14382 = this.f5604;
                AbstractC1375 abstractC13752 = this.f5599;
                c14382.m4753(abstractC13752);
                c14382.f5899.remove(abstractC13752);
                c14382.m4974();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f5602) {
            case 0:
                this.f5604.getClass();
                break;
            default:
                this.f5604.getClass();
                break;
        }
    }
}
