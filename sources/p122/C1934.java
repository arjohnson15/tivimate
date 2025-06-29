package p122;

import java.util.List;
import p447.AbstractC5179;

/* renamed from: ˈי.ˎᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1934 extends AbstractC1965 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final List f7364;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final AbstractC1907 f7365;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final List f7366;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C1973 f7367;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final List f7368;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final int f7369;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final Boolean f7370;

    public C1934(C1973 c1973, List list, List list2, Boolean bool, AbstractC1907 abstractC1907, List list3, int i) {
        this.f7367 = c1973;
        this.f7364 = list;
        this.f7366 = list2;
        this.f7370 = bool;
        this.f7365 = abstractC1907;
        this.f7368 = list3;
        this.f7369 = i;
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        Boolean bool;
        AbstractC1907 abstractC1907;
        List list3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1965)) {
            return false;
        }
        C1934 c1934 = (C1934) ((AbstractC1965) obj);
        return this.f7367.equals(c1934.f7367) && ((list = this.f7364) != null ? list.equals(c1934.f7364) : c1934.f7364 == null) && ((list2 = this.f7366) != null ? list2.equals(c1934.f7366) : c1934.f7366 == null) && ((bool = this.f7370) != null ? bool.equals(c1934.f7370) : c1934.f7370 == null) && ((abstractC1907 = this.f7365) != null ? abstractC1907.equals(c1934.f7365) : c1934.f7365 == null) && ((list3 = this.f7368) != null ? list3.equals(c1934.f7368) : c1934.f7368 == null) && this.f7369 == c1934.f7369;
    }

    public final int hashCode() {
        int iHashCode = (this.f7367.hashCode() ^ 1000003) * 1000003;
        List list = this.f7364;
        int iHashCode2 = (iHashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.f7366;
        int iHashCode3 = (iHashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.f7370;
        int iHashCode4 = (iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        AbstractC1907 abstractC1907 = this.f7365;
        int iHashCode5 = (iHashCode4 ^ (abstractC1907 == null ? 0 : abstractC1907.hashCode())) * 1000003;
        List list3 = this.f7368;
        return ((iHashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003) ^ this.f7369;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{execution=");
        sb.append(this.f7367);
        sb.append(", customAttributes=");
        sb.append(this.f7364);
        sb.append(", internalKeys=");
        sb.append(this.f7366);
        sb.append(", background=");
        sb.append(this.f7370);
        sb.append(", currentProcessDetails=");
        sb.append(this.f7365);
        sb.append(", appProcessDetails=");
        sb.append(this.f7368);
        sb.append(", uiOrientation=");
        return AbstractC5179.m11550(sb, this.f7369, "}");
    }
}
