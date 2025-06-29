package p200;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: ˎٴ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2740 implements Set {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ C2741 f10719;

    public C2740(C2741 c2741) {
        this.f10719 = c2741;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f10719.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f10719.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f10719.m6960(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        C2741 c2741 = this.f10719;
        int iHashCode = 0;
        for (int i = c2741.f10778 - 1; i >= 0; i--) {
            Object objM7021 = c2741.m7021(i);
            iHashCode += objM7021 == null ? 0 : objM7021.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f10719.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C2751(this.f10719, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        C2741 c2741 = this.f10719;
        int iM7014 = c2741.m7014(obj);
        if (iM7014 < 0) {
            return false;
        }
        c2741.mo7022(iM7014);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f10719.m6961(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.f10719.m6962(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f10719.f10778;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        C2741 c2741 = this.f10719;
        int i = c2741.f10778;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c2741.m7021(i2);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C2741 c2741 = this.f10719;
        int i = c2741.f10778;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c2741.m7021(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
