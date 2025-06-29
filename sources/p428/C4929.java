package p428;

import ˆʽ.ᵎˏ;

/* renamed from: ﹶˊ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4929 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f18651;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String f18652;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f18653;

    public C4929(String str, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null crashlyticsInstallId");
        }
        this.f18653 = str;
        this.f18651 = str2;
        this.f18652 = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4929)) {
            return false;
        }
        C4929 c4929 = (C4929) obj;
        if (this.f18653.equals(c4929.f18653)) {
            String str = c4929.f18651;
            String str2 = this.f18651;
            if (str2 != null ? str2.equals(str) : str == null) {
                String str3 = c4929.f18652;
                String str4 = this.f18652;
                if (str4 == null) {
                    if (str3 == null) {
                        return true;
                    }
                } else if (str4.equals(str3)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f18653.hashCode() ^ 1000003) * 1000003;
        String str = this.f18651;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f18652;
        return iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb.append(this.f18653);
        sb.append(", firebaseInstallationId=");
        sb.append(this.f18651);
        sb.append(", firebaseAuthenticationToken=");
        return ᵎˏ.ˎٴ(sb, this.f18652, "}");
    }
}
