package p031;

/* renamed from: ʼـ.ᵎˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1200 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Class f4941;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Class f4942;

    public C1200(Class cls, Class cls2) {
        this.f4942 = cls;
        this.f4941 = cls2;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C1200 m4252(Class cls) {
        return new C1200(InterfaceC1190.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1200.class != obj.getClass()) {
            return false;
        }
        C1200 c1200 = (C1200) obj;
        if (this.f4941.equals(c1200.f4941)) {
            return this.f4942.equals(c1200.f4942);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4942.hashCode() + (this.f4941.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f4941;
        Class cls2 = this.f4942;
        if (cls2 == InterfaceC1190.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
