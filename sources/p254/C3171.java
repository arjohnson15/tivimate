package p254;

import p383.AbstractC4470;

/* renamed from: יי.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3171 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final long f12260;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public long f12261;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public long f12262;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final long f12263;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final long f12264;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public long f12265;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public long f12266;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public long f12267 = 0;

    public C3171(long j, long j2, long j3, long j4, long j5, long j6) {
        this.f12264 = j;
        this.f12260 = j2;
        this.f12261 = j3;
        this.f12265 = j4;
        this.f12266 = j5;
        this.f12263 = j6;
        this.f12262 = m7838(j2, 0L, j3, j4, j5, j6);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static long m7838(long j, long j2, long j3, long j4, long j5, long j6) {
        if (j4 + 1 >= j5 || j2 + 1 >= j3) {
            return j4;
        }
        long j7 = (long) ((j - j2) * ((j5 - j4) / (j3 - j2)));
        return AbstractC4470.m10184(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
    }
}
