package p070;

/* renamed from: ʿ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1548 implements InterfaceC1564 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Class f6283;

    public C1548(Class cls) {
        this.f6283 = cls;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1548) {
            if (AbstractC1549.m5138(this.f6283, ((C1548) obj).f6283)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f6283.hashCode();
    }

    public final String toString() {
        return this.f6283.toString() + " (Kotlin reflection is not available)";
    }

    @Override // p070.InterfaceC1564
    /* renamed from: ـﹶ */
    public final Class mo5134() {
        return this.f6283;
    }
}
