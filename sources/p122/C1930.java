package p122;

import p447.AbstractC5179;

/* renamed from: ˈי.ˋﾞ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1930 extends AbstractC1924 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f7344;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final int f7345;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String f7346;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final long f7347;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final long f7348;

    public C1930(long j, String str, String str2, long j2, int i) {
        this.f7347 = j;
        this.f7344 = str;
        this.f7346 = str2;
        this.f7348 = j2;
        this.f7345 = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1924)) {
            return false;
        }
        AbstractC1924 abstractC1924 = (AbstractC1924) obj;
        if (this.f7347 == ((C1930) abstractC1924).f7347) {
            C1930 c1930 = (C1930) abstractC1924;
            if (this.f7344.equals(c1930.f7344)) {
                String str = c1930.f7346;
                String str2 = this.f7346;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.f7348 == c1930.f7348 && this.f7345 == c1930.f7345) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f7347;
        int iHashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f7344.hashCode()) * 1000003;
        String str = this.f7346;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j2 = this.f7348;
        return this.f7345 ^ ((iHashCode2 ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Frame{pc=");
        sb.append(this.f7347);
        sb.append(", symbol=");
        sb.append(this.f7344);
        sb.append(", file=");
        sb.append(this.f7346);
        sb.append(", offset=");
        sb.append(this.f7348);
        sb.append(", importance=");
        return AbstractC5179.m11550(sb, this.f7345, "}");
    }
}
