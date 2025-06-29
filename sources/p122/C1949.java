package p122;

import ˆʽ.ᵎˏ;

/* renamed from: ˈי.ـᵎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1949 extends AbstractC1946 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f7441;

    public C1949(String str) {
        this.f7441 = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1946)) {
            return false;
        }
        return this.f7441.equals(((C1949) ((AbstractC1946) obj)).f7441);
    }

    public final int hashCode() {
        return this.f7441.hashCode() ^ 1000003;
    }

    public final String toString() {
        return ᵎˏ.ˎٴ(new StringBuilder("User{identifier="), this.f7441, "}");
    }
}
