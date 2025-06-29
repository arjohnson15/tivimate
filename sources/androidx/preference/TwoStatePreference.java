package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import p149.C2306;

/* loaded from: classes.dex */
public abstract class TwoStatePreference extends Preference {

    /* renamed from: ʻʻ, reason: contains not printable characters */
    public boolean f1608;

    /* renamed from: ʾˈ, reason: contains not printable characters */
    public boolean f1609;

    /* renamed from: ˆﾞ, reason: contains not printable characters */
    public boolean f1610;

    /* renamed from: ˊﹶ, reason: contains not printable characters */
    public CharSequence f1611;

    /* renamed from: ᐧʼ, reason: contains not printable characters */
    public CharSequence f1612;

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
    }

    @Override // androidx.preference.Preference
    /* renamed from: ˎˑ */
    public final boolean mo1169() {
        return (this.f1610 ? this.f1608 : !this.f1608) || super.mo1169();
    }

    @Override // androidx.preference.Preference
    /* renamed from: ˎٴ */
    public final void mo1170(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C2306.class)) {
            super.mo1170(parcelable);
            return;
        }
        C2306 c2306 = (C2306) parcelable;
        super.mo1170(c2306.getSuperState());
        m1210(c2306.f9105);
    }

    @Override // androidx.preference.Preference
    /* renamed from: ˏᴵ */
    public final void mo1167() {
        boolean z = !this.f1608;
        m1193(Boolean.valueOf(z));
        m1210(z);
    }

    @Override // androidx.preference.Preference
    /* renamed from: ᵎˏ */
    public final Parcelable mo1171() {
        this.f1555 = true;
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.f1570) {
            return absSavedState;
        }
        C2306 c2306 = new C2306(absSavedState);
        c2306.f9105 = this.f1608;
        return c2306;
    }

    @Override // androidx.preference.Preference
    /* renamed from: ᵎـ */
    public final Object mo1172(TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
    }

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public void m1210(boolean z) {
        boolean z2 = this.f1608 != z;
        if (z2 || !this.f1609) {
            this.f1608 = z;
            this.f1609 = true;
            if (m1196()) {
                boolean z3 = !z;
                if (m1196() && m1195() == null) {
                    z3 = this.f1545.m6355().getBoolean(this.f1558, z3);
                }
                if (z != z3) {
                    if (m1195() != null) {
                        throw new UnsupportedOperationException("Not implemented on this data store");
                    }
                    SharedPreferences.Editor editorM6352 = this.f1545.m6352();
                    editorM6352.putBoolean(this.f1558, z);
                    if (!this.f1545.f9117) {
                        editorM6352.apply();
                    }
                }
            }
            if (z2) {
                mo1189(mo1169());
                mo1168();
            }
        }
    }

    @Override // androidx.preference.Preference
    /* renamed from: ﹳˎ */
    public void mo1174(Object obj) {
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (m1196() && m1195() == null) {
            zBooleanValue = this.f1545.m6355().getBoolean(this.f1558, zBooleanValue);
        }
        m1210(zBooleanValue);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1211(android.view.View r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof android.widget.TextView
            if (r0 != 0) goto L5
            return
        L5:
            android.widget.TextView r5 = (android.widget.TextView) r5
            boolean r0 = r4.f1608
            r1 = 0
            if (r0 == 0) goto L1b
            java.lang.CharSequence r0 = r4.f1612
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1b
            java.lang.CharSequence r0 = r4.f1612
            r5.setText(r0)
        L19:
            r0 = 0
            goto L2e
        L1b:
            boolean r0 = r4.f1608
            if (r0 != 0) goto L2d
            java.lang.CharSequence r0 = r4.f1611
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L2d
            java.lang.CharSequence r0 = r4.f1611
            r5.setText(r0)
            goto L19
        L2d:
            r0 = 1
        L2e:
            if (r0 == 0) goto L3e
            java.lang.CharSequence r2 = r4.mo1177()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L3e
            r5.setText(r2)
            r0 = 0
        L3e:
            if (r0 != 0) goto L41
            goto L43
        L41:
            r1 = 8
        L43:
            int r0 = r5.getVisibility()
            if (r1 == r0) goto L4c
            r5.setVisibility(r1)
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.TwoStatePreference.m1211(android.view.View):void");
    }
}
