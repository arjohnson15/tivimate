package p375;

import j$.util.Objects;
import p005.C0934;

/* renamed from: ᵢˏ.ᵎـ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4314 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C0934 f16766;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Class f16767;

    public C4314(Class cls, C0934 c0934) {
        this.f16767 = cls;
        this.f16766 = c0934;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4314)) {
            return false;
        }
        C4314 c4314 = (C4314) obj;
        return c4314.f16767.equals(this.f16767) && c4314.f16766.equals(this.f16766);
    }

    public final int hashCode() {
        return Objects.hash(this.f16767, this.f16766);
    }

    public final String toString() {
        return this.f16767.getSimpleName() + ", object identifier: " + this.f16766;
    }
}
