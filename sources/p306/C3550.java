package p306;

import p447.AbstractC5179;

/* renamed from: ᐧˈ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3550 {

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final C3550 f13711 = new C3550(10485760, 200, 10000, 604800000, 81920);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f13712;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final int f13713;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int f13714;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final long f13715;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final long f13716;

    public C3550(long j, int i, int i2, long j2, int i3) {
        this.f13715 = j;
        this.f13712 = i;
        this.f13714 = i2;
        this.f13716 = j2;
        this.f13713 = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3550)) {
            return false;
        }
        C3550 c3550 = (C3550) obj;
        return this.f13715 == c3550.f13715 && this.f13712 == c3550.f13712 && this.f13714 == c3550.f13714 && this.f13716 == c3550.f13716 && this.f13713 == c3550.f13713;
    }

    public final int hashCode() {
        long j = this.f13715;
        int i = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f13712) * 1000003) ^ this.f13714) * 1000003;
        long j2 = this.f13716;
        return this.f13713 ^ ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.f13715);
        sb.append(", loadBatchSize=");
        sb.append(this.f13712);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.f13714);
        sb.append(", eventCleanUpAge=");
        sb.append(this.f13716);
        sb.append(", maxBlobByteSizePerRow=");
        return AbstractC5179.m11550(sb, this.f13713, "}");
    }
}
