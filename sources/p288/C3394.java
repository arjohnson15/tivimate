package p288;

/* renamed from: ٴˑ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3394 implements Comparable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final C3394 f13242 = new C3394();

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int f13243 = 131092;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f13243 - ((C3394) obj).f13243;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C3394 c3394 = obj instanceof C3394 ? (C3394) obj : null;
        return c3394 != null && this.f13243 == c3394.f13243;
    }

    public final int hashCode() {
        return this.f13243;
    }

    public final String toString() {
        return "2.0.20";
    }
}
