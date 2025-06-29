package p345;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p353.InterfaceC4019;

/* renamed from: ᵎᴵ.ˎᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3942 extends AbstractList implements RandomAccess, Serializable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final InterfaceC4019 f15299;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final AbstractCollection f15300;

    /* JADX WARN: Multi-variable type inference failed */
    public C3942(List list, InterfaceC4019 interfaceC4019) {
        list.getClass();
        this.f15300 = (AbstractCollection) list;
        this.f15299 = interfaceC4019;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f15299.apply(this.f15300.get(i));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f15300.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C3974(this, this.f15300.listIterator(i), 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        return this.f15299.apply(this.f15300.remove(i));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        this.f15300.subList(i, i2).clear();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15300.size();
    }
}
