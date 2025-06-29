package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import java.util.HashSet;
import java.util.Set;
import org.lsposed.hiddenapibypass.library.R;
import p149.AbstractC2283;
import p149.C2310;
import p371.AbstractC4205;

/* loaded from: classes.dex */
public class MultiSelectListPreference extends DialogPreference {

    /* renamed from: ʻ, reason: contains not printable characters */
    public final CharSequence[] f1537;

    /* renamed from: ʽⁱ, reason: contains not printable characters */
    public final HashSet f1538;

    /* renamed from: ˏ, reason: contains not printable characters */
    public final CharSequence[] f1539;

    /* JADX WARN: Illegal instructions before constructor call */
    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        int iM9642 = AbstractC4205.m9642(context, R.attr._2_res_0x7f0401da, android.R.attr.dialogPreferenceStyle);
        super(context, attributeSet, iM9642);
        this.f1538 = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2283.f9052, iM9642, 0);
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(2);
        this.f1539 = textArray == null ? typedArrayObtainStyledAttributes.getTextArray(0) : textArray;
        CharSequence[] textArray2 = typedArrayObtainStyledAttributes.getTextArray(3);
        this.f1537 = textArray2 == null ? typedArrayObtainStyledAttributes.getTextArray(1) : textArray2;
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    /* renamed from: ˎٴ */
    public final void mo1170(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C2310.class)) {
            super.mo1170(parcelable);
            return;
        }
        C2310 c2310 = (C2310) parcelable;
        super.mo1170(c2310.getSuperState());
        m1180(c2310.f9123);
    }

    @Override // androidx.preference.Preference
    /* renamed from: ᵎˏ */
    public final Parcelable mo1171() {
        this.f1555 = true;
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.f1570) {
            return absSavedState;
        }
        C2310 c2310 = new C2310(absSavedState);
        c2310.f9123 = this.f1538;
        return c2310;
    }

    @Override // androidx.preference.Preference
    /* renamed from: ᵎـ */
    public final Object mo1172(TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final void m1180(Set set) {
        HashSet hashSet = this.f1538;
        hashSet.clear();
        hashSet.addAll(set);
        if (m1196()) {
            Set<String> stringSet = null;
            if (m1196() && m1195() == null) {
                stringSet = this.f1545.m6355().getStringSet(this.f1558, null);
            }
            if (!set.equals(stringSet)) {
                if (m1195() != null) {
                    throw new UnsupportedOperationException("Not implemented on this data store");
                }
                SharedPreferences.Editor editorM6352 = this.f1545.m6352();
                editorM6352.putStringSet(this.f1558, set);
                if (!this.f1545.f9117) {
                    editorM6352.apply();
                }
            }
        }
        mo1168();
    }

    @Override // androidx.preference.Preference
    /* renamed from: ﹳˎ */
    public final void mo1174(Object obj) {
        Set<String> stringSet = (Set) obj;
        if (m1196() && m1195() == null) {
            stringSet = this.f1545.m6355().getStringSet(this.f1558, stringSet);
        }
        m1180(stringSet);
    }
}
