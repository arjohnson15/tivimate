package p121;

/* renamed from: ˈˑ.ᵎـ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1893 extends AbstractC1869 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Integer f7195;

    public C1893(Integer num) {
        this.f7195 = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1869)) {
            return false;
        }
        Integer num = this.f7195;
        C1893 c1893 = (C1893) ((AbstractC1869) obj);
        return num == null ? c1893.f7195 == null : num.equals(c1893.f7195);
    }

    public final int hashCode() {
        Integer num = this.f7195;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.f7195 + "}";
    }
}
