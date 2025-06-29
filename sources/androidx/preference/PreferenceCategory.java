package androidx.preference;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import org.lsposed.hiddenapibypass.library.R;
import p149.C2302;
import p371.AbstractC4205;

/* loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, AbstractC4205.m9642(context, R.attr._2_res_0x7f04049b, android.R.attr.preferenceCategoryStyle));
    }

    @Override // androidx.preference.Preference
    /* renamed from: ˎˑ */
    public final boolean mo1169() {
        return !super.mo1200();
    }

    @Override // androidx.preference.Preference
    /* renamed from: ᴵʿ */
    public final void mo1166(C2302 c2302) {
        super.mo1166(c2302);
        if (Build.VERSION.SDK_INT >= 28) {
            c2302.f5618.setAccessibilityHeading(true);
        }
    }

    @Override // androidx.preference.Preference
    /* renamed from: ﹶˆ */
    public final boolean mo1200() {
        return false;
    }
}
