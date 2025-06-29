package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import org.lsposed.hiddenapibypass.library.R;
import p149.AbstractC2283;
import p149.C2298;
import p149.C2302;
import p371.AbstractC4205;

/* loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {

    /* renamed from: ᵢᵢ, reason: contains not printable characters */
    public final C2298 f1521;

    /* JADX WARN: Illegal instructions before constructor call */
    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        int iM9642 = AbstractC4205.m9642(context, R.attr._2_res_0x7f0400df, android.R.attr.checkBoxPreferenceStyle);
        super(context, attributeSet, iM9642, 0);
        this.f1521 = new C2298(this, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2283.f9043, iM9642, 0);
        String string = typedArrayObtainStyledAttributes.getString(5);
        this.f1612 = string == null ? typedArrayObtainStyledAttributes.getString(0) : string;
        if (this.f1608) {
            mo1168();
        }
        String string2 = typedArrayObtainStyledAttributes.getString(4);
        this.f1611 = string2 == null ? typedArrayObtainStyledAttributes.getString(1) : string2;
        if (!this.f1608) {
            mo1168();
        }
        this.f1610 = typedArrayObtainStyledAttributes.getBoolean(3, typedArrayObtainStyledAttributes.getBoolean(2, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final void mo1164(View view) {
        super.mo1164(view);
        if (((AccessibilityManager) this.f1565.getSystemService("accessibility")).isEnabled()) {
            m1165(view.findViewById(android.R.id.checkbox));
            m1211(view.findViewById(android.R.id.summary));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final void m1165(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f1608);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.f1521);
        }
    }

    @Override // androidx.preference.Preference
    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final void mo1166(C2302 c2302) {
        super.mo1166(c2302);
        m1165(c2302.m6346(android.R.id.checkbox));
        m1211(c2302.m6346(android.R.id.summary));
    }
}
