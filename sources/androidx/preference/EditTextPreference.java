package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import org.lsposed.hiddenapibypass.library.R;
import p149.AbstractC2283;
import p149.C2295;
import p371.AbstractC4205;
import ˈˉ.ﹳﹳ;

/* loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {

    /* renamed from: ˏ, reason: contains not printable characters */
    public String f1531;

    /* JADX WARN: Illegal instructions before constructor call */
    public EditTextPreference(Context context, AttributeSet attributeSet) {
        int iM9642 = AbstractC4205.m9642(context, R.attr._2_res_0x7f040203, android.R.attr.editTextPreferenceStyle);
        super(context, attributeSet, iM9642);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2283.f9054, iM9642, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(0, typedArrayObtainStyledAttributes.getBoolean(0, false))) {
            if (ﹳﹳ.ˆʿ == null) {
                ﹳﹳ.ˆʿ = new ﹳﹳ(21);
            }
            this.f1576 = ﹳﹳ.ˆʿ;
            mo1168();
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final boolean mo1169() {
        return TextUtils.isEmpty(this.f1531) || super.mo1169();
    }

    @Override // androidx.preference.Preference
    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final void mo1170(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C2295.class)) {
            super.mo1170(parcelable);
            return;
        }
        C2295 c2295 = (C2295) parcelable;
        super.mo1170(c2295.getSuperState());
        m1173(c2295.f9075);
    }

    @Override // androidx.preference.Preference
    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final Parcelable mo1171() {
        this.f1555 = true;
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.f1570) {
            return absSavedState;
        }
        C2295 c2295 = new C2295(absSavedState);
        c2295.f9075 = this.f1531;
        return c2295;
    }

    @Override // androidx.preference.Preference
    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final Object mo1172(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final void m1173(String str) {
        boolean zMo1169 = mo1169();
        this.f1531 = str;
        m1187(str);
        boolean zMo11692 = mo1169();
        if (zMo11692 != zMo1169) {
            mo1189(zMo11692);
        }
        mo1168();
    }

    @Override // androidx.preference.Preference
    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final void mo1174(Object obj) {
        m1173(m1194((String) obj));
    }
}
