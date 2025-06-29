package p356;

import java.math.RoundingMode;
import java.util.List;
import p383.AbstractC4470;

/* renamed from: ᵔˋ.ᴵʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4044 extends AbstractC4045 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final long f15558;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final long f15559;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final List f15560;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final long f15561;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final long f15562;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final long f15563;

    public AbstractC4044(C4032 c4032, long j, long j2, long j3, long j4, List list, long j5, long j6, long j7) {
        super(c4032, j, j2);
        this.f15562 = j3;
        this.f15558 = j4;
        this.f15560 = list;
        this.f15563 = j5;
        this.f15561 = j6;
        this.f15559 = j7;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final long m9305(long j, long j2) {
        long jMo9298 = mo9298(j);
        return jMo9298 != -1 ? jMo9298 : (int) (m9308((j2 - this.f15559) + this.f15563, j) - m9307(j, j2));
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final long m9306(long j, long j2) {
        long j3 = this.f15564;
        long j4 = this.f15562;
        List list = this.f15560;
        if (list != null) {
            return (((C4046) list.get((int) (j - j4))).f15567 * 1000000) / j3;
        }
        long jMo9298 = mo9298(j2);
        return (jMo9298 == -1 || j != (j4 + jMo9298) - 1) ? (this.f15558 * 1000000) / j3 : j2 - m9309(j);
    }

    /* renamed from: ˏᵢ */
    public abstract C4032 mo9297(C4036 c4036, long j);

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final long m9307(long j, long j2) {
        long jMo9298 = mo9298(j);
        long j3 = this.f15562;
        if (jMo9298 == -1) {
            long j4 = this.f15561;
            if (j4 != -9223372036854775807L) {
                return Math.max(j3, m9308((j2 - this.f15559) - j4, j));
            }
        }
        return j3;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final long m9308(long j, long j2) {
        long jMo9298 = mo9298(j2);
        long j3 = this.f15562;
        if (jMo9298 == 0) {
            return j3;
        }
        if (this.f15560 == null) {
            long j4 = (j / ((this.f15558 * 1000000) / this.f15564)) + j3;
            return j4 < j3 ? j3 : jMo9298 == -1 ? j4 : Math.min(j4, (j3 + jMo9298) - 1);
        }
        long j5 = (jMo9298 + j3) - 1;
        long j6 = j3;
        while (j6 <= j5) {
            long j7 = ((j5 - j6) / 2) + j6;
            long jM9309 = m9309(j7);
            if (jM9309 < j) {
                j6 = j7 + 1;
            } else {
                if (jM9309 <= j) {
                    return j7;
                }
                j5 = j7 - 1;
            }
        }
        return j6 == j3 ? j6 : j5;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final long m9309(long j) {
        long j2 = this.f15562;
        List list = this.f15560;
        long j3 = list != null ? ((C4046) list.get((int) (j - j2))).f15568 - this.f15565 : (j - j2) * this.f15558;
        int i = AbstractC4470.f17202;
        return AbstractC4470.m10166(j3, 1000000L, this.f15564, RoundingMode.FLOOR);
    }

    /* renamed from: ﹳﹳ */
    public abstract long mo9298(long j);

    /* renamed from: ﹶˆ */
    public boolean mo9299() {
        return this.f15560 != null;
    }
}
