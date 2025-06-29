package p222;

import android.graphics.Insets;
import android.graphics.Rect;
import android.view.View;
import android.view.WindowInsets;

/* renamed from: ˏᴵ.ˋᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2897 {
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m7240(View view, Rect rect, Rect rect2) {
        Insets systemWindowInsets = view.computeSystemWindowInsets(new WindowInsets.Builder().setSystemWindowInsets(Insets.of(rect)).build(), rect2).getSystemWindowInsets();
        rect.set(systemWindowInsets.left, systemWindowInsets.top, systemWindowInsets.right, systemWindowInsets.bottom);
    }
}
