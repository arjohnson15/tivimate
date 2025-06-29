package p315;

import android.graphics.Matrix;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: ᐧⁱ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3609 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final ThreadLocal f13830 = new ThreadLocal();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final ThreadLocal f13829 = new ThreadLocal();

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m8504(CoordinatorLayout coordinatorLayout, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != coordinatorLayout) {
            m8504(coordinatorLayout, (View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }
}
