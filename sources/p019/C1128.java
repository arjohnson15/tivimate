package p019;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import p192.C2676;

/* renamed from: ʻﹳ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1128 implements TextWatcher {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public C1122 f4756;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public boolean f4757 = true;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final EditText f4758;

    public C1128(EditText editText) {
        this.f4758 = editText;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m4144(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            C2676 c2676M6853 = C2676.m6853();
            if (editableText == null) {
                length = 0;
            } else {
                c2676M6853.getClass();
                length = editableText.length();
            }
            c2676M6853.m6855(editableText, 0, length);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        EditText editText = this.f4758;
        if (editText.isInEditMode() || !this.f4757 || C2676.f10575 == null || i2 > i3 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iM6854 = C2676.m6853().m6854();
        if (iM6854 != 0) {
            if (iM6854 == 1) {
                C2676.m6853().m6855((Spannable) charSequence, i, i3 + i);
                return;
            } else if (iM6854 != 3) {
                return;
            }
        }
        C2676 c2676M6853 = C2676.m6853();
        if (this.f4756 == null) {
            this.f4756 = new C1122(editText);
        }
        c2676M6853.m6857(this.f4756);
    }
}
