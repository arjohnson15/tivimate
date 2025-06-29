package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.Switch;
import org.lsposed.hiddenapibypass.library.R;
import p149.AbstractC2283;
import p149.C2298;
import p149.C2302;
import p371.AbstractC4205;

/* loaded from: classes.dex */
public class SwitchPreference extends TwoStatePreference {

    /* renamed from: ʻ, reason: contains not printable characters */
    public final String f1602;

    /* renamed from: ˏ, reason: contains not printable characters */
    public final String f1603;

    /* renamed from: ᵢᵢ, reason: contains not printable characters */
    public final C2298 f1604;

    public SwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC4205.m9642(context, R.attr._2_res_0x7f040576, android.R.attr.switchPreferenceStyle), 0);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f1604 = new C2298(this, 1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2283.f9046, i, i2);
        String string = typedArrayObtainStyledAttributes.getString(7);
        this.f1612 = string == null ? typedArrayObtainStyledAttributes.getString(0) : string;
        if (this.f1608) {
            mo1168();
        }
        String string2 = typedArrayObtainStyledAttributes.getString(6);
        this.f1611 = string2 == null ? typedArrayObtainStyledAttributes.getString(1) : string2;
        if (!this.f1608) {
            mo1168();
        }
        String string3 = typedArrayObtainStyledAttributes.getString(9);
        this.f1603 = string3 == null ? typedArrayObtainStyledAttributes.getString(3) : string3;
        mo1168();
        String string4 = typedArrayObtainStyledAttributes.getString(8);
        this.f1602 = string4 == null ? typedArrayObtainStyledAttributes.getString(4) : string4;
        mo1168();
        this.f1610 = typedArrayObtainStyledAttributes.getBoolean(5, typedArrayObtainStyledAttributes.getBoolean(2, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    /* renamed from: ʿˏ */
    public final void mo1164(View view) {
        super.mo1164(view);
        if (((AccessibilityManager) this.f1565.getSystemService("accessibility")).isEnabled()) {
            m1208(view.findViewById(android.R.id.switch_widget));
            m1211(view.findViewById(android.R.id.summary));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final void m1208(View view) {
        boolean z = view instanceof Switch;
        if (z) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f1608);
        }
        if (z) {
            Switch r4 = (Switch) view;
            r4.setTextOn(this.f1603);
            r4.setTextOff(this.f1602);
            r4.setOnCheckedChangeListener(this.f1604);
        }
    }

    @Override // androidx.preference.Preference
    /* renamed from: ᴵʿ */
    public void mo1166(C2302 c2302) {
        super.mo1166(c2302);
        m1208(c2302.m6346(android.R.id.switch_widget));
        m1211(c2302.m6346(android.R.id.summary));
    }
}
