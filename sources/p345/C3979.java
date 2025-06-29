package p345;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* renamed from: ᵎᴵ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C3979 extends AbstractMap {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public transient C3964 f15356;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final transient Map f15357;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final /* synthetic */ C3934 f15358;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public transient C3922 f15359;

    public C3979(C3934 c3934, Map map) {
        this.f15358 = c3934;
        this.f15357 = map;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        C3934 c3934 = this.f15358;
        if (this.f15357 == c3934.f15284) {
            c3934.m9148();
            return;
        }
        C3947 c3947 = new C3947(this);
        while (c3947.hasNext()) {
            c3947.next();
            c3947.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.f15357;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C3922 c3922 = this.f15359;
        if (c3922 != null) {
            return c3922;
        }
        C3922 c39222 = new C3922(this);
        this.f15359 = c39222;
        return c39222;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f15357.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Map map = this.f15357;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        C3934 c3934 = this.f15358;
        c3934.getClass();
        List list = (List) collection;
        return list instanceof RandomAccess ? new C3946(c3934, obj, list, null) : new C3933(c3934, obj, list, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f15357.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public Set keySet() {
        C3934 c3934 = this.f15358;
        Set c3960 = c3934.f3519;
        if (c3960 == null) {
            Map map = c3934.f15284;
            c3960 = map instanceof NavigableMap ? new C3960(c3934, (NavigableMap) map) : map instanceof SortedMap ? new C3931(c3934, (SortedMap) map) : new C3924(c3934, map);
            c3934.f3519 = c3960;
        }
        return c3960;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.f15357.remove(obj);
        if (collection == null) {
            return null;
        }
        C3934 c3934 = this.f15358;
        Collection collectionM9149 = c3934.m9149();
        collectionM9149.addAll(collection);
        c3934.f15283 -= collection.size();
        collection.clear();
        return collectionM9149;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f15357.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f15357.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C3964 c3964 = this.f15356;
        if (c3964 != null) {
            return c3964;
        }
        C3964 c39642 = new C3964(this);
        this.f15356 = c39642;
        return c39642;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C3940 m9202(Map.Entry entry) {
        Object key = entry.getKey();
        Collection collection = (Collection) entry.getValue();
        C3934 c3934 = this.f15358;
        c3934.getClass();
        List list = (List) collection;
        return new C3940(key, list instanceof RandomAccess ? new C3946(c3934, key, list, null) : new C3933(c3934, key, list, null));
    }
}
