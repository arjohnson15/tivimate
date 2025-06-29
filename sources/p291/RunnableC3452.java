package p291;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import p378.ViewTreeObserverOnPreDrawListenerC4351;

/* renamed from: ٴᐧ.ﹳˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC3452 extends AnimationSet implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final View f13369;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public boolean f13370;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public boolean f13371;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public boolean f13372;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final ViewGroup f13373;

    public RunnableC3452(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f13370 = true;
        this.f13373 = viewGroup;
        this.f13369 = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.f13370 = true;
        if (this.f13371) {
            return !this.f13372;
        }
        if (!super.getTransformation(j, transformation)) {
            this.f13371 = true;
            ViewTreeObserverOnPreDrawListenerC4351.m9908(this.f13373, this);
        }
        return true;
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f) {
        this.f13370 = true;
        if (this.f13371) {
            return !this.f13372;
        }
        if (!super.getTransformation(j, transformation, f)) {
            this.f13371 = true;
            ViewTreeObserverOnPreDrawListenerC4351.m9908(this.f13373, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.f13371;
        ViewGroup viewGroup = this.f13373;
        if (z || !this.f13370) {
            viewGroup.endViewTransition(this.f13369);
            this.f13372 = true;
        } else {
            this.f13370 = false;
            viewGroup.post(this);
        }
    }
}
