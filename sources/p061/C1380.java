package p061;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: ʾـ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1380 extends AnimatorListenerAdapter {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ C1409 f5640;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final /* synthetic */ C1438 f5641;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ ViewPropertyAnimator f5642;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f5643;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final /* synthetic */ View f5644;

    public /* synthetic */ C1380(C1438 c1438, C1409 c1409, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.f5643 = i;
        this.f5641 = c1438;
        this.f5640 = c1409;
        this.f5642 = viewPropertyAnimator;
        this.f5644 = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5643) {
            case 0:
                this.f5642.setListener(null);
                View view = this.f5644;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                C1409 c1409 = this.f5640;
                AbstractC1375 abstractC1375 = c1409.f5757;
                C1438 c1438 = this.f5641;
                c1438.m4753(abstractC1375);
                c1438.f5898.remove(c1409.f5757);
                c1438.m4974();
                break;
            default:
                this.f5642.setListener(null);
                View view2 = this.f5644;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                C1409 c14092 = this.f5640;
                AbstractC1375 abstractC13752 = c14092.f5754;
                C1438 c14382 = this.f5641;
                c14382.m4753(abstractC13752);
                c14382.f5898.remove(c14092.f5754);
                c14382.m4974();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f5643) {
            case 0:
                AbstractC1375 abstractC1375 = this.f5640.f5757;
                this.f5641.getClass();
                break;
            default:
                AbstractC1375 abstractC13752 = this.f5640.f5754;
                this.f5641.getClass();
                break;
        }
    }
}
