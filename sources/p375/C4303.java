package p375;

import j$.util.Objects;

/* renamed from: ᵢˏ.ˎٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4303 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Class f16742;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Class f16743;

    public C4303(Class cls, Class cls2) {
        this.f16743 = cls;
        this.f16742 = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4303)) {
            return false;
        }
        C4303 c4303 = (C4303) obj;
        return c4303.f16743.equals(this.f16743) && c4303.f16742.equals(this.f16742);
    }

    public final int hashCode() {
        return Objects.hash(this.f16743, this.f16742);
    }

    public final String toString() {
        return this.f16743.getSimpleName() + " with serialization type: " + this.f16742.getSimpleName();
    }
}
