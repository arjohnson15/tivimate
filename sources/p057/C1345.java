package p057;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import p013.AbstractC1048;
import p407.InterfaceC4671;

/* renamed from: ʾˉ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1345 implements ListIterator, InterfaceC4671 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public int f5484;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final AbstractC1048 f5485;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public int f5487;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f5488 = 0;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public int f5486 = -1;

    public C1345(C1340 c1340, int i) {
        this.f5485 = c1340;
        this.f5484 = i;
        this.f5487 = ((AbstractList) c1340).modCount;
    }

    public C1345(C1344 c1344, int i) {
        this.f5485 = c1344;
        this.f5484 = i;
        this.f5487 = ((AbstractList) c1344).modCount;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f5488) {
            case 0:
                m4687();
                int i = this.f5484;
                this.f5484 = i + 1;
                C1340 c1340 = (C1340) this.f5485;
                c1340.add(i, obj);
                this.f5486 = -1;
                this.f5487 = ((AbstractList) c1340).modCount;
                break;
            default:
                m4686();
                int i2 = this.f5484;
                this.f5484 = i2 + 1;
                C1344 c1344 = (C1344) this.f5485;
                c1344.add(i2, obj);
                this.f5486 = -1;
                this.f5487 = ((AbstractList) c1344).modCount;
                break;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f5488) {
            case 0:
                if (this.f5484 < ((C1340) this.f5485).f5471) {
                }
                break;
            default:
                if (this.f5484 < ((C1344) this.f5485).f5481) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f5488) {
            case 0:
                if (this.f5484 > 0) {
                }
                break;
            default:
                if (this.f5484 > 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f5488) {
            case 0:
                m4687();
                int i = this.f5484;
                C1340 c1340 = (C1340) this.f5485;
                if (i >= c1340.f5471) {
                    throw new NoSuchElementException();
                }
                this.f5484 = i + 1;
                this.f5486 = i;
                return c1340.f5473[c1340.f5469 + i];
            default:
                m4686();
                int i2 = this.f5484;
                C1344 c1344 = (C1344) this.f5485;
                if (i2 >= c1344.f5481) {
                    throw new NoSuchElementException();
                }
                this.f5484 = i2 + 1;
                this.f5486 = i2;
                return c1344.f5483[i2];
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f5488) {
        }
        return this.f5484;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f5488) {
            case 0:
                m4687();
                int i = this.f5484;
                if (i <= 0) {
                    throw new NoSuchElementException();
                }
                int i2 = i - 1;
                this.f5484 = i2;
                this.f5486 = i2;
                C1340 c1340 = (C1340) this.f5485;
                return c1340.f5473[c1340.f5469 + i2];
            default:
                m4686();
                int i3 = this.f5484;
                if (i3 <= 0) {
                    throw new NoSuchElementException();
                }
                int i4 = i3 - 1;
                this.f5484 = i4;
                this.f5486 = i4;
                return ((C1344) this.f5485).f5483[i4];
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f5488) {
        }
        return this.f5484 - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f5488) {
            case 0:
                m4687();
                int i = this.f5486;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                C1340 c1340 = (C1340) this.f5485;
                c1340.mo4038(i);
                this.f5484 = this.f5486;
                this.f5486 = -1;
                this.f5487 = ((AbstractList) c1340).modCount;
                return;
            default:
                m4686();
                int i2 = this.f5486;
                if (i2 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                C1344 c1344 = (C1344) this.f5485;
                c1344.mo4038(i2);
                this.f5484 = this.f5486;
                this.f5486 = -1;
                this.f5487 = ((AbstractList) c1344).modCount;
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f5488) {
            case 0:
                m4687();
                int i = this.f5486;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((C1340) this.f5485).set(i, obj);
                return;
            default:
                m4686();
                int i2 = this.f5486;
                if (i2 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((C1344) this.f5485).set(i2, obj);
                return;
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public void m4686() {
        if (((AbstractList) ((C1344) this.f5485)).modCount != this.f5487) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public void m4687() {
        if (((AbstractList) ((C1340) this.f5485).f5470).modCount != this.f5487) {
            throw new ConcurrentModificationException();
        }
    }
}
