package p329;

/* renamed from: ᴵᵢ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3734 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public Class f14489;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public Class f14490;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public Class f14491;

    public C3734(Class cls, Class cls2, Class cls3) {
        this.f14491 = cls;
        this.f14489 = cls2;
        this.f14490 = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3734.class != obj.getClass()) {
            return false;
        }
        C3734 c3734 = (C3734) obj;
        return this.f14491.equals(c3734.f14491) && this.f14489.equals(c3734.f14489) && AbstractC3742.m8708(this.f14490, c3734.f14490);
    }

    public final int hashCode() {
        int iHashCode = (this.f14489.hashCode() + (this.f14491.hashCode() * 31)) * 31;
        Class cls = this.f14490;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.f14491 + ", second=" + this.f14489 + '}';
    }
}
