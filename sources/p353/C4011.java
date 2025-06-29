package p353;

/* renamed from: ᵔʿ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4011 extends AbstractC4020 {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Object f15454;

    public C4011(Object obj) {
        this.f15454 = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4011) {
            return this.f15454.equals(((C4011) obj).f15454);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15454.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.f15454 + ")";
    }

    @Override // p353.AbstractC4020
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean mo9268() {
        return true;
    }

    @Override // p353.AbstractC4020
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Object mo9269() {
        return this.f15454;
    }
}
