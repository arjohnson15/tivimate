package p335;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.leanback.widget.C0145;
import androidx.preference.DialogPreference;
import androidx.preference.EditTextPreference;
import org.lsposed.hiddenapibypass.library.R;

/* renamed from: ᵎʾ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C3790 extends C3791 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public CharSequence f14632;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f14633;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public CharSequence f14634;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public CharSequence f14635;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public int f14636;

    @Override // p335.C3791, androidx.fragment.app.AbstractComponentCallbacksC0100
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f14632 = bundle.getCharSequence("LeanbackEditPreferenceDialog.title");
            this.f14634 = bundle.getCharSequence("LeanbackEditPreferenceDialog.message");
            this.f14635 = bundle.getCharSequence("LeanbackEditPreferenceDialog.text");
            this.f14636 = bundle.getInt("LeanbackEditPreferenceDialog.inputType", 1);
            this.f14633 = bundle.getInt("LeanbackEditPreferenceDialog.imeOptions", 2);
            return;
        }
        DialogPreference dialogPreferenceM8886 = m8886();
        CharSequence charSequence = dialogPreferenceM8886.f1522;
        this.f14632 = charSequence;
        String str = dialogPreferenceM8886.f1526;
        this.f14634 = str;
        if (!(dialogPreferenceM8886 instanceof EditTextPreference)) {
            throw new IllegalArgumentException("Preference must be a EditTextPreference");
        }
        this.f14632 = charSequence;
        this.f14634 = str;
        this.f14635 = ((EditTextPreference) dialogPreferenceM8886).f1531;
        this.f14636 = dialogPreferenceM8886.m1199().getInt("input_type", 1);
        this.f14633 = dialogPreferenceM8886.m1199().getInt("ime_option", 2);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0100
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TypedValue typedValue = new TypedValue();
        getActivity().getTheme().resolveAttribute(R.attr._2_res_0x7f0404a4, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = R.style._2_res_0x7f14019b;
        }
        View viewInflate = layoutInflater.cloneInContext(new ContextThemeWrapper(getActivity(), i)).inflate(R.layout._2_res_0x7f0e00ce, viewGroup, false);
        if (!TextUtils.isEmpty(this.f14632)) {
            ((TextView) viewInflate.findViewById(R.id._2_res_0x7f0b0112)).setText(this.f14632);
        }
        if (!TextUtils.isEmpty(this.f14634)) {
            TextView textView = (TextView) viewInflate.findViewById(android.R.id.message);
            textView.setVisibility(0);
            textView.setText(this.f14634);
        }
        EditText editText = (EditText) viewInflate.findViewById(android.R.id.edit);
        editText.setInputType(this.f14636);
        editText.setImeOptions(this.f14633);
        if (!TextUtils.isEmpty(this.f14635)) {
            editText.setText(this.f14635);
        }
        editText.setOnEditorActionListener(new C0145(2, this));
        return viewInflate;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0100
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("LeanbackEditPreferenceDialog.title", this.f14632);
        bundle.putCharSequence("LeanbackEditPreferenceDialog.message", this.f14634);
        bundle.putCharSequence("LeanbackEditPreferenceDialog.text", this.f14635);
        bundle.putInt("LeanbackEditPreferenceDialog.inputType", this.f14636);
        bundle.putInt("LeanbackEditPreferenceDialog.imeOptions", this.f14633);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0100
    public final void onStart() {
        super.onStart();
        EditText editText = (EditText) getView().findViewById(android.R.id.edit);
        InputMethodManager inputMethodManager = (InputMethodManager) getActivity().getSystemService("input_method");
        editText.requestFocus();
        inputMethodManager.showSoftInput(editText, 0);
    }
}
