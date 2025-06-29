package p163;

/* renamed from: ˊᵎ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2357 extends C2358 {

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static final C2357 f9329 = new C2357(1, 0, 1);

    @Override // p163.C2358
    public final boolean equals(Object obj) {
        if (obj instanceof C2357) {
            if (!isEmpty() || !((C2357) obj).isEmpty()) {
                C2357 c2357 = (C2357) obj;
                if (this.f9332 == c2357.f9332) {
                    if (this.f9330 == c2357.f9330) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // p163.C2358
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f9332 * 31) + this.f9330;
    }

    @Override // p163.C2358
    public final boolean isEmpty() {
        return this.f9332 > this.f9330;
    }

    @Override // p163.C2358
    public final String toString() {
        return this.f9332 + ".." + this.f9330;
    }
}
