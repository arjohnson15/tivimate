package p149;

import android.view.View;
import android.widget.AdapterView;
import androidx.preference.DropDownPreference;
import p222.C2882;
import p222.C2959;

/* renamed from: ˊʾ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2280 implements AdapterView.OnItemSelectedListener {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ Object f9031;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f9032;

    public /* synthetic */ C2280(int i, Object obj) {
        this.f9032 = i;
        this.f9031 = obj;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    private final void m6299(AdapterView adapterView) {
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    private final void m6300(AdapterView adapterView) {
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        C2882 c2882;
        switch (this.f9032) {
            case 0:
                if (i >= 0) {
                    DropDownPreference dropDownPreference = (DropDownPreference) this.f9031;
                    String string = dropDownPreference.f1532[i].toString();
                    if (!string.equals(dropDownPreference.f1533)) {
                        dropDownPreference.m1193(string);
                        dropDownPreference.m1176(string);
                        break;
                    }
                }
                break;
            default:
                if (i != -1 && (c2882 = ((C2959) this.f9031).f11414) != null) {
                    c2882.setListSelectionHidden(false);
                    break;
                }
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i = this.f9032;
    }
}
