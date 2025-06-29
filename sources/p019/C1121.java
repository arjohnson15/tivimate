package p019;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import p192.C2676;

/* renamed from: ʻﹳ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1121 implements TransformationMethod {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final TransformationMethod f4742;

    public C1121(TransformationMethod transformationMethod) {
        this.f4742 = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f4742;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || C2676.m6853().m6854() != 1) {
            return charSequence;
        }
        C2676 c2676M6853 = C2676.m6853();
        c2676M6853.getClass();
        return c2676M6853.m6855(charSequence, 0, charSequence.length());
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        TransformationMethod transformationMethod = this.f4742;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
        }
    }
}
