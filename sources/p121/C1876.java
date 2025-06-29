package p121;

import java.util.ArrayList;

/* renamed from: ˈˑ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1876 extends AbstractC1901 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ArrayList f7166;

    public C1876(ArrayList arrayList) {
        this.f7166 = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1901)) {
            return false;
        }
        return this.f7166.equals(((C1876) ((AbstractC1901) obj)).f7166);
    }

    public final int hashCode() {
        return this.f7166.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f7166 + "}";
    }
}
