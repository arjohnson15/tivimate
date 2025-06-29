package p122;

/* renamed from: ˈי.ᵎᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1968 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C1941 f7517;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C1935 f7518;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C1964 f7519;

    public C1968(C1964 c1964, C1941 c1941, C1935 c1935) {
        this.f7519 = c1964;
        this.f7517 = c1941;
        this.f7518 = c1935;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1968)) {
            return false;
        }
        C1968 c1968 = (C1968) obj;
        return this.f7519.equals(c1968.f7519) && this.f7517.equals(c1968.f7517) && this.f7518.equals(c1968.f7518);
    }

    public final int hashCode() {
        return ((((this.f7519.hashCode() ^ 1000003) * 1000003) ^ this.f7517.hashCode()) * 1000003) ^ this.f7518.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f7519 + ", osData=" + this.f7517 + ", deviceData=" + this.f7518 + "}";
    }
}
