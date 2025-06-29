package p036;

/* renamed from: ʼﹶ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1251 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final long f5127;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final long f5128;

    public C1251(long j, long j2) {
        this.f5128 = j;
        this.f5127 = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1251)) {
            return false;
        }
        C1251 c1251 = (C1251) obj;
        return this.f5128 == c1251.f5128 && this.f5127 == c1251.f5127;
    }

    public final int hashCode() {
        return (((int) this.f5128) * 31) + ((int) this.f5127);
    }
}
