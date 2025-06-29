package androidx.leanback.transition;

import android.animation.Animator;
import android.transition.ChangeBounds;
import android.transition.TransitionValues;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* renamed from: androidx.leanback.transition.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0126 extends ChangeBounds {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final HashMap f757 = new HashMap();

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final SparseIntArray f755 = new SparseIntArray();

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final HashMap f756 = new HashMap();

    @Override // android.transition.ChangeBounds, android.transition.Transition
    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        View view;
        int iIntValue;
        Animator animatorCreateAnimator = super.createAnimator(viewGroup, transitionValues, transitionValues2);
        if (animatorCreateAnimator != null && transitionValues2 != null && (view = transitionValues2.view) != null) {
            Integer num = (Integer) this.f757.get(view);
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                int i = this.f755.get(view.getId(), -1);
                if (i != -1) {
                    iIntValue = i;
                } else {
                    Integer num2 = (Integer) this.f756.get(view.getClass().getName());
                    iIntValue = num2 != null ? num2.intValue() : 0;
                }
            }
            animatorCreateAnimator.setStartDelay(iIntValue);
        }
        return animatorCreateAnimator;
    }
}
