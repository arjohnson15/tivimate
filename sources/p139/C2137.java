package p139;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import p200.C2741;
import p378.C4382;
import p378.C4394;
import p378.InterfaceC4360;

/* renamed from: ˉˋ.ˑי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2137 extends AnimatorListenerAdapter {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ Object f8393;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ Object f8394;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f8395;

    public /* synthetic */ C2137(Object obj, View view, int i) {
        this.f8395 = i;
        this.f8393 = obj;
        this.f8394 = view;
    }

    public C2137(AbstractC2160 abstractC2160, C2741 c2741) {
        this.f8395 = 0;
        this.f8394 = abstractC2160;
        this.f8393 = c2741;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f8395) {
            case 1:
                ((InterfaceC4360) this.f8393).m9937();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f8395) {
            case 0:
                ((C2741) this.f8393).remove(animator);
                ((AbstractC2160) this.f8394).f8479.remove(animator);
                break;
            case 1:
                ((InterfaceC4360) this.f8393).m9936();
                break;
            default:
                ((C4394) this.f8393).f16922.mo9965(1.0f);
                C4382.m9966((View) this.f8394);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f8395) {
            case 0:
                ((AbstractC2160) this.f8394).f8479.add(animator);
                break;
            case 1:
                ((InterfaceC4360) this.f8393).m9935();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
