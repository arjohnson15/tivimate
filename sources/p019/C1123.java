package p019;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import p192.AbstractC2669;
import p192.C2676;

/* renamed from: ʻﹳ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1123 extends AbstractC2669 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final WeakReference f4745;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final WeakReference f4746;

    public C1123(TextView textView, C1127 c1127) {
        this.f4746 = new WeakReference(textView);
        this.f4745 = new WeakReference(c1127);
    }

    @Override // p192.AbstractC2669
    /* renamed from: ʽᐧ */
    public final void mo4132() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f4746.get();
        InputFilter inputFilter = (InputFilter) this.f4745.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    C2676 c2676M6853 = C2676.m6853();
                    if (text == null) {
                        length = 0;
                    } else {
                        c2676M6853.getClass();
                        length = text.length();
                    }
                    CharSequence charSequenceM6855 = c2676M6853.m6855(text, 0, length);
                    if (text == charSequenceM6855) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(charSequenceM6855);
                    int selectionEnd = Selection.getSelectionEnd(charSequenceM6855);
                    textView.setText(charSequenceM6855);
                    if (charSequenceM6855 instanceof Spannable) {
                        Spannable spannable = (Spannable) charSequenceM6855;
                        if (selectionStart >= 0 && selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionStart, selectionEnd);
                            return;
                        } else if (selectionStart >= 0) {
                            Selection.setSelection(spannable, selectionStart);
                            return;
                        } else {
                            if (selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionEnd);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }
}
