package p335;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0104;
import androidx.fragment.app.AbstractComponentCallbacksC0100;
import androidx.fragment.app.C0105;
import androidx.leanback.preference.LeanbackSettingsRootView;
import androidx.preference.DialogPreference;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.MultiSelectListPreference;
import org.lsposed.hiddenapibypass.library.R;
import p149.AbstractC2282;
import p149.ViewOnKeyListenerC2301;

/* renamed from: ᵎʾ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3795 extends AbstractComponentCallbacksC0100 {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final ViewOnKeyListenerC2301 f14642 = new ViewOnKeyListenerC2301(1, this);

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0100
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout._2_res_0x7f0e00da, viewGroup, false);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0100
    public final void onPause() {
        super.onPause();
        LeanbackSettingsRootView leanbackSettingsRootView = (LeanbackSettingsRootView) getView();
        if (leanbackSettingsRootView != null) {
            leanbackSettingsRootView.setOnBackKeyListener(null);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0100
    public final void onResume() {
        super.onResume();
        LeanbackSettingsRootView leanbackSettingsRootView = (LeanbackSettingsRootView) getView();
        if (leanbackSettingsRootView != null) {
            leanbackSettingsRootView.setOnBackKeyListener(this.f14642);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0100
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (bundle == null) {
            m8890();
        }
    }

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public boolean m8888(AbstractC2282 abstractC2282, DialogPreference dialogPreference) {
        if (abstractC2282 == null) {
            throw new IllegalArgumentException("Cannot display dialog for preference " + dialogPreference + ", Caller must not be null!");
        }
        if (dialogPreference instanceof ListPreference) {
            String str = ((ListPreference) dialogPreference).f1558;
            Bundle bundle = new Bundle(1);
            bundle.putString("key", str);
            C3796 c3796 = new C3796();
            c3796.setArguments(bundle);
            c3796.setTargetFragment(abstractC2282, 0);
            m8889(c3796);
        } else if (dialogPreference instanceof MultiSelectListPreference) {
            String str2 = ((MultiSelectListPreference) dialogPreference).f1558;
            Bundle bundle2 = new Bundle(1);
            bundle2.putString("key", str2);
            C3796 c37962 = new C3796();
            c37962.setArguments(bundle2);
            c37962.setTargetFragment(abstractC2282, 0);
            m8889(c37962);
        } else {
            if (!(dialogPreference instanceof EditTextPreference)) {
                return false;
            }
            String str3 = dialogPreference.f1558;
            Bundle bundle3 = new Bundle(1);
            bundle3.putString("key", str3);
            C3790 c3790 = new C3790();
            c3790.setArguments(bundle3);
            c3790.setTargetFragment(abstractC2282, 0);
            m8889(c3790);
        }
        return true;
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public final void m8889(AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100) {
        AbstractC0104 childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        C0105 c0105 = new C0105(childFragmentManager);
        if (getChildFragmentManager().m675("androidx.leanback.preference.LeanbackSettingsFragment.PREFERENCE_FRAGMENT") != null) {
            c0105.m702(null);
            c0105.m700(R.id._2_res_0x7f0b0341, abstractComponentCallbacksC0100, "androidx.leanback.preference.LeanbackSettingsFragment.PREFERENCE_FRAGMENT");
        } else {
            c0105.m705(R.id._2_res_0x7f0b0341, abstractComponentCallbacksC0100, "androidx.leanback.preference.LeanbackSettingsFragment.PREFERENCE_FRAGMENT", 1);
        }
        c0105.m697(false);
    }

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public abstract void m8890();
}
