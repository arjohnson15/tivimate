package p375;

import j$.util.Objects;

/* renamed from: ᵢˏ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4302 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Class f16740;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Class f16741;

    public C4302(Class cls, Class cls2) {
        this.f16741 = cls;
        this.f16740 = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4302)) {
            return false;
        }
        C4302 c4302 = (C4302) obj;
        return c4302.f16741.equals(this.f16741) && c4302.f16740.equals(this.f16740);
    }

    public final int hashCode() {
        return Objects.hash(this.f16741, this.f16740);
    }

    public final String toString() {
        return this.f16741.getSimpleName() + " with primitive type: " + this.f16740.getSimpleName();
    }
}
