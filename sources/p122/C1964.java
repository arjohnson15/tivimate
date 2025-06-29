package p122;

import p331.C3761;

/* renamed from: ˈי.ᵎʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1964 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f7498;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final int f7499;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String f7500;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f7501;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final C3761 f7502;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final String f7503;

    public C1964(String str, String str2, String str3, String str4, int i, C3761 c3761) {
        if (str == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.f7501 = str;
        if (str2 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.f7498 = str2;
        if (str3 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.f7500 = str3;
        if (str4 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.f7503 = str4;
        this.f7499 = i;
        this.f7502 = c3761;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1964)) {
            return false;
        }
        C1964 c1964 = (C1964) obj;
        return this.f7501.equals(c1964.f7501) && this.f7498.equals(c1964.f7498) && this.f7500.equals(c1964.f7500) && this.f7503.equals(c1964.f7503) && this.f7499 == c1964.f7499 && this.f7502.equals(c1964.f7502);
    }

    public final int hashCode() {
        return ((((((((((this.f7501.hashCode() ^ 1000003) * 1000003) ^ this.f7498.hashCode()) * 1000003) ^ this.f7500.hashCode()) * 1000003) ^ this.f7503.hashCode()) * 1000003) ^ this.f7499) * 1000003) ^ this.f7502.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f7501 + ", versionCode=" + this.f7498 + ", versionName=" + this.f7500 + ", installUuid=" + this.f7503 + ", deliveryMechanism=" + this.f7499 + ", developmentPlatformProvider=" + this.f7502 + "}";
    }
}
