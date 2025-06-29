package p147;

import android.support.v4.media.session.AbstractC0002;

/* renamed from: ˊ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2251 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final long f8965;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final long f8966;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f8967;

    public C2251(long j, long j2, String str) {
        this.f8967 = str;
        this.f8965 = j;
        this.f8966 = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2251)) {
            return false;
        }
        C2251 c2251 = (C2251) obj;
        return this.f8967.equals(c2251.f8967) && this.f8965 == c2251.f8965 && this.f8966 == c2251.f8966;
    }

    public final int hashCode() {
        int iHashCode = (this.f8967.hashCode() ^ 1000003) * 1000003;
        long j = this.f8965;
        long j2 = this.f8966;
        return ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationTokenResult{token=");
        sb.append(this.f8967);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.f8965);
        sb.append(", tokenCreationTimestamp=");
        return AbstractC0002.m42(sb, this.f8966, "}");
    }
}
