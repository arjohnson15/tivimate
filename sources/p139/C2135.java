package p139;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.lsposed.hiddenapibypass.library.R;
import ᵔᵔ.ٴˎ;

/* renamed from: ˉˋ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2135 extends AnimatorListenerAdapter implements InterfaceC2121 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public boolean f8388 = false;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final View f8389;

    public C2135(View view) {
        this.f8389 = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        AbstractC2157.f8452.ﾞˊ(this.f8389, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        boolean z2 = this.f8388;
        View view = this.f8389;
        if (z2) {
            view.setLayerType(0, null);
        }
        if (z) {
            return;
        }
        ٴˎ r3 = AbstractC2157.f8452;
        r3.ﾞˊ(view, 1.0f);
        r3.getClass();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f8389;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f8388 = true;
            view.setLayerType(2, null);
        }
    }

    @Override // p139.InterfaceC2121
    /* renamed from: ʽᐧ */
    public final void mo5988() {
        View view = this.f8389;
        view.setTag(R.id._2_res_0x7f0b03ae, Float.valueOf(view.getVisibility() == 0 ? AbstractC2157.f8452.ᴵʿ(view) : 0.0f));
    }

    @Override // p139.InterfaceC2121
    /* renamed from: ʿʼ */
    public final void mo5989() {
        this.f8389.setTag(R.id._2_res_0x7f0b03ae, null);
    }

    @Override // p139.InterfaceC2121
    /* renamed from: ˑʽ */
    public final void mo5990(AbstractC2160 abstractC2160) {
    }

    @Override // p139.InterfaceC2121
    /* renamed from: ـﹶ */
    public final void mo5991(AbstractC2160 abstractC2160) {
        throw null;
    }

    @Override // p139.InterfaceC2121
    /* renamed from: ٴˎ */
    public final void mo5992(AbstractC2160 abstractC2160) {
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
