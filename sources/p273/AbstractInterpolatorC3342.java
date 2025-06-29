package p273;

import android.view.animation.Interpolator;
import ᵎﹳ.ᐧʻ;

/* renamed from: ـᵎ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractInterpolatorC3342 implements Interpolator {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final float f13101;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final float[] f13102;

    public AbstractInterpolatorC3342(float[] fArr) {
        this.f13102 = fArr;
        this.f13101 = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f13102;
        int iMin = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f2 = this.f13101;
        float f3 = (f - (iMin * f2)) / f2;
        float f4 = fArr[iMin];
        return ᐧʻ.ﹶˆ(fArr[iMin + 1], f4, f3, f4);
    }
}
