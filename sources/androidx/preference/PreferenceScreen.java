package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import org.lsposed.hiddenapibypass.library.R;
import p149.AbstractC2282;
import p335.AbstractC3795;
import p371.AbstractC4205;
import ـˈ.ˎٴ;

/* loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {

    /* renamed from: ʽⁱ, reason: contains not printable characters */
    public final boolean f1589;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, AbstractC4205.m9642(context, R.attr._2_res_0x7f0404a2, android.R.attr.preferenceScreenStyle));
        this.f1589 = true;
    }

    @Override // androidx.preference.Preference
    /* renamed from: ˏᴵ */
    public final void mo1167() {
        ˎٴ r0;
        boolean z;
        if (this.f1557 != null || this.f1574 != null || this.f1585.size() == 0 || (r0 = (AbstractC2282) this.f1545.f9111) == null) {
            return;
        }
        if (r0.mo6307() instanceof AbstractC3795) {
            ((AbstractC3795) r0.mo6307()).ﾞˎ(this);
            z = true;
        } else {
            z = false;
        }
        for (ˎٴ parentFragment = r0; !z && parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof AbstractC3795) {
                ((AbstractC3795) parentFragment).ﾞˎ(this);
                z = true;
            }
        }
        if (!z) {
            r0.getContext();
        }
        if (z) {
            return;
        }
        r0.getActivity();
    }
}
