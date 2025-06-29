package p457;

import java.util.HashSet;
import java.util.UUID;
import p070.AbstractC1549;
import p080.AbstractC1702;
import p447.AbstractC5179;

/* renamed from: ﾞﹶ.ˆᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5361 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f20807;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C5363 f20808;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final C5380 f20809;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final int f20810;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final long f20811;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final C5358 f20812;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final HashSet f20813;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final UUID f20814;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final int f20815;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final int f20816;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C5363 f20817;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final long f20818;

    public C5361(UUID uuid, int i, HashSet hashSet, C5363 c5363, C5363 c53632, int i2, int i3, C5358 c5358, long j, C5380 c5380, long j2, int i4) {
        this.f20814 = uuid;
        this.f20807 = i;
        this.f20813 = hashSet;
        this.f20817 = c5363;
        this.f20808 = c53632;
        this.f20815 = i2;
        this.f20816 = i3;
        this.f20812 = c5358;
        this.f20818 = j;
        this.f20809 = c5380;
        this.f20811 = j2;
        this.f20810 = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C5361.class.equals(obj.getClass())) {
            return false;
        }
        C5361 c5361 = (C5361) obj;
        if (this.f20815 == c5361.f20815 && this.f20816 == c5361.f20816 && AbstractC1549.m5138(this.f20814, c5361.f20814) && this.f20807 == c5361.f20807 && AbstractC1549.m5138(this.f20817, c5361.f20817) && this.f20812.equals(c5361.f20812) && this.f20818 == c5361.f20818 && AbstractC1549.m5138(this.f20809, c5361.f20809) && this.f20811 == c5361.f20811 && this.f20810 == c5361.f20810 && this.f20813.equals(c5361.f20813)) {
            return AbstractC1549.m5138(this.f20808, c5361.f20808);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f20812.hashCode() + ((((((this.f20808.hashCode() + ((this.f20813.hashCode() + ((this.f20817.hashCode() + ((AbstractC1702.m5411(this.f20807) + (this.f20814.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.f20815) * 31) + this.f20816) * 31)) * 31;
        long j = this.f20818;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        C5380 c5380 = this.f20809;
        int iHashCode2 = (i + (c5380 != null ? c5380.hashCode() : 0)) * 31;
        long j2 = this.f20811;
        return ((iHashCode2 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f20810;
    }

    public final String toString() {
        return "WorkInfo{id='" + this.f20814 + "', state=" + AbstractC5179.m11553(this.f20807) + ", outputData=" + this.f20817 + ", tags=" + this.f20813 + ", progress=" + this.f20808 + ", runAttemptCount=" + this.f20815 + ", generation=" + this.f20816 + ", constraints=" + this.f20812 + ", initialDelayMillis=" + this.f20818 + ", periodicityInfo=" + this.f20809 + ", nextScheduleTimeMillis=" + this.f20811 + "}, stopReason=" + this.f20810;
    }
}
