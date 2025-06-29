package p149;

import android.R;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.leanback.widget.RunnableC0183;
import androidx.preference.EditTextPreference;

/* renamed from: ˊʾ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C2309 extends AbstractDialogInterfaceOnClickListenerC2305 {

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public EditText f9119;

    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public CharSequence f9120;

    /* renamed from: ⁱʿ, reason: contains not printable characters */
    public final RunnableC0183 f9122 = new RunnableC0183(9, this);

    /* renamed from: ˎˉ, reason: contains not printable characters */
    public long f9121 = -1;

    @Override // p149.AbstractDialogInterfaceOnClickListenerC2305, androidx.fragment.app.DialogInterfaceOnCancelListenerC0116, androidx.fragment.app.AbstractComponentCallbacksC0100
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.f9120 = ((EditTextPreference) m6350()).f1531;
        } else {
            this.f9120 = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // p149.AbstractDialogInterfaceOnClickListenerC2305, androidx.fragment.app.DialogInterfaceOnCancelListenerC0116, androidx.fragment.app.AbstractComponentCallbacksC0100
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.f9120);
    }

    @Override // p149.AbstractDialogInterfaceOnClickListenerC2305
    /* renamed from: ʿˊ */
    public final void mo6349(View view) {
        super.mo6349(view);
        EditText editText = (EditText) view.findViewById(R.id.edit);
        this.f9119 = editText;
        if (editText == null) {
            throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText.requestFocus();
        this.f9119.setText(this.f9120);
        EditText editText2 = this.f9119;
        editText2.setSelection(editText2.getText().length());
        ((EditTextPreference) m6350()).getClass();
    }

    @Override // p149.AbstractDialogInterfaceOnClickListenerC2305
    /* renamed from: ˉᵎ */
    public final void mo6309(boolean z) {
        if (z) {
            String string = this.f9119.getText().toString();
            EditTextPreference editTextPreference = (EditTextPreference) m6350();
            editTextPreference.m1193(string);
            editTextPreference.m1173(string);
        }
    }

    /* renamed from: ˎˉ, reason: contains not printable characters */
    public final void m6356() {
        long j = this.f9121;
        if (j == -1 || j + 1000 <= SystemClock.currentThreadTimeMillis()) {
            return;
        }
        EditText editText = this.f9119;
        if (editText == null || !editText.isFocused()) {
            this.f9121 = -1L;
            return;
        }
        if (((InputMethodManager) this.f9119.getContext().getSystemService("input_method")).showSoftInput(this.f9119, 0)) {
            this.f9121 = -1L;
            return;
        }
        EditText editText2 = this.f9119;
        RunnableC0183 runnableC0183 = this.f9122;
        editText2.removeCallbacks(runnableC0183);
        this.f9119.postDelayed(runnableC0183, 50L);
    }
}
