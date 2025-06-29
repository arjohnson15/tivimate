package p356;

import java.util.Arrays;
import ⁱـ.ˑי;

/* renamed from: ᵔˋ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4030 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f15501;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int f15502;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f15503;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int f15504;

    public C4030(int i, int i2, String str, String str2) {
        this.f15503 = str;
        this.f15501 = str2;
        this.f15502 = i;
        this.f15504 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4030)) {
            return false;
        }
        C4030 c4030 = (C4030) obj;
        return this.f15502 == c4030.f15502 && this.f15504 == c4030.f15504 && ˑי.ﹶˆ(this.f15503, c4030.f15503) && ˑי.ﹶˆ(this.f15501, c4030.f15501);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15503, this.f15501, Integer.valueOf(this.f15502), Integer.valueOf(this.f15504)});
    }
}
