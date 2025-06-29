package p122;

import java.util.List;

/* renamed from: ˈי.ʽˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1908 extends AbstractC1961 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final List f7231;

    public C1908(List list) {
        this.f7231 = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1961)) {
            return false;
        }
        return this.f7231.equals(((C1908) ((AbstractC1961) obj)).f7231);
    }

    public final int hashCode() {
        return this.f7231.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f7231 + "}";
    }
}
