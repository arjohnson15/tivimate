package p142;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;
import ﹶⁱ.ـﹶ;

/* renamed from: ˉי.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2222 extends ـﹶ {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final boolean f8833;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final ObjectAnimator f8834;

    public C2222(AnimationDrawable animationDrawable, boolean z, boolean z2) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i = z ? numberOfFrames - 1 : 0;
        int i2 = z ? 0 : numberOfFrames - 1;
        C2225 c2225 = new C2225();
        int numberOfFrames2 = animationDrawable.getNumberOfFrames();
        c2225.f8850 = numberOfFrames2;
        int[] iArr = c2225.f8852;
        if (iArr == null || iArr.length < numberOfFrames2) {
            c2225.f8852 = new int[numberOfFrames2];
        }
        int[] iArr2 = c2225.f8852;
        int i3 = 0;
        for (int i4 = 0; i4 < numberOfFrames2; i4++) {
            int duration = animationDrawable.getDuration(z ? (numberOfFrames2 - i4) - 1 : i4);
            iArr2[i4] = duration;
            i3 += duration;
        }
        c2225.f8851 = i3;
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
        objectAnimatorOfInt.setAutoCancel(true);
        objectAnimatorOfInt.setDuration(c2225.f8851);
        objectAnimatorOfInt.setInterpolator(c2225);
        this.f8833 = z2;
        this.f8834 = objectAnimatorOfInt;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean m6199() {
        return this.f8833;
    }

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final void m6200() {
        this.f8834.start();
    }

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final void m6201() {
        this.f8834.cancel();
    }

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final void m6202() {
        this.f8834.reverse();
    }
}
