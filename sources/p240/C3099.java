package p240;

import j$.util.Objects;

/* renamed from: ˑⁱ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3099 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Object f11982;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Object f11983;

    public C3099(Object obj, Object obj2) {
        this.f11983 = obj;
        this.f11982 = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3099)) {
            return false;
        }
        C3099 c3099 = (C3099) obj;
        return Objects.equals(c3099.f11983, this.f11983) && Objects.equals(c3099.f11982, this.f11982);
    }

    public final int hashCode() {
        Object obj = this.f11983;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f11982;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "Pair{" + this.f11983 + " " + this.f11982 + "}";
    }
}
