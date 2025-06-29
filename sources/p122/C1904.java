package p122;

import ˆʽ.ᵎˏ;

/* renamed from: ˈי.ʻʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1904 extends AbstractC1936 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final long f7223;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String f7224;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final long f7225;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final String f7226;

    public C1904(long j, long j2, String str, String str2) {
        this.f7225 = j;
        this.f7223 = j2;
        this.f7224 = str;
        this.f7226 = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1936)) {
            return false;
        }
        AbstractC1936 abstractC1936 = (AbstractC1936) obj;
        if (this.f7225 == ((C1904) abstractC1936).f7225) {
            C1904 c1904 = (C1904) abstractC1936;
            if (this.f7223 == c1904.f7223 && this.f7224.equals(c1904.f7224)) {
                String str = c1904.f7226;
                String str2 = this.f7226;
                if (str2 == null) {
                    if (str == null) {
                        return true;
                    }
                } else if (str2.equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f7225;
        long j2 = this.f7223;
        int iHashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f7224.hashCode()) * 1000003;
        String str = this.f7226;
        return (str == null ? 0 : str.hashCode()) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BinaryImage{baseAddress=");
        sb.append(this.f7225);
        sb.append(", size=");
        sb.append(this.f7223);
        sb.append(", name=");
        sb.append(this.f7224);
        sb.append(", uuid=");
        return ᵎˏ.ˎٴ(sb, this.f7226, "}");
    }
}
