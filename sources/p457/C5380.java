package p457;

import p447.AbstractC5179;

/* renamed from: ﾞﹶ.ᐧˋ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5380 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final long f20851;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final long f20852;

    public C5380(long j, long j2) {
        this.f20852 = j;
        this.f20851 = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C5380.class.equals(obj.getClass())) {
            return false;
        }
        C5380 c5380 = (C5380) obj;
        return c5380.f20852 == this.f20852 && c5380.f20851 == this.f20851;
    }

    public final int hashCode() {
        long j = this.f20852;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.f20851;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PeriodicityInfo{repeatIntervalMillis=");
        sb.append(this.f20852);
        sb.append(", flexIntervalMillis=");
        return AbstractC5179.m11554(sb, this.f20851, '}');
    }
}
