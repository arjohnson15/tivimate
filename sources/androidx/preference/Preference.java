package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.v4.media.session.AbstractC0002;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.leanback.widget.RunnableC0183;
import androidx.leanback.widget.ViewOnClickListenerC0202;
import ar.tvplayer.tv.base.ui.OnOffPreference;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.lsposed.hiddenapibypass.library.R;
import p015.C1067;
import p070.AbstractC1549;
import p149.AbstractC2282;
import p149.AbstractC2283;
import p149.C2302;
import p149.C2308;
import p149.C2311;
import p149.InterfaceC2303;
import p149.ViewOnCreateContextMenuListenerC2289;
import p331.C3759;
import p371.AbstractC4205;
import p378.AbstractC4345;
import p395.AbstractC4535;
import ᴵﹳ.ٴˎ;

/* loaded from: classes.dex */
public class Preference implements Comparable<Preference> {

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public boolean f1540;

    /* renamed from: ʻﹳ, reason: contains not printable characters */
    public boolean f1541;

    /* renamed from: ʽˆ, reason: contains not printable characters */
    public final boolean f1542;

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public Drawable f1543;

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public boolean f1544;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public C2308 f1545;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public boolean f1546;

    /* renamed from: ˈﹳ, reason: contains not printable characters */
    public final boolean f1547;

    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public final boolean f1548;

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public final Object f1549;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public int f1550;

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public boolean f1551;

    /* renamed from: ˎˉ, reason: contains not printable characters */
    public final boolean f1552;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public AbstractC4535 f1553;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public Bundle f1554;

    /* renamed from: ˎᵢ, reason: contains not printable characters */
    public boolean f1555;

    /* renamed from: ˑʾ, reason: contains not printable characters */
    public ViewOnCreateContextMenuListenerC2289 f1556;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public Intent f1557;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public String f1558;

    /* renamed from: יˋ, reason: contains not printable characters */
    public final boolean f1559;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public CharSequence f1560;

    /* renamed from: ـᵎ, reason: contains not printable characters */
    public C2311 f1561;

    /* renamed from: ٴᐧ, reason: contains not printable characters */
    public int f1562;

    /* renamed from: ٴﹶ, reason: contains not printable characters */
    public final int f1563;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public long f1564;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Context f1565;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public CharSequence f1566;

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public boolean f1567;

    /* renamed from: ᵎʾ, reason: contains not printable characters */
    public PreferenceGroup f1568;

    /* renamed from: ᵎᵢ, reason: contains not printable characters */
    public ArrayList f1569;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public boolean f1570;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public boolean f1571;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public boolean f1572;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public C1067 f1573;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public final String f1574;

    /* renamed from: ⁱʿ, reason: contains not printable characters */
    public final boolean f1575;

