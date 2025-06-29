package p122;

/* renamed from: ˈי.ٴﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1953 extends AbstractC1972 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f7454;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String f7455;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f7456;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final boolean f7457;

    public C1953(int i, String str, String str2, boolean z) {
        this.f7456 = i;
        this.f7454 = str;
        this.f7455 = str2;
        this.f7457 = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1972)) {
            return false;
        }
        AbstractC1972 abstractC1972 = (AbstractC1972) obj;
        if (this.f7456 == ((C1953) abstractC1972).f7456) {
            C1953 c1953 = (C1953) abstractC1972;
            if (this.f7454.equals(c1953.f7454) && this.f7455.equals(c1953.f7455) && this.f7457 == c1953.f7457) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f7456 ^ 1000003) * 1000003) ^ this.f7454.hashCode()) * 1000003) ^ this.f7455.hashCode()) * 1000003) ^ (this.f7457 ? 1231 : 1237);
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f7456 + ", version=" + this.f7454 + ", buildVersion=" + this.f7455 + ", jailbroken=" + this.f7457 + "}";
    }
}
