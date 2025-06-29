package p355;

import java.math.RoundingMode;
import p254.C3174;
import p254.C3180;
import p254.InterfaceC3157;
import p323.C3682;
import p383.AbstractC4470;

/* renamed from: ᵔˊ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4029 implements InterfaceC3157 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f15496;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final long f15497;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final long f15498;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3682 f15499;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final long f15500;

    public C4029(C3682 c3682, int i, long j, long j2) {
        this.f15499 = c3682;
        this.f15496 = i;
        this.f15498 = j;
        long j3 = (j2 - j) / c3682.f14115;
        this.f15500 = j3;
        this.f15497 = m9271(j3);
    }

    @Override // p254.InterfaceC3157
    /* renamed from: ˋⁱ */
    public final long mo5502() {
        return this.f15497;
    }

    @Override // p254.InterfaceC3157
    /* renamed from: ˏʾ */
    public final C3180 mo5503(long j) {
        C3682 c3682 = this.f15499;
        long j2 = this.f15500;
        long jM10184 = AbstractC4470.m10184((c3682.f14113 * j) / (this.f15496 * 1000000), 0L, j2 - 1);
        long j3 = this.f15498;
        long jM9271 = m9271(jM10184);
        C3174 c3174 = new C3174(jM9271, (c3682.f14115 * jM10184) + j3);
        if (jM9271 >= j || jM10184 == j2 - 1) {
            return new C3180(c3174, c3174);
        }
        long j4 = jM10184 + 1;
        return new C3180(c3174, new C3174(m9271(j4), (c3682.f14115 * j4) + j3));
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final long m9271(long j) {
        long j2 = j * this.f15496;
        long j3 = this.f15499.f14113;
        int i = AbstractC4470.f17202;
        return AbstractC4470.m10166(j2, 1000000L, j3, RoundingMode.FLOOR);
    }

    @Override // p254.InterfaceC3157
    /* renamed from: ﹶˆ */
    public final boolean mo5504() {
        return true;
    }
}
