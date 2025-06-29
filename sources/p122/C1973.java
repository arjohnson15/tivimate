package p122;

import java.util.List;

/* renamed from: ˈי.ᵔﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1973 extends AbstractC1987 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C1971 f7528;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final List f7529;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final AbstractC1992 f7530;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final List f7531;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C1969 f7532;

    public C1973(List list, C1971 c1971, AbstractC1992 abstractC1992, C1969 c1969, List list2) {
        this.f7531 = list;
        this.f7528 = c1971;
        this.f7530 = abstractC1992;
        this.f7532 = c1969;
        this.f7529 = list2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1987)) {
            return false;
        }
        AbstractC1987 abstractC1987 = (AbstractC1987) obj;
        List list = this.f7531;
        if (list != null ? list.equals(((C1973) abstractC1987).f7531) : ((C1973) abstractC1987).f7531 == null) {
            C1971 c1971 = this.f7528;
            if (c1971 != null ? c1971.equals(((C1973) abstractC1987).f7528) : ((C1973) abstractC1987).f7528 == null) {
                AbstractC1992 abstractC1992 = this.f7530;
                if (abstractC1992 != null ? abstractC1992.equals(((C1973) abstractC1987).f7530) : ((C1973) abstractC1987).f7530 == null) {
                    C1973 c1973 = (C1973) abstractC1987;
                    if (this.f7532.equals(c1973.f7532) && this.f7529.equals(c1973.f7529)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        List list = this.f7531;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        C1971 c1971 = this.f7528;
        int iHashCode2 = (iHashCode ^ (c1971 == null ? 0 : c1971.hashCode())) * 1000003;
        AbstractC1992 abstractC1992 = this.f7530;
        return (((((abstractC1992 != null ? abstractC1992.hashCode() : 0) ^ iHashCode2) * 1000003) ^ this.f7532.hashCode()) * 1000003) ^ this.f7529.hashCode();
    }

    public final String toString() {
        return "Execution{threads=" + this.f7531 + ", exception=" + this.f7528 + ", appExitInfo=" + this.f7530 + ", signal=" + this.f7532 + ", binaries=" + this.f7529 + "}";
    }
}
