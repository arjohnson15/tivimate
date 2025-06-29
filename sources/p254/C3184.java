package p254;

import p383.AbstractC4464;
import p383.AbstractC4470;

/* renamed from: יי.ﾞʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3184 implements InterfaceC3157 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final long[] f12309;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final long f12310;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final long[] f12311;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final boolean f12312;

    public C3184(long j, long[] jArr, long[] jArr2) {
        AbstractC4464.m10142(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z = length > 0;
        this.f12312 = z;
        if (!z || jArr2[0] <= 0) {
            this.f12311 = jArr;
            this.f12309 = jArr2;
        } else {
            int i = length + 1;
            long[] jArr3 = new long[i];
            this.f12311 = jArr3;
            long[] jArr4 = new long[i];
            this.f12309 = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f12310 = j;
    }

    @Override // p254.InterfaceC3157
    /* renamed from: ˋⁱ */
    public final long mo5502() {
        return this.f12310;
    }

    @Override // p254.InterfaceC3157
    /* renamed from: ˏʾ */
    public final C3180 mo5503(long j) {
        if (!this.f12312) {
            C3174 c3174 = C3174.f12268;
            return new C3180(c3174, c3174);
        }
        long[] jArr = this.f12309;
        int iM10195 = AbstractC4470.m10195(jArr, j, true);
        long j2 = jArr[iM10195];
        long[] jArr2 = this.f12311;
        C3174 c31742 = new C3174(j2, jArr2[iM10195]);
        if (j2 == j || iM10195 == jArr.length - 1) {
            return new C3180(c31742, c31742);
        }
        int i = iM10195 + 1;
        return new C3180(c31742, new C3174(jArr[i], jArr2[i]));
    }

    @Override // p254.InterfaceC3157
    /* renamed from: ﹶˆ */
    public final boolean mo5504() {
        return this.f12312;
    }
}
