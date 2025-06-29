package androidx.leanback.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.media.session.AbstractC0001;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import com.google.android.gms.internal.play_billing.ˎˑ;
import p348.AbstractC3996;

/* loaded from: classes.dex */
public class FadeAndShortSlide extends Visibility {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public Visibility f737;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public float f738;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final C0125 f739;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public AbstractC0001 f740;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static final DecelerateInterpolator f731 = new DecelerateInterpolator();

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public static final C0122 f735 = new C0122(0);

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public static final C0122 f736 = new C0122(1);

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public static final C0122 f732 = new C0122(2);

    /* renamed from: ـˆ, reason: contains not printable characters */
    public static final C0122 f733 = new C0122(3);

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public static final C0122 f734 = new C0122(4);

    public FadeAndShortSlide(int i) {
        this.f737 = new Fade();
        this.f738 = -1.0f;
        this.f739 = new C0125(this);
        m770(i);
    }

    public FadeAndShortSlide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f737 = new Fade();
        this.f738 = -1.0f;
        this.f739 = new C0125(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3996.f15428);
        m770(typedArrayObtainStyledAttributes.getInt(3, 8388611));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.transition.Transition
    public final Transition addListener(Transition.TransitionListener transitionListener) {
        this.f737.addListener(transitionListener);
        return super.addListener(transitionListener);
    }

    @Override // android.transition.Visibility, android.transition.Transition
    public final void captureEndValues(TransitionValues transitionValues) {
        this.f737.captureEndValues(transitionValues);
        super.captureEndValues(transitionValues);
        int[] iArr = new int[2];
        transitionValues.view.getLocationOnScreen(iArr);
        transitionValues.values.put("android:fadeAndShortSlideTransition:screenPosition", iArr);
    }

    @Override // android.transition.Visibility, android.transition.Transition
    public final void captureStartValues(TransitionValues transitionValues) {
        this.f737.captureStartValues(transitionValues);
        super.captureStartValues(transitionValues);
        int[] iArr = new int[2];
        transitionValues.view.getLocationOnScreen(iArr);
        transitionValues.values.put("android:fadeAndShortSlideTransition:screenPosition", iArr);
    }

    @Override // android.transition.Transition
    public final Transition clone() {
        FadeAndShortSlide fadeAndShortSlide = (FadeAndShortSlide) super.clone();
        fadeAndShortSlide.f737 = (Visibility) this.f737.clone();
        return fadeAndShortSlide;
    }

    @Override // android.transition.Visibility
    public final Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues2 == null || viewGroup == view) {
            return null;
        }
        int[] iArr = (int[]) transitionValues2.values.get("android:fadeAndShortSlideTransition:screenPosition");
        int i = iArr[0];
        int i2 = iArr[1];
        float translationX = view.getTranslationX();
        ObjectAnimator objectAnimator = ˎˑ.ᐧʻ(view, transitionValues2, i, i2, this.f740.mo33(this, viewGroup, view, iArr), this.f740.mo29(this, viewGroup, view, iArr), translationX, view.getTranslationY(), f731, this);
        Animator animatorOnAppear = this.f737.onAppear(viewGroup, view, transitionValues, transitionValues2);
        if (objectAnimator == null) {
            return animatorOnAppear;
        }
        if (animatorOnAppear == null) {
            return objectAnimator;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimator).with(animatorOnAppear);
        return animatorSet;
    }

    @Override // android.transition.Visibility
    public final Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null || viewGroup == view) {
            return null;
        }
        int[] iArr = (int[]) transitionValues.values.get("android:fadeAndShortSlideTransition:screenPosition");
        ObjectAnimator objectAnimator = ˎˑ.ᐧʻ(view, transitionValues, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.f740.mo33(this, viewGroup, view, iArr), this.f740.mo29(this, viewGroup, view, iArr), f731, this);
        Animator animatorOnDisappear = this.f737.onDisappear(viewGroup, view, transitionValues, transitionValues2);
        if (objectAnimator == null) {
            return animatorOnDisappear;
        }
        if (animatorOnDisappear == null) {
            return objectAnimator;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimator).with(animatorOnDisappear);
        return animatorSet;
    }

    @Override // android.transition.Transition
    public final Transition removeListener(Transition.TransitionListener transitionListener) {
        this.f737.removeListener(transitionListener);
        return super.removeListener(transitionListener);
    }

    @Override // android.transition.Transition
    public final void setEpicenterCallback(Transition.EpicenterCallback epicenterCallback) {
        this.f737.setEpicenterCallback(epicenterCallback);
        super.setEpicenterCallback(epicenterCallback);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final float m769(ViewGroup viewGroup) {
        float f = this.f738;
        return f >= 0.0f ? f : viewGroup.getWidth() / 4;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m770(int i) {
        if (i == 48) {
            this.f740 = f734;
            return;
        }
        if (i == 80) {
            this.f740 = f733;
            return;
        }
        if (i == 112) {
            this.f740 = this.f739;
            return;
        }
        if (i == 8388611) {
            this.f740 = f735;
        } else if (i == 8388613) {
            this.f740 = f736;
        } else {
            if (i != 8388615) {
                throw new IllegalArgumentException("Invalid slide direction");
            }
            this.f740 = f732;
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final float m771(ViewGroup viewGroup) {
        float f = this.f738;
        return f >= 0.0f ? f : viewGroup.getHeight() / 4;
    }
}
