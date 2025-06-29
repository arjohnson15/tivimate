package p362;

import android.text.TextUtils;
import ˆʽ.ᵎˏ;

/* renamed from: ᵔᵢ.ﹳˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4127 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean f15996;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final boolean f15997;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f15998;

    public C4127(String str, boolean z, boolean z2) {
        this.f15998 = str;
        this.f15996 = z;
        this.f15997 = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != C4127.class) {
            return false;
        }
        C4127 c4127 = (C4127) obj;
        return TextUtils.equals(this.f15998, c4127.f15998) && this.f15996 == c4127.f15996 && this.f15997 == c4127.f15997;
    }

    public final int hashCode() {
        return ((ᵎˏ.ˏʾ(31, 31, this.f15998) + (this.f15996 ? 1231 : 1237)) * 31) + (this.f15997 ? 1231 : 1237);
    }
}
