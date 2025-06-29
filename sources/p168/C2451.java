package p168;

import p254.C3174;
import p254.C3180;
import p383.AbstractC4464;
import p383.AbstractC4470;

/* renamed from: ˋʽ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2451 implements InterfaceC2454 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f9747;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final long f9748;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final long f9749;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final long f9750;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final long f9751;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final long[] f9752;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int f9753;

    public C2451(long j, int i, long j2, int i2, long j3, long[] jArr) {
        this.f9750 = j;
        this.f9747 = i;
        this.f9749 = j2;
        this.f9753 = i2;
        this.f9748 = j3;
        this.f9752 = jArr;
        this.f9751 = j3 != -1 ? j + j3 : -1L;
    }

    @Override // p168.InterfaceC2454
    /* renamed from: ˉⁱ */
    public final int mo6564() {
        return this.f9753;
    }

    @Override // p254.InterfaceC3157
    /* renamed from: ˋⁱ */
    public final long mo5502() {
        return this.f9749;
    }

    @Override // p254.InterfaceC3157
    /* renamed from: ˏʾ */
    public final C3180 mo5503(long j) {
        double d;
        boolean zMo5504 = mo5504();
        int i = this.f9747;
        long j2 = this.f9750;
        if (!zMo5504) {
            C3174 c3174 = new C3174(0L, j2 + i);
            return new C3180(c3174, c3174);
        }
        long jM10184 = AbstractC4470.m10184(j, 0L, this.f9749);
        double d2 = (jM10184 * 100.0d) / this.f9749;
        double d3 = 0.0d;
        if (d2 <= 0.0d) {
            d = 256.0d;
        } else if (d2 >= 100.0d) {
            d = 256.0d;
            d3 = 256.0d;
        } else {
            int i2 = (int) d2;
            long[] jArr = this.f9752;
            AbstractC4464.m10146(jArr);
            double d4 = jArr[i2];
            d3 = (((i2 == 99 ? 256.0d : jArr[i2 + 1]) - d4) * (d2 - i2)) + d4;
            d = 256.0d;
        }
        double d5 = d3 / d;
        long j3 = this.f9748;
        C3174 c31742 = new C3174(jM10184, j2 + AbstractC4470.m10184(Math.round(d5 * j3), i, j3 - 1));
        return new C3180(c31742, c31742);
    }

    @Override // p168.InterfaceC2454
    /* renamed from: ˑʽ */
    public final long mo6565(long j) {
        long j2 = j - this.f9750;
        if (!mo5504() || j2 <= this.f9747) {
            return 0L;
        }
        long[] jArr = this.f9752;
        AbstractC4464.m10146(jArr);
        double d = (j2 * 256.0d) / this.f9748;
        int iM10195 = AbstractC4470.m10195(jArr, (long) d, true);
        long j3 = this.f9749;
        long j4 = (iM10195 * j3) / 100;
        long j5 = jArr[iM10195];
        int i = iM10195 + 1;
        long j6 = (j3 * i) / 100;
        return Math.round((j5 == (iM10195 == 99 ? 256L : jArr[i]) ? 0.0d : (d - j5) / (r0 - j5)) * (j6 - j4)) + j4;
    }

    @Override // p168.InterfaceC2454
    /* renamed from: ٴˎ */
    public final long mo6567() {
        return this.f9751;
    }

    @Override // p254.InterfaceC3157
    /* renamed from: ﹶˆ */
    public final boolean mo5504() {
        return this.f9752 != null;
    }
}
