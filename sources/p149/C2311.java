package p149;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.leanback.widget.RunnableC0183;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.lsposed.hiddenapibypass.library.R;
import p061.AbstractC1373;
import p061.AbstractC1375;
import p331.C3759;
import p378.AbstractC4345;
import ᴵﹳ.ٴˎ;

/* renamed from: ˊʾ.ﾞʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2311 extends AbstractC1373 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public ArrayList f9124;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public ArrayList f9126;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final ArrayList f9127;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final PreferenceScreen f9128;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final RunnableC0183 f9129 = new RunnableC0183(12, this);

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final Handler f9125 = new Handler(Looper.getMainLooper());

    public C2311(PreferenceScreen preferenceScreen) {
        this.f9128 = preferenceScreen;
        preferenceScreen.f1561 = this;
        this.f9124 = new ArrayList();
        this.f9126 = new ArrayList();
        this.f9127 = new ArrayList();
        m4760(preferenceScreen.f1589);
        m6362();
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public static boolean m6357(PreferenceGroup preferenceGroup) {
        return preferenceGroup.f1586 != Integer.MAX_VALUE;
    }

    @Override // p061.AbstractC1373
    /* renamed from: ʽᐧ */
    public final long mo2854(int i) {
        if (this.f5596) {
            return m6361(i).mo1183();
        }
        return -1L;
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final int m6358(String str) {
        int size = this.f9126.size();
        for (int i = 0; i < size; i++) {
            if (TextUtils.equals(str, ((Preference) this.f9126.get(i)).f1558)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final ArrayList m6359(PreferenceGroup preferenceGroup) {
        boolean z = false;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = preferenceGroup.f1585.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Preference preferenceM1202 = preferenceGroup.m1202(i2);
            if (preferenceM1202.f1544) {
                if (!m6357(preferenceGroup) || i < preferenceGroup.f1586) {
                    arrayList.add(preferenceM1202);
                } else {
                    arrayList2.add(preferenceM1202);
                }
                if (preferenceM1202 instanceof PreferenceGroup) {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceM1202;
                    if (preferenceGroup2 instanceof PreferenceScreen) {
                        continue;
                    } else {
                        if (m6357(preferenceGroup) && m6357(preferenceGroup2)) {
                            throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                        }
                        Iterator it = m6359(preferenceGroup2).iterator();
                        while (it.hasNext()) {
                            Preference preference = (Preference) it.next();
                            if (!m6357(preferenceGroup) || i < preferenceGroup.f1586) {
                                arrayList.add(preference);
                            } else {
                                arrayList2.add(preference);
                            }
                            i++;
                        }
                    }
                } else {
                    i++;
                }
            }
        }
        if (m6357(preferenceGroup) && i > preferenceGroup.f1586) {
            long j = preferenceGroup.f1564;
            CharSequence string = null;
            C2281 c2281 = new C2281(preferenceGroup.f1565, null);
            c2281.f1562 = R.layout._2_res_0x7f0e0042;
            Context context = c2281.f1565;
            c2281.m1201(ٴˎ.ˏᵢ(context, R.drawable._2_res_0x7f080116));
            c2281.f1579 = R.drawable._2_res_0x7f080116;
            c2281.m1197(context.getString(R.string._2_res_0x7f1300c0));
            c2281.m1198(999);
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Preference preference2 = (Preference) it2.next();
                CharSequence charSequence = preference2.f1560;
                boolean z2 = preference2 instanceof PreferenceGroup;
                if (z2 && !TextUtils.isEmpty(charSequence)) {
                    arrayList3.add((PreferenceGroup) preference2);
                }
                if (arrayList3.contains(preference2.f1568)) {
                    if (z2) {
                        arrayList3.add((PreferenceGroup) preference2);
                    }
                } else if (!TextUtils.isEmpty(charSequence)) {
                    string = string == null ? charSequence : context.getString(R.string._2_res_0x7f1303ea, string, charSequence);
                }
            }
            c2281.mo1175(string);
            c2281.f9033 = j + 1000000;
            c2281.f1577 = new C3759(8, this, preferenceGroup, z);
            arrayList.add(c2281);
        }
        return arrayList;
    }

    @Override // p061.AbstractC1373
    /* renamed from: ˑʽ */
    public final int mo972(int i) {
        C2312 c2312 = new C2312(m6361(i));
        ArrayList arrayList = this.f9127;
        int iIndexOf = arrayList.indexOf(c2312);
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        int size = arrayList.size();
        arrayList.add(c2312);
        return size;
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public final void m6360(ArrayList arrayList, PreferenceGroup preferenceGroup) {
        synchronized (preferenceGroup) {
            Collections.sort(preferenceGroup.f1585);
        }
        int size = preferenceGroup.f1585.size();
        for (int i = 0; i < size; i++) {
            Preference preferenceM1202 = preferenceGroup.m1202(i);
            arrayList.add(preferenceM1202);
            C2312 c2312 = new C2312(preferenceM1202);
            if (!this.f9127.contains(c2312)) {
                this.f9127.add(c2312);
            }
            if (preferenceM1202 instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceM1202;
                if (!(preferenceGroup2 instanceof PreferenceScreen)) {
                    m6360(arrayList, preferenceGroup2);
                }
            }
            preferenceM1202.f1561 = this;
        }
    }

    @Override // p061.AbstractC1373
    /* renamed from: ـﹶ */
    public final int mo974() {
        return this.f9126.size();
    }

    @Override // p061.AbstractC1373
    /* renamed from: ᐧʻ */
    public final void mo975(AbstractC1375 abstractC1375, int i) {
        ColorStateList colorStateList;
        C2302 c2302 = (C2302) abstractC1375;
        Preference preferenceM6361 = m6361(i);
        View view = c2302.f5618;
        Drawable background = view.getBackground();
        Drawable drawable = c2302.f9092;
        if (background != drawable) {
            WeakHashMap weakHashMap = AbstractC4345.f16838;
            view.setBackground(drawable);
        }
        TextView textView = (TextView) c2302.m6346(android.R.id.title);
        if (textView != null && (colorStateList = c2302.f9089) != null && !textView.getTextColors().equals(colorStateList)) {
            textView.setTextColor(colorStateList);
        }
        preferenceM6361.mo1166(c2302);
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final Preference m6361(int i) {
        if (i < 0 || i >= this.f9126.size()) {
            return null;
        }
        return (Preference) this.f9126.get(i);
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final void m6362() {
        Iterator it = this.f9124.iterator();
        while (it.hasNext()) {
            ((Preference) it.next()).f1561 = null;
        }
        ArrayList arrayList = new ArrayList(this.f9124.size());
        this.f9124 = arrayList;
        PreferenceScreen preferenceScreen = this.f9128;
        m6360(arrayList, preferenceScreen);
        this.f9126 = m6359(preferenceScreen);
        m4765();
        Iterator it2 = this.f9124.iterator();
        while (it2.hasNext()) {
            ((Preference) it2.next()).getClass();
        }
    }

    @Override // p061.AbstractC1373
    /* renamed from: ﹶˆ */
    public final AbstractC1375 mo977(ViewGroup viewGroup, int i) {
        C2312 c2312 = (C2312) this.f9127.get(i);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        TypedArray typedArrayObtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, AbstractC2283.f9051);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = ٴˎ.ˏᵢ(viewGroup.getContext(), android.R.drawable.list_selector_background);
        }
        typedArrayObtainStyledAttributes.recycle();
        View viewInflate = layoutInflaterFrom.inflate(c2312.f9132, viewGroup, false);
        if (viewInflate.getBackground() == null) {
            WeakHashMap weakHashMap = AbstractC4345.f16838;
            viewInflate.setBackground(drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(android.R.id.widget_frame);
        if (viewGroup2 != null) {
            int i2 = c2312.f9130;
            if (i2 != 0) {
                layoutInflaterFrom.inflate(i2, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new C2302(viewInflate);
    }
}
