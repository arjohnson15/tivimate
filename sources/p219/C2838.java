package p219;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import p200.C2755;

/* renamed from: ˏـ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2838 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C2755 f10995 = new C2755(0);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C2755 f10994 = new C2755(0);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static C2838 m7109(ArrayList arrayList) {
        C2838 c2838 = new C2838();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c2838.f10994.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = AbstractC2840.f11001;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = AbstractC2840.f11002;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = AbstractC2840.f11004;
            }
            C2839 c2839 = new C2839();
            c2839.f11000 = 0;
            c2839.f10997 = 1;
            c2839.f10999 = startDelay;
            c2839.f10996 = duration;
            c2839.f10998 = interpolator;
            c2839.f11000 = objectAnimator.getRepeatCount();
            c2839.f10997 = objectAnimator.getRepeatMode();
            c2838.f10995.put(propertyName, c2839);
        }
        return c2838;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C2838 m7110(Context context, int i) throws Resources.NotFoundException {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return m7109(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return m7109(arrayList);
        } catch (Exception e) {
            String str = "Can't load animation resource ID #0x" + Integer.toHexString(i);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2838) {
            return this.f10995.equals(((C2838) obj).f10995);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10995.hashCode();
    }

    public final String toString() {
        return "\n" + C2838.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f10995 + "}\n";
    }
}
