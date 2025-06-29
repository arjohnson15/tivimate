package p149;

import android.text.TextUtils;
import androidx.preference.Preference;

/* renamed from: ˊʾ.ﾞˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2312 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f9130;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String f9131;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f9132;

    public C2312(Preference preference) {
        this.f9131 = preference.getClass().getName();
        this.f9132 = preference.f1562;
        this.f9130 = preference.f1563;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2312)) {
            return false;
        }
        C2312 c2312 = (C2312) obj;
        return this.f9132 == c2312.f9132 && this.f9130 == c2312.f9130 && TextUtils.equals(this.f9131, c2312.f9131);
    }

    public final int hashCode() {
        return this.f9131.hashCode() + ((((527 + this.f9132) * 31) + this.f9130) * 31);
    }
}
