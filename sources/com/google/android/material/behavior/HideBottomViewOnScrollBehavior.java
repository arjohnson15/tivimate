package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.leanback.widget.C0168;
import com.google.android.gms.internal.play_billing.ˎˑ;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.lsposed.hiddenapibypass.library.R;
import p219.AbstractC2840;
import p315.AbstractC3608;

/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends AbstractC3608 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f3125;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public TimeInterpolator f3126;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public ViewPropertyAnimator f3127;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f3128;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final LinkedHashSet f3129 = new LinkedHashSet();

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public int f3130 = 0;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public int f3131 = 2;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public TimeInterpolator f3132;

    public HideBottomViewOnScrollBehavior() {
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }

    @Override // p315.AbstractC3608
    /* renamed from: ˏʾ */
    public final void mo2793(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        LinkedHashSet linkedHashSet = this.f3129;
        if (i > 0) {
            if (this.f3131 == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f3127;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f3131 = 1;
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            this.f3127 = view.animate().translationY(this.f3130).setInterpolator(this.f3126).setDuration(this.f3128).setListener(new C0168(4, this));
            return;
        }
        if (i >= 0 || this.f3131 == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.f3127;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.f3131 = 2;
        Iterator it2 = linkedHashSet.iterator();
        if (it2.hasNext()) {
            it2.next().getClass();
            throw new ClassCastException();
        }
        this.f3127 = view.animate().translationY(0).setInterpolator(this.f3132).setDuration(this.f3125).setListener(new C0168(4, this));
    }

    @Override // p315.AbstractC3608
    /* renamed from: ˏᴵ */
    public boolean mo2794(View view, int i, int i2) {
        return i == 2;
    }

    @Override // p315.AbstractC3608
    /* renamed from: ᐧʻ */
    public boolean mo2798(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f3130 = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f3125 = ˎˑ.ᵎˏ(view.getContext(), R.attr._2_res_0x7f040404, 225);
        this.f3128 = ˎˑ.ᵎˏ(view.getContext(), R.attr._2_res_0x7f04040a, 175);
        this.f3132 = ˎˑ.ﹳˎ(view.getContext(), R.attr._2_res_0x7f040414, AbstractC2840.f11004);
        this.f3126 = ˎˑ.ﹳˎ(view.getContext(), R.attr._2_res_0x7f040414, AbstractC2840.f11002);
        return false;
    }
}
