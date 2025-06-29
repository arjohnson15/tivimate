package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.widget.SeekBar;
import android.widget.TextView;
import org.lsposed.hiddenapibypass.library.R;
import p149.AbstractC2283;
import p149.C2284;
import p149.C2290;
import p149.C2302;
import p149.ViewOnKeyListenerC2301;

/* loaded from: classes.dex */
public class SeekBarPreference extends Preference {

    /* renamed from: ʻ, reason: contains not printable characters */
    public final boolean f1590;

    /* renamed from: ʻʻ, reason: contains not printable characters */
    public int f1591;

    /* renamed from: ʽⁱ, reason: contains not printable characters */
    public final boolean f1592;

    /* renamed from: ʾˈ, reason: contains not printable characters */
    public int f1593;

    /* renamed from: ˆﾞ, reason: contains not printable characters */
    public boolean f1594;

    /* renamed from: ˊˆ, reason: contains not printable characters */
    public final boolean f1595;

    /* renamed from: ˊﹶ, reason: contains not printable characters */
    public int f1596;

    /* renamed from: ˏ, reason: contains not printable characters */
    public TextView f1597;

    /* renamed from: ᐧʼ, reason: contains not printable characters */
    public int f1598;

    /* renamed from: ᐧᴵ, reason: contains not printable characters */
    public final C2290 f1599;

    /* renamed from: ᵢᵢ, reason: contains not printable characters */
    public SeekBar f1600;

    /* renamed from: ﹶﾞ, reason: contains not printable characters */
    public final ViewOnKeyListenerC2301 f1601;

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr._2_res_0x7f0404f6, 0);
        this.f1599 = new C2290(this);
        this.f1601 = new ViewOnKeyListenerC2301(0, this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2283.f9048, R.attr._2_res_0x7f0404f6, 0);
        this.f1598 = typedArrayObtainStyledAttributes.getInt(3, 0);
        int i = typedArrayObtainStyledAttributes.getInt(1, 100);
        int i2 = this.f1598;
        i = i < i2 ? i2 : i;
        if (i != this.f1596) {
            this.f1596 = i;
            mo1168();
        }
        int i3 = typedArrayObtainStyledAttributes.getInt(4, 0);
        if (i3 != this.f1593) {
            this.f1593 = Math.min(this.f1596 - this.f1598, Math.abs(i3));
            mo1168();
        }
        this.f1590 = typedArrayObtainStyledAttributes.getBoolean(2, true);
        this.f1592 = typedArrayObtainStyledAttributes.getBoolean(5, false);
        this.f1595 = typedArrayObtainStyledAttributes.getBoolean(6, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    /* renamed from: ˎٴ */
    public final void mo1170(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C2284.class)) {
            super.mo1170(parcelable);
            return;
        }
        C2284 c2284 = (C2284) parcelable;
        super.mo1170(c2284.getSuperState());
        this.f1591 = c2284.f9058;
        this.f1598 = c2284.f9056;
        this.f1596 = c2284.f9057;
        mo1168();
    }

    @Override // androidx.preference.Preference
    /* renamed from: ᴵʿ */
    public final void mo1166(C2302 c2302) {
        super.mo1166(c2302);
        c2302.f5618.setOnKeyListener(this.f1601);
        this.f1600 = (SeekBar) c2302.m6346(R.id._2_res_0x7f0b0338);
        TextView textView = (TextView) c2302.m6346(R.id._2_res_0x7f0b0339);
        this.f1597 = textView;
        if (this.f1592) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.f1597 = null;
        }
        SeekBar seekBar = this.f1600;
        if (seekBar == null) {
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.f1599);
        this.f1600.setMax(this.f1596 - this.f1598);
        int i = this.f1593;
        if (i != 0) {
            this.f1600.setKeyProgressIncrement(i);
        } else {
            this.f1593 = this.f1600.getKeyProgressIncrement();
        }
        this.f1600.setProgress(this.f1591 - this.f1598);
        int i2 = this.f1591;
        TextView textView2 = this.f1597;
        if (textView2 != null) {
            textView2.setText(String.valueOf(i2));
        }
        this.f1600.setEnabled(mo1200());
    }

    @Override // androidx.preference.Preference
    /* renamed from: ᵎˏ */
    public final Parcelable mo1171() {
        this.f1555 = true;
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.f1570) {
            return absSavedState;
        }
        C2284 c2284 = new C2284(absSavedState);
        c2284.f9058 = this.f1591;
        c2284.f9056 = this.f1598;
        c2284.f9057 = this.f1596;
        return c2284;
    }

    @Override // androidx.preference.Preference
    /* renamed from: ᵎـ */
    public final Object mo1172(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final void m1207(int i, boolean z) {
        int i2 = this.f1598;
        if (i < i2) {
            i = i2;
        }
        int i3 = this.f1596;
        if (i > i3) {
            i = i3;
        }
        if (i != this.f1591) {
            this.f1591 = i;
            TextView textView = this.f1597;
            if (textView != null) {
                textView.setText(String.valueOf(i));
            }
            if (m1196()) {
                int i4 = ~i;
                if (m1196() && m1195() == null) {
                    i4 = this.f1545.m6355().getInt(this.f1558, i4);
                }
                if (i != i4) {
                    if (m1195() != null) {
                        throw new UnsupportedOperationException("Not implemented on this data store");
                    }
                    SharedPreferences.Editor editorM6352 = this.f1545.m6352();
                    editorM6352.putInt(this.f1558, i);
                    if (!this.f1545.f9117) {
                        editorM6352.apply();
                    }
                }
            }
            if (z) {
                mo1168();
            }
        }
    }

    @Override // androidx.preference.Preference
    /* renamed from: ﹳˎ */
    public final void mo1174(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        int iIntValue = ((Integer) obj).intValue();
        if (m1196() && m1195() == null) {
            iIntValue = this.f1545.m6355().getInt(this.f1558, iIntValue);
        }
        m1207(iIntValue, true);
    }
}
