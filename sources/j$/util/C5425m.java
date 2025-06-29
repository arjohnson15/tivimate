package j$.util;

import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* renamed from: j$.util.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C5425m implements java.util.Collection, Serializable, Collection {
    private static final long serialVersionUID = 1820017752578914078L;
    final java.util.Collection a;

    C5425m(java.util.Collection collection) {
        collection.getClass();
        this.a = collection;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(java.util.Collection collection) {
        return this.a.containsAll(collection);
    }

    @Override // java.lang.Iterable, j$.util.Collection
    public void forEach(Consumer consumer) {
        AbstractC5414b.q(this.a, consumer);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new C5424l(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public Stream parallelStream() {
        return AbstractC5414b.u(this.a);
    }

    @Override // java.util.Collection
    public final /* synthetic */ java.util.stream.Stream parallelStream() {
        return Stream.Wrapper.convert(parallelStream());
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, j$.util.Collection
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection
    public Spliterator spliterator() {
        return AbstractC5414b.x(this.a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    @Override // java.util.Collection, j$.util.Collection
    public Stream stream() {
        return AbstractC5414b.y(this.a);
    }

    @Override // java.util.Collection
    public final /* synthetic */ java.util.stream.Stream stream() {
        return Stream.Wrapper.convert(stream());
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return this.a.toArray();
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return this.a.toArray(objArr);
    }

    public final String toString() {
        return this.a.toString();
    }
}
