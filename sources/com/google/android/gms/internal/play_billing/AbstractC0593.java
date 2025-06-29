package com.google.android.gms.internal.play_billing;

import j$.lang.Iterable$CC;
import j$.util.AbstractC5414b;
import j$.util.Collection;
import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.stream.AbstractC5551y0;
import j$.util.stream.Stream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* renamed from: com.google.android.gms.internal.play_billing.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0593 extends AbstractCollection implements Serializable, Collection {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static final Object[] f2960 = new Object[0];

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.lang.Iterable, j$.util.Collection
    public final /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        return AbstractC5551y0.f0(AbstractC5414b.x(this), true);
    }

    @Override // java.util.Collection
    public final /* synthetic */ java.util.stream.Stream parallelStream() {
        return Stream.Wrapper.convert(AbstractC5551y0.f0(AbstractC5414b.x(this), true));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection.CC.$default$removeIf(this, predicate);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection
    public final Spliterator spliterator() {
        return Spliterators.spliterator(this, 1296);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(Spliterators.spliterator(this, 1296));
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream stream() {
        return AbstractC5551y0.f0(AbstractC5414b.x(this), false);
    }

    @Override // java.util.Collection
    public final /* synthetic */ java.util.stream.Stream stream() {
        return Stream.Wrapper.convert(AbstractC5551y0.f0(AbstractC5414b.x(this), false));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f2960);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] objArrMo2561 = mo2561();
            if (objArrMo2561 != null) {
                return Arrays.copyOfRange(objArrMo2561, mo2559(), mo2558(), objArr.getClass());
            }
            if (length != 0) {
                objArr = Arrays.copyOf(objArr, 0);
            }
            objArr = Arrays.copyOf(objArr, size);
        } else if (length > size) {
            objArr[size] = null;
        }
        mo2560(objArr);
        return objArr;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public int mo2558() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public int mo2559() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public abstract int mo2560(Object[] objArr);

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public Object[] mo2561() {
        return null;
    }
}
