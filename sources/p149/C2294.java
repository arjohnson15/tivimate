package p149;

import android.os.Bundle;
import androidx.preference.ListPreference;
import p225.C2990;
import p225.C3009;

/* renamed from: ˊʾ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C2294 extends AbstractDialogInterfaceOnClickListenerC2305 {

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public int f9072;

    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public CharSequence[] f9073;

    /* renamed from: ⁱʿ, reason: contains not printable characters */
    public CharSequence[] f9074;

    @Override // p149.AbstractDialogInterfaceOnClickListenerC2305, androidx.fragment.app.DialogInterfaceOnCancelListenerC0116, androidx.fragment.app.AbstractComponentCallbacksC0100
    public final void onCreate(Bundle bundle) {
        CharSequence[] charSequenceArr;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f9072 = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.f9073 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.f9074 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        ListPreference listPreference = (ListPreference) m6350();
        if (listPreference.f1535 == null || (charSequenceArr = listPreference.f1532) == null) {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.f9072 = listPreference.m1178(listPreference.f1533);
        this.f9073 = listPreference.f1535;
        this.f9074 = charSequenceArr;
    }

    @Override // p149.AbstractDialogInterfaceOnClickListenerC2305, androidx.fragment.app.DialogInterfaceOnCancelListenerC0116, androidx.fragment.app.AbstractComponentCallbacksC0100
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.f9072);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.f9073);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.f9074);
    }

    @Override // p149.AbstractDialogInterfaceOnClickListenerC2305
    /* renamed from: ˉᵎ */
    public final void mo6309(boolean z) {
        int i;
        if (!z || (i = this.f9072) < 0) {
            return;
        }
        String string = this.f9074[i].toString();
        ListPreference listPreference = (ListPreference) m6350();
        listPreference.m1193(string);
        listPreference.m1176(string);
    }

    @Override // p149.AbstractDialogInterfaceOnClickListenerC2305
    /* renamed from: ⁱʿ */
    public final void mo6310(C2990 c2990) {
        CharSequence[] charSequenceArr = this.f9073;
        int i = this.f9072;
        DialogInterfaceOnClickListenerC2300 dialogInterfaceOnClickListenerC2300 = new DialogInterfaceOnClickListenerC2300(this);
        C3009 c3009 = c2990.f11507;
        c3009.f11548 = charSequenceArr;
        c3009.f11559 = dialogInterfaceOnClickListenerC2300;
        c3009.f11560 = i;
        c3009.f11550 = true;
        c3009.f11558 = null;
        c3009.f11553 = null;
    }
}
