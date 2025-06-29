package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import androidx.leanback.widget.RunnableC0183;
import java.util.ArrayList;
import java.util.Collections;
import p149.AbstractC2283;
import p149.C2288;
import p149.C2308;
import p149.C2311;
import p200.C2755;

/* loaded from: classes.dex */
public abstract class PreferenceGroup extends Preference {

    /* renamed from: ʻ, reason: contains not printable characters */
    public final RunnableC0183 f1581;

    /* renamed from: ʻʻ, reason: contains not printable characters */
    public final C2755 f1582;

    /* renamed from: ʾˈ, reason: contains not printable characters */
    public boolean f1583;

    /* renamed from: ˆﾞ, reason: contains not printable characters */
    public int f1584;

    /* renamed from: ˊﹶ, reason: contains not printable characters */
    public final ArrayList f1585;

    /* renamed from: ˏ, reason: contains not printable characters */
    public int f1586;

    /* renamed from: ᐧʼ, reason: contains not printable characters */
    public final Handler f1587;

    /* renamed from: ᵢᵢ, reason: contains not printable characters */
    public boolean f1588;

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.f1582 = new C2755(0);
        this.f1587 = new Handler(Looper.getMainLooper());
        this.f1583 = true;
        this.f1584 = 0;
        this.f1588 = false;
        this.f1586 = Integer.MAX_VALUE;
        this.f1581 = new RunnableC0183(11, this);
        this.f1585 = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2283.f9055, i, 0);
        this.f1583 = typedArrayObtainStyledAttributes.getBoolean(2, typedArrayObtainStyledAttributes.getBoolean(2, true));
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            int i2 = typedArrayObtainStyledAttributes.getInt(1, typedArrayObtainStyledAttributes.getInt(1, Integer.MAX_VALUE));
            if (i2 != Integer.MAX_VALUE && TextUtils.isEmpty(this.f1558)) {
                getClass().getSimpleName().concat(" should have a key defined if it contains an expandable preference");
            }
            this.f1586 = i2;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    /* renamed from: ʽᐧ */
    public final void mo1182(Bundle bundle) {
        super.mo1182(bundle);
        int size = this.f1585.size();
        for (int i = 0; i < size; i++) {
            m1202(i).mo1182(bundle);
        }
    }

    @Override // androidx.preference.Preference
    /* renamed from: ˉⁱ */
    public final void mo1186() {
        super.mo1186();
        this.f1588 = true;
        int size = this.f1585.size();
        for (int i = 0; i < size; i++) {
            m1202(i).mo1186();
        }
    }

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final Preference m1202(int i) {
        return (Preference) this.f1585.get(i);
    }

    @Override // androidx.preference.Preference
    /* renamed from: ˎٴ */
    public final void mo1170(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C2288.class)) {
            super.mo1170(parcelable);
            return;
        }
        C2288 c2288 = (C2288) parcelable;
        this.f1586 = c2288.f9063;
        super.mo1170(c2288.getSuperState());
    }

    @Override // androidx.preference.Preference
    /* renamed from: ˏʾ */
    public final void mo1189(boolean z) {
        super.mo1189(z);
        int size = this.f1585.size();
        for (int i = 0; i < size; i++) {
            Preference preferenceM1202 = m1202(i);
            if (preferenceM1202.f1567 == z) {
                preferenceM1202.f1567 = !z;
                preferenceM1202.mo1189(preferenceM1202.mo1169());
                preferenceM1202.mo1168();
            }
        }
    }

    @Override // androidx.preference.Preference
    /* renamed from: ˑʽ */
    public final void mo1190(Bundle bundle) {
        super.mo1190(bundle);
        int size = this.f1585.size();
        for (int i = 0; i < size; i++) {
            m1202(i).mo1190(bundle);
        }
    }

    @Override // androidx.preference.Preference
    /* renamed from: ˑי */
    public final void mo1191() {
        m1185();
        this.f1588 = false;
        int size = this.f1585.size();
        for (int i = 0; i < size; i++) {
            m1202(i).mo1191();
        }
    }

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final void m1203() {
        synchronized (this) {
            try {
                ArrayList arrayList = this.f1585;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    m1204((Preference) arrayList.get(0));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C2311 c2311 = this.f1561;
        if (c2311 != null) {
            Handler handler = c2311.f9125;
            RunnableC0183 runnableC0183 = c2311.f9129;
            handler.removeCallbacks(runnableC0183);
            handler.post(runnableC0183);
        }
    }

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final boolean m1204(Preference preference) {
        boolean zRemove;
        synchronized (this) {
            try {
                preference.m1185();
                if (preference.f1568 == this) {
                    preference.f1568 = null;
                }
                zRemove = this.f1585.remove(preference);
                if (zRemove) {
                    String str = preference.f1558;
                    if (str != null) {
                        this.f1582.put(str, Long.valueOf(preference.mo1183()));
                        this.f1587.removeCallbacks(this.f1581);
                        this.f1587.post(this.f1581);
                    }
                    if (this.f1588) {
                        preference.mo1191();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zRemove;
    }

    @Override // androidx.preference.Preference
    /* renamed from: ᵎˏ */
    public final Parcelable mo1171() {
        this.f1555 = true;
        return new C2288(AbsSavedState.EMPTY_STATE, this.f1586);
    }

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final void m1205(Preference preference) {
        long jM6353;
        if (this.f1585.contains(preference)) {
            return;
        }
        if (preference.f1558 != null) {
            PreferenceGroup preferenceGroup = this;
            while (true) {
                PreferenceGroup preferenceGroup2 = preferenceGroup.f1568;
                if (preferenceGroup2 == null) {
                    break;
                } else {
                    preferenceGroup = preferenceGroup2;
                }
            }
            String str = preference.f1558;
            if (preferenceGroup.m1206(str) != null) {
                String str2 = "Found duplicated key: \"" + str + "\". This can cause unintended behaviour, please use unique keys for every preference.";
            }
        }
        if (preference.f1550 == Integer.MAX_VALUE) {
            if (this.f1583) {
                int i = this.f1584;
                this.f1584 = i + 1;
                preference.m1198(i);
            }
            if (preference instanceof PreferenceGroup) {
                ((PreferenceGroup) preference).f1583 = this.f1583;
            }
        }
        int iBinarySearch = Collections.binarySearch(this.f1585, preference);
        if (iBinarySearch < 0) {
            iBinarySearch = (iBinarySearch * (-1)) - 1;
        }
        boolean zMo1169 = mo1169();
        if (preference.f1567 == zMo1169) {
            preference.f1567 = !zMo1169;
            preference.mo1189(preference.mo1169());
            preference.mo1168();
        }
        synchronized (this) {
            this.f1585.add(iBinarySearch, preference);
        }
        C2308 c2308 = this.f1545;
        String str3 = preference.f1558;
        if (str3 == null || !this.f1582.containsKey(str3)) {
            jM6353 = c2308.m6353();
        } else {
            jM6353 = ((Long) this.f1582.get(str3)).longValue();
            this.f1582.remove(str3);
        }
        preference.f1564 = jM6353;
        preference.f1546 = true;
        try {
            preference.m1188(c2308);
            preference.f1546 = false;
            if (preference.f1568 != null) {
                throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
            }
            preference.f1568 = this;
            if (this.f1588) {
                preference.mo1186();
            }
            C2311 c2311 = this.f1561;
            if (c2311 != null) {
                Handler handler = c2311.f9125;
                RunnableC0183 runnableC0183 = c2311.f9129;
                handler.removeCallbacks(runnableC0183);
                handler.post(runnableC0183);
            }
        } catch (Throwable th) {
            preference.f1546 = false;
            throw th;
        }
    }

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final Preference m1206(CharSequence charSequence) {
        Preference preferenceM1206;
        if (charSequence == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        if (TextUtils.equals(this.f1558, charSequence)) {
            return this;
        }
        int size = this.f1585.size();
        for (int i = 0; i < size; i++) {
            Preference preferenceM1202 = m1202(i);
            if (TextUtils.equals(preferenceM1202.f1558, charSequence)) {
                return preferenceM1202;
            }
            if ((preferenceM1202 instanceof PreferenceGroup) && (preferenceM1206 = ((PreferenceGroup) preferenceM1202).m1206(charSequence)) != null) {
                return preferenceM1206;
            }
        }
        return null;
    }
}
