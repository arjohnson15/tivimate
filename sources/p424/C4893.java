package p424;

import p166.AbstractC2394;
import p166.C2395;
import p166.C2402;
import p166.C2412;
import p166.C2444;
import p356.C4039;
import p383.AbstractC4464;
import p383.AbstractC4470;

/* renamed from: ﹶʾ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4893 extends AbstractC2394 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final long f18466;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final int f18467;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final C2402 f18468;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final C2444 f18469;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final long f18470;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final long f18471;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final long f18472;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final long f18473;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final long f18474;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final C4039 f18475;

    public C4893(long j, long j2, long j3, int i, long j4, long j5, long j6, C4039 c4039, C2402 c2402, C2444 c2444) {
        AbstractC4464.m10132(c4039.f15540 == (c2444 != null));
        this.f18466 = j;
        this.f18471 = j2;
        this.f18474 = j3;
        this.f18467 = i;
        this.f18472 = j4;
        this.f18473 = j5;
        this.f18470 = j6;
        this.f18475 = c4039;
        this.f18468 = c2402;
        this.f18469 = c2444;
    }

    @Override // p166.AbstractC2394
    /* renamed from: ʽᐧ */
    public final int mo6469(Object obj) {
        int iIntValue;
        if ((obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue() - this.f18467) >= 0 && iIntValue < mo6475()) {
            return iIntValue;
        }
        return -1;
    }

    @Override // p166.AbstractC2394
    /* renamed from: ˉⁱ */
    public final Object mo6472(int i) {
        AbstractC4464.m10152(i, mo6475());
        return Integer.valueOf(this.f18467 + i);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003b A[PHI: r7
  0x003b: PHI (r7v1 long) = (r7v0 long), (r7v2 long) binds: [B:14:0x002e, B:16:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p166.AbstractC2394
    /* renamed from: ˋⁱ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p166.C2434 mo6179(int r22, p166.C2434 r23, long r24) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p424.C4893.mo6179(int, ˊﹶ.ᵔﹳ, long):ˊﹶ.ᵔﹳ");
    }

    @Override // p166.AbstractC2394
    /* renamed from: ˏᴵ */
    public final int mo6474() {
        return 1;
    }

    @Override // p166.AbstractC2394
    /* renamed from: ˏᵢ */
    public final int mo6475() {
        return this.f18475.f15533.size();
    }

    @Override // p166.AbstractC2394
    /* renamed from: ٴˎ */
    public final C2412 mo6180(int i, C2412 c2412, boolean z) {
        AbstractC4464.m10152(i, mo6475());
        C4039 c4039 = this.f18475;
        String str = z ? c4039.m9300(i).f15527 : null;
        Integer numValueOf = z ? Integer.valueOf(this.f18467 + i) : null;
        long jM9302 = c4039.m9302(i);
        long jM10206 = AbstractC4470.m10206(c4039.m9300(i).f15525 - c4039.m9300(0).f15525) - this.f18472;
        c2412.getClass();
        c2412.m6501(str, numValueOf, 0, jM9302, jM10206, C2395.f9449, false);
        return c2412;
    }
}
