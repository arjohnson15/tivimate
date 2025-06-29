package p357;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: ᵔˎ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4053 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ C4055 f15601;

    public C4053(C4055 c4055) {
        this.f15601 = c4055;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m9326(TextInputLayout textInputLayout) {
        C4055 c4055 = this.f15601;
        if (c4055.f15618 == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = c4055.f15618;
        C4057 c4057 = c4055.f15607;
        if (editText != null) {
            editText.removeTextChangedListener(c4057);
            if (c4055.f15618.getOnFocusChangeListener() == c4055.m9327().mo9310()) {
                c4055.f15618.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        c4055.f15618 = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(c4057);
        }
        c4055.m9327().mo9314(c4055.f15618);
        c4055.m9329(c4055.m9327());
    }
}
