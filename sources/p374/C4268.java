package p374;

/* renamed from: ᵢˎ.ˑⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4268 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean f16577;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f16578;

    public C4268(int i, boolean z) {
        this.f16578 = i;
        this.f16577 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4268.class != obj.getClass()) {
            return false;
        }
        C4268 c4268 = (C4268) obj;
        return this.f16578 == c4268.f16578 && this.f16577 == c4268.f16577;
    }

    public final int hashCode() {
        return (this.f16578 * 31) + (this.f16577 ? 1 : 0);
    }
}
