package p061;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import p361.C4098;
import p361.C4105;

/* renamed from: ʾـ.ᐧˋ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1405 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ Object f5736;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f5737;

    public /* synthetic */ C1405(int i, Object obj) {
        this.f5737 = i;
        this.f5736 = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5737) {
            case 0:
                int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                C1368 c1368 = (C1368) this.f5736;
                c1368.f5567.setAlpha(iFloatValue);
                c1368.f5579.setAlpha(iFloatValue);
                c1368.f5575.invalidate();
                break;
            case 1:
                ((TextInputLayout) this.f5736).f3409.m7120(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C4105 c4105 = ((BottomSheetBehavior) this.f5736).f3193;
                if (c4105 != null) {
                    C4098 c4098 = c4105.f15848;
                    if (c4098.f15809 != fFloatValue) {
                        c4098.f15809 = fFloatValue;
                        c4105.f15867 = true;
                        c4105.f15870 = true;
                        c4105.invalidateSelf();
                        break;
                    }
                }
                break;
        }
    }
}
