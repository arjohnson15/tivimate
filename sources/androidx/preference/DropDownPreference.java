package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import org.lsposed.hiddenapibypass.library.R;
import p149.C2280;
import p149.C2302;

/* loaded from: classes.dex */
public class DropDownPreference extends ListPreference {

    /* renamed from: ʼᵎ, reason: contains not printable characters */
    public Spinner f1528;

    /* renamed from: ᵎˆ, reason: contains not printable characters */
    public final C2280 f1529;

    /* renamed from: ﹶﾞ, reason: contains not printable characters */
    public final ArrayAdapter f1530;

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr._2_res_0x7f0401fe);
        this.f1529 = new C2280(0, this);
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, android.R.layout.simple_spinner_dropdown_item);
        this.f1530 = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = this.f1535;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    /* renamed from: ˉי, reason: contains not printable characters */
    public final void mo1168() {
        super.mo1168();
        ArrayAdapter arrayAdapter = this.f1530;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    /* renamed from: ˏᴵ */
    public final void mo1167() {
        this.f1528.performClick();
    }

    @Override // androidx.preference.Preference
    /* renamed from: ᴵʿ */
    public final void mo1166(C2302 c2302) {
        int length;
        CharSequence[] charSequenceArr;
        Spinner spinner = (Spinner) c2302.f5618.findViewById(R.id._2_res_0x7f0b035a);
        this.f1528 = spinner;
        spinner.setAdapter((SpinnerAdapter) this.f1530);
        this.f1528.setOnItemSelectedListener(this.f1529);
        Spinner spinner2 = this.f1528;
        String str = this.f1533;
        if (str == null || (charSequenceArr = this.f1532) == null) {
            length = -1;
        } else {
            length = charSequenceArr.length - 1;
            while (length >= 0) {
                if (TextUtils.equals(charSequenceArr[length].toString(), str)) {
                    break;
                } else {
                    length--;
                }
            }
            length = -1;
        }
        spinner2.setSelection(length);
        super.mo1166(c2302);
    }
}
