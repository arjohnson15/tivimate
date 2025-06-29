package p122;

import java.util.List;
import ˆʽ.ᵎˏ;

/* renamed from: ˈי.ᵢʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1974 extends AbstractC1926 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f7533;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final List f7534;

    public C1974(List list, String str) {
        this.f7534 = list;
        this.f7533 = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1926)) {
            return false;
        }
        AbstractC1926 abstractC1926 = (AbstractC1926) obj;
        if (this.f7534.equals(((C1974) abstractC1926).f7534)) {
            String str = this.f7533;
            if (str == null) {
                if (((C1974) abstractC1926).f7533 == null) {
                    return true;
                }
            } else if (str.equals(((C1974) abstractC1926).f7533)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f7534.hashCode() ^ 1000003) * 1000003;
        String str = this.f7533;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilesPayload{files=");
        sb.append(this.f7534);
        sb.append(", orgId=");
        return ᵎˏ.ˎٴ(sb, this.f7533, "}");
    }
}
