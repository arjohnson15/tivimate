package p146;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

/* renamed from: ˉⁱ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2246 implements TransformationMethod {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public Locale f8947;

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.f8947);
        }
        return null;
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
    }
}
