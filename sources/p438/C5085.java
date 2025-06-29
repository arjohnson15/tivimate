package p438;

import p383.AbstractC4464;
import p383.AbstractC4470;

/* renamed from: ﹶﾞ.ˋﾞ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5085 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final C5085 f19324;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final C5085 f19325;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final long f19326;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final long f19327;

    static {
        C5085 c5085 = new C5085(0L, 0L);
        f19324 = new C5085(Long.MAX_VALUE, Long.MAX_VALUE);
        new C5085(Long.MAX_VALUE, 0L);
        new C5085(0L, Long.MAX_VALUE);
        f19325 = c5085;
    }

    public C5085(long j, long j2) {
        AbstractC4464.m10142(j >= 0);
        AbstractC4464.m10142(j2 >= 0);
        this.f19327 = j;
        this.f19326 = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5085.class != obj.getClass()) {
            return false;
        }
        C5085 c5085 = (C5085) obj;
        return this.f19327 == c5085.f19327 && this.f19326 == c5085.f19326;
    }

    public final int hashCode() {
        return (((int) this.f19327) * 31) + ((int) this.f19326);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final long m11289(long j, long j2, long j3) {
        long j4 = this.f19326;
        long j5 = this.f19327;
        if (j5 == 0 && j4 == 0) {
            return j;
        }
        int i = AbstractC4470.f17202;
        long j6 = j - j5;
        if (((j5 ^ j) & (j ^ j6)) < 0) {
            j6 = Long.MIN_VALUE;
        }
        long j7 = j + j4;
        if (((j4 ^ j7) & (j ^ j7)) < 0) {
            j7 = Long.MAX_VALUE;
        }
        boolean z = false;
        boolean z2 = j6 <= j2 && j2 <= j7;
        if (j6 <= j3 && j3 <= j7) {
            z = true;
        }
        return (z2 && z) ? Math.abs(j2 - j) <= Math.abs(j3 - j) ? j2 : j3 : z2 ? j2 : z ? j3 : j6;
    }
}
