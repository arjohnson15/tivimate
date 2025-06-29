package androidx.datastore.preferences.protobuf;

import java.util.ListIterator;

/* renamed from: androidx.datastore.preferences.protobuf.ᵎʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0064 implements ListIterator {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final ListIterator f486;

    public C0064(C0044 c0044, int i) {
        this.f486 = c0044.f450.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f486.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f486.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return (String) this.f486.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f486.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return (String) this.f486.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f486.previousIndex();
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
