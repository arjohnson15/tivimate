package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.play_billing.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0627 implements ListIterator, Iterator {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public int f2998;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final AbstractC0597 f2999;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int f3000;

    public C0627(AbstractC0597 abstractC0597, int i) {
        int size = abstractC0597.size();
        ˈי.ʾˈ.ᵎˏ(i, size);
        this.f3000 = size;
        this.f2998 = i;
        this.f2999 = abstractC0597;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f2998 < this.f3000;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f2998 > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f2998;
        this.f2998 = i + 1;
        return m2640(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f2998;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f2998 - 1;
        this.f2998 = i;
        return m2640(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f2998 - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Object m2640(int i) {
        return this.f2999.get(i);
    }
}
