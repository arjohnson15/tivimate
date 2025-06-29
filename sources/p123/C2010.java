package p123;

import java.util.Arrays;
import java.util.HashMap;

/* renamed from: ˈـ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2010 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Integer f7642;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final long f7643;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final byte[] f7644;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final String f7645;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C1997 f7646;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f7647;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final HashMap f7648;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final Integer f7649;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final long f7650;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final byte[] f7651;

    public C2010(String str, Integer num, C1997 c1997, long j, long j2, HashMap map, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.f7647 = str;
        this.f7642 = num;
        this.f7646 = c1997;
        this.f7650 = j;
        this.f7643 = j2;
        this.f7648 = map;
        this.f7649 = num2;
        this.f7645 = str2;
        this.f7651 = bArr;
        this.f7644 = bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2010)) {
            return false;
        }
        C2010 c2010 = (C2010) obj;
        if (this.f7647.equals(c2010.f7647)) {
            Integer num = c2010.f7642;
            Integer num2 = this.f7642;
            if (num2 != null ? num2.equals(num) : num == null) {
                if (this.f7646.equals(c2010.f7646) && this.f7650 == c2010.f7650 && this.f7643 == c2010.f7643 && this.f7648.equals(c2010.f7648)) {
                    Integer num3 = c2010.f7649;
                    Integer num4 = this.f7649;
                    if (num4 != null ? num4.equals(num3) : num3 == null) {
                        String str = c2010.f7645;
                        String str2 = this.f7645;
                        if (str2 != null ? str2.equals(str) : str == null) {
                            if (Arrays.equals(this.f7651, c2010.f7651) && Arrays.equals(this.f7644, c2010.f7644)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f7647.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f7642;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f7646.hashCode()) * 1000003;
        long j = this.f7650;
        int i = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f7643;
        int iHashCode3 = (((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f7648.hashCode()) * 1000003;
        Integer num2 = this.f7649;
        int iHashCode4 = (iHashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.f7645;
        return ((((iHashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.f7651)) * 1000003) ^ Arrays.hashCode(this.f7644);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f7647 + ", code=" + this.f7642 + ", encodedPayload=" + this.f7646 + ", eventMillis=" + this.f7650 + ", uptimeMillis=" + this.f7643 + ", autoMetadata=" + this.f7648 + ", productId=" + this.f7649 + ", pseudonymousId=" + this.f7645 + ", experimentIdsClear=" + Arrays.toString(this.f7651) + ", experimentIdsEncrypted=" + Arrays.toString(this.f7644) + "}";
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int m5653(String str) {
        String str2 = (String) this.f7648.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C2001 m5654() {
        C2001 c2001 = new C2001();
        String str = this.f7647;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        c2001.f7614 = str;
        c2001.f7609 = this.f7642;
        c2001.f7616 = this.f7649;
        c2001.f7612 = this.f7645;
        c2001.f7618 = this.f7651;
        c2001.f7611 = this.f7644;
        C1997 c1997 = this.f7646;
        if (c1997 == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        c2001.f7613 = c1997;
        c2001.f7617 = Long.valueOf(this.f7650);
        c2001.f7610 = Long.valueOf(this.f7643);
        c2001.f7615 = new HashMap(this.f7648);
        return c2001;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String m5655(String str) {
        String str2 = (String) this.f7648.get(str);
        return str2 == null ? "" : str2;
    }
}
