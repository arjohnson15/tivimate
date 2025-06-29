package p122;

/* renamed from: ˈי.ᵢٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1976 extends AbstractC1962 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f7535;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C1931 f7536;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C1934 f7537;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final long f7538;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final C1908 f7539;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C1979 f7540;

    public C1976(long j, String str, C1934 c1934, C1979 c1979, C1931 c1931, C1908 c1908) {
        this.f7538 = j;
        this.f7535 = str;
        this.f7537 = c1934;
        this.f7540 = c1979;
        this.f7536 = c1931;
        this.f7539 = c1908;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1962)) {
            return false;
        }
        C1976 c1976 = (C1976) ((AbstractC1962) obj);
        if (this.f7538 == c1976.f7538) {
            if (this.f7535.equals(c1976.f7535) && this.f7537.equals(c1976.f7537) && this.f7540.equals(c1976.f7540)) {
                C1931 c1931 = c1976.f7536;
                C1931 c19312 = this.f7536;
                if (c19312 != null ? c19312.equals(c1931) : c1931 == null) {
                    C1908 c1908 = c1976.f7539;
                    C1908 c19082 = this.f7539;
                    if (c19082 == null) {
                        if (c1908 == null) {
                            return true;
                        }
                    } else if (c19082.equals(c1908)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f7538;
        int iHashCode = (((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f7535.hashCode()) * 1000003) ^ this.f7537.hashCode()) * 1000003) ^ this.f7540.hashCode()) * 1000003;
        C1931 c1931 = this.f7536;
        int iHashCode2 = (iHashCode ^ (c1931 == null ? 0 : c1931.hashCode())) * 1000003;
        C1908 c1908 = this.f7539;
        return iHashCode2 ^ (c1908 != null ? c1908.hashCode() : 0);
    }

    public final String toString() {
        return "Event{timestamp=" + this.f7538 + ", type=" + this.f7535 + ", app=" + this.f7537 + ", device=" + this.f7540 + ", log=" + this.f7536 + ", rollouts=" + this.f7539 + "}";
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C1943 m5644() {
        C1943 c1943 = new C1943();
        c1943.f7406 = this.f7538;
        c1943.f7403 = this.f7535;
        c1943.f7405 = this.f7537;
        c1943.f7409 = this.f7540;
        c1943.f7404 = this.f7536;
        c1943.f7407 = this.f7539;
        c1943.f7408 = (byte) 1;
        return c1943;
    }
}
