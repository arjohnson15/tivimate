package p345;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: ᵎᴵ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3960 extends C3931 implements NavigableSet {

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final /* synthetic */ C3934 f15331;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3960(C3934 c3934, NavigableMap navigableMap) {
        super(c3934, navigableMap);
        this.f15331 = c3934;
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return mo9144().ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((C3924) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new C3960(this.f15331, mo9144().descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return mo9144().floorKey(obj);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return new C3960(this.f15331, mo9144().headMap(obj, z));
    }

    @Override // p345.C3931, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return mo9144().higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return mo9144().lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        C3947 c3947 = (C3947) iterator();
        if (!c3947.hasNext()) {
            return null;
        }
        Object next = c3947.next();
        c3947.remove();
        return next;
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        Iterator itDescendingIterator = descendingIterator();
        if (!itDescendingIterator.hasNext()) {
            return null;
        }
        Object next = itDescendingIterator.next();
        itDescendingIterator.remove();
        return next;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return new C3960(this.f15331, mo9144().subMap(obj, z, obj2, z2));
    }

    @Override // p345.C3931, java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return new C3960(this.f15331, mo9144().tailMap(obj, z));
    }

    @Override // p345.C3931, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // p345.C3931
    /* renamed from: ٴˎ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final NavigableMap mo9144() {
        return (NavigableMap) ((SortedMap) this.f15250);
    }
}
