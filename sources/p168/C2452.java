package p168;

import android.util.Pair;
import p254.C3174;
import p254.C3180;
import p383.AbstractC4470;

/* renamed from: ˋʽ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2452 implements InterfaceC2454 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final long[] f9754;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final long f9755;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final long[] f9756;

    public C2452(long j, long[] jArr, long[] jArr2) {
        this.f9756 = jArr;
        this.f9754 = jArr2;
        this.f9755 = j == -9223372036854775807L ? AbstractC4470.m10206(jArr2[jArr2.length - 1]) : j;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static Pair m6568(long j, long[] jArr, long[] jArr2) {
        int iM10195 = AbstractC4470.m10195(jArr, j, true);
        long j2 = jArr[iM10195];
        long j3 = jArr2[iM10195];
        int i = iM10195 + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((jArr[i] == j2 ? 0.0d : (j - j2) / (r6 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // p168.InterfaceC2454
    /* renamed from: ˉⁱ */
    public final int mo6564() {
        return -2147483647;
    }

    @Override // p254.InterfaceC3157
    /* renamed from: ˋⁱ */
    public final long mo5502() {
        return this.f9755;
    }

    @Override // p254.InterfaceC3157
    /* renamed from: ˏʾ */
    public final C3180 mo5503(long j) {
        Pair pairM6568 = m6568(AbstractC4470.m10171(AbstractC4470.m10184(j, 0L, this.f9755)), this.f9754, this.f9756);
        C3174 c3174 = new C3174(AbstractC4470.m10206(((Long) pairM6568.first).longValue()), ((Long) pairM6568.second).longValue());
        return new C3180(c3174, c3174);
    }

    @Override // p168.InterfaceC2454
    /* renamed from: ˑʽ */
    public final long mo6565(long j) {
        return AbstractC4470.m10206(((Long) m6568(j, this.f9756, this.f9754).second).longValue());
    }

    @Override // p168.InterfaceC2454
    /* renamed from: ٴˎ */
    public final long mo6567() {
        return -1L;
    }

    @Override // p254.InterfaceC3157
    /* renamed from: ﹶˆ */
    public final boolean mo5504() {
        return true;
    }
}
