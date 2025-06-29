package p364;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.inputmethod.EditorInfo;

/* renamed from: ᵔﹳ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4136 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final String[] f16030 = new String[0];

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m9488(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }
}
