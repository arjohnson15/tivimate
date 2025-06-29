package p122;

import ˆʽ.ᵎˏ;

/* renamed from: ˈי.ˑﾞ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1944 extends AbstractC1977 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f7410;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final long f7411;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final String f7412;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int f7413;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f7414;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final boolean f7415;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final int f7416;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final long f7417;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final String f7418;

    public C1944(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.f7414 = i;
        this.f7410 = str;
        this.f7413 = i2;
        this.f7417 = j;
        this.f7411 = j2;
        this.f7415 = z;
        this.f7416 = i3;
        this.f7412 = str2;
        this.f7418 = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1977)) {
            return false;
        }
        AbstractC1977 abstractC1977 = (AbstractC1977) obj;
        if (this.f7414 == ((C1944) abstractC1977).f7414) {
            C1944 c1944 = (C1944) abstractC1977;
            if (this.f7410.equals(c1944.f7410) && this.f7413 == c1944.f7413 && this.f7417 == c1944.f7417 && this.f7411 == c1944.f7411 && this.f7415 == c1944.f7415 && this.f7416 == c1944.f7416 && this.f7412.equals(c1944.f7412) && this.f7418.equals(c1944.f7418)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f7414 ^ 1000003) * 1000003) ^ this.f7410.hashCode()) * 1000003) ^ this.f7413) * 1000003;
        long j = this.f7417;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f7411;
        return ((((((((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.f7415 ? 1231 : 1237)) * 1000003) ^ this.f7416) * 1000003) ^ this.f7412.hashCode()) * 1000003) ^ this.f7418.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{arch=");
        sb.append(this.f7414);
        sb.append(", model=");
        sb.append(this.f7410);
        sb.append(", cores=");
        sb.append(this.f7413);
        sb.append(", ram=");
        sb.append(this.f7417);
        sb.append(", diskSpace=");
        sb.append(this.f7411);
        sb.append(", simulator=");
        sb.append(this.f7415);
        sb.append(", state=");
        sb.append(this.f7416);
        sb.append(", manufacturer=");
        sb.append(this.f7412);
        sb.append(", modelClass=");
        return ᵎˏ.ˎٴ(sb, this.f7418, "}");
    }
}
