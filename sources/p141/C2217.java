package p141;

import java.util.Locale;
import p383.AbstractC4470;
import ﹶⁱ.ـﹶ;

/* renamed from: ˉˑ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2217 {

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static final byte[] f8775 = new byte[0];

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final byte f8776;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final int f8777;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int f8778;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final boolean f8779;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final byte[] f8780;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final long f8781;

    public C2217(C2200 c2200) {
        this.f8779 = c2200.f8657;
        this.f8776 = c2200.f8654;
        this.f8778 = c2200.f8656;
        this.f8781 = c2200.f8660;
        this.f8777 = c2200.f8655;
        int length = c2200.f8658.length;
        this.f8780 = c2200.f8659;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static int m6189(int i) {
        return ـﹶ.ˎˑ(i + 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2217.class != obj.getClass()) {
            return false;
        }
        C2217 c2217 = (C2217) obj;
        return this.f8776 == c2217.f8776 && this.f8778 == c2217.f8778 && this.f8779 == c2217.f8779 && this.f8781 == c2217.f8781 && this.f8777 == c2217.f8777;
    }

    public final int hashCode() {
        int i = (((((527 + this.f8776) * 31) + this.f8778) * 31) + (this.f8779 ? 1 : 0)) * 31;
        long j = this.f8781;
        return ((i + ((int) (j ^ (j >>> 32)))) * 31) + this.f8777;
    }

    public final String toString() {
        Object[] objArr = {Byte.valueOf(this.f8776), Integer.valueOf(this.f8778), Long.valueOf(this.f8781), Integer.valueOf(this.f8777), Boolean.valueOf(this.f8779)};
        int i = AbstractC4470.f17202;
        return String.format(Locale.US, "RtpPacket(payloadType=%d, seq=%d, timestamp=%d, ssrc=%x, marker=%b)", objArr);
    }
}
