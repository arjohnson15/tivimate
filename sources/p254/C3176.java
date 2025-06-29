package p254;

import p331.C3761;
import p383.AbstractC4464;
import p383.AbstractC4470;
import p403.C4622;
import p403.C4623;

/* renamed from: יי.ᵎˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C3176 implements InterfaceC3157 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final long f12272;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Object f12273;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f12274;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3176(long j) {
        this(j, 0L);
        this.f12274 = 1;
    }

    public C3176(long j, long j2) {
        this.f12274 = 1;
        this.f12272 = j;
        C3174 c3174 = j2 == 0 ? C3174.f12268 : new C3174(0L, j2);
        this.f12273 = new C3180(c3174, c3174);
    }

    public /* synthetic */ C3176(Object obj, long j, int i) {
        this.f12274 = i;
        this.f12273 = obj;
        this.f12272 = j;
    }

    @Override // p254.InterfaceC3157
    /* renamed from: ˋⁱ */
    public final long mo5502() {
        switch (this.f12274) {
        }
        return this.f12272;
    }

    @Override // p254.InterfaceC3157
    /* renamed from: ˏʾ */
    public final C3180 mo5503(long j) {
        switch (this.f12274) {
            case 0:
                C3179 c3179 = (C3179) this.f12273;
                AbstractC4464.m10146(c3179.f12280);
                C3761 c3761 = c3179.f12280;
                long[] jArr = (long[]) c3761.f14527;
                int iM10195 = AbstractC4470.m10195(jArr, AbstractC4470.m10184((c3179.f12277 * j) / 1000000, 0L, c3179.f12278 - 1), false);
                long j2 = iM10195 == -1 ? 0L : jArr[iM10195];
                long[] jArr2 = (long[]) c3761.f14528;
                long j3 = iM10195 != -1 ? jArr2[iM10195] : 0L;
                int i = c3179.f12277;
                long j4 = (j2 * 1000000) / i;
                long j5 = this.f12272;
                C3174 c3174 = new C3174(j4, j3 + j5);
                if (j4 == j || iM10195 == jArr.length - 1) {
                    return new C3180(c3174, c3174);
                }
                int i2 = iM10195 + 1;
                return new C3180(c3174, new C3174((jArr[i2] * 1000000) / i, j5 + jArr2[i2]));
            case 1:
                return (C3180) this.f12273;
            default:
                C4622 c4622 = (C4622) this.f12273;
                C3180 c3180M10510 = c4622.f17709[0].m10510(j);
                int i3 = 1;
                while (true) {
                    C4623[] c4623Arr = c4622.f17709;
                    if (i3 >= c4623Arr.length) {
                        return c3180M10510;
                    }
                    C3180 c3180M105102 = c4623Arr[i3].m10510(j);
                    if (c3180M105102.f12289.f12269 < c3180M10510.f12289.f12269) {
                        c3180M10510 = c3180M105102;
                    }
                    i3++;
                }
        }
    }

    @Override // p254.InterfaceC3157
    /* renamed from: ﹶˆ */
    public final boolean mo5504() {
        switch (this.f12274) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return true;
        }
    }
}
