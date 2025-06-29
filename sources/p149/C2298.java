package p149;

import android.widget.CompoundButton;
import androidx.preference.CheckBoxPreference;
import androidx.preference.SwitchPreference;
import androidx.preference.SwitchPreferenceCompat;
import androidx.preference.TwoStatePreference;

/* renamed from: ˊʾ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2298 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ TwoStatePreference f9082;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f9083;

    public /* synthetic */ C2298(TwoStatePreference twoStatePreference, int i) {
        this.f9083 = i;
        this.f9082 = twoStatePreference;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.f9083) {
            case 0:
                Boolean boolValueOf = Boolean.valueOf(z);
                CheckBoxPreference checkBoxPreference = (CheckBoxPreference) this.f9082;
                checkBoxPreference.m1193(boolValueOf);
                checkBoxPreference.m1210(z);
                break;
            case 1:
                Boolean boolValueOf2 = Boolean.valueOf(z);
                SwitchPreference switchPreference = (SwitchPreference) this.f9082;
                switchPreference.m1193(boolValueOf2);
                switchPreference.m1210(z);
                break;
            default:
                Boolean boolValueOf3 = Boolean.valueOf(z);
                SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) this.f9082;
                switchPreferenceCompat.m1193(boolValueOf3);
                switchPreferenceCompat.m1210(z);
                break;
        }
    }
}
