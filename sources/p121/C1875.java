package p121;

/* renamed from: ˈˑ.ˋˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1875 extends AbstractC1874 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final EnumC1894 f7164;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final EnumC1898 f7165;

    public C1875(EnumC1898 enumC1898, EnumC1894 enumC1894) {
        this.f7165 = enumC1898;
        this.f7164 = enumC1894;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1874)) {
            return false;
        }
        AbstractC1874 abstractC1874 = (AbstractC1874) obj;
        EnumC1898 enumC1898 = this.f7165;
        if (enumC1898 != null ? enumC1898.equals(((C1875) abstractC1874).f7165) : ((C1875) abstractC1874).f7165 == null) {
            EnumC1894 enumC1894 = this.f7164;
            if (enumC1894 == null) {
                if (((C1875) abstractC1874).f7164 == null) {
                    return true;
                }
            } else if (enumC1894.equals(((C1875) abstractC1874).f7164)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        EnumC1898 enumC1898 = this.f7165;
        int iHashCode = ((enumC1898 == null ? 0 : enumC1898.hashCode()) ^ 1000003) * 1000003;
        EnumC1894 enumC1894 = this.f7164;
        return (enumC1894 != null ? enumC1894.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f7165 + ", mobileSubtype=" + this.f7164 + "}";
    }
}
