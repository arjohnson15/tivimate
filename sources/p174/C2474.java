package p174;

import p070.AbstractC1549;
import p118.C1856;
import p428.C4921;

/* renamed from: ˋˎ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2474 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public C4921 f9826 = null;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C1856 f9827;

    public C2474(C1856 c1856) {
        this.f9827 = c1856;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2474)) {
            return false;
        }
        C2474 c2474 = (C2474) obj;
        return this.f9827.equals(c2474.f9827) && AbstractC1549.m5138(this.f9826, c2474.f9826);
    }

    public final int hashCode() {
        int iHashCode = this.f9827.hashCode() * 31;
        C4921 c4921 = this.f9826;
        return iHashCode + (c4921 == null ? 0 : c4921.hashCode());
    }

    public final String toString() {
        return "Dependency(mutex=" + this.f9827 + ", subscriber=" + this.f9826 + ')';
    }
}
