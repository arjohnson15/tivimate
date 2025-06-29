package p139;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: ˉˋ.ˑⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2138 extends C2139 {
    /* renamed from: ˈٴ, reason: contains not printable characters */
    public final void m6033(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public final void m6034(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final float m6035(View view) {
        return view.getTransitionAlpha();
    }

    @Override // p139.C2161
    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final void mo6036(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // p139.C2139
    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public final void mo6037(View view, int i) {
        view.setTransitionVisibility(i);
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public final void m6038(View view, float f) {
        view.setTransitionAlpha(f);
    }
}
