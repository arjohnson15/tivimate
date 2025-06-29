package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.fragment.app.AbstractC0104;
import androidx.fragment.app.AbstractComponentCallbacksC0100;
import androidx.fragment.app.C0105;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0116;
import org.lsposed.hiddenapibypass.library.R;
import p149.AbstractC2282;
import p149.AbstractC2283;
import p149.C2292;
import p149.C2294;
import p149.C2309;
import p335.AbstractC3795;
import p371.AbstractC4205;

/* loaded from: classes.dex */
public abstract class DialogPreference extends Preference {

    /* renamed from: ʻʻ, reason: contains not printable characters */
    public CharSequence f1522;

    /* renamed from: ʾˈ, reason: contains not printable characters */
    public final String f1523;

    /* renamed from: ˆﾞ, reason: contains not printable characters */
    public final String f1524;

    /* renamed from: ˊﹶ, reason: contains not printable characters */
    public final Drawable f1525;

    /* renamed from: ᐧʼ, reason: contains not printable characters */
    public final String f1526;

    /* renamed from: ᵢᵢ, reason: contains not printable characters */
    public final int f1527;

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC4205.m9642(context, R.attr._2_res_0x7f0401da, android.R.attr.dialogPreferenceStyle));
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2283.f9050, i, 0);
        String string = typedArrayObtainStyledAttributes.getString(9);
        string = string == null ? typedArrayObtainStyledAttributes.getString(0) : string;
        this.f1522 = string;
        if (string == null) {
            this.f1522 = this.f1560;
        }
        String string2 = typedArrayObtainStyledAttributes.getString(8);
        this.f1526 = string2 == null ? typedArrayObtainStyledAttributes.getString(1) : string2;
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(6);
        this.f1525 = drawable == null ? typedArrayObtainStyledAttributes.getDrawable(2) : drawable;
        String string3 = typedArrayObtainStyledAttributes.getString(11);
        this.f1523 = string3 == null ? typedArrayObtainStyledAttributes.getString(3) : string3;
        String string4 = typedArrayObtainStyledAttributes.getString(10);
        this.f1524 = string4 == null ? typedArrayObtainStyledAttributes.getString(4) : string4;
        this.f1527 = typedArrayObtainStyledAttributes.getResourceId(7, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public void mo1167() {
        DialogInterfaceOnCancelListenerC0116 c2292;
        AbstractC2282 abstractC2282 = (AbstractC2282) this.f1545.f9118;
        if (abstractC2282 != null) {
            boolean zM8888 = abstractC2282.mo6307() instanceof AbstractC3795 ? ((AbstractC3795) abstractC2282.mo6307()).m8888(abstractC2282, this) : false;
            for (AbstractComponentCallbacksC0100 parentFragment = abstractC2282; !zM8888 && parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
                if (parentFragment instanceof AbstractC3795) {
                    zM8888 = ((AbstractC3795) parentFragment).m8888(abstractC2282, this);
                }
            }
            if (!zM8888) {
                abstractC2282.getContext();
            }
            if (!zM8888) {
                abstractC2282.getActivity();
            }
            if (!zM8888 && abstractC2282.getParentFragmentManager().m675("androidx.preference.PreferenceFragment.DIALOG") == null) {
                if (this instanceof EditTextPreference) {
                    String str = this.f1558;
                    c2292 = new C2309();
                    Bundle bundle = new Bundle(1);
                    bundle.putString("key", str);
                    c2292.setArguments(bundle);
                } else if (this instanceof ListPreference) {
                    String str2 = this.f1558;
                    c2292 = new C2294();
                    Bundle bundle2 = new Bundle(1);
                    bundle2.putString("key", str2);
                    c2292.setArguments(bundle2);
                } else {
                    if (!(this instanceof MultiSelectListPreference)) {
                        throw new IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + getClass().getSimpleName() + ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
                    }
                    String str3 = this.f1558;
                    c2292 = new C2292();
                    Bundle bundle3 = new Bundle(1);
                    bundle3.putString("key", str3);
                    c2292.setArguments(bundle3);
                }
                c2292.setTargetFragment(abstractC2282, 0);
                AbstractC0104 parentFragmentManager = abstractC2282.getParentFragmentManager();
                c2292.f700 = false;
                c2292.f707 = true;
                parentFragmentManager.getClass();
                C0105 c0105 = new C0105(parentFragmentManager);
                c0105.f647 = true;
                c0105.m705(0, c2292, "androidx.preference.PreferenceFragment.DIALOG", 1);
                c0105.m697(false);
            }
        }
    }
}
