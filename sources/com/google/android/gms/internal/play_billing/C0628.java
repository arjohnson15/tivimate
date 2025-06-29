package com.google.android.gms.internal.play_billing;

import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.play_billing.ˑʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0628 implements ListIterator {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final ListIterator f3001;

    public C0628(C0681 c0681, int i) {
        this.f3001 = c0681.f3104.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f3001.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f3001.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f3001.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f3001.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f3001.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f3001.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
