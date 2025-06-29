package p131;

import android.animation.TypeEvaluator;
import ᵎﹳ.ᐧʻ;

/* renamed from: ˉʻ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2072 implements TypeEvaluator {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final C2072 f7860 = new C2072();

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        int iIntValue = ((Integer) obj).intValue();
        float f2 = ((iIntValue >> 24) & 255) / 255.0f;
        int iIntValue2 = ((Integer) obj2).intValue();
        float f3 = ((iIntValue2 >> 24) & 255) / 255.0f;
        float fPow = (float) Math.pow(((iIntValue >> 16) & 255) / 255.0f, 2.2d);
        float fPow2 = (float) Math.pow(((iIntValue >> 8) & 255) / 255.0f, 2.2d);
        float fPow3 = (float) Math.pow((iIntValue & 255) / 255.0f, 2.2d);
        float fPow4 = (float) Math.pow(((iIntValue2 >> 16) & 255) / 255.0f, 2.2d);
        float fPow5 = (float) Math.pow(((iIntValue2 >> 8) & 255) / 255.0f, 2.2d);
        float fPow6 = (float) Math.pow((iIntValue2 & 255) / 255.0f, 2.2d);
        float f4 = ᐧʻ.ﹶˆ(f3, f2, f, f2);
        float f5 = ᐧʻ.ﹶˆ(fPow4, fPow, f, fPow);
        float f6 = ᐧʻ.ﹶˆ(fPow5, fPow2, f, fPow2);
        float f7 = ᐧʻ.ﹶˆ(fPow6, fPow3, f, fPow3);
        float fPow7 = ((float) Math.pow(f5, 0.45454545454545453d)) * 255.0f;
        float fPow8 = ((float) Math.pow(f6, 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(f7, 0.45454545454545453d)) * 255.0f) | (Math.round(fPow7) << 16) | (Math.round(f4 * 255.0f) << 24) | (Math.round(fPow8) << 8));
    }
}
