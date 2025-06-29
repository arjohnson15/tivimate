package p324;

import p166.C2405;

/* renamed from: ᴵˋ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3713 implements Comparable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C3712 f14331;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final long f14332;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final String f14333;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final long f14334;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final long f14335;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final int f14336;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final String f14337;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final long f14338;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final C2405 f14339;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final String f14340;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final boolean f14341;

    public AbstractC3713(String str, C3712 c3712, long j, int i, long j2, C2405 c2405, String str2, String str3, long j3, long j4, boolean z) {
        this.f14337 = str;
        this.f14331 = c3712;
        this.f14334 = j;
        this.f14336 = i;
        this.f14332 = j2;
        this.f14339 = c2405;
        this.f14340 = str2;
        this.f14333 = str3;
        this.f14335 = j3;
        this.f14338 = j4;
        this.f14341 = z;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Long l = (Long) obj;
        long jLongValue = l.longValue();
        long j = this.f14332;
        if (j > jLongValue) {
            return 1;
        }
        return j < l.longValue() ? -1 : 0;
    }
}
