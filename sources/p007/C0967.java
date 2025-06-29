package p007;

import java.util.Arrays;

/* renamed from: ʻˉ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0967 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public long f4268;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public long f4269;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public int f4270;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public long f4271;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public long f4272;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public long f4273;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final boolean[] f4274 = new boolean[15];

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public long f4275;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m3900(long j) {
        long j2 = this.f4275;
        if (j2 == 0) {
            this.f4272 = j;
        } else if (j2 == 1) {
            long j3 = j - this.f4272;
            this.f4268 = j3;
            this.f4273 = j3;
            this.f4269 = 1L;
        } else {
            long j4 = j - this.f4271;
            int i = (int) (j2 % 15);
            long jAbs = Math.abs(j4 - this.f4268);
            boolean[] zArr = this.f4274;
            if (jAbs <= 1000000) {
                this.f4269++;
                this.f4273 += j4;
                if (zArr[i]) {
                    zArr[i] = false;
                    this.f4270--;
                }
            } else if (!zArr[i]) {
                zArr[i] = true;
                this.f4270++;
            }
        }
        this.f4275++;
        this.f4271 = j;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m3901() {
        this.f4275 = 0L;
        this.f4269 = 0L;
        this.f4273 = 0L;
        this.f4270 = 0;
        Arrays.fill(this.f4274, false);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final boolean m3902() {
        return this.f4275 > 15 && this.f4270 == 0;
    }
}
