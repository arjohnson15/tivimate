package p345;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import ﹶⁱ.ـﹶ;

/* renamed from: ᵎᴵ.ˆᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3928 extends AbstractC3986 implements ListIterator {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public int f15262;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final AbstractC3980 f15263;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int f15264;

    public C3928(AbstractC3980 abstractC3980, int i) {
        int size = abstractC3980.size();
        ـﹶ.ﹶˆ(i, size);
        this.f15264 = size;
        this.f15262 = i;
        this.f15263 = abstractC3980;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f15262 < this.f15264;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f15262 > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f15262;
        this.f15262 = i + 1;
        return m9137(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f15262;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f15262 - 1;
        this.f15262 = i;
        return m9137(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f15262 - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Object m9137(int i) {
        return this.f15263.get(i);
    }
}
