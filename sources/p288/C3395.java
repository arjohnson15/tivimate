package p288;

import java.io.Serializable;
import p070.AbstractC1549;

/* renamed from: ٴˑ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3395 implements Serializable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final Object f13244;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Object f13245;

    public C3395(Object obj, Object obj2) {
        this.f13245 = obj;
        this.f13244 = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3395)) {
            return false;
        }
        C3395 c3395 = (C3395) obj;
        return AbstractC1549.m5138(this.f13245, c3395.f13245) && AbstractC1549.m5138(this.f13244, c3395.f13244);
    }

    public final int hashCode() {
        Object obj = this.f13245;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f13244;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f13245 + ", " + this.f13244 + ')';
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Object m8263() {
        return this.f13244;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Object m8264() {
        return this.f13245;
    }
}
