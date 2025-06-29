package p302;

/* renamed from: ᐧʽ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3510 implements InterfaceC3513 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f13614;

    public C3510(int i) {
        this.f13614 = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return InterfaceC3513.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC3513)) {
            return false;
        }
        C3510 c3510 = (C3510) ((InterfaceC3513) obj);
        if (this.f13614 == c3510.f13614) {
            Object obj2 = EnumC3509.f13613;
            c3510.getClass();
            if (obj2.equals(obj2)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (14552422 ^ this.f13614) + (EnumC3509.f13613.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f13614 + "intEncoding=" + EnumC3509.f13613 + ')';
    }
}
