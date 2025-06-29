package p031;

/* renamed from: ʼـ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1191 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean f4919;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C1200 f4920;

    public C1191(C1200 c1200, boolean z) {
        this.f4920 = c1200;
        this.f4919 = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1191)) {
            return false;
        }
        C1191 c1191 = (C1191) obj;
        return c1191.f4920.equals(this.f4920) && c1191.f4919 == this.f4919;
    }

    public final int hashCode() {
        return ((this.f4920.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f4919).hashCode();
    }
}
