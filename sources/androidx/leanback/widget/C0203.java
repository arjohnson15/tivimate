package androidx.leanback.widget;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: androidx.leanback.widget.ﾞˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0203 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public Drawable f1201;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f1202;

    /* renamed from: ˉי, reason: contains not printable characters */
    public int f1203;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public int f1204;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public int f1205;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public int f1206;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public int f1207;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public CharSequence f1208;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public long f1209;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public CharSequence f1210;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public CharSequence f1211;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public CharSequence f1212;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public int f1213;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(this.f1208)) {
            sb.append(this.f1208);
        }
        if (!TextUtils.isEmpty(this.f1212)) {
            if (!TextUtils.isEmpty(this.f1208)) {
                sb.append(" ");
            }
            sb.append(this.f1212);
        }
        if (this.f1201 != null && sb.length() == 0) {
            sb.append("(action icon)");
        }
        return sb.toString();
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean m987() {
        int i = this.f1207;
        return i == 1 || i == 2;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final boolean m988() {
        return (this.f1202 & 16) == 16;
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final void m989(boolean z) {
        m995(z ? 16 : 0, 16);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final boolean m990() {
        return (this.f1202 & 1) == 1;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final boolean m991() {
        return this.f1207 == 3;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m992(String str, Bundle bundle) {
        int i;
        if (m994()) {
            String string = bundle.getString(str);
            if (string != null) {
                this.f1208 = string;
                return;
            }
            return;
        }
        if (this.f1207 != 2 || (i = this.f1204 & 4080) == 128 || i == 144 || i == 224) {
            if (this.f1205 != 0) {
                m995(bundle.getBoolean(str, m990()) ? 1 : 0, 1);
            }
        } else {
            String string2 = bundle.getString(str);
            if (string2 != null) {
                this.f1212 = string2;
            }
        }
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m993(String str, Bundle bundle) {
        int i;
        CharSequence charSequence;
        CharSequence charSequence2;
        if (m994() && (charSequence2 = this.f1208) != null) {
            bundle.putString(str, charSequence2.toString());
            return;
        }
        if (this.f1207 == 2 && (i = this.f1204 & 4080) != 128 && i != 144 && i != 224 && (charSequence = this.f1212) != null) {
            bundle.putString(str, charSequence.toString());
        } else if (this.f1205 != 0) {
            bundle.putBoolean(str, m990());
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final boolean m994() {
        return this.f1207 == 1;
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void m995(int i, int i2) {
        this.f1202 = (i & i2) | (this.f1202 & (~i2));
    }
}
