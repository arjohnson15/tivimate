package p435;

import java.util.Map;

/* renamed from: ﹶᵔ.ʿˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5040 implements Map.Entry {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public C5040 f19121;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public C5040 f19122;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public Object f19123;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public C5040 f19124;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public int f19125;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public C5040 f19126;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public C5040 f19127;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final Object f19128;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final int f19129;

    public C5040() {
        this.f19128 = null;
        this.f19129 = -1;
        this.f19122 = this;
        this.f19126 = this;
    }

    public C5040(C5040 c5040, Object obj, int i, C5040 c50402, C5040 c50403) {
        this.f19127 = c5040;
        this.f19128 = obj;
        this.f19129 = i;
        this.f19125 = 1;
        this.f19126 = c50402;
        this.f19122 = c50403;
        c50403.f19126 = this;
        c50402.f19122 = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f19128;
        if (obj2 == null) {
            if (entry.getKey() != null) {
                return false;
            }
        } else if (!obj2.equals(entry.getKey())) {
            return false;
        }
        Object obj3 = this.f19123;
        if (obj3 == null) {
            if (entry.getValue() != null) {
                return false;
            }
        } else if (!obj3.equals(entry.getValue())) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f19128;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f19123;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f19128;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f19123;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f19123;
        this.f19123 = obj;
        return obj2;
    }

    public final String toString() {
        return this.f19128 + "=" + this.f19123;
    }
}
