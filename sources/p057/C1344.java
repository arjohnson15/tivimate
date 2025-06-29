package p057;

import android.support.v4.media.session.AbstractC0002;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p013.AbstractC1036;
import p013.AbstractC1048;
import p070.AbstractC1549;
import ˎˊ.ˆʿ;
import ˏʼ.ʽᐧ;
import ⁱـ.ˑי;

/* renamed from: ʾˉ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1344 extends AbstractC1048 implements RandomAccess, Serializable {

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static final C1344 f5480;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public int f5481;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public boolean f5482;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public Object[] f5483;

    static {
        C1344 c1344 = new C1344(0);
        c1344.f5482 = true;
        f5480 = c1344;
    }

    public C1344(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        this.f5483 = new Object[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        m4682();
        int i2 = this.f5481;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(AbstractC0002.m55(i, i2, "index: ", ", size: "));
        }
        ((AbstractList) this).modCount++;
        m4683(i, 1);
        this.f5483[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m4682();
        int i = this.f5481;
        ((AbstractList) this).modCount++;
        m4683(i, 1);
        this.f5483[i] = obj;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m4682();
        int i2 = this.f5481;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(AbstractC0002.m55(i, i2, "index: ", ", size: "));
        }
        int size = collection.size();
        m4679(i, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m4682();
        int size = collection.size();
        m4679(this.f5481, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m4682();
        m4684(0, this.f5481);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof List)) {
                return false;
            }
            if (!ˑי.ـﹶ(this.f5483, 0, this.f5481, (List) obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.f5481;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC0002.m55(i, i2, "index: ", ", size: "));
        }
        return this.f5483[i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f5483;
        int i = this.f5481;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.f5481; i++) {
            if (AbstractC1549.m5138(this.f5483[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f5481 == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.f5481 - 1; i >= 0; i--) {
            if (AbstractC1549.m5138(this.f5483[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        int i2 = this.f5481;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(AbstractC0002.m55(i, i2, "index: ", ", size: "));
        }
        return new C1345(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m4682();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            mo4038(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        m4682();
        return m4685(0, this.f5481, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        m4682();
        return m4685(0, this.f5481, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m4682();
        int i2 = this.f5481;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC0002.m55(i, i2, "index: ", ", size: "));
        }
        Object[] objArr = this.f5483;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        ˆʿ.ˑʽ(i, i2, this.f5481);
        return new C1340(this.f5483, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        Object[] objArr = this.f5483;
        int i = this.f5481;
        ʽᐧ.ﹳﹳ(i, objArr.length);
        return Arrays.copyOfRange(objArr, 0, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        int length = objArr.length;
        int i = this.f5481;
        if (length < i) {
            return Arrays.copyOfRange(this.f5483, 0, i, objArr.getClass());
        }
        AbstractC1036.m3991(0, 0, i, this.f5483, objArr);
        int i2 = this.f5481;
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return ˑי.ʽᐧ(this.f5483, 0, this.f5481, this);
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final void m4679(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        m4683(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.f5483[i + i3] = it.next();
        }
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final void m4680(int i, Object obj) {
        ((AbstractList) this).modCount++;
        m4683(i, 1);
        this.f5483[i] = obj;
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final Object m4681(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f5483;
        Object obj = objArr[i];
        AbstractC1036.m3991(i, i + 1, this.f5481, objArr, objArr);
        Object[] objArr2 = this.f5483;
        int i2 = this.f5481;
        objArr2[i2 - 1] = null;
        this.f5481 = i2 - 1;
        return obj;
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final void m4682() {
        if (this.f5482) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public final void m4683(int i, int i2) {
        int i3 = this.f5481 + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f5483;
        if (i3 > objArr.length) {
            int length = objArr.length;
            int i4 = length + (length >> 1);
            if (i4 - i3 < 0) {
                i4 = i3;
            }
            if (i4 - 2147483639 > 0) {
                i4 = i3 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.f5483 = Arrays.copyOf(objArr, i4);
        }
        Object[] objArr2 = this.f5483;
        AbstractC1036.m3991(i + i2, i, this.f5481, objArr2, objArr2);
        this.f5481 += i2;
    }

    @Override // p013.AbstractC1048
    /* renamed from: ٴˎ */
    public final int mo4037() {
        return this.f5481;
    }

    @Override // p013.AbstractC1048
    /* renamed from: ᐧʻ */
    public final Object mo4038(int i) {
        m4682();
        int i2 = this.f5481;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC0002.m55(i, i2, "index: ", ", size: "));
        }
        return m4681(i);
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final void m4684(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f5483;
        AbstractC1036.m3991(i, i + i2, this.f5481, objArr, objArr);
        Object[] objArr2 = this.f5483;
        int i3 = this.f5481;
        ˑי.ˎٴ(objArr2, i3 - i2, i3);
        this.f5481 -= i2;
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final int m4685(int i, int i2, Collection collection, boolean z) {
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i + i3;
            if (collection.contains(this.f5483[i5]) == z) {
                Object[] objArr = this.f5483;
                i3++;
                objArr[i4 + i] = objArr[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        Object[] objArr2 = this.f5483;
        AbstractC1036.m3991(i + i4, i2 + i, this.f5481, objArr2, objArr2);
        Object[] objArr3 = this.f5483;
        int i7 = this.f5481;
        ˑי.ˎٴ(objArr3, i7 - i6, i7);
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f5481 -= i6;
        return i6;
    }
}
