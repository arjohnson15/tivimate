package p013;

import p070.AbstractC1549;

/* renamed from: ʻי.ﾞˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1058 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Object f4459;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f4460;

    public C1058(int i, Object obj) {
        this.f4460 = i;
        this.f4459 = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1058)) {
            return false;
        }
        C1058 c1058 = (C1058) obj;
        return this.f4460 == c1058.f4460 && AbstractC1549.m5138(this.f4459, c1058.f4459);
    }

    public final int hashCode() {
        int i = this.f4460 * 31;
        Object obj = this.f4459;
        return i + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f4460 + ", value=" + this.f4459 + ')';
    }
}
