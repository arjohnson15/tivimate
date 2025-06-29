package p121;

/* renamed from: ˈˑ.ᴵʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1891 extends AbstractC1884 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C1873 f7185;

    public C1891(C1873 c1873) {
        this.f7185 = c1873;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1884)) {
            return false;
        }
        AbstractC1884 abstractC1884 = (AbstractC1884) obj;
        Object obj2 = EnumC1900.f7222;
        ((C1891) abstractC1884).getClass();
        return obj2.equals(obj2) && this.f7185.equals(((C1891) abstractC1884).f7185);
    }

    public final int hashCode() {
        return ((EnumC1900.f7222.hashCode() ^ 1000003) * 1000003) ^ this.f7185.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + EnumC1900.f7222 + ", androidClientInfo=" + this.f7185 + "}";
    }
}
