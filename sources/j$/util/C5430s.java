package j$.util;

import j$.util.stream.AbstractC5551y0;
import j$.util.stream.Stream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;

/* renamed from: j$.util.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5430s extends C5562v {
    private static final long serialVersionUID = 7854390611657943733L;

    @Override // j$.util.C5425m, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return this.a.contains(new C5429q((Map.Entry) obj));
    }

    @Override // j$.util.C5425m, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // j$.util.C5562v, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.Set)) {
            return false;
        }
        java.util.Set set = (java.util.Set) obj;
        if (set.size() != this.a.size()) {
            return false;
        }
        return containsAll(set);
    }

    @Override // j$.util.C5425m, java.lang.Iterable, j$.util.Collection
    public final void forEach(Consumer consumer) {
        Objects.requireNonNull(consumer);
        AbstractC5414b.q(this.a, new C5428p(consumer));
    }

    @Override // j$.util.C5425m, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C5424l(this);
    }

    @Override // j$.util.C5425m, java.util.Collection, j$.util.Collection
    public final Stream parallelStream() {
        return AbstractC5551y0.f0(spliterator(), true);
    }

    @Override // j$.util.C5425m, java.util.Collection, java.lang.Iterable, j$.util.Collection
    public final Spliterator spliterator() {
        return new r(AbstractC5414b.x(this.a));
    }

    @Override // j$.util.C5425m, java.util.Collection, j$.util.Collection
    public final Stream stream() {
        return AbstractC5551y0.f0(spliterator(), false);
    }

    @Override // j$.util.C5425m, java.util.Collection
    public final Object[] toArray() {
        Object[] array = this.a.toArray();
        for (int i = 0; i < array.length; i++) {
            array[i] = new C5429q((Map.Entry) array[i]);
        }
        return array;
    }

    @Override // j$.util.C5425m, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] array = this.a.toArray(objArr.length == 0 ? objArr : Arrays.copyOf(objArr, 0));
        for (int i = 0; i < array.length; i++) {
            array[i] = new C5429q((Map.Entry) array[i]);
        }
        if (array.length > objArr.length) {
            return array;
        }
        System.arraycopy(array, 0, objArr, 0, array.length);
        if (objArr.length > array.length) {
            objArr[array.length] = null;
        }
        return objArr;
    }
}
