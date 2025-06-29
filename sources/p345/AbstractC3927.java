package p345;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: ᵎᴵ.ˆʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3927 extends AbstractCollection implements Serializable {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static final Object[] f15261 = new Object[0];

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f15261);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        if (objArr.length < size) {
            Object[] objArrMo9120 = mo9120();
            if (objArrMo9120 != null) {
                return Arrays.copyOfRange(objArrMo9120, mo9117(), mo9122(), objArr.getClass());
            }
            if (objArr.length != 0) {
                objArr = Arrays.copyOf(objArr, 0);
            }
            objArr = Arrays.copyOf(objArr, size);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        mo9119(0, objArr);
        return objArr;
    }

    /* renamed from: ˉי */
    public int mo9117() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: ˉⁱ */
    public abstract boolean mo9116();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: ˏᴵ, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC3986 iterator();

    /* renamed from: ٴˎ */
    public abstract int mo9119(int i, Object[] objArr);

    /* renamed from: ᐧʻ */
    public Object[] mo9120() {
        return null;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public abstract AbstractC3980 mo9136();

    /* renamed from: ﹶˆ */
    public int mo9122() {
        throw new UnsupportedOperationException();
    }
}
