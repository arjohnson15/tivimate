package p272;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: ـᐧ.ﾞˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3340 extends AnimatorListenerAdapter {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ C3328 f13062;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ C3339 f13063;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f13064;

    public /* synthetic */ C3340(C3339 c3339, C3328 c3328, int i) {
        this.f13064 = i;
        this.f13063 = c3339;
        this.f13062 = c3328;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f13064) {
            case 0:
                C3339 c3339 = this.f13063;
                c3339.m8172(1);
                if (c3339.f13052) {
                    this.f13062.post(c3339.f13054);
                    c3339.f13052 = false;
                    break;
                }
                break;
            case 1:
                C3339 c33392 = this.f13063;
                c33392.m8172(2);
                if (c33392.f13052) {
                    this.f13062.post(c33392.f13054);
                    c33392.f13052 = false;
                    break;
                }
                break;
            default:
                C3339 c33393 = this.f13063;
                c33393.m8172(2);
                if (c33393.f13052) {
                    this.f13062.post(c33393.f13054);
                    c33393.f13052 = false;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f13064) {
            case 0:
                this.f13063.m8172(3);
                break;
            case 1:
                this.f13063.m8172(3);
                break;
            default:
                this.f13063.m8172(3);
                break;
        }
    }
}
