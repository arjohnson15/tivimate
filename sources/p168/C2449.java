package p168;

import java.math.RoundingMode;
import p014.C1060;
import p254.C3174;
import p254.C3180;
import p383.AbstractC4470;

/* renamed from: ˋʽ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2449 implements InterfaceC2454 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C1060 f9742;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public long f9743;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C1060 f9744;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final long f9745;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int f9746;

    public C2449(long j, long j2, long j3) {
        this.f9743 = j;
        this.f9745 = j3;
        C1060 c1060 = new C1060(9);
        this.f9742 = c1060;
        C1060 c10602 = new C1060(9);
        this.f9744 = c10602;
        c1060.m4053(0L);
        c10602.m4053(j2);
        int i = -2147483647;
        if (j == -9223372036854775807L) {
            this.f9746 = -2147483647;
            return;
        }
        long jM10166 = AbstractC4470.m10166(j2 - j3, 8L, j, RoundingMode.HALF_UP);
        if (jM10166 > 0 && jM10166 <= 2147483647L) {
            i = (int) jM10166;
        }
        this.f9746 = i;
    }

    @Override // p168.InterfaceC2454
    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final int mo6564() {
        return this.f9746;
    }

    @Override // p254.InterfaceC3157
    /* renamed from: ˋⁱ */
    public final long mo5502() {
        return this.f9743;
    }

    @Override // p254.InterfaceC3157
    /* renamed from: ˏʾ */
    public final C3180 mo5503(long j) {
        C1060 c1060 = this.f9742;
        int iM10187 = AbstractC4470.m10187(c1060, j);
        long jM4063 = c1060.m4063(iM10187);
        C1060 c10602 = this.f9744;
        C3174 c3174 = new C3174(jM4063, c10602.m4063(iM10187));
        if (jM4063 == j || iM10187 == c1060.f4469 - 1) {
            return new C3180(c3174, c3174);
        }
        int i = iM10187 + 1;
        return new C3180(c3174, new C3174(c1060.m4063(i), c10602.m4063(i)));
    }

    @Override // p168.InterfaceC2454
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final long mo6565(long j) {
        return this.f9742.m4063(AbstractC4470.m10187(this.f9744, j));
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final boolean m6566(long j) {
        C1060 c1060 = this.f9742;
        return j - c1060.m4063(c1060.f4469 - 1) < 100000;
    }

    @Override // p168.InterfaceC2454
    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final long mo6567() {
        return this.f9745;
    }

    @Override // p254.InterfaceC3157
    /* renamed from: ﹶˆ */
    public final boolean mo5504() {
        return true;
    }
}
