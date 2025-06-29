package p000;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p345.AbstractC3968;
import p345.C3919;

/* renamed from: ʻ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0868 implements Map {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Map f3946;

    public C0868(Map map) {
        this.f3946 = map;
    }

    @Override // java.util.Map
    public final void clear() {
        this.f3946.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && this.f3946.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        C3919 c3919 = new C3919(entrySet().iterator());
        if (obj == null) {
            while (c3919.hasNext()) {
                if (c3919.next() == null) {
                    return true;
                }
            }
        } else {
            while (c3919.hasNext()) {
                if (obj.equals(c3919.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return AbstractC3968.m9179(this.f3946.entrySet(), new C0867(0));
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && AbstractC3968.m9186(this, obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.f3946.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return AbstractC3968.m9182(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        Map map = this.f3946;
        if (map.isEmpty()) {
            return true;
        }
        return map.size() == 1 && map.containsKey(null);
    }

    @Override // java.util.Map
    public final Set keySet() {
        return AbstractC3968.m9179(this.f3946.keySet(), new C0867(1));
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.f3946.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.f3946.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.f3946.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        Map map = this.f3946;
        return map.size() - (map.containsKey(null) ? 1 : 0);
    }

    public final String toString() {
        return this.f3946.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f3946.values();
    }
}
