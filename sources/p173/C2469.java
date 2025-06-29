package p173;

/* renamed from: ˋˋ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2469 extends Number implements Comparable {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public long f9812;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.f9812;
        long j2 = ((C2469) obj).f9812;
        if (j == j2) {
            return 0;
        }
        return j < j2 ? -1 : 1;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return this.f9812;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C2469) && this.f9812 == ((C2469) obj).f9812;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return this.f9812;
    }

    public final int hashCode() {
        long j = this.f9812;
        return (int) (j ^ (j >>> 32));
    }

    @Override // java.lang.Number
    public final int intValue() {
        return (int) this.f9812;
    }

    @Override // java.lang.Number
    public final long longValue() {
        return this.f9812;
    }

    public final String toString() {
        return String.valueOf(this.f9812);
    }
}
