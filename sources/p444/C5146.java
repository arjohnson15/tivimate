package p444;

import java.util.Set;

/* renamed from: ﾞˆ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5146 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final long f19670;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Set f19671;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final long f19672;

    public C5146(long j, long j2, Set set) {
        this.f19672 = j;
        this.f19670 = j2;
        this.f19671 = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5146)) {
            return false;
        }
        C5146 c5146 = (C5146) obj;
        return this.f19672 == c5146.f19672 && this.f19670 == c5146.f19670 && this.f19671.equals(c5146.f19671);
    }

    public final int hashCode() {
        long j = this.f19672;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.f19670;
        return this.f19671.hashCode() ^ ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f19672 + ", maxAllowedDelay=" + this.f19670 + ", flags=" + this.f19671 + "}";
    }
}
