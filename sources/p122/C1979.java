package p122;

import android.support.v4.media.session.AbstractC0002;

/* renamed from: ˈי.ⁱʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1979 extends AbstractC1985 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f7541;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final long f7542;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final boolean f7543;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Double f7544;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final long f7545;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int f7546;

    public C1979(Double d, int i, boolean z, int i2, long j, long j2) {
        this.f7544 = d;
        this.f7541 = i;
        this.f7543 = z;
        this.f7546 = i2;
        this.f7542 = j;
        this.f7545 = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1985)) {
            return false;
        }
        AbstractC1985 abstractC1985 = (AbstractC1985) obj;
        Double d = this.f7544;
        if (d != null ? d.equals(((C1979) abstractC1985).f7544) : ((C1979) abstractC1985).f7544 == null) {
            if (this.f7541 == ((C1979) abstractC1985).f7541) {
                C1979 c1979 = (C1979) abstractC1985;
                if (this.f7543 == c1979.f7543 && this.f7546 == c1979.f7546 && this.f7542 == c1979.f7542 && this.f7545 == c1979.f7545) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Double d = this.f7544;
        int iHashCode = ((((((((d == null ? 0 : d.hashCode()) ^ 1000003) * 1000003) ^ this.f7541) * 1000003) ^ (this.f7543 ? 1231 : 1237)) * 1000003) ^ this.f7546) * 1000003;
        long j = this.f7542;
        long j2 = this.f7545;
        return ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{batteryLevel=");
        sb.append(this.f7544);
        sb.append(", batteryVelocity=");
        sb.append(this.f7541);
        sb.append(", proximityOn=");
        sb.append(this.f7543);
        sb.append(", orientation=");
        sb.append(this.f7546);
        sb.append(", ramUsed=");
        sb.append(this.f7542);
        sb.append(", diskUsed=");
        return AbstractC0002.m42(sb, this.f7545, "}");
    }
}
