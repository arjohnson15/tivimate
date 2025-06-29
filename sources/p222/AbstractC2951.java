package p222;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* renamed from: ˏᴵ.ᵔﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2951 {
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static TextClassifier m7317(TextView textView) {
        TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
        return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
    }
}
