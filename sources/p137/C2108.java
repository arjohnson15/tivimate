package p137;

/* renamed from: ˉˈ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2108 implements InterfaceC2103 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f8330;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public Class f8331;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C2100 f8332;

    public C2108(C2100 c2100) {
        this.f8332 = c2100;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2108)) {
            return false;
        }
        C2108 c2108 = (C2108) obj;
        return this.f8330 == c2108.f8330 && this.f8331 == c2108.f8331;
    }

    public final int hashCode() {
        int i = this.f8330 * 31;
        Class cls = this.f8331;
        return i + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "Key{size=" + this.f8330 + "array=" + this.f8331 + '}';
    }

    @Override // p137.InterfaceC2103
    /* renamed from: ـﹶ */
    public final void mo5953() {
        this.f8332.ˎᵢ(this);
    }
}
