package p222;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.widget.TextView;

/* renamed from: ˏᴵ.יˋ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2921 {
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static StaticLayout m7272(CharSequence charSequence, Layout.Alignment alignment, int i, int i2, TextView textView, TextPaint textPaint, C2867 c2867) {
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i);
        StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
        if (i2 == -1) {
            i2 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i2);
        try {
            c2867.mo7183(builderObtain, textView);
        } catch (ClassCastException unused) {
        }
        return builderObtain.build();
    }
}
