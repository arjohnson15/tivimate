package p356;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
import p166.C2431;
import p203.AbstractC2770;
import p260.C3222;

/* renamed from: ᵔˋ.ˑי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4040 extends AbstractC4044 {

    /* renamed from: ˉי, reason: contains not printable characters */
    public final C3222 f15542;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final long f15543;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final C3222 f15544;

    public C4040(C4032 c4032, long j, long j2, long j3, long j4, long j5, List list, long j6, C3222 c3222, C3222 c32222, long j7, long j8) {
        super(c4032, j, j2, j3, j5, list, j6, j7, j8);
        this.f15542 = c3222;
        this.f15544 = c32222;
        this.f15543 = j4;
    }

    @Override // p356.AbstractC4044
    /* renamed from: ˏᵢ */
    public final C4032 mo9297(C4036 c4036, long j) {
        long j2 = this.f15562;
        List list = this.f15560;
        long j3 = list != null ? ((C4046) list.get((int) (j - j2))).f15568 : (j - j2) * this.f15558;
        C2431 c2431 = c4036.f15520;
        return new C4032(0L, -1L, this.f15544.m7948(c2431.f9677, j, c2431.f9691, j3));
    }

    @Override // p356.AbstractC4045
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C4032 mo9303(AbstractC4034 abstractC4034) {
        C3222 c3222 = this.f15542;
        if (c3222 == null) {
            return this.f15566;
        }
        C2431 c2431 = abstractC4034.f15520;
        return new C4032(0L, -1L, c3222.m7948(c2431.f9677, 0L, c2431.f9691, 0L));
    }

    @Override // p356.AbstractC4044
    /* renamed from: ﹳﹳ */
    public final long mo9298(long j) {
        if (this.f15560 != null) {
            return r0.size();
        }
        long j2 = this.f15543;
        if (j2 != -1) {
            return (j2 - this.f15562) + 1;
        }
        if (j == -9223372036854775807L) {
            return -1L;
        }
        BigInteger bigIntegerMultiply = BigInteger.valueOf(j).multiply(BigInteger.valueOf(this.f15564));
        BigInteger bigIntegerMultiply2 = BigInteger.valueOf(this.f15558).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i = AbstractC2770.f10826;
        return new BigDecimal(bigIntegerMultiply).divide(new BigDecimal(bigIntegerMultiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }
}
