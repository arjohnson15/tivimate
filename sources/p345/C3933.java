package p345;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: ᵎᴵ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C3933 extends AbstractCollection implements List {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public Collection f15277;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final /* synthetic */ C3934 f15278;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final C3933 f15279;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final Collection f15280;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Object f15281;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ C3934 f15282;

    public C3933(C3934 c3934, Object obj, List list, C3933 c3933) {
        this.f15282 = c3934;
        this.f15278 = c3934;
        this.f15281 = obj;
        this.f15277 = list;
        this.f15279 = c3933;
        this.f15280 = c3933 == null ? null : c3933.f15277;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        m9145();
        boolean zIsEmpty = this.f15277.isEmpty();
        ((List) this.f15277).add(i, obj);
        this.f15282.f15283++;
        if (zIsEmpty) {
            m9147();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m9145();
        boolean zIsEmpty = this.f15277.isEmpty();
        boolean zAdd = this.f15277.add(obj);
        if (zAdd) {
            this.f15278.f15283++;
            if (zIsEmpty) {
                m9147();
            }
        }
        return zAdd;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.f15277).addAll(i, collection);
        if (zAddAll) {
            this.f15282.f15283 += this.f15277.size() - size;
            if (size == 0) {
                m9147();
            }
        }
        return zAddAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.f15277.addAll(collection);
        if (zAddAll) {
            this.f15278.f15283 += this.f15277.size() - size;
            if (size == 0) {
                m9147();
            }
        }
        return zAddAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f15277.clear();
        this.f15278.f15283 -= size;
        m9146();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        m9145();
        return this.f15277.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        m9145();
        return this.f15277.containsAll(collection);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        m9145();
        return this.f15277.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        m9145();
        return ((List) this.f15277).get(i);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        m9145();
        return this.f15277.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        m9145();
        return ((List) this.f15277).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        m9145();
        return new C3947(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        m9145();
        return ((List) this.f15277).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        m9145();
        return new C3944(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        m9145();
        return new C3944(this, i);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        m9145();
        Object objRemove = ((List) this.f15277).remove(i);
        C3934 c3934 = this.f15282;
        c3934.f15283--;
        m9146();
        return objRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m9145();
        boolean zRemove = this.f15277.remove(obj);
        if (zRemove) {
            C3934 c3934 = this.f15278;
            c3934.f15283--;
            m9146();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.f15277.removeAll(collection);
        if (zRemoveAll) {
            this.f15278.f15283 += this.f15277.size() - size;
            m9146();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.f15277.retainAll(collection);
        if (zRetainAll) {
            this.f15278.f15283 += this.f15277.size() - size;
            m9146();
        }
        return zRetainAll;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        m9145();
        return ((List) this.f15277).set(i, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        m9145();
        return this.f15277.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        m9145();
        List listSubList = ((List) this.f15277).subList(i, i2);
        C3933 c3933 = this.f15279;
        if (c3933 == null) {
            c3933 = this;
        }
        C3934 c3934 = this.f15282;
        c3934.getClass();
        boolean z = listSubList instanceof RandomAccess;
        Object obj = this.f15281;
        return z ? new C3946(c3934, obj, listSubList, c3933) : new C3933(c3934, obj, listSubList, c3933);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        m9145();
        return this.f15277.toString();
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m9145() {
        Collection collection;
        C3933 c3933 = this.f15279;
        if (c3933 != null) {
            c3933.m9145();
            if (c3933.f15277 != this.f15280) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.f15277.isEmpty() || (collection = (Collection) this.f15278.f15284.get(this.f15281)) == null) {
                return;
            }
            this.f15277 = collection;
        }
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m9146() {
        C3933 c3933 = this.f15279;
        if (c3933 != null) {
            c3933.m9146();
        } else if (this.f15277.isEmpty()) {
            this.f15278.f15284.remove(this.f15281);
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m9147() {
        C3933 c3933 = this.f15279;
        if (c3933 != null) {
            c3933.m9147();
        } else {
            this.f15278.f15284.put(this.f15281, this.f15277);
        }
    }
}
