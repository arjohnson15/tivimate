package p139;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import p395.AbstractC4535;

/* renamed from: ˉˋ.ᵢٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2153 extends AnimatorListenerAdapter implements InterfaceC2121 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f8428;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public boolean f8429;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final ViewGroup f8430;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final View f8431;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public boolean f8432 = false;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final boolean f8433 = true;

    public C2153(View view, int i) {
        this.f8431 = view;
        this.f8428 = i;
        this.f8430 = (ViewGroup) view.getParent();
        m6069(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f8432 = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f8432) {
            AbstractC2157.m6072(this.f8431, this.f8428);
            ViewGroup viewGroup = this.f8430;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        m6069(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        if (!this.f8432) {
            AbstractC2157.m6072(this.f8431, this.f8428);
            ViewGroup viewGroup = this.f8430;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        m6069(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            AbstractC2157.m6072(this.f8431, 0);
            ViewGroup viewGroup = this.f8430;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // p139.InterfaceC2121
    /* renamed from: ʽᐧ */
    public final void mo5988() {
        m6069(false);
        if (this.f8432) {
            return;
        }
        AbstractC2157.m6072(this.f8431, this.f8428);
    }

    @Override // p139.InterfaceC2121
    /* renamed from: ʿʼ */
    public final void mo5989() {
        m6069(true);
        if (this.f8432) {
            return;
        }
        AbstractC2157.m6072(this.f8431, 0);
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final void m6069(boolean z) {
        ViewGroup viewGroup;
        if (!this.f8433 || this.f8429 == z || (viewGroup = this.f8430) == null) {
            return;
        }
        this.f8429 = z;
        AbstractC4535.m10321(viewGroup, z);
    }

    @Override // p139.InterfaceC2121
    /* renamed from: ˑʽ */
    public final void mo5990(AbstractC2160 abstractC2160) {
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
