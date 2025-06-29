package p122;

import ˆʽ.ᵎˏ;

/* renamed from: ˈי.ᐧˋ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1956 extends AbstractC1980 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f7466;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String f7467;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f7468;

    public C1956(String str, String str2, String str3) {
        this.f7468 = str;
        this.f7466 = str2;
        this.f7467 = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1980)) {
            return false;
        }
        AbstractC1980 abstractC1980 = (AbstractC1980) obj;
        if (this.f7468.equals(((C1956) abstractC1980).f7468)) {
            C1956 c1956 = (C1956) abstractC1980;
            if (this.f7466.equals(c1956.f7466) && this.f7467.equals(c1956.f7467)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f7468.hashCode() ^ 1000003) * 1000003) ^ this.f7466.hashCode()) * 1000003) ^ this.f7467.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BuildIdMappingForArch{arch=");
        sb.append(this.f7468);
        sb.append(", libraryName=");
        sb.append(this.f7466);
        sb.append(", buildId=");
        return ᵎˏ.ˎٴ(sb, this.f7467, "}");
    }
}
