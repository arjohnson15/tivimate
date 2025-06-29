package p061;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: ʾـ.ﹳˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1430 extends AnimatorListenerAdapter {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ C1367 f5854;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final /* synthetic */ C1438 f5855;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ ViewPropertyAnimator f5856;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f5857;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final /* synthetic */ View f5858;

    public /* synthetic */ C1430(C1438 c1438, C1367 c1367, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.f5857 = i;
        this.f5855 = c1438;
        this.f5854 = c1367;
        this.f5856 = viewPropertyAnimator;
        this.f5858 = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5857) {
            case 0:
                this.f5856.setListener(null);
                View view = this.f5858;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                C1367 c1367 = this.f5854;
                AbstractC1375 abstractC1375 = c1367.f5550;
                C1438 c1438 = this.f5855;
                c1438.m4753(abstractC1375);
                c1438.f5898.remove(c1367.f5550);
                c1438.m4974();
                break;
            default:
                this.f5856.setListener(null);
                View view2 = this.f5858;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                C1367 c13672 = this.f5854;
                AbstractC1375 abstractC13752 = c13672.f5547;
                C1438 c14382 = this.f5855;
                c14382.m4753(abstractC13752);
                c14382.f5898.remove(c13672.f5547);
                c14382.m4974();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f5857) {
            case 0:
                AbstractC1375 abstractC1375 = this.f5854.f5550;
                this.f5855.getClass();
                break;
            default:
                AbstractC1375 abstractC13752 = this.f5854.f5547;
                this.f5855.getClass();
                break;
        }
    }
}
