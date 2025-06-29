package p057;

import android.support.v4.media.session.AbstractC0002;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
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

/* renamed from: ʾˉ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1340 extends AbstractC1048 implements RandomAccess, Serializable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final int f5469;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final C1344 f5470;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public int f5471;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final C1340 f5472;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public Object[] f5473;

    public C1340(Object[] objArr, int i, int i2, C1340 c1340, C1344 c1344) {
        this.f5473 = objArr;
        this.f5469 = i;
        this.f5471 = i2;
        this.f5472 = c1340;
        this.f5470 = c1344;
        ((AbstractList) this).modCount = ((AbstractList) c1344).modCount;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        m4675();
        m4674();
        int i2 = this.f5471;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(AbstractC0002.m55(i, i2, "index: ", ", size: "));
        }
        m4672(this.f5469 + i, obj);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m4675();
        m4674();
        m4672(this.f5469 + this.f5471, obj);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m4675();
        m4674();
        int i2 = this.f5471;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(AbstractC0002.m55(i, i2, "index: ", ", size: "));
        }
        int size = collection.size();
        m4671(this.f5469 + i, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m4675();
        m4674();
        int size = collection.size();
        m4671(this.f5469 + this.f5471, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m4675();
        m4674();
        m4676(this.f5469, this.f5471);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        m4674();
        if (obj != this) {
            if (obj instanceof List) {
                if (ˑי.ـﹶ(this.f5473, this.f5469, this.f5471, (List) obj)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m4674();
        int i2 = this.f5471;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC0002.m55(i, i2, "index: ", ", size: "));
        }
        return this.f5473[this.f5469 + i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        m4674();
        Object[] objArr = this.f5473;
        int i = this.f5471;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[this.f5469 + i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        m4674();
        for (int i = 0; i < this.f5471; i++) {
            if (AbstractC1549.m5138(this.f5473[this.f5469 + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        m4674();
        return this.f5471 == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        m4674();
        for (int i = this.f5471 - 1; i >= 0; i--) {
            if (AbstractC1549.m5138(this.f5473[this.f5469 + i], obj)) {
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
        m4674();
        int i2 = this.f5471;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(AbstractC0002.m55(i, i2, "index: ", ", size: "));
        }
        return new C1345(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m4675();
        m4674();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            mo4038(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        m4675();
        m4674();
        return m4677(this.f5469, this.f5471, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        m4675();
        m4674();
        return m4677(this.f5469, this.f5471, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m4675();
        m4674();
        int i2 = this.f5471;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC0002.m55(i, i2, "index: ", ", size: "));
        }
        Object[] objArr = this.f5473;
        int i3 = this.f5469;
        Object obj2 = objArr[i3 + i];
        objArr[i3 + i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        ˆʿ.ˑʽ(i, i2, this.f5471);
        return new C1340(this.f5473, this.f5469 + i, i2 - i, this, this.f5470);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        m4674();
        Object[] objArr = this.f5473;
        int i = this.f5471;
        int i2 = this.f5469;
        int i3 = i + i2;
        ʽᐧ.ﹳﹳ(i3, objArr.length);
        return Arrays.copyOfRange(objArr, i2, i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        m4674();
        int length = objArr.length;
        int i = this.f5471;
        int i2 = this.f5469;
        if (length < i) {
            return Arrays.copyOfRange(this.f5473, i2, i + i2, objArr.getClass());
        }
        AbstractC1036.m3991(0, i2, i + i2, this.f5473, objArr);
        int i3 = this.f5471;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        m4674();
        return ˑי.ʽᐧ(this.f5473, this.f5469, this.f5471, this);
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final void m4671(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        C1344 c1344 = this.f5470;
        C1340 c1340 = this.f5472;
        if (c1340 != null) {
            c1340.m4671(i, collection, i2);
        } else {
            C1344 c13442 = C1344.f5480;
            c1344.m4679(i, collection, i2);
        }
        this.f5473 = c1344.f5483;
        this.f5471 += i2;
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final void m4672(int i, Object obj) {
        ((AbstractList) this).modCount++;
        C1344 c1344 = this.f5470;
        C1340 c1340 = this.f5472;
        if (c1340 != null) {
            c1340.m4672(i, obj);
        } else {
            C1344 c13442 = C1344.f5480;
            c1344.m4680(i, obj);
        }
        this.f5473 = c1344.f5483;
        this.f5471++;
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final Object m4673(int i) {
        Object objM4681;
        ((AbstractList) this).modCount++;
        C1340 c1340 = this.f5472;
        if (c1340 != null) {
            objM4681 = c1340.m4673(i);
        } else {
            C1344 c1344 = C1344.f5480;
            objM4681 = this.f5470.m4681(i);
        }
        this.f5471--;
        return objM4681;
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final void m4674() {
        if (((AbstractList) this.f5470).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public final void m4675() {
        if (this.f5470.f5482) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // p013.AbstractC1048
    /* renamed from: ٴˎ */
    public final int mo4037() {
        m4674();
        return this.f5471;
    }

    @Override // p013.AbstractC1048
    /* renamed from: ᐧʻ */
    public final Object mo4038(int i) {
        m4675();
        m4674();
        int i2 = this.f5471;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC0002.m55(i, i2, "index: ", ", size: "));
        }
        return m4673(this.f5469 + i);
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final void m4676(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        C1340 c1340 = this.f5472;
        if (c1340 != null) {
            c1340.m4676(i, i2);
        } else {
            C1344 c1344 = C1344.f5480;
            this.f5470.m4684(i, i2);
        }
        this.f5471 -= i2;
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final int m4677(int i, int i2, Collection collection, boolean z) {
        int iM4685;
        C1340 c1340 = this.f5472;
        if (c1340 != null) {
            iM4685 = c1340.m4677(i, i2, collection, z);
        } else {
            C1344 c1344 = C1344.f5480;
            iM4685 = this.f5470.m4685(i, i2, collection, z);
        }
        if (iM4685 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f5471 -= iM4685;
        return iM4685;
    }
}
