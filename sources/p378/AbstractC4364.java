package p378;

import android.R;
import android.content.Context;
import android.os.Build;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;

/* renamed from: ᵢٴ.ـˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4364 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final Method f16866;

    static {
        if (Build.VERSION.SDK_INT == 25) {
            try {
                f16866 = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", null);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static float m9946(ViewConfiguration viewConfiguration, Context context) {
        Method method;
        if (Build.VERSION.SDK_INT >= 25 && (method = f16866) != null) {
            try {
                return ((Integer) method.invoke(viewConfiguration, null)).intValue();
            } catch (Exception unused) {
            }
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }
}
