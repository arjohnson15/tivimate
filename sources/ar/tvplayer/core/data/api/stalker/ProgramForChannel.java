package ar.tvplayer.core.data.api.stalker;

import p070.AbstractC1549;
import p435.InterfaceC5046;
import p435.InterfaceC5065;
import p447.AbstractC5179;

@InterfaceC5046(generateAdapter = true)
/* loaded from: classes.dex */
public final class ProgramForChannel {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final long f1911;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f1912;

    public ProgramForChannel(@InterfaceC5065(name = "id") String str, @InterfaceC5065(name = "start_timestamp") long j) {
        this.f1912 = str;
        this.f1911 = j;
    }

    public final ProgramForChannel copy(@InterfaceC5065(name = "id") String str, @InterfaceC5065(name = "start_timestamp") long j) {
        return new ProgramForChannel(str, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProgramForChannel)) {
            return false;
        }
        ProgramForChannel programForChannel = (ProgramForChannel) obj;
        return AbstractC1549.m5138(this.f1912, programForChannel.f1912) && this.f1911 == programForChannel.f1911;
    }

    public final int hashCode() {
        int iHashCode = this.f1912.hashCode() * 31;
        long j = this.f1911;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProgramForChannel(id=");
        sb.append(this.f1912);
        sb.append(", startSeconds=");
        return AbstractC5179.m11554(sb, this.f1911, ')');
    }
}
