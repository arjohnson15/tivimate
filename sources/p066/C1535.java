package p066;

import com.google.android.gms.internal.play_billing.ᐧʻ;
import p080.AbstractC1702;

/* renamed from: ʾᵢ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1535 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final long f6239;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int f6240;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f6241;

    public C1535(int i, long j, String str) {
        this.f6241 = str;
        this.f6239 = j;
        this.f6240 = i;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static ᐧʻ m5114() {
        ᐧʻ r0 = new ᐧʻ((byte) 0, 3);
        r0.ᐧˋ = 0L;
        return r0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1535)) {
            return false;
        }
        C1535 c1535 = (C1535) obj;
        String str = this.f6241;
        if (str != null ? str.equals(c1535.f6241) : c1535.f6241 == null) {
            if (this.f6239 == c1535.f6239) {
                int i = c1535.f6240;
                int i2 = this.f6240;
                if (i2 == 0) {
                    if (i == 0) {
                        return true;
                    }
                } else if (AbstractC1702.m5410(i2, i)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f6241;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.f6239;
        int i = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        int i2 = this.f6240;
        return (i2 != 0 ? AbstractC1702.m5411(i2) : 0) ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TokenResult{token=");
        sb.append(this.f6241);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.f6239);
        sb.append(", responseCode=");
        int i = this.f6240;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "AUTH_ERROR" : "BAD_CONFIG" : "OK");
        sb.append("}");
        return sb.toString();
    }
}
