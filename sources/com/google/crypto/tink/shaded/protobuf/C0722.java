package com.google.crypto.tink.shaded.protobuf;

import java.util.ListIterator;

/* renamed from: com.google.crypto.tink.shaded.protobuf.ʻﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0722 implements ListIterator {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final ListIterator f3521;

    public C0722(C0723 c0723, int i) {
        this.f3521 = c0723.f3522.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f3521.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f3521.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return (String) this.f3521.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f3521.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return (String) this.f3521.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f3521.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
