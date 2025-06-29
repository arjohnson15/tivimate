package p121;

/* renamed from: ˈˑ.ˏᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1880 extends AbstractC1871 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C1878 f7171;

    public C1880(C1878 c1878) {
        EnumC1896 enumC1896 = EnumC1896.f7205;
        this.f7171 = c1878;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1871)) {
            return false;
        }
        AbstractC1871 abstractC1871 = (AbstractC1871) obj;
        if (this.f7171.equals(((C1880) abstractC1871).f7171)) {
            Object obj2 = EnumC1896.f7205;
            ((C1880) abstractC1871).getClass();
            if (obj2.equals(obj2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f7171.hashCode() ^ 1000003) * 1000003) ^ EnumC1896.f7205.hashCode();
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.f7171 + ", productIdOrigin=" + EnumC1896.f7205 + "}";
    }
}
