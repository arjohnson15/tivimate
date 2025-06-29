package p044;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;

/* renamed from: ʽٴ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC1298 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final int[] f5320 = {R.attr.state_enabled, R.attr.state_pressed};

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final String f5319 = AbstractC1298.class.getSimpleName();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static boolean m4596(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static ColorStateList m4597(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 22 && i <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f5320, 0)) != 0) {
            String str = f5319;
        }
        return colorStateList;
    }
}
