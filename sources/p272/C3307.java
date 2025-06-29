package p272;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.ui.DefaultTimeBar;

/* renamed from: ـᐧ.ˋˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3307 extends AnimatorListenerAdapter {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ C3339 f12859;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f12860;

    public /* synthetic */ C3307(C3339 c3339, int i) {
        this.f12860 = i;
        this.f12859 = c3339;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f12860) {
            case 0:
                C3339 c3339 = this.f12859;
                View view = c3339.f13033;
                if (view != null) {
                    view.setVisibility(4);
                }
                ViewGroup viewGroup = c3339.f13046;
                if (viewGroup != null) {
                    viewGroup.setVisibility(4);
                }
                ViewGroup viewGroup2 = c3339.f13034;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(4);
                    break;
                }
                break;
            case 1:
            default:
                super.onAnimationEnd(animator);
                break;
            case 2:
                this.f12859.m8172(0);
                break;
            case 3:
                this.f12859.m8172(0);
                break;
            case 4:
                ViewGroup viewGroup3 = this.f12859.f13050;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(4);
                    break;
                }
                break;
            case 5:
                ViewGroup viewGroup4 = this.f12859.f13045;
                if (viewGroup4 != null) {
                    viewGroup4.setVisibility(4);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        C3339 c3339 = this.f12859;
        switch (this.f12860) {
            case 0:
                View view = c3339.f13038;
                if ((view instanceof DefaultTimeBar) && !c3339.f13037) {
                    DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view;
                    ValueAnimator valueAnimator = defaultTimeBar.f1480;
                    if (valueAnimator.isStarted()) {
                        valueAnimator.cancel();
                    }
                    valueAnimator.setFloatValues(defaultTimeBar.f1481, 0.0f);
                    valueAnimator.setDuration(250L);
                    valueAnimator.start();
                    break;
                }
                break;
            case 1:
                View view2 = c3339.f13033;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                ViewGroup viewGroup = c3339.f13046;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                }
                ViewGroup viewGroup2 = c3339.f13034;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(c3339.f13037 ? 0 : 4);
                }
                View view3 = c3339.f13038;
                if ((view3 instanceof DefaultTimeBar) && !c3339.f13037) {
                    DefaultTimeBar defaultTimeBar2 = (DefaultTimeBar) view3;
                    ValueAnimator valueAnimator2 = defaultTimeBar2.f1480;
                    if (valueAnimator2.isStarted()) {
                        valueAnimator2.cancel();
                    }
                    defaultTimeBar2.f1479 = false;
                    valueAnimator2.setFloatValues(defaultTimeBar2.f1481, 1.0f);
                    valueAnimator2.setDuration(250L);
                    valueAnimator2.start();
                    break;
                }
                break;
            case 2:
                c3339.m8172(4);
                break;
            case 3:
                c3339.m8172(4);
                break;
            case 4:
                ViewGroup viewGroup3 = c3339.f13045;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(0);
                    c3339.f13045.setTranslationX(r9.getWidth());
                    ViewGroup viewGroup4 = c3339.f13045;
                    viewGroup4.scrollTo(viewGroup4.getWidth(), 0);
                    break;
                }
                break;
            default:
                ViewGroup viewGroup5 = c3339.f13050;
                if (viewGroup5 != null) {
                    viewGroup5.setVisibility(0);
                    break;
                }
                break;
        }
    }
}
