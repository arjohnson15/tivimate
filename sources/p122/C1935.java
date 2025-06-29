package p122;

import ˆʽ.ᵎˏ;

/* renamed from: ˈי.ˎᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1935 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f7371;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final long f7372;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final String f7373;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int f7374;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f7375;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final boolean f7376;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final int f7377;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final long f7378;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final String f7379;

    public C1935(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.f7375 = i;
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.f7371 = str;
        this.f7374 = i2;
        this.f7378 = j;
        this.f7372 = j2;
        this.f7376 = z;
        this.f7377 = i3;
        if (str2 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        this.f7373 = str2;
        if (str3 == null) {
            throw new NullPointerException("Null modelClass");
        }
        this.f7379 = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1935)) {
            return false;
        }
        C1935 c1935 = (C1935) obj;
        return this.f7375 == c1935.f7375 && this.f7371.equals(c1935.f7371) && this.f7374 == c1935.f7374 && this.f7378 == c1935.f7378 && this.f7372 == c1935.f7372 && this.f7376 == c1935.f7376 && this.f7377 == c1935.f7377 && this.f7373.equals(c1935.f7373) && this.f7379.equals(c1935.f7379);
    }

    public final int hashCode() {
        int iHashCode = (((((this.f7375 ^ 1000003) * 1000003) ^ this.f7371.hashCode()) * 1000003) ^ this.f7374) * 1000003;
        long j = this.f7378;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f7372;
        return ((((((((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.f7376 ? 1231 : 1237)) * 1000003) ^ this.f7377) * 1000003) ^ this.f7373.hashCode()) * 1000003) ^ this.f7379.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceData{arch=");
        sb.append(this.f7375);
        sb.append(", model=");
        sb.append(this.f7371);
        sb.append(", availableProcessors=");
        sb.append(this.f7374);
        sb.append(", totalRam=");
        sb.append(this.f7378);
        sb.append(", diskSpace=");
        sb.append(this.f7372);
        sb.append(", isEmulator=");
        sb.append(this.f7376);
        sb.append(", state=");
        sb.append(this.f7377);
        sb.append(", manufacturer=");
        sb.append(this.f7373);
        sb.append(", modelClass=");
        return ᵎˏ.ˎٴ(sb, this.f7379, "}");
    }
}
