package p353;

/* renamed from: ᵔʿ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4018 extends AbstractC4020 {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static final C4018 f15467 = new C4018();

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }

    @Override // p353.AbstractC4020
    /* renamed from: ʽᐧ */
    public final boolean mo9268() {
        return false;
    }

    @Override // p353.AbstractC4020
    /* renamed from: ـﹶ */
    public final Object mo9269() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }
}
