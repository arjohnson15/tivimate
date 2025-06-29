package p429;

/* renamed from: ﹶˎ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4952 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final EnumC4987 f18728;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final double f18729;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final EnumC4987 f18730;

    public C4952(EnumC4987 enumC4987, EnumC4987 enumC49872, double d) {
        this.f18730 = enumC4987;
        this.f18728 = enumC49872;
        this.f18729 = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4952)) {
            return false;
        }
        C4952 c4952 = (C4952) obj;
        return this.f18730 == c4952.f18730 && this.f18728 == c4952.f18728 && Double.compare(this.f18729, c4952.f18729) == 0;
    }

    public final int hashCode() {
        int iHashCode = (this.f18728.hashCode() + (this.f18730.hashCode() * 31)) * 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.f18729);
        return iHashCode + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f18730 + ", crashlytics=" + this.f18728 + ", sessionSamplingRate=" + this.f18729 + ')';
    }
}
