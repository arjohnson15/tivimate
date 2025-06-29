package p139;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.leanback.widget.C0148;
import ᵔᵔ.ٴˎ;

/* renamed from: ˉˋ.ﹳﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2157 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C0148 f8451;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final ٴˎ f8452;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f8452 = new C2138(18);
        } else if (i >= 23) {
            f8452 = new C2139(18);
        } else if (i >= 22) {
            f8452 = new C2161(18);
        } else {
            f8452 = new ٴˎ(18);
        }
        f8451 = new C0148(Float.class, "translationAlpha", 14);
        new C0148(Rect.class, "clipBounds", 15);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static void m6072(View view, int i) {
        f8452.ﾞʽ(view, i);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m6073(View view, int i, int i2, int i3, int i4) {
        f8452.ﹳˎ(view, i, i2, i3, i4);
    }
}
