package p444;

import java.util.HashMap;
import p165.InterfaceC2393;
import p183.EnumC2533;

/* renamed from: ﾞˆ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5150 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final HashMap f19684;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final InterfaceC2393 f19685;

    public C5150(InterfaceC2393 interfaceC2393, HashMap map) {
        this.f19685 = interfaceC2393;
        this.f19684 = map;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5150)) {
            return false;
        }
        C5150 c5150 = (C5150) obj;
        return this.f19685.equals(c5150.f19685) && this.f19684.equals(c5150.f19684);
    }

    public final int hashCode() {
        return ((this.f19685.hashCode() ^ 1000003) * 1000003) ^ this.f19684.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f19685 + ", values=" + this.f19684 + "}";
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final long m11454(EnumC2533 enumC2533, long j, int i) {
        long jM6468 = j - this.f19685.m6468();
        C5146 c5146 = (C5146) this.f19684.get(enumC2533);
        long j2 = c5146.f19672;
        return Math.min(Math.max((long) (Math.pow(3.0d, i - 1) * j2 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j2 > 1 ? j2 : 2L) * r12))), jM6468), c5146.f19670);
    }
}
