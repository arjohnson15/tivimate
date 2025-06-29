package p122;

import ˆʽ.ᵎˏ;

/* renamed from: ˈי.ˎˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1931 extends AbstractC1970 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f7349;

    public C1931(String str) {
        this.f7349 = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1970)) {
            return false;
        }
        return this.f7349.equals(((C1931) ((AbstractC1970) obj)).f7349);
    }

    public final int hashCode() {
        return this.f7349.hashCode() ^ 1000003;
    }

    public final String toString() {
        return ᵎˏ.ˎٴ(new StringBuilder("Log{content="), this.f7349, "}");
    }
}
