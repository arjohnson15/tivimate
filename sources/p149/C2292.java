package p149;

import android.os.Bundle;
import androidx.preference.MultiSelectListPreference;
import java.util.ArrayList;
import java.util.HashSet;
import p225.C2990;
import p225.C3009;

/* renamed from: ˊʾ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C2292 extends AbstractDialogInterfaceOnClickListenerC2305 {

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public final HashSet f9068 = new HashSet();

    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public boolean f9069;

    /* renamed from: ˎˉ, reason: contains not printable characters */
    public CharSequence[] f9070;

    /* renamed from: ⁱʿ, reason: contains not printable characters */
    public CharSequence[] f9071;

    @Override // p149.AbstractDialogInterfaceOnClickListenerC2305, androidx.fragment.app.DialogInterfaceOnCancelListenerC0116, androidx.fragment.app.AbstractComponentCallbacksC0100
    public final void onCreate(Bundle bundle) {
        CharSequence[] charSequenceArr;
        super.onCreate(bundle);
        HashSet hashSet = this.f9068;
        if (bundle != null) {
            hashSet.clear();
            hashSet.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
            this.f9069 = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
            this.f9071 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
            this.f9070 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
            return;
        }
        MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) m6350();
        if (multiSelectListPreference.f1539 == null || (charSequenceArr = multiSelectListPreference.f1537) == null) {
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        hashSet.clear();
        hashSet.addAll(multiSelectListPreference.f1538);
        this.f9069 = false;
        this.f9071 = multiSelectListPreference.f1539;
        this.f9070 = charSequenceArr;
    }

    @Override // p149.AbstractDialogInterfaceOnClickListenerC2305, androidx.fragment.app.DialogInterfaceOnCancelListenerC0116, androidx.fragment.app.AbstractComponentCallbacksC0100
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.f9068));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.f9069);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.f9071);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.f9070);
    }

    @Override // p149.AbstractDialogInterfaceOnClickListenerC2305
    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public final void mo6309(boolean z) {
        if (z && this.f9069) {
            MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) m6350();
            HashSet hashSet = this.f9068;
            multiSelectListPreference.m1193(hashSet);
            multiSelectListPreference.m1180(hashSet);
        }
        this.f9069 = false;
    }

    @Override // p149.AbstractDialogInterfaceOnClickListenerC2305
    /* renamed from: ⁱʿ, reason: contains not printable characters */
    public final void mo6310(C2990 c2990) {
        int length = this.f9070.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.f9068.contains(this.f9070[i].toString());
        }
        CharSequence[] charSequenceArr = this.f9071;
        DialogInterfaceOnMultiChoiceClickListenerC2286 dialogInterfaceOnMultiChoiceClickListenerC2286 = new DialogInterfaceOnMultiChoiceClickListenerC2286(this);
        C3009 c3009 = c2990.f11507;
        c3009.f11548 = charSequenceArr;
        c3009.f11562 = dialogInterfaceOnMultiChoiceClickListenerC2286;
        c3009.f11555 = zArr;
        c3009.f11561 = true;
    }
}
