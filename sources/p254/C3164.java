package p254;

/* renamed from: יי.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C3164 implements InterfaceC3157 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final long f12233;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final int f12234;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int f12235;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final long f12236;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final long f12237;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final boolean f12238;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final long f12239;

    public C3164(long j, long j2, int i, int i2, boolean z) {
        this.f12236 = j;
        this.f12233 = j2;
        this.f12235 = i2 == -1 ? 1 : i2;
        this.f12234 = i;
        this.f12238 = z;
        if (j == -1) {
            this.f12239 = -1L;
            this.f12237 = -9223372036854775807L;
        } else {
            long j3 = j - j2;
            this.f12239 = j3;
            this.f12237 = (Math.max(0L, j3) * 8000000) / i;
        }
    }

    @Override // p254.InterfaceC3157
    /* renamed from: ˋⁱ */
    public final long mo5502() {
        return this.f12237;
    }

    @Override // p254.InterfaceC3157
    /* renamed from: ˏʾ */
    public final C3180 mo5503(long j) {
        long j2 = this.f12233;
        long j3 = this.f12239;
        if (j3 == -1 && !this.f12238) {
            C3174 c3174 = new C3174(0L, j2);
            return new C3180(c3174, c3174);
        }
        int i = this.f12234;
        long j4 = this.f12235;
        long jMin = (((i * j) / 8000000) / j4) * j4;
        if (j3 != -1) {
            jMin = Math.min(jMin, j3 - j4);
        }
        long jMax = Math.max(jMin, 0L) + j2;
        long jMax2 = (Math.max(0L, jMax - j2) * 8000000) / i;
        C3174 c31742 = new C3174(jMax2, jMax);
        if (j3 != -1 && jMax2 < j) {
            long j5 = jMax + j4;
            if (j5 < this.f12236) {
                return new C3180(c31742, new C3174((Math.max(0L, j5 - j2) * 8000000) / i, j5));
            }
        }
        return new C3180(c31742, c31742);
    }

    @Override // p254.InterfaceC3157
    /* renamed from: ﹶˆ */
    public final boolean mo5504() {
        return this.f12239 != -1 || this.f12238;
    }
}
