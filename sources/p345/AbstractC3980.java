package p345;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import ⁱـ.ˑי;
import ﹶⁱ.ـﹶ;

/* renamed from: ᵎᴵ.ﹳﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3980 extends AbstractC3927 implements List, RandomAccess {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final C3928 f15360 = new C3928(C3932.f15274, 0);

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public static C3932 m9203(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        AbstractC3968.m9187(3, objArr);
        return m9206(3, objArr);
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public static C3932 m9204() {
        return C3932.f15274;
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public static C3961 m9205() {
        return new C3961(4);
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public static C3932 m9206(int i, Object[] objArr) {
        return i == 0 ? C3932.f15274 : new C3932(i, objArr);
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public static C3932 m9207(Object obj) {
        Object[] objArr = {obj};
        AbstractC3968.m9187(1, objArr);
        return m9206(1, objArr);
    }

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static C3932 m9208(AbstractC3925 abstractC3925, Collection collection) {
        Collection collection2;
        abstractC3925.getClass();
        Collection collection3 = collection;
        if (collection3 instanceof Collection) {
            collection2 = collection3;
        } else {
            Iterator it = collection3.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            collection2 = arrayList;
        }
        Object[] array = collection2.toArray();
        AbstractC3968.m9187(array.length, array);
        Arrays.sort(array, abstractC3925);
        return m9206(array.length, array);
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public static AbstractC3980 m9209(Collection collection) {
        if (!(collection instanceof AbstractC3927)) {
            Object[] array = collection.toArray();
            AbstractC3968.m9187(array.length, array);
            return m9206(array.length, array);
        }
        AbstractC3980 abstractC3980Mo9136 = ((AbstractC3927) collection).mo9136();
        if (!abstractC3980Mo9136.mo9116()) {
            return abstractC3980Mo9136;
        }
        Object[] array2 = abstractC3980Mo9136.toArray(AbstractC3927.f15261);
        return m9206(array2.length, array2);
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public static C3932 m9210(Object[] objArr) {
        if (objArr.length == 0) {
            return C3932.f15274;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        AbstractC3968.m9187(objArr2.length, objArr2);
        return m9206(objArr2.length, objArr2);
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public static C3932 m9211(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        AbstractC3968.m9187(2, objArr);
        return m9206(2, objArr);
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public static C3932 m9212(Long l, Long l2, Long l3, Long l4, Long l5) {
        Object[] objArr = {l, l2, l3, l4, l5};
        AbstractC3968.m9187(5, objArr);
        return m9206(5, objArr);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // p345.AbstractC3927, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (ˑי.ﹶˆ(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (it.hasNext()) {
                    if (it2.hasNext() && ˑי.ﹶˆ(it.next(), it2.next())) {
                    }
                }
                return !it2.hasNext();
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~(get(i2).hashCode() + (i * 31)));
        }
        return i;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // p345.AbstractC3927, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: ʿˏ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C3928 listIterator(int i) {
        ـﹶ.ﹶˆ(i, size());
        return isEmpty() ? f15360 : new C3928(this, i);
    }

    @Override // java.util.List
    /* renamed from: ˆʿ, reason: merged with bridge method [inline-methods] */
    public AbstractC3980 subList(int i, int i2) {
        ـﹶ.ˉי(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? C3932.f15274 : new C3973(this, i, i3);
    }

    @Override // p345.AbstractC3927
    /* renamed from: ˏᴵ */
    public final AbstractC3986 iterator() {
        return listIterator(0);
    }

    @Override // p345.AbstractC3927
    /* renamed from: ٴˎ */
    public int mo9119(int i, Object[] objArr) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // p345.AbstractC3927
    /* renamed from: ﹳﹳ */
    public final AbstractC3980 mo9136() {
        return this;
    }
}
