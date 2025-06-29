package p013;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import p070.AbstractC1565;
import p407.InterfaceC4671;

/* renamed from: ʻי.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1043 implements Collection, InterfaceC4671 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final boolean f4440;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Object[] f4441;

    public C1043(Object[] objArr, boolean z) {
        this.f4441 = objArr;
        this.f4440 = z;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return AbstractC1036.m3997(this.f4441, obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!AbstractC1036.m3997(this.f4441, it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f4441.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C1032(1, this.f4441);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f4441.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] objArr = this.f4441;
        return (this.f4440 && objArr.getClass().equals(Object[].class)) ? objArr : Arrays.copyOf(objArr, objArr.length, Object[].class);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC1565.m5155(this, objArr);
    }
}
