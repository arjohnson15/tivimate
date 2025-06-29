package p357;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: ᵔˎ.ʿˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4051 implements TextWatcher {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ EditText f15584;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ TextInputLayout f15585;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public int f15586;

    public C4051(TextInputLayout textInputLayout, EditText editText) {
        this.f15585 = textInputLayout;
        this.f15584 = editText;
        this.f15586 = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f15585;
        textInputLayout.m2886(!textInputLayout.f3430, false);
        if (textInputLayout.f3470) {
            textInputLayout.m2899(editable);
        }
        if (textInputLayout.f3455) {
            textInputLayout.m2889(editable);
        }
        EditText editText = this.f15584;
        int lineCount = editText.getLineCount();
        int i = this.f15586;
        if (lineCount != i) {
            if (lineCount < i) {
                int minimumHeight = editText.getMinimumHeight();
                int i2 = textInputLayout.f3460;
                if (minimumHeight != i2) {
                    editText.setMinimumHeight(i2);
                }
            }
            this.f15586 = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
