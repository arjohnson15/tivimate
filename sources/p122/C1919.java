package p122;

import ˆʽ.ᵎˏ;

/* renamed from: ˈי.ˈﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1919 extends AbstractC1978 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f7286;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f7287;

    public C1919(String str, String str2) {
        this.f7287 = str;
        this.f7286 = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1978)) {
            return false;
        }
        AbstractC1978 abstractC1978 = (AbstractC1978) obj;
        return this.f7287.equals(((C1919) abstractC1978).f7287) && this.f7286.equals(((C1919) abstractC1978).f7286);
    }

    public final int hashCode() {
        return ((this.f7287.hashCode() ^ 1000003) * 1000003) ^ this.f7286.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutVariant{rolloutId=");
        sb.append(this.f7287);
        sb.append(", variantId=");
        return ᵎˏ.ˎٴ(sb, this.f7286, "}");
    }
}
