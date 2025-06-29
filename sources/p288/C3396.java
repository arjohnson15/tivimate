package p288;

import java.io.Serializable;
import p070.AbstractC1549;

/* renamed from: ٴˑ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3396 implements Serializable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final Object f13246;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final Object f13247;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Object f13248;

    public C3396(Object obj, Object obj2, Object obj3) {
        this.f13248 = obj;
        this.f13246 = obj2;
        this.f13247 = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3396)) {
            return false;
        }
        C3396 c3396 = (C3396) obj;
        return AbstractC1549.m5138(this.f13248, c3396.f13248) && AbstractC1549.m5138(this.f13246, c3396.f13246) && AbstractC1549.m5138(this.f13247, c3396.f13247);
    }

    public final int hashCode() {
        Object obj = this.f13248;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f13246;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f13247;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f13248 + ", " + this.f13246 + ", " + this.f13247 + ')';
    }
}
