package androidx.leanback.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.media3.ui.AspectRatioFrameLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.util.ArrayList;
import p131.C2061;
import p139.AbstractC2160;
import p189.C2641;
import p189.C2642;
import p357.C4052;

/* renamed from: androidx.leanback.widget.ˑⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0168 extends AnimatorListenerAdapter {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ Object f1126;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f1127;

    public /* synthetic */ C0168(int i, Object obj) {
        this.f1127 = i;
        this.f1126 = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f1127) {
            case 3:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f1126;
                actionBarOverlayLayout.f114 = null;
                actionBarOverlayLayout.f123 = false;
                break;
            case 4:
            default:
                super.onAnimationCancel(animator);
                break;
            case 5:
                ((AspectRatioFrameLayout) this.f1126).f1451 = null;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f1127) {
            case 0:
                ((C0193) this.f1126).f1176 = null;
                break;
            case 1:
                C2061 c2061 = (C2061) this.f1126;
                ArrayList arrayList = new ArrayList(c2061.f7803);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ColorStateList colorStateList = ((C2642) arrayList.get(i)).f10478.f10474;
                    if (colorStateList != null) {
                        c2061.setTintList(colorStateList);
                    }
                }
                break;
            case 2:
                ((AbstractC2160) this.f1126).m6084();
                animator.removeListener(this);
                break;
            case 3:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f1126;
                actionBarOverlayLayout.f114 = null;
                actionBarOverlayLayout.f123 = false;
                break;
            case 4:
                ((HideBottomViewOnScrollBehavior) this.f1126).f3127 = null;
                break;
            case 5:
                ((AspectRatioFrameLayout) this.f1126).f1451 = null;
                break;
            default:
                C4052 c4052 = (C4052) this.f1126;
                c4052.m9361();
                c4052.f15591.start();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f1127) {
            case 1:
                C2061 c2061 = (C2061) this.f1126;
                ArrayList arrayList = new ArrayList(c2061.f7803);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    C2641 c2641 = ((C2642) arrayList.get(i)).f10478;
                    ColorStateList colorStateList = c2641.f10474;
                    if (colorStateList != null) {
                        c2061.setTint(colorStateList.getColorForState(c2641.f10471, colorStateList.getDefaultColor()));
                    }
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
