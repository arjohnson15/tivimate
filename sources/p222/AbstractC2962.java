package p222;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import p171.C2467;
import p171.InterfaceC2465;

/* renamed from: ˏᴵ.ⁱⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2962 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final int[] f11434 = {R.attr.state_checked};

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final int[] f11432 = new int[0];

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final Rect f11433 = new Rect();

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static Rect m7330(Drawable drawable) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            Insets insetsM7258 = AbstractC2912.m7258(drawable);
            return new Rect(insetsM7258.left, insetsM7258.top, insetsM7258.right, insetsM7258.bottom);
        }
        boolean z = drawable instanceof InterfaceC2465;
        Drawable drawable2 = drawable;
        if (z) {
            drawable2 = ((C2467) ((InterfaceC2465) drawable)).f9810;
        }
        if (i >= 29) {
            boolean z2 = AbstractC2905.f11250;
        } else if (AbstractC2905.f11250) {
            try {
                Object objInvoke = AbstractC2905.f11247.invoke(drawable2, null);
                if (objInvoke != null) {
                    return new Rect(AbstractC2905.f11249.getInt(objInvoke), AbstractC2905.f11252.getInt(objInvoke), AbstractC2905.f11248.getInt(objInvoke), AbstractC2905.f11251.getInt(objInvoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return f11433;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static PorterDuff.Mode m7331(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m7332(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        int[] iArr = f11434;
        int[] iArr2 = f11432;
        if (i == 21 && "android.graphics.drawable.VectorDrawable".equals(name)) {
            int[] state = drawable.getState();
            if (state == null || state.length == 0) {
                drawable.setState(iArr);
            } else {
                drawable.setState(iArr2);
            }
            drawable.setState(state);
            return;
        }
        if (i < 29 || i >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state2 = drawable.getState();
        if (state2 == null || state2.length == 0) {
            drawable.setState(iArr);
        } else {
            drawable.setState(iArr2);
        }
        drawable.setState(state2);
    }
}
