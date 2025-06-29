package p225;

/* renamed from: ˏᵢ.ʾʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2984 {

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static C2984 f11480;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public long f11481;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f11482;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public long f11483;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m7406(double d, double d2, long j) {
        double d3 = (0.01720197f * ((j - 946728000000L) / 8.64E7f)) + 6.24006f;
        double dSin = (Math.sin(r4 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * r4) * 3.4906598739326E-4d) + (Math.sin(d3) * 0.03341960161924362d) + d3 + 1.796593063d + 3.141592653589793d;
        double dSin2 = (Math.sin(2.0d * dSin) * (-0.0069d)) + (Math.sin(d3) * 0.0053d) + Math.round((r3 - 9.0E-4f) - r7) + 9.0E-4f + ((-d2) / 360.0d);
        double dAsin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(dSin));
        double d4 = 0.01745329238474369d * d;
        double dSin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(dAsin) * Math.sin(d4))) / (Math.cos(dAsin) * Math.cos(d4));
        if (dSin3 >= 1.0d) {
            this.f11482 = 1;
            this.f11483 = -1L;
            this.f11481 = -1L;
        } else {
            if (dSin3 <= -1.0d) {
                this.f11482 = 0;
                this.f11483 = -1L;
                this.f11481 = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin3) / 6.283185307179586d);
            this.f11483 = Math.round((dSin2 + dAcos) * 8.64E7d) + 946728000000L;
            long jRound = Math.round((dSin2 - dAcos) * 8.64E7d) + 946728000000L;
            this.f11481 = jRound;
            if (jRound >= j || this.f11483 <= j) {
                this.f11482 = 1;
            } else {
                this.f11482 = 0;
            }
        }
    }
}
