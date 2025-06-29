package p345;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import p353.InterfaceC4016;
import ﹶⁱ.ـﹶ;

/* renamed from: ᵎᴵ.ᵎᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C3969 extends AbstractCollection implements Set {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final InterfaceC4016 f15340;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Set f15341;

    public C3969(Set set, InterfaceC4016 interfaceC4016) {
        this.f15341 = set;
        this.f15340 = interfaceC4016;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        if (this.f15340.apply(obj)) {
            return this.f15341.add(obj);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f15340.apply(it.next())) {
                throw new IllegalArgumentException();
            }
        }
        return this.f15341.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Set set = this.f15341;
        boolean z = set instanceof RandomAccess;
        InterfaceC4016 interfaceC4016 = this.f15340;
        if (!z || !(set instanceof List)) {
            Iterator it = set.iterator();
            interfaceC4016.getClass();
            while (it.hasNext()) {
                if (interfaceC4016.apply(it.next())) {
                    it.remove();
                }
            }
            return;
        }
        List list = (List) set;
        interfaceC4016.getClass();
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            if (!interfaceC4016.apply(obj)) {
                if (i2 > i) {
                    try {
                        list.set(i, obj);
                    } catch (IllegalArgumentException unused) {
                        AbstractC3968.m9191(list, interfaceC4016, i, i2);
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        AbstractC3968.m9191(list, interfaceC4016, i, i2);
                        return;
                    }
                }
                i++;
            }
        }
        list.subList(i, list.size()).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        boolean zContains;
        Set set = this.f15341;
        set.getClass();
        try {
            zContains = set.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            zContains = false;
        }
        if (zContains) {
            return this.f15340.apply(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return AbstractC3968.m9195(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return AbstractC3968.m9182(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        Iterator it = this.f15341.iterator();
        InterfaceC4016 interfaceC4016 = this.f15340;
        ـﹶ.ˏᵢ(interfaceC4016, "predicate");
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (interfaceC4016.apply(it.next())) {
                break;
            }
            i++;
        }
        return true ^ (i != -1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Iterator it = this.f15341.iterator();
        it.getClass();
        InterfaceC4016 interfaceC4016 = this.f15340;
        interfaceC4016.getClass();
        return new C3923(it, interfaceC4016);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return contains(obj) && this.f15341.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f15341.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f15340.apply(next) && collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f15341.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f15340.apply(next) && !collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f15341.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.f15340.apply(it.next())) {
                i++;
            }
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            C3923 c3923 = (C3923) it;
            if (!c3923.hasNext()) {
                return arrayList.toArray();
            }
            arrayList.add(c3923.next());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            C3923 c3923 = (C3923) it;
            if (!c3923.hasNext()) {
                return arrayList.toArray(objArr);
            }
            arrayList.add(c3923.next());
        }
    }
}
