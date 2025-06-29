package p168;

import p254.C3174;
import p254.C3180;
import p383.AbstractC4470;

/* renamed from: ˋʽ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2455 implements InterfaceC2454 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final long[] f9758;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final int f9759;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final long f9760;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final long[] f9761;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final long f9762;

    public C2455(long[] jArr, long[] jArr2, long j, long j2, int i) {
        this.f9761 = jArr;
        this.f9758 = jArr2;
        this.f9760 = j;
        this.f9762 = j2;
        this.f9759 = i;
    }

    @Override // p168.InterfaceC2454
    /* renamed from: ˉⁱ */
    public final int mo6564() {
        return this.f9759;
    }

    @Override // p254.InterfaceC3157
    /* renamed from: ˋⁱ */
    public final long mo5502() {
        return this.f9760;
    }

    @Override // p254.InterfaceC3157
    /* renamed from: ˏʾ */
    public final C3180 mo5503(long j) {
        long[] jArr = this.f9761;
        int iM10195 = AbstractC4470.m10195(jArr, j, true);
        long j2 = jArr[iM10195];
        long[] jArr2 = this.f9758;
        C3174 c3174 = new C3174(j2, jArr2[iM10195]);
        if (j2 >= j || iM10195 == jArr.length - 1) {
            return new C3180(c3174, c3174);
        }
        int i = iM10195 + 1;
        return new C3180(c3174, new C3174(jArr[i], jArr2[i]));
    }

    @Override // p168.InterfaceC2454
    /* renamed from: ˑʽ */
    public final long mo6565(long j) {
        return this.f9761[AbstractC4470.m10195(this.f9758, j, true)];
    }

    @Override // p168.InterfaceC2454
    /* renamed from: ٴˎ */
    public final long mo6567() {
        return this.f9762;
    }

    @Override // p254.InterfaceC3157
    /* renamed from: ﹶˆ */
    public final boolean mo5504() {
        return true;
    }
}
