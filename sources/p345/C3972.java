package p345;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;
import p353.InterfaceC4019;

/* renamed from: ᵎᴵ.ᵔﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3972 extends AbstractSequentialList implements Serializable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final InterfaceC4019 f15343;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final AbstractCollection f15344;

    /* JADX WARN: Multi-variable type inference failed */
    public C3972(List list, InterfaceC4019 interfaceC4019) {
        list.getClass();
        this.f15344 = (AbstractCollection) list;
        this.f15343 = interfaceC4019;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C3974(this, this.f15344.listIterator(i), 1);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        this.f15344.subList(i, i2).clear();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15344.size();
    }
}
