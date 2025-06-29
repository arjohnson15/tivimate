package p066;

import p080.AbstractC1702;

/* renamed from: ʾᵢ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1537 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f6247;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final int f6248;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String f6249;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f6250;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C1535 f6251;

    public C1537(String str, String str2, String str3, C1535 c1535, int i) {
        this.f6250 = str;
        this.f6247 = str2;
        this.f6249 = str3;
        this.f6251 = c1535;
        this.f6248 = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1537)) {
            return false;
        }
        C1537 c1537 = (C1537) obj;
        String str = this.f6250;
        if (str != null ? str.equals(c1537.f6250) : c1537.f6250 == null) {
            String str2 = this.f6247;
            if (str2 != null ? str2.equals(c1537.f6247) : c1537.f6247 == null) {
                String str3 = this.f6249;
                if (str3 != null ? str3.equals(c1537.f6249) : c1537.f6249 == null) {
                    C1535 c1535 = this.f6251;
                    if (c1535 != null ? c1535.equals(c1537.f6251) : c1537.f6251 == null) {
                        int i = this.f6248;
                        if (i == 0) {
                            if (c1537.f6248 == 0) {
                                return true;
                            }
                        } else if (AbstractC1702.m5410(i, c1537.f6248)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f6250;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f6247;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f6249;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        C1535 c1535 = this.f6251;
        int iHashCode4 = (iHashCode3 ^ (c1535 == null ? 0 : c1535.hashCode())) * 1000003;
        int i = this.f6248;
        return (i != 0 ? AbstractC1702.m5411(i) : 0) ^ iHashCode4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationResponse{uri=");
        sb.append(this.f6250);
        sb.append(", fid=");
        sb.append(this.f6247);
        sb.append(", refreshToken=");
        sb.append(this.f6249);
        sb.append(", authToken=");
        sb.append(this.f6251);
        sb.append(", responseCode=");
        int i = this.f6248;
        sb.append(i != 1 ? i != 2 ? "null" : "BAD_CONFIG" : "OK");
        sb.append("}");
        return sb.toString();
    }
}
