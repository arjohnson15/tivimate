package p335;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.leanback.widget.VerticalGridView;
import androidx.preference.DialogPreference;
import androidx.preference.ListPreference;
import androidx.preference.MultiSelectListPreference;
import java.util.Collections;
import java.util.Set;
import org.lsposed.hiddenapibypass.library.R;
import p200.C2752;
import p272.C3327;

/* renamed from: ᵎʾ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C3796 extends C3791 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public boolean f14643;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public CharSequence f14644;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public String f14645;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public CharSequence[] f14646;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public CharSequence[] f14647;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public CharSequence f14648;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public Set f14649;

    @Override // p335.C3791, androidx.fragment.app.AbstractComponentCallbacksC0100
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f14644 = bundle.getCharSequence("LeanbackListPreferenceDialogFragment.title");
            this.f14648 = bundle.getCharSequence("LeanbackListPreferenceDialogFragment.message");
            this.f14643 = bundle.getBoolean("LeanbackListPreferenceDialogFragment.isMulti");
            this.f14646 = bundle.getCharSequenceArray("LeanbackListPreferenceDialogFragment.entries");
            this.f14647 = bundle.getCharSequenceArray("LeanbackListPreferenceDialogFragment.entryValues");
            if (!this.f14643) {
                this.f14645 = bundle.getString("LeanbackListPreferenceDialogFragment.initialSelection");
                return;
            }
            String[] stringArray = bundle.getStringArray("LeanbackListPreferenceDialogFragment.initialSelections");
            C2752 c2752 = new C2752(stringArray != null ? stringArray.length : 0);
            this.f14649 = c2752;
            if (stringArray != null) {
                Collections.addAll(c2752, stringArray);
                return;
            }
            return;
        }
        DialogPreference dialogPreferenceM8886 = m8886();
        this.f14644 = dialogPreferenceM8886.f1522;
        this.f14648 = dialogPreferenceM8886.f1526;
        if (dialogPreferenceM8886 instanceof ListPreference) {
            this.f14643 = false;
            ListPreference listPreference = (ListPreference) dialogPreferenceM8886;
            this.f14646 = listPreference.f1535;
            this.f14647 = listPreference.f1532;
            this.f14645 = listPreference.f1533;
            return;
        }
        if (!(dialogPreferenceM8886 instanceof MultiSelectListPreference)) {
            throw new IllegalArgumentException("Preference must be a ListPreference or MultiSelectListPreference");
        }
        this.f14643 = true;
        MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) dialogPreferenceM8886;
        this.f14646 = multiSelectListPreference.f1539;
        this.f14647 = multiSelectListPreference.f1537;
        this.f14649 = multiSelectListPreference.f1538;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0100
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TypedValue typedValue = new TypedValue();
        getActivity().getTheme().resolveAttribute(R.attr._2_res_0x7f0404a4, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = R.style._2_res_0x7f14019b;
        }
        View viewInflate = layoutInflater.cloneInContext(new ContextThemeWrapper(getActivity(), i)).inflate(R.layout._2_res_0x7f0e00cf, viewGroup, false);
        VerticalGridView verticalGridView = (VerticalGridView) viewInflate.findViewById(android.R.id.list);
        verticalGridView.setWindowAlignment(3);
        verticalGridView.setFocusScrollStrategy(0);
        verticalGridView.setAdapter(this.f14643 ? new C3327(this, this.f14646, this.f14647, this.f14649) : new C3327(this, this.f14646, this.f14647, this.f14645));
        verticalGridView.requestFocus();
        CharSequence charSequence = this.f14644;
        if (!TextUtils.isEmpty(charSequence)) {
            ((TextView) viewInflate.findViewById(R.id._2_res_0x7f0b0112)).setText(charSequence);
        }
        CharSequence charSequence2 = this.f14648;
        if (!TextUtils.isEmpty(charSequence2)) {
            TextView textView = (TextView) viewInflate.findViewById(android.R.id.message);
            textView.setVisibility(0);
            textView.setText(charSequence2);
        }
        return viewInflate;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0100
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("LeanbackListPreferenceDialogFragment.title", this.f14644);
        bundle.putCharSequence("LeanbackListPreferenceDialogFragment.message", this.f14648);
        bundle.putBoolean("LeanbackListPreferenceDialogFragment.isMulti", this.f14643);
        bundle.putCharSequenceArray("LeanbackListPreferenceDialogFragment.entries", this.f14646);
        bundle.putCharSequenceArray("LeanbackListPreferenceDialogFragment.entryValues", this.f14647);
        if (!this.f14643) {
            bundle.putString("LeanbackListPreferenceDialogFragment.initialSelection", this.f14645);
        } else {
            Set set = this.f14649;
            bundle.putStringArray("LeanbackListPreferenceDialogFragment.initialSelections", (String[]) set.toArray(new String[set.size()]));
        }
    }
}
