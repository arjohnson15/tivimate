package p271;

import j$.util.Objects;
import p115.C1831;

/* renamed from: ـٴ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3294 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f12828;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String f12829;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C1831 f12830;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final String f12831;

    public C3294(C1831 c1831, int i, String str, String str2) {
        this.f12830 = c1831;
        this.f12828 = i;
        this.f12829 = str;
        this.f12831 = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3294)) {
            return false;
        }
        C3294 c3294 = (C3294) obj;
        return this.f12830 == c3294.f12830 && this.f12828 == c3294.f12828 && this.f12829.equals(c3294.f12829) && this.f12831.equals(c3294.f12831);
    }

    public final int hashCode() {
        return Objects.hash(this.f12830, Integer.valueOf(this.f12828), this.f12829, this.f12831);
    }

    public final String toString() {
        return "(status=" + this.f12830 + ", keyId=" + this.f12828 + ", keyType='" + this.f12829 + "', keyPrefix='" + this.f12831 + "')";
    }
}
