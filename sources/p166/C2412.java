package p166;

import p383.AbstractC4470;
import ˆʽ.ᵎˏ;

/* renamed from: ˊﹶ.ˎᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2412 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public Object f9574;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public long f9575;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f9576;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public Object f9577;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public boolean f9578;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public C2395 f9579 = C2395.f9449;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public long f9580;

    static {
        ᵎˏ.ﹳˎ(0, 1, 2, 3, 4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C2412.class.equals(obj.getClass())) {
            return false;
        }
        C2412 c2412 = (C2412) obj;
        return AbstractC4470.m10194(this.f9577, c2412.f9577) && AbstractC4470.m10194(this.f9574, c2412.f9574) && this.f9576 == c2412.f9576 && this.f9580 == c2412.f9580 && this.f9575 == c2412.f9575 && this.f9578 == c2412.f9578 && AbstractC4470.m10194(this.f9579, c2412.f9579);
    }

    public final int hashCode() {
        Object obj = this.f9577;
        int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.f9574;
        int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f9576) * 31;
        long j = this.f9580;
        int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f9575;
        return this.f9579.hashCode() + ((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f9578 ? 1 : 0)) * 31);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int m6499(long j) {
        int i;
        C2422 c2422M6484;
        int i2;
        C2395 c2395 = this.f9579;
        long j2 = this.f9580;
        c2395.getClass();
        if (j == Long.MIN_VALUE) {
            return -1;
        }
        if (j2 != -9223372036854775807L && j >= j2) {
            return -1;
        }
        int i3 = 0;
        while (true) {
            i = c2395.f9452;
            if (i3 >= i) {
                break;
            }
            c2395.m6484(i3).getClass();
            c2395.m6484(i3).getClass();
            if (0 > j && ((i2 = (c2422M6484 = c2395.m6484(i3)).f9638) == -1 || c2422M6484.m6525(-1) < i2)) {
                break;
            }
            i3++;
        }
        if (i3 < i) {
            return i3;
        }
        return -1;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final int m6500(int i) {
        return this.f9579.m6484(i).m6525(-1);
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final void m6501(Object obj, Object obj2, int i, long j, long j2, C2395 c2395, boolean z) {
        this.f9577 = obj;
        this.f9574 = obj2;
        this.f9576 = i;
        this.f9580 = j;
        this.f9575 = j2;
        this.f9579 = c2395;
        this.f9578 = z;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int m6502(long j) {
        C2395 c2395 = this.f9579;
        int i = c2395.f9452 - 1;
        c2395.m6483(i);
        while (i >= 0 && j != Long.MIN_VALUE) {
            c2395.m6484(i).getClass();
            if (j >= 0) {
                break;
            }
            i--;
        }
        if (i >= 0) {
            C2422 c2422M6484 = c2395.m6484(i);
            int i2 = c2422M6484.f9638;
            if (i2 == -1) {
                return i;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = c2422M6484.f9636[i3];
                if (i4 == 0 || i4 == 1) {
                    return i;
                }
            }
        }
        return -1;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final long m6503(int i, int i2) {
        C2422 c2422M6484 = this.f9579.m6484(i);
        if (c2422M6484.f9638 != -1) {
            return c2422M6484.f9639[i2];
        }
        return -9223372036854775807L;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final boolean m6504(int i) {
        C2395 c2395 = this.f9579;
        if (i != c2395.f9452 - 1) {
            return false;
        }
        c2395.m6483(i);
        return false;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final boolean m6505(int i) {
        this.f9579.m6484(i).getClass();
        return false;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final long m6506(int i) {
        this.f9579.m6484(i).getClass();
        return 0L;
    }
}
