package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import org.lsposed.hiddenapibypass.library.R;
import p149.AbstractC2283;
import p149.C2299;
import p149.InterfaceC2303;
import p371.AbstractC4205;
import ᵔʼ.ˑʽ;

/* loaded from: classes.dex */
public class ListPreference extends DialogPreference {

    /* renamed from: ʻ, reason: contains not printable characters */
    public final CharSequence[] f1532;

    /* renamed from: ʽⁱ, reason: contains not printable characters */
    public String f1533;

    /* renamed from: ˊˆ, reason: contains not printable characters */
    public String f1534;

    /* renamed from: ˏ, reason: contains not printable characters */
    public final CharSequence[] f1535;

    /* renamed from: ᐧᴵ, reason: contains not printable characters */
    public boolean f1536;

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC4205.m9642(context, R.attr._2_res_0x7f0401da, android.R.attr.dialogPreferenceStyle));
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2283.f9044, i, 0);
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(2);
        this.f1535 = textArray == null ? typedArrayObtainStyledAttributes.getTextArray(0) : textArray;
        CharSequence[] textArray2 = typedArrayObtainStyledAttributes.getTextArray(3);
        this.f1532 = textArray2 == null ? typedArrayObtainStyledAttributes.getTextArray(1) : textArray2;
        if (typedArrayObtainStyledAttributes.getBoolean(4, typedArrayObtainStyledAttributes.getBoolean(4, false))) {
            if (ˑʽ.ᐧⁱ == null) {
                ˑʽ.ᐧⁱ = new ˑʽ();
            }
            this.f1576 = ˑʽ.ᐧⁱ;
            mo1168();
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC2283.f9053, i, 0);
        String string = typedArrayObtainStyledAttributes2.getString(33);
        this.f1534 = string == null ? typedArrayObtainStyledAttributes2.getString(7) : string;
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // androidx.preference.Preference
    /* renamed from: ˈٴ, reason: contains not printable characters */
    public final void mo1175(CharSequence charSequence) {
        super.mo1175(charSequence);
        if (charSequence == null) {
            this.f1534 = null;
        } else {
            this.f1534 = charSequence.toString();
        }
    }

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final void m1176(String str) {
        boolean zEquals = TextUtils.equals(this.f1533, str);
        if (zEquals && this.f1536) {
            return;
        }
        this.f1533 = str;
        this.f1536 = true;
        m1187(str);
        if (zEquals) {
            return;
        }
        mo1168();
    }

    @Override // androidx.preference.Preference
    /* renamed from: ˎٴ */
    public final void mo1170(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C2299.class)) {
            super.mo1170(parcelable);
            return;
        }
        C2299 c2299 = (C2299) parcelable;
        super.mo1170(c2299.getSuperState());
        m1176(c2299.f9084);
    }

    @Override // androidx.preference.Preference
    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final CharSequence mo1177() {
        InterfaceC2303 interfaceC2303 = this.f1576;
        if (interfaceC2303 != null) {
            return interfaceC2303.m6347(this);
        }
        CharSequence charSequenceM1179 = m1179();
        CharSequence charSequenceMo1177 = super.mo1177();
        String str = this.f1534;
        if (str == null) {
            return charSequenceMo1177;
        }
        if (charSequenceM1179 == null) {
            charSequenceM1179 = "";
        }
        String str2 = String.format(str, charSequenceM1179);
        return TextUtils.equals(str2, charSequenceMo1177) ? charSequenceMo1177 : str2;
    }

    @Override // androidx.preference.Preference
    /* renamed from: ᵎˏ */
    public final Parcelable mo1171() {
        this.f1555 = true;
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.f1570) {
            return absSavedState;
        }
        C2299 c2299 = new C2299(absSavedState);
        c2299.f9084 = this.f1533;
        return c2299;
    }

    @Override // androidx.preference.Preference
    /* renamed from: ᵎـ */
    public final Object mo1172(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final int m1178(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.f1532) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (TextUtils.equals(charSequenceArr[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    @Override // androidx.preference.Preference
    /* renamed from: ﹳˎ */
    public final void mo1174(Object obj) {
        m1176(m1194((String) obj));
    }

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final CharSequence m1179() {
        CharSequence[] charSequenceArr;
        int iM1178 = m1178(this.f1533);
        if (iM1178 < 0 || (charSequenceArr = this.f1535) == null) {
            return null;
        }
        return charSequenceArr[iM1178];
    }
}
