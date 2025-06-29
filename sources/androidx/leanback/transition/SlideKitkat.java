package androidx.leanback.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import org.lsposed.hiddenapibypass.library.R;
import p348.AbstractC3996;

/* loaded from: classes.dex */
class SlideKitkat extends Visibility {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final InterfaceC0127 f749;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final DecelerateInterpolator f741 = new DecelerateInterpolator();

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static final AccelerateInterpolator f744 = new AccelerateInterpolator();

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static final C0129 f746 = new C0129(0);

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static final C0123 f742 = new C0123(0);

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public static final C0129 f747 = new C0129(1);

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public static final C0123 f748 = new C0123(1);

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public static final C0129 f743 = new C0129(2);

    /* renamed from: ـˆ, reason: contains not printable characters */
    public static final C0129 f745 = new C0129(3);

    public SlideKitkat(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3996.f15428);
        int i = typedArrayObtainStyledAttributes.getInt(3, 80);
        if (i == 3) {
            this.f749 = f746;
        } else if (i == 5) {
            this.f749 = f747;
        } else if (i == 48) {
            this.f749 = f742;
        } else if (i == 80) {
            this.f749 = f748;
        } else if (i == 8388611) {
            this.f749 = f743;
        } else {
            if (i != 8388613) {
                throw new IllegalArgumentException("Invalid slide direction");
            }
            this.f749 = f745;
        }
        long j = typedArrayObtainStyledAttributes.getInt(1, -1);
        if (j >= 0) {
            setDuration(j);
        }
        long j2 = typedArrayObtainStyledAttributes.getInt(2, -1);
        if (j2 > 0) {
            setStartDelay(j2);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId > 0) {
            setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static ObjectAnimator m772(View view, Property property, float f, float f2, float f3, TimeInterpolator timeInterpolator, int i) {
        float[] fArr = (float[]) view.getTag(R.id._2_res_0x7f0b0249);
        if (fArr != null) {
            f = View.TRANSLATION_Y == property ? fArr[1] : fArr[0];
            view.setTag(R.id._2_res_0x7f0b0249, null);
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, f, f2);
        C0128 c0128 = new C0128(view, property, f3, f2, i);
        objectAnimatorOfFloat.addListener(c0128);
        objectAnimatorOfFloat.addPauseListener(c0128);
        objectAnimatorOfFloat.setInterpolator(timeInterpolator);
        return objectAnimatorOfFloat;
    }

    @Override // android.transition.Visibility
    public final Animator onAppear(ViewGroup viewGroup, TransitionValues transitionValues, int i, TransitionValues transitionValues2, int i2) {
        View view = transitionValues2 != null ? transitionValues2.view : null;
        if (view == null) {
            return null;
        }
        float fM778 = this.f749.m778(view);
        return m772(view, this.f749.m779(), this.f749.m780(view), fM778, fM778, f741, 0);
    }

    @Override // android.transition.Visibility
    public final Animator onDisappear(ViewGroup viewGroup, TransitionValues transitionValues, int i, TransitionValues transitionValues2, int i2) {
        View view = transitionValues != null ? transitionValues.view : null;
        if (view == null) {
            return null;
        }
        float fM778 = this.f749.m778(view);
        return m772(view, this.f749.m779(), fM778, this.f749.m780(view), fM778, f744, 4);
    }
}
