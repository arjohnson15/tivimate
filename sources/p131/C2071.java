package p131;

import android.animation.TypeEvaluator;
import com.google.android.gms.internal.play_billing.ˎˑ;
import p421.C4857;

/* renamed from: ˉʻ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2071 implements TypeEvaluator {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public C4857[] f7859;

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        C4857[] c4857Arr = (C4857[]) obj;
        C4857[] c4857Arr2 = (C4857[]) obj2;
        if (!ˎˑ.ˑʽ(c4857Arr, c4857Arr2)) {
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
        if (!ˎˑ.ˑʽ(this.f7859, c4857Arr)) {
            this.f7859 = ˎˑ.ˉⁱ(c4857Arr);
        }
        for (int i = 0; i < c4857Arr.length; i++) {
            C4857 c4857 = this.f7859[i];
            C4857 c48572 = c4857Arr[i];
            C4857 c48573 = c4857Arr2[i];
            c4857.getClass();
            c4857.f18358 = c48572.f18358;
            int i2 = 0;
            while (true) {
                float[] fArr = c48572.f18357;
                if (i2 < fArr.length) {
                    c4857.f18357[i2] = (c48573.f18357[i2] * f) + ((1.0f - f) * fArr[i2]);
                    i2++;
                }
            }
        }
        return this.f7859;
    }
}
