package p019;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
import p192.C2676;

/* renamed from: ʻﹳ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1127 implements InputFilter {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public C1123 f4754;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final TextView f4755;

    public C1127(TextView textView) {
        this.f4755 = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        TextView textView = this.f4755;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iM6854 = C2676.m6853().m6854();
        if (iM6854 != 0) {
            if (iM6854 == 1) {
                if ((i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i != 0 || i2 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return C2676.m6853().m6855(charSequence, 0, charSequence.length());
            }
            if (iM6854 != 3) {
                return charSequence;
            }
        }
        C2676 c2676M6853 = C2676.m6853();
        if (this.f4754 == null) {
            this.f4754 = new C1123(textView, this);
        }
        c2676M6853.m6857(this.f4754);
        return charSequence;
    }
}
