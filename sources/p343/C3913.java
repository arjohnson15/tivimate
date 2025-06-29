package p343;

import java.util.Map;

/* renamed from: ᵎـ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3913 implements Map.Entry {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final Object f15215;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public C3913 f15216;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public C3913 f15217;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Object f15218;

    public C3913(Object obj, Object obj2) {
        this.f15218 = obj;
        this.f15215 = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3913)) {
            return false;
        }
        C3913 c3913 = (C3913) obj;
        return this.f15218.equals(c3913.f15218) && this.f15215.equals(c3913.f15215);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f15218;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f15215;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f15218.hashCode() ^ this.f15215.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f15218 + "=" + this.f15215;
    }
}
