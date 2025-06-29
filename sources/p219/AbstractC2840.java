package p219;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import p273.C3343;
import ᵎﹳ.ᐧʻ;

/* renamed from: ˏـ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2840 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final LinearInterpolator f11003 = new LinearInterpolator();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C3343 f11001 = new C3343(C3343.f13105);

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final C3343 f11002 = new C3343();

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final C3343 f11004 = new C3343(C3343.f13103);

    static {
        new DecelerateInterpolator();
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static float m7112(float f, float f2, float f3, float f4, float f5) {
        return f5 <= f3 ? f : f5 >= f4 ? f2 : m7114(f, f2, (f5 - f3) / (f4 - f3));
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static int m7113(float f, int i, int i2) {
        return Math.round(f * (i2 - i)) + i;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static float m7114(float f, float f2, float f3) {
        return ᐧʻ.ﹶˆ(f2, f, f3, f);
    }
}
