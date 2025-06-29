package p220;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: ˏٴ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2848 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final ThreadLocal f11087 = new ThreadLocal();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final ThreadLocal f11086 = new ThreadLocal();

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m7136(ViewGroup viewGroup, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != viewGroup) {
            m7136(viewGroup, (View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }
}
