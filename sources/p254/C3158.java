package p254;

import java.util.Arrays;
import p383.AbstractC4470;

/* renamed from: יי.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3158 implements InterfaceC3157 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int[] f12208;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final long[] f12209;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final long[] f12210;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f12211;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final long f12212;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final long[] f12213;

    public C3158(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f12208 = iArr;
        this.f12210 = jArr;
        this.f12213 = jArr2;
        this.f12209 = jArr3;
        int length = iArr.length;
        this.f12211 = length;
        if (length > 0) {
            this.f12212 = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f12212 = 0L;
        }
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f12211 + ", sizes=" + Arrays.toString(this.f12208) + ", offsets=" + Arrays.toString(this.f12210) + ", timeUs=" + Arrays.toString(this.f12209) + ", durationsUs=" + Arrays.toString(this.f12213) + ")";
    }

    @Override // p254.InterfaceC3157
    /* renamed from: ˋⁱ */
    public final long mo5502() {
        return this.f12212;
    }

    @Override // p254.InterfaceC3157
    /* renamed from: ˏʾ */
    public final C3180 mo5503(long j) {
        long[] jArr = this.f12209;
        int iM10195 = AbstractC4470.m10195(jArr, j, true);
        long j2 = jArr[iM10195];
        long[] jArr2 = this.f12210;
        C3174 c3174 = new C3174(j2, jArr2[iM10195]);
        if (j2 >= j || iM10195 == this.f12211 - 1) {
            return new C3180(c3174, c3174);
        }
        int i = iM10195 + 1;
        return new C3180(c3174, new C3174(jArr[i], jArr2[i]));
    }

    @Override // p254.InterfaceC3157
    /* renamed from: ﹶˆ */
    public final boolean mo5504() {
        return true;
    }
}
