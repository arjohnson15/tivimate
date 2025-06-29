package p210;

import android.support.v4.media.session.AbstractC0002;

/* renamed from: ˏʼ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2803 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final long f10926;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final long f10927;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final long f10928;

    public C2803(long j, long j2, long j3) {
        this.f10928 = j;
        this.f10926 = j2;
        this.f10927 = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2803)) {
            return false;
        }
        C2803 c2803 = (C2803) obj;
        return this.f10928 == c2803.f10928 && this.f10926 == c2803.f10926 && this.f10927 == c2803.f10927;
    }

    public final int hashCode() {
        long j = this.f10928;
        long j2 = this.f10926;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.f10927;
        return ((int) ((j3 >>> 32) ^ j3)) ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartupTime{epochMillis=");
        sb.append(this.f10928);
        sb.append(", elapsedRealtime=");
        sb.append(this.f10926);
        sb.append(", uptimeMillis=");
        return AbstractC0002.m42(sb, this.f10927, "}");
    }
}
