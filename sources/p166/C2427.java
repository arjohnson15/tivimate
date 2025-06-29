package p166;

/* renamed from: ˊﹶ.ᴵʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2427 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C2414 f9648;

    public C2427(C2414 c2414) {
        this.f9648 = c2414;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2427) {
            return this.f9648.equals(((C2427) obj).f9648);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9648.hashCode();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final boolean m6527(int... iArr) {
        C2414 c2414 = this.f9648;
        for (int i : iArr) {
            if (c2414.f9586.get(i)) {
                return true;
            }
        }
        return false;
    }
}
