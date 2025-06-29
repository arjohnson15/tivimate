package p357;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import p222.C2900;

/* renamed from: ᵔˎ.ˏᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4058 extends AnimatorListenerAdapter {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ TextView f15634;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final /* synthetic */ C4061 f15635;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ int f15636;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f15637;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final /* synthetic */ TextView f15638;

    public C4058(C4061 c4061, int i, TextView textView, int i2, TextView textView2) {
        this.f15635 = c4061;
        this.f15637 = i;
        this.f15634 = textView;
        this.f15636 = i2;
        this.f15638 = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C2900 c2900;
        int i = this.f15637;
        C4061 c4061 = this.f15635;
        c4061.f15668 = i;
        c4061.f15654 = null;
        TextView textView = this.f15634;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f15636 == 1 && (c2900 = c4061.f15657) != null) {
                c2900.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f15638;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f15638;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
