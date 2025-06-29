package p121;

/* renamed from: ˈˑ.ˎٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1878 extends AbstractC1877 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C1893 f7167;

    public C1878(C1893 c1893) {
        this.f7167 = c1893;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1877) {
            return this.f7167.equals(((C1878) ((AbstractC1877) obj)).f7167);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7167.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f7167 + "}";
    }
}
