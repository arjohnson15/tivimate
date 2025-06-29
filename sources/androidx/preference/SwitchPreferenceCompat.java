package androidx.preference;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import androidx.appcompat.widget.SwitchCompat;
import org.lsposed.hiddenapibypass.library.R;
import p149.AbstractC2283;
import p149.C2298;
import p149.C2302;

/* loaded from: classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {

    /* renamed from: ʻ, reason: contains not printable characters */
    public final String f1605;

    /* renamed from: ˏ, reason: contains not printable characters */
    public final String f1606;

    /* renamed from: ᵢᵢ, reason: contains not printable characters */
    public final C2298 f1607;

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr._2_res_0x7f040575, 0);
        this.f1607 = new C2298(this, 2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2283.f9047, R.attr._2_res_0x7f040575, 0);
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
        this.f1606 = string3 == null ? typedArrayObtainStyledAttributes.getString(3) : string3;
        mo1168();
        String string4 = typedArrayObtainStyledAttributes.getString(8);
        this.f1605 = string4 == null ? typedArrayObtainStyledAttributes.getString(4) : string4;
        mo1168();
        this.f1610 = typedArrayObtainStyledAttributes.getBoolean(5, typedArrayObtainStyledAttributes.getBoolean(2, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    /* renamed from: ʿˏ */
    public final void mo1164(View view) throws Resources.NotFoundException {
        super.mo1164(view);
        if (((AccessibilityManager) this.f1565.getSystemService("accessibility")).isEnabled()) {
            m1209(view.findViewById(R.id._2_res_0x7f0b0374));
            m1211(view.findViewById(android.R.id.summary));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final void m1209(View view) throws Resources.NotFoundException {
        boolean z = view instanceof SwitchCompat;
        if (z) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f1608);
        }
        if (z) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.f1606);
            switchCompat.setTextOff(this.f1605);
            switchCompat.setOnCheckedChangeListener(this.f1607);
        }
    }

    @Override // androidx.preference.Preference
    /* renamed from: ᴵʿ */
    public final void mo1166(C2302 c2302) throws Resources.NotFoundException {
        super.mo1166(c2302);
        m1209(c2302.m6346(R.id._2_res_0x7f0b0374));
        m1211(c2302.m6346(android.R.id.summary));
    }
}
