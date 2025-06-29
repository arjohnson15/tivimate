package p122;

import java.util.List;
import p447.AbstractC5179;

/* renamed from: ˈי.ᵔٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1971 extends AbstractC1902 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f7523;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final int f7524;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final List f7525;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f7526;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final AbstractC1902 f7527;

    public C1971(String str, String str2, List list, AbstractC1902 abstractC1902, int i) {
        this.f7526 = str;
        this.f7523 = str2;
        this.f7525 = list;
        this.f7527 = abstractC1902;
        this.f7524 = i;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1902)) {
            return false;
        }
        AbstractC1902 abstractC1902 = (AbstractC1902) obj;
        if (this.f7526.equals(((C1971) abstractC1902).f7526) && ((str = this.f7523) != null ? str.equals(((C1971) abstractC1902).f7523) : ((C1971) abstractC1902).f7523 == null)) {
            C1971 c1971 = (C1971) abstractC1902;
            if (this.f7525.equals(c1971.f7525)) {
                AbstractC1902 abstractC19022 = c1971.f7527;
                AbstractC1902 abstractC19023 = this.f7527;
                if (abstractC19023 != null ? abstractC19023.equals(abstractC19022) : abstractC19022 == null) {
                    if (this.f7524 == c1971.f7524) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f7526.hashCode() ^ 1000003) * 1000003;
        String str = this.f7523;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f7525.hashCode()) * 1000003;
        AbstractC1902 abstractC1902 = this.f7527;
        return ((iHashCode2 ^ (abstractC1902 != null ? abstractC1902.hashCode() : 0)) * 1000003) ^ this.f7524;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Exception{type=");
        sb.append(this.f7526);
        sb.append(", reason=");
        sb.append(this.f7523);
        sb.append(", frames=");
        sb.append(this.f7525);
        sb.append(", causedBy=");
        sb.append(this.f7527);
        sb.append(", overflowCount=");
        return AbstractC5179.m11550(sb, this.f7524, "}");
    }
}
