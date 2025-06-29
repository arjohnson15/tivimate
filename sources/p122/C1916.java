package p122;

import ˆʽ.ᵎˏ;

/* renamed from: ˈי.ˆᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1916 extends AbstractC1903 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f7271;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f7272;

    public C1916(String str, String str2) {
        this.f7272 = str;
        this.f7271 = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1903)) {
            return false;
        }
        AbstractC1903 abstractC1903 = (AbstractC1903) obj;
        return this.f7272.equals(((C1916) abstractC1903).f7272) && this.f7271.equals(((C1916) abstractC1903).f7271);
    }

    public final int hashCode() {
        return ((this.f7272.hashCode() ^ 1000003) * 1000003) ^ this.f7271.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomAttribute{key=");
        sb.append(this.f7272);
        sb.append(", value=");
        return ᵎˏ.ˎٴ(sb, this.f7271, "}");
    }
}
