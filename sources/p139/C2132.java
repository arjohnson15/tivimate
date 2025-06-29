package p139;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.lsposed.hiddenapibypass.library.R;

/* renamed from: ˉˋ.ˎᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2132 extends AnimatorListenerAdapter implements InterfaceC2121 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final View f8383;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2117 f8384;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final View f8385;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ViewGroup f8386;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public boolean f8387 = true;

    public C2132(AbstractC2117 abstractC2117, ViewGroup viewGroup, View view, View view2) {
        this.f8384 = abstractC2117;
        this.f8386 = viewGroup;
        this.f8383 = view;
        this.f8385 = view2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        m6031();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        m6031();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f8386.getOverlay().remove(this.f8383);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f8383;
        if (view.getParent() == null) {
            this.f8386.getOverlay().add(view);
        } else {
            this.f8384.cancel();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            View view = this.f8385;
            View view2 = this.f8383;
            view.setTag(R.id._2_res_0x7f0b0321, view2);
            this.f8386.getOverlay().add(view2);
            this.f8387 = true;
        }
    }

    @Override // p139.InterfaceC2121
    /* renamed from: ʽᐧ */
    public final void mo5988() {
    }

    @Override // p139.InterfaceC2121
    /* renamed from: ʿʼ */
    public final void mo5989() {
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final void m6031() {
        this.f8385.setTag(R.id._2_res_0x7f0b0321, null);
        this.f8386.getOverlay().remove(this.f8383);
        this.f8387 = false;
    }

    @Override // p139.InterfaceC2121
    /* renamed from: ˑʽ */
    public final void mo5990(AbstractC2160 abstractC2160) {
        if (this.f8387) {
            m6031();
        }
    }

    @Override // p139.InterfaceC2121
    /* renamed from: ـﹶ */
    public final void mo5991(AbstractC2160 abstractC2160) {
        abstractC2160.mo6019(this);
    }

    @Override // p139.InterfaceC2121
    /* renamed from: ٴˎ */
    public final void mo5992(AbstractC2160 abstractC2160) {
        abstractC2160.mo6019(this);
    }

    @Override // p139.InterfaceC2121
    /* renamed from: ᐧʻ */
    public final void mo5993(AbstractC2160 abstractC2160) {
    }

    @Override // p139.InterfaceC2121
    /* renamed from: ﹳﹳ */
    public final void mo5994(AbstractC2160 abstractC2160) {
        throw null;
    }
}
