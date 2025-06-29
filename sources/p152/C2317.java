package p152;

import j$.util.Objects;
import ˆʽ.ᵎˏ;

/* renamed from: ˊˈ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2317 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f9140;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String f9141;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f9142;

    public C2317(int i, String str, String str2) {
        this.f9142 = str;
        this.f9140 = i;
        this.f9141 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2317)) {
            return false;
        }
        C2317 c2317 = (C2317) obj;
        if (m6366(obj)) {
            if (this.f9140 == c2317.f9140 && Objects.equals(this.f9141, c2317.f9141)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f9140), this.f9141) + (m6365() * 31);
    }

    public final String toString() {
        String str = this.f9142;
        String str2 = str == null ? "null" : ᵎˏ.ˑי("\"", str, "\"");
        Integer numValueOf = Integer.valueOf(this.f9140);
        String str3 = this.f9141;
        return String.format("NetShareInfo1{netName: %s, type: %d, remark: %s}", str2, numValueOf, str3 != null ? ᵎˏ.ˑי("\"", str3, "\"") : "null");
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean m6364(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2317)) {
            return false;
        }
        return Objects.equals(this.f9142, ((C2317) obj).f9142);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int m6365() {
        return Objects.hash(this.f9142);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final boolean m6366(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2317) {
            return m6364(obj);
        }
        return false;
    }
}
