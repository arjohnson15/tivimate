package p378;

import android.view.animation.Interpolator;

/* renamed from: ᵢٴ.ᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4380 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public float f16883;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Interpolator f16884;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f16885;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final long f16886;

    public AbstractC4380(int i, Interpolator interpolator, long j) {
        this.f16885 = i;
        this.f16884 = interpolator;
        this.f16886 = j;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public float mo9962() {
        Interpolator interpolator = this.f16884;
        return interpolator != null ? interpolator.getInterpolation(this.f16883) : this.f16883;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int mo9963() {
        return this.f16885;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public long mo9964() {
        return this.f16886;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public void mo9965(float f) {
        this.f16883 = f;
    }
}