    /* renamed from: ⁱⁱ, reason: contains not printable characters */
    public InterfaceC2303 f1576;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public C3759 f1577;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public final String f1578;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public int f1579;

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public final ViewOnClickListenerC0202 f1580;

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC4205.m9642(context, R.attr._2_res_0x7f0404a3, android.R.attr.preferenceStyle), 0);
    }

    public Preference(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f1550 = Integer.MAX_VALUE;
        this.f1572 = true;
        this.f1540 = true;
        this.f1570 = true;
        this.f1551 = true;
        this.f1567 = true;
        this.f1544 = true;
        this.f1548 = true;
        this.f1575 = true;
        this.f1559 = true;
        this.f1542 = true;
        this.f1562 = R.layout._2_res_0x7f0e011d;
        this.f1580 = new ViewOnClickListenerC0202(3, this);
        this.f1565 = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2283.f9053, i, i2);
        this.f1579 = typedArrayObtainStyledAttributes.getResourceId(23, typedArrayObtainStyledAttributes.getResourceId(0, 0));
        String string = typedArrayObtainStyledAttributes.getString(26);
        this.f1558 = string == null ? typedArrayObtainStyledAttributes.getString(6) : string;
        CharSequence text = typedArrayObtainStyledAttributes.getText(34);
        this.f1560 = text == null ? typedArrayObtainStyledAttributes.getText(4) : text;
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(33);
        this.f1566 = text2 == null ? typedArrayObtainStyledAttributes.getText(7) : text2;
        this.f1550 = typedArrayObtainStyledAttributes.getInt(28, typedArrayObtainStyledAttributes.getInt(8, Integer.MAX_VALUE));
        String string2 = typedArrayObtainStyledAttributes.getString(22);
        this.f1574 = string2 == null ? typedArrayObtainStyledAttributes.getString(13) : string2;
        this.f1562 = typedArrayObtainStyledAttributes.getResourceId(27, typedArrayObtainStyledAttributes.getResourceId(3, R.layout._2_res_0x7f0e011d));
        this.f1563 = typedArrayObtainStyledAttributes.getResourceId(35, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        this.f1572 = typedArrayObtainStyledAttributes.getBoolean(21, typedArrayObtainStyledAttributes.getBoolean(2, true));
        this.f1540 = typedArrayObtainStyledAttributes.getBoolean(30, typedArrayObtainStyledAttributes.getBoolean(5, true));
        this.f1570 = typedArrayObtainStyledAttributes.getBoolean(29, typedArrayObtainStyledAttributes.getBoolean(1, true));
        String string3 = typedArrayObtainStyledAttributes.getString(19);
        this.f1578 = string3 == null ? typedArrayObtainStyledAttributes.getString(10) : string3;
        this.f1548 = typedArrayObtainStyledAttributes.getBoolean(16, typedArrayObtainStyledAttributes.getBoolean(16, this.f1540));
        this.f1575 = typedArrayObtainStyledAttributes.getBoolean(17, typedArrayObtainStyledAttributes.getBoolean(17, this.f1540));
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            this.f1549 = mo1172(typedArrayObtainStyledAttributes, 18);
        } else if (typedArrayObtainStyledAttributes.hasValue(11)) {
            this.f1549 = mo1172(typedArrayObtainStyledAttributes, 11);
        }
        this.f1542 = typedArrayObtainStyledAttributes.getBoolean(31, typedArrayObtainStyledAttributes.getBoolean(12, true));
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(32);
        this.f1552 = zHasValue;
        if (zHasValue) {
            this.f1559 = typedArrayObtainStyledAttributes.getBoolean(32, typedArrayObtainStyledAttributes.getBoolean(14, true));
        }
        this.f1541 = typedArrayObtainStyledAttributes.getBoolean(24, typedArrayObtainStyledAttributes.getBoolean(15, false));
        this.f1544 = typedArrayObtainStyledAttributes.getBoolean(25, typedArrayObtainStyledAttributes.getBoolean(25, true));
        this.f1547 = typedArrayObtainStyledAttributes.getBoolean(20, typedArrayObtainStyledAttributes.getBoolean(20, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public static void m1181(View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                m1181(viewGroup.getChildAt(childCount), z);
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Preference preference) {
        Preference preference2 = preference;
        int i = this.f1550;
        int i2 = preference2.f1550;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.f1560;
        CharSequence charSequence2 = preference2.f1560;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference2.f1560.toString());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.f1560;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence charSequenceMo1177 = mo1177();
        if (!TextUtils.isEmpty(charSequenceMo1177)) {
            sb.append(charSequenceMo1177);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public void mo1182(Bundle bundle) {
        Parcelable parcelable;
        if (TextUtils.isEmpty(this.f1558) || (parcelable = bundle.getParcelable(this.f1558)) == null) {
            return;
        }
        this.f1555 = false;
        mo1170(parcelable);
        if (!this.f1555) {
            throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public long mo1183() {
        return this.f1564;
    }

    /* renamed from: ʿˏ */
    public void mo1164(View view) {
        Intent intent;
        AbstractC2282 abstractC2282;
        if (mo1200() && this.f1540) {
            mo1167();
            C3759 c3759 = this.f1577;
            if (c3759 != null) {
                ((PreferenceGroup) c3759.f14522).f1586 = Integer.MAX_VALUE;
                C2311 c2311 = (C2311) c3759.f14523;
                Handler handler = c2311.f9125;
                RunnableC0183 runnableC0183 = c2311.f9129;
                handler.removeCallbacks(runnableC0183);
                handler.post(runnableC0183);
                return;
            }
            C2308 c2308 = this.f1545;
            if ((c2308 == null || (abstractC2282 = (AbstractC2282) c2308.f9112) == null || !abstractC2282.m6303(this)) && (intent = this.f1557) != null) {
                this.f1565.startActivity(intent);
            }
        }
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final void m1184(boolean z) {
        if (this.f1544 != z) {
            this.f1544 = z;
            C2311 c2311 = this.f1561;
            if (c2311 != null) {
                Handler handler = c2311.f9125;
                RunnableC0183 runnableC0183 = c2311.f9129;
                handler.removeCallbacks(runnableC0183);
                handler.post(runnableC0183);
            }
        }
    }

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final void m1185() {
        ArrayList arrayList;
        PreferenceScreen preferenceScreen;
        String str = this.f1578;
        if (str != null) {
            C2308 c2308 = this.f1545;
            Preference preferenceM1206 = null;
            if (c2308 != null && (preferenceScreen = (PreferenceScreen) c2308.f9116) != null) {
                preferenceM1206 = preferenceScreen.m1206(str);
            }
            if (preferenceM1206 == null || (arrayList = preferenceM1206.f1569) == null) {
                return;
            }
            arrayList.remove(this);
        }
    }

    /* renamed from: ˈٴ */
    public void mo1175(CharSequence charSequence) {
        if (this.f1576 != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        }
        if (TextUtils.equals(this.f1566, charSequence)) {
            return;
        }
        this.f1566 = charSequence;
        mo1168();
    }

    /* renamed from: ˉי */
    public void mo1168() {
        int iIndexOf;
        C2311 c2311 = this.f1561;
        if (c2311 == null || (iIndexOf = c2311.f9126.indexOf(this)) == -1) {
            return;
        }
        c2311.f5598.m4956(iIndexOf, 1, this);
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public void mo1186() {
        PreferenceScreen preferenceScreen;
        String str = this.f1578;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C2308 c2308 = this.f1545;
        Preference preferenceM1206 = null;
        if (c2308 != null && (preferenceScreen = (PreferenceScreen) c2308.f9116) != null) {
            preferenceM1206 = preferenceScreen.m1206(str);
        }
        if (preferenceM1206 == null) {
            StringBuilder sbM50 = AbstractC0002.m50("Dependency \"", str, "\" not found for preference \"");
            sbM50.append(this.f1558);
            sbM50.append("\" (title: \"");
            sbM50.append((Object) this.f1560);
            sbM50.append("\"");
            throw new IllegalStateException(sbM50.toString());
        }
        if (preferenceM1206.f1569 == null) {
            preferenceM1206.f1569 = new ArrayList();
        }
        preferenceM1206.f1569.add(this);
        boolean zMo1169 = preferenceM1206.mo1169();
        if (this.f1551 == zMo1169) {
            this.f1551 = !zMo1169;
            mo1189(mo1169());
            mo1168();
        }
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public final void m1187(String str) {
        if (m1196() && !TextUtils.equals(str, m1194(null))) {
            AbstractC4535 abstractC4535M1195 = m1195();
            if (abstractC4535M1195 != null) {
                abstractC4535M1195.m10398(this.f1558, str);
                return;
            }
            SharedPreferences.Editor editorM6352 = this.f1545.m6352();
            editorM6352.putString(this.f1558, str);
            if (this.f1545.f9117) {
                return;
            }
            editorM6352.apply();
        }
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final void m1188(C2308 c2308) {
        this.f1545 = c2308;
        if (!this.f1546) {
            this.f1564 = c2308.m6353();
        }
        AbstractC4535 abstractC4535M1195 = m1195();
        Object obj = this.f1549;
        if (abstractC4535M1195 != null) {
            mo1174(obj);
            return;
        }
        if (m1196()) {
            if (((this.f1545 == null || m1195() != null) ? null : this.f1545.m6355()).contains(this.f1558)) {
                mo1174(null);
                return;
            }
        }
        if (obj != null) {
            mo1174(obj);
        }
    }

    /* renamed from: ˎˑ */
    public boolean mo1169() {
        return !mo1200();
    }

    /* renamed from: ˎٴ */
    public void mo1170(Parcelable parcelable) {
        this.f1555 = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public void mo1189(boolean z) {
        ArrayList arrayList = this.f1569;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Preference preference = (Preference) arrayList.get(i);
            if (preference.f1551 == z) {
                preference.f1551 = !z;
                preference.mo1189(preference.mo1169());
                preference.mo1168();
            }
        }
    }

    /* renamed from: ˏᴵ */
    public void mo1167() {
    }

    /* renamed from: ˏᵢ */
    public CharSequence mo1177() {
        InterfaceC2303 interfaceC2303 = this.f1576;
        return interfaceC2303 != null ? interfaceC2303.m6347(this) : this.f1566;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public void mo1190(Bundle bundle) {
        if (TextUtils.isEmpty(this.f1558)) {
            return;
        }
        this.f1555 = false;
        Parcelable parcelableMo1171 = mo1171();
        if (!this.f1555) {
            throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
        }
        if (parcelableMo1171 != null) {
            bundle.putParcelable(this.f1558, parcelableMo1171);
        }
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public void mo1191() {
        m1185();
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public final void m1192(String str) {
        this.f1558 = str;
        if (this.f1571 && TextUtils.isEmpty(str)) {
            if (TextUtils.isEmpty(this.f1558)) {
                throw new IllegalStateException("Preference does not have a key assigned.");
            }
            this.f1571 = true;
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m1193(Serializable serializable) {
        C1067 c1067 = this.f1573;
        if (c1067 != null) {
            boolean zM5138 = AbstractC1549.m5138(serializable, Boolean.TRUE);
            OnOffPreference onOffPreference = (OnOffPreference) c1067.f4608;
            onOffPreference.getClass();
            onOffPreference.m1197(onOffPreference.f1565.getString(zM5138 ? R.string.on : R.string.off));
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final String m1194(String str) {
        if (!m1196()) {
            return str;
        }
        AbstractC4535 abstractC4535M1195 = m1195();
        return abstractC4535M1195 != null ? abstractC4535M1195.m10399(this.f1558, str) : this.f1545.m6355().getString(this.f1558, str);
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final AbstractC4535 m1195() {
        AbstractC4535 abstractC4535 = this.f1553;
        if (abstractC4535 != null) {
            return abstractC4535;
        }
        C2308 c2308 = this.f1545;
        if (c2308 != null) {
            c2308.getClass();
        }
        return null;
    }

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final boolean m1196() {
        return (this.f1545 == null || !this.f1570 || TextUtils.isEmpty(this.f1558)) ? false : true;
    }

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final void m1197(String str) {
        if (TextUtils.equals(str, this.f1560)) {
            return;
        }
        this.f1560 = str;
        mo1168();
    }

    /* renamed from: ᴵʿ */
    public void mo1166(C2302 c2302) {
        Integer numValueOf;
        View view = c2302.f5618;
        view.setOnClickListener(this.f1580);
        view.setId(0);
        TextView textView = (TextView) c2302.m6346(android.R.id.summary);
        if (textView != null) {
            CharSequence charSequenceMo1177 = mo1177();
            if (TextUtils.isEmpty(charSequenceMo1177)) {
                textView.setVisibility(8);
                numValueOf = null;
            } else {
                textView.setText(charSequenceMo1177);
                textView.setVisibility(0);
                numValueOf = Integer.valueOf(textView.getCurrentTextColor());
            }
        } else {
            numValueOf = null;
        }
        TextView textView2 = (TextView) c2302.m6346(android.R.id.title);
        if (textView2 != null) {
            CharSequence charSequence = this.f1560;
            if (TextUtils.isEmpty(charSequence)) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(charSequence);
                textView2.setVisibility(0);
                if (this.f1552) {
                    textView2.setSingleLine(this.f1559);
                }
                if (!this.f1540 && mo1200() && numValueOf != null) {
                    textView2.setTextColor(numValueOf.intValue());
                }
            }
        }
        ImageView imageView = (ImageView) c2302.m6346(android.R.id.icon);
        if (imageView != null) {
            int i = this.f1579;
            if (i != 0 || this.f1543 != null) {
                if (this.f1543 == null) {
                    this.f1543 = ٴˎ.ˏᵢ(this.f1565, i);
                }
                Drawable drawable = this.f1543;
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                }
            }
            if (this.f1543 != null) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(this.f1541 ? 4 : 8);
            }
        }
        View viewM6346 = c2302.m6346(R.id._2_res_0x7f0b01eb);
        if (viewM6346 == null) {
            viewM6346 = c2302.m6346(android.R.id.icon_frame);
        }
        if (viewM6346 != null) {
            if (this.f1543 != null) {
                viewM6346.setVisibility(0);
            } else {
                viewM6346.setVisibility(this.f1541 ? 4 : 8);
            }
        }
        if (this.f1542) {
            m1181(view, mo1200());
        } else {
            m1181(view, true);
        }
        boolean z = this.f1540;
        view.setFocusable(z);
        view.setClickable(z);
        c2302.f9091 = this.f1548;
        c2302.f9088 = this.f1575;
        boolean z2 = this.f1547;
        if (z2 && this.f1556 == null) {
            this.f1556 = new ViewOnCreateContextMenuListenerC2289(this);
        }
        view.setOnCreateContextMenuListener(z2 ? this.f1556 : null);
        view.setLongClickable(z2);
        if (!z2 || z) {
            return;
        }
        WeakHashMap weakHashMap = AbstractC4345.f16838;
        view.setBackground(null);
    }

    /* renamed from: ᵎˏ */
    public Parcelable mo1171() {
        this.f1555 = true;
        return AbsSavedState.EMPTY_STATE;
    }

    /* renamed from: ᵎـ */
    public Object mo1172(TypedArray typedArray, int i) {
        return null;
    }

    /* renamed from: ﹳˎ */
    public void mo1174(Object obj) {
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public final void m1198(int i) {
        if (i != this.f1550) {
            this.f1550 = i;
            C2311 c2311 = this.f1561;
            if (c2311 != null) {
                Handler handler = c2311.f9125;
                RunnableC0183 runnableC0183 = c2311.f9129;
                handler.removeCallbacks(runnableC0183);
                handler.post(runnableC0183);
            }
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final Bundle m1199() {
        if (this.f1554 == null) {
            this.f1554 = new Bundle();
        }
        return this.f1554;
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public boolean mo1200() {
        return this.f1572 && this.f1551 && this.f1567;
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public final void m1201(Drawable drawable) {
        if (this.f1543 != drawable) {
            this.f1543 = drawable;
            this.f1579 = 0;
            mo1168();
        }
    }
}
