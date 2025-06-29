package p061;

import android.view.animation.Interpolator;

/* renamed from: ʾـ.ˋﾞ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class InterpolatorC1381 implements Interpolator {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f5645;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        switch (this.f5645) {
            case 0:
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            default:
                float f3 = f - 1.0f;
                return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    }
}
