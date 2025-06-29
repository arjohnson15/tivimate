package p345;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;
import p353.InterfaceC4016;

/* renamed from: ᵎᴵ.ᵎʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3966 extends C3969 implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f15341).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f15341.iterator();
        it.getClass();
        InterfaceC4016 interfaceC4016 = this.f15340;
        interfaceC4016.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (interfaceC4016.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new C3966(((SortedSet) this.f15341).headSet(obj), this.f15340);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.f15341;
        while (true) {
            Object objLast = sortedSetHeadSet.last();
            if (this.f15340.apply(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new C3966(((SortedSet) this.f15341).subSet(obj, obj2), this.f15340);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new C3966(((SortedSet) this.f15341).tailSet(obj), this.f15340);
    }
}
