package p345;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: ᵎᴵ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C3924 extends AbstractC3943 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ C3934 f15249;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Map f15250;

    public C3924(C3934 c3934, Map map) {
        this.f15249 = c3934;
        map.getClass();
        this.f15250 = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            C3947 c3947 = (C3947) it;
            if (!c3947.hasNext()) {
                return;
            }
            c3947.next();
            c3947.remove();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f15250.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f15250.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.f15250.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f15250.keySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f15250.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C3947(this, this.f15250.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int size;
        Collection collection = (Collection) this.f15250.remove(obj);
        if (collection != null) {
            size = collection.size();
            collection.clear();
            this.f15249.f15283 -= size;
        } else {
            size = 0;
        }
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f15250.size();
    }
}
