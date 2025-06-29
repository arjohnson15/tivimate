package p275;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.AbstractC0002;
import p383.C4457;
import ـˏ.ٴˎ;

/* renamed from: ـᵢ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3347 extends AbstractC3345 {
    public static final Parcelable.Creator<C3347> CREATOR = new ٴˎ(18);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final long f13119;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final long f13120;

    public C3347(long j, long j2) {
        this.f13120 = j;
        this.f13119 = j2;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static long m8175(long j, C4457 c4457) {
        long jM10086 = c4457.m10086();
        if ((128 & jM10086) != 0) {
            return 8589934591L & ((((jM10086 & 1) << 32) | c4457.m10110()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // p275.AbstractC3345
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
        sb.append(this.f13120);
        sb.append(", playbackPositionUs= ");
        return AbstractC0002.m42(sb, this.f13119, " }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f13120);
        parcel.writeLong(this.f13119);
    }
}
