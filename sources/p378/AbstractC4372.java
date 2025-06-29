package p378;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: ᵢٴ.ᐧⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4372 {
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static void m9958(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C4369 m9959(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        C4369 c4369M9950 = C4369.m9950(null, rootWindowInsets);
        C4331 c4331 = c4369M9950.f16871;
        c4331.mo9837(c4369M9950);
        c4331.mo9841(view.getRootView());
        return c4369M9950;
    }
}
