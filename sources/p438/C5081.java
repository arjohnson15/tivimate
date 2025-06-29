package p438;

/* renamed from: ﹶﾞ.ˊᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5081 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final C5081 f19306 = new C5081(0, false);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean f19307;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f19308;

    public C5081(int i, boolean z) {
        this.f19308 = i;
        this.f19307 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5081.class != obj.getClass()) {
            return false;
        }
        C5081 c5081 = (C5081) obj;
        return this.f19308 == c5081.f19308 && this.f19307 == c5081.f19307;
    }

    public final int hashCode() {
        return (this.f19308 << 1) + (this.f19307 ? 1 : 0);
    }
}
