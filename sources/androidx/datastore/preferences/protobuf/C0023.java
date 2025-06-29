package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.ˈﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0023 implements Map.Entry, Comparable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public Object f380;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ C0034 f381;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Comparable f382;

    public C0023(C0034 c0034, Comparable comparable, Object obj) {
        this.f381 = c0034;
        this.f382 = comparable;
        this.f380 = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f382.compareTo(((C0023) obj).f382);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Comparable comparable = this.f382;
        if (comparable == null ? key == null : comparable.equals(key)) {
            Object obj2 = this.f380;
            Object value = entry.getValue();
            if (obj2 == null ? value == null : obj2.equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f382;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f380;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f382;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f380;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f381.m346();
        Object obj2 = this.f380;
        this.f380 = obj;
        return obj2;
    }

    public final String toString() {
        return this.f382 + "=" + this.f380;
    }
}
