package p357;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: ᵔˎ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4049 extends AnimatorListenerAdapter {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ C4060 f15581;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f15582;

    public /* synthetic */ C4049(C4060 c4060, int i) {
        this.f15582 = i;
        this.f15581 = c4060;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f15582) {
            case 1:
                this.f15581.f15682.m9333(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f15582) {
            case 0:
                this.f15581.f15682.m9333(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
