package p013;

import android.support.v4.media.session.AbstractC0002;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p070.AbstractC1549;
import ˎˊ.ˆʿ;

/* renamed from: ʻי.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1056 extends AbstractC1048 {

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static final Object[] f4453 = new Object[0];

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public Object[] f4454 = f4453;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public int f4455;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public int f4456;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2 = this.f4455;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(AbstractC0002.m55(i, i2, "index: ", ", size: "));
        }
        if (i == i2) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        m4050();
        m4045(this.f4455 + 1);
        int iM4047 = m4047(this.f4456 + i);
        int i3 = this.f4455;
        if (i < ((i3 + 1) >> 1)) {
            int length = iM4047 == 0 ? this.f4454.length - 1 : iM4047 - 1;
            int i4 = this.f4456;
            int length2 = i4 == 0 ? this.f4454.length - 1 : i4 - 1;
            if (length >= i4) {
                Object[] objArr = this.f4454;
                objArr[length2] = objArr[i4];
                AbstractC1036.m3991(i4, i4 + 1, length + 1, objArr, objArr);
            } else {
                Object[] objArr2 = this.f4454;
                AbstractC1036.m3991(i4 - 1, i4, objArr2.length, objArr2, objArr2);
                Object[] objArr3 = this.f4454;
                objArr3[objArr3.length - 1] = objArr3[0];
                AbstractC1036.m3991(0, 1, length + 1, objArr3, objArr3);
            }
            this.f4454[length] = obj;
            this.f4456 = length2;
        } else {
            int iM40472 = m4047(i3 + this.f4456);
            if (iM4047 < iM40472) {
                Object[] objArr4 = this.f4454;
                AbstractC1036.m3991(iM4047 + 1, iM4047, iM40472, objArr4, objArr4);
            } else {
                Object[] objArr5 = this.f4454;
                AbstractC1036.m3991(1, 0, iM40472, objArr5, objArr5);
                Object[] objArr6 = this.f4454;
                objArr6[0] = objArr6[objArr6.length - 1];
                AbstractC1036.m3991(iM4047 + 1, iM4047, objArr6.length - 1, objArr6, objArr6);
            }
            this.f4454[iM4047] = obj;
        }
        this.f4455++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2 = this.f4455;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(AbstractC0002.m55(i, i2, "index: ", ", size: "));
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.f4455) {
            return addAll(collection);
        }
        m4050();
        m4045(collection.size() + this.f4455);
        int iM4047 = m4047(this.f4455 + this.f4456);
        int iM40472 = m4047(this.f4456 + i);
        int size = collection.size();
        if (i < ((this.f4455 + 1) >> 1)) {
            int i3 = this.f4456;
            int length = i3 - size;
            if (iM40472 < i3) {
                Object[] objArr = this.f4454;
                AbstractC1036.m3991(length, i3, objArr.length, objArr, objArr);
                if (size >= iM40472) {
                    Object[] objArr2 = this.f4454;
                    AbstractC1036.m3991(objArr2.length - size, 0, iM40472, objArr2, objArr2);
                } else {
                    Object[] objArr3 = this.f4454;
                    AbstractC1036.m3991(objArr3.length - size, 0, size, objArr3, objArr3);
                    Object[] objArr4 = this.f4454;
                    AbstractC1036.m3991(0, size, iM40472, objArr4, objArr4);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.f4454;
                AbstractC1036.m3991(length, i3, iM40472, objArr5, objArr5);
            } else {
                Object[] objArr6 = this.f4454;
                length += objArr6.length;
                int i4 = iM40472 - i3;
                int length2 = objArr6.length - length;
                if (length2 >= i4) {
                    AbstractC1036.m3991(length, i3, iM40472, objArr6, objArr6);
                } else {
                    AbstractC1036.m3991(length, i3, i3 + length2, objArr6, objArr6);
                    Object[] objArr7 = this.f4454;
                    AbstractC1036.m3991(0, this.f4456 + length2, iM40472, objArr7, objArr7);
                }
            }
            this.f4456 = length;
            m4051(m4048(iM40472 - size), collection);
        } else {
            int i5 = iM40472 + size;
            if (iM40472 < iM4047) {
                int i6 = size + iM4047;
                Object[] objArr8 = this.f4454;
                if (i6 <= objArr8.length) {
                    AbstractC1036.m3991(i5, iM40472, iM4047, objArr8, objArr8);
                } else if (i5 >= objArr8.length) {
                    AbstractC1036.m3991(i5 - objArr8.length, iM40472, iM4047, objArr8, objArr8);
                } else {
                    int length3 = iM4047 - (i6 - objArr8.length);
                    AbstractC1036.m3991(0, length3, iM4047, objArr8, objArr8);
                    Object[] objArr9 = this.f4454;
                    AbstractC1036.m3991(i5, iM40472, length3, objArr9, objArr9);
                }
            } else {
                Object[] objArr10 = this.f4454;
                AbstractC1036.m3991(size, 0, iM4047, objArr10, objArr10);
                Object[] objArr11 = this.f4454;
                if (i5 >= objArr11.length) {
                    AbstractC1036.m3991(i5 - objArr11.length, iM40472, objArr11.length, objArr11, objArr11);
                } else {
                    AbstractC1036.m3991(0, objArr11.length - size, objArr11.length, objArr11, objArr11);
                    Object[] objArr12 = this.f4454;
                    AbstractC1036.m3991(i5, iM40472, objArr12.length - size, objArr12, objArr12);
                }
            }
            m4051(iM40472, collection);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        m4050();
        m4045(collection.size() + mo4037());
        m4051(m4047(mo4037() + this.f4456), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        m4050();
        m4045(this.f4455 + 1);
        int length = this.f4456;
        if (length == 0) {
            length = this.f4454.length;
        }
        int i = length - 1;
        this.f4456 = i;
        this.f4454[i] = obj;
        this.f4455++;
    }

    public final void addLast(Object obj) {
        m4050();
        m4045(mo4037() + 1);
        this.f4454[m4047(mo4037() + this.f4456)] = obj;
        this.f4455 = mo4037() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            m4050();
            m4049(this.f4456, m4047(mo4037() + this.f4456));
        }
        this.f4456 = 0;
        this.f4455 = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int iMo4037 = mo4037();
        if (i < 0 || i >= iMo4037) {
            throw new IndexOutOfBoundsException(AbstractC0002.m55(i, iMo4037, "index: ", ", size: "));
        }
        return this.f4454[m4047(this.f4456 + i)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iM4047 = m4047(mo4037() + this.f4456);
        int length = this.f4456;
        if (length < iM4047) {
            while (length < iM4047) {
                if (AbstractC1549.m5138(obj, this.f4454[length])) {
                    i = this.f4456;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iM4047) {
            return -1;
        }
        int length2 = this.f4454.length;
        while (true) {
            if (length >= length2) {
                for (int i2 = 0; i2 < iM4047; i2++) {
                    if (AbstractC1549.m5138(obj, this.f4454[i2])) {
                        length = i2 + this.f4454.length;
                        i = this.f4456;
                    }
                }
                return -1;
            }
            if (AbstractC1549.m5138(obj, this.f4454[length])) {
                i = this.f4456;
                break;
            }
            length++;
        }
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return mo4037() == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int iM4047 = m4047(mo4037() + this.f4456);
        int i2 = this.f4456;
        if (i2 < iM4047) {
            length = iM4047 - 1;
            if (i2 <= length) {
                while (!AbstractC1549.m5138(obj, this.f4454[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.f4456;
                return length - i;
            }
            return -1;
        }
        if (i2 > iM4047) {
            int i3 = iM4047 - 1;
            while (true) {
                if (-1 >= i3) {
                    length = this.f4454.length - 1;
                    int i4 = this.f4456;
                    if (i4 <= length) {
                        while (!AbstractC1549.m5138(obj, this.f4454[length])) {
                            if (length != i4) {
                                length--;
                            }
                        }
                        i = this.f4456;
                    }
                } else {
                    if (AbstractC1549.m5138(obj, this.f4454[i3])) {
                        length = i3 + this.f4454.length;
                        i = this.f4456;
                        break;
                    }
                    i3--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        mo4038(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iM4047;
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f4454.length != 0) {
            int iM40472 = m4047(mo4037() + this.f4456);
            int i = this.f4456;
            if (i < iM40472) {
                iM4047 = i;
                while (i < iM40472) {
                    Object obj = this.f4454[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.f4454[iM4047] = obj;
                        iM4047++;
                    }
                    i++;
                }
                Arrays.fill(this.f4454, iM4047, iM40472, (Object) null);
            } else {
                int length = this.f4454.length;
                int i2 = i;
                boolean z2 = false;
                while (i < length) {
                    Object[] objArr = this.f4454;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.f4454[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                iM4047 = m4047(i2);
                for (int i3 = 0; i3 < iM40472; i3++) {
                    Object[] objArr2 = this.f4454;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.f4454[iM4047] = obj3;
                        iM4047 = m4046(iM4047);
                    }
                }
                z = z2;
            }
            if (z) {
                m4050();
                this.f4455 = m4048(iM4047 - this.f4456);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m4050();
        Object[] objArr = this.f4454;
        int i = this.f4456;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f4456 = m4046(i);
        this.f4455 = mo4037() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m4050();
        int iM4047 = m4047(AbstractC1037.m4009(this) + this.f4456);
        Object[] objArr = this.f4454;
        Object obj = objArr[iM4047];
        objArr[iM4047] = null;
        this.f4455 = mo4037() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ˆʿ.ˑʽ(i, i2, this.f4455);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.f4455) {
            clear();
            return;
        }
        if (i3 == 1) {
            mo4038(i);
            return;
        }
        m4050();
        if (i < this.f4455 - i2) {
            int iM4047 = m4047((i - 1) + this.f4456);
            int iM40472 = m4047((i2 - 1) + this.f4456);
            while (i > 0) {
                int i4 = iM4047 + 1;
                int iMin = Math.min(i, Math.min(i4, iM40472 + 1));
                Object[] objArr = this.f4454;
                int i5 = iM40472 - iMin;
                int i6 = iM4047 - iMin;
                AbstractC1036.m3991(i5 + 1, i6 + 1, i4, objArr, objArr);
                iM4047 = m4048(i6);
                iM40472 = m4048(i5);
                i -= iMin;
            }
            int iM40473 = m4047(this.f4456 + i3);
            m4049(this.f4456, iM40473);
            this.f4456 = iM40473;
        } else {
            int iM40474 = m4047(this.f4456 + i2);
            int iM40475 = m4047(this.f4456 + i);
            int i7 = this.f4455;
            while (true) {
                i7 -= i2;
                if (i7 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f4454;
                i2 = Math.min(i7, Math.min(objArr2.length - iM40474, objArr2.length - iM40475));
                Object[] objArr3 = this.f4454;
                int i8 = iM40474 + i2;
                AbstractC1036.m3991(iM40475, iM40474, i8, objArr3, objArr3);
                iM40474 = m4047(i8);
                iM40475 = m4047(iM40475 + i2);
            }
            int iM40476 = m4047(this.f4455 + this.f4456);
            m4049(m4048(iM40476 - i3), iM40476);
        }
        this.f4455 -= i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iM4047;
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f4454.length != 0) {
            int iM40472 = m4047(mo4037() + this.f4456);
            int i = this.f4456;
            if (i < iM40472) {
                iM4047 = i;
                while (i < iM40472) {
                    Object obj = this.f4454[i];
                    if (collection.contains(obj)) {
                        this.f4454[iM4047] = obj;
                        iM4047++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                Arrays.fill(this.f4454, iM4047, iM40472, (Object) null);
            } else {
                int length = this.f4454.length;
                int i2 = i;
                boolean z2 = false;
                while (i < length) {
                    Object[] objArr = this.f4454;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        this.f4454[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iM4047 = m4047(i2);
                for (int i3 = 0; i3 < iM40472; i3++) {
                    Object[] objArr2 = this.f4454;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        this.f4454[iM4047] = obj3;
                        iM4047 = m4046(iM4047);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                m4050();
                this.f4455 = m4048(iM4047 - this.f4456);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int iMo4037 = mo4037();
        if (i < 0 || i >= iMo4037) {
            throw new IndexOutOfBoundsException(AbstractC0002.m55(i, iMo4037, "index: ", ", size: "));
        }
        int iM4047 = m4047(this.f4456 + i);
        Object[] objArr = this.f4454;
        Object obj2 = objArr[iM4047];
        objArr[iM4047] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[mo4037()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        int length = objArr.length;
        int i = this.f4455;
        if (length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        int iM4047 = m4047(this.f4455 + this.f4456);
        int i2 = this.f4456;
        if (i2 < iM4047) {
            AbstractC1036.m3996(i2, iM4047, 2, this.f4454, objArr);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f4454;
            AbstractC1036.m3991(0, this.f4456, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.f4454;
            AbstractC1036.m3991(objArr3.length - this.f4456, 0, iM4047, objArr3, objArr);
        }
        int i3 = this.f4455;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final void m4045(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f4454;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == f4453) {
            if (i < 10) {
                i = 10;
            }
            this.f4454 = new Object[i];
            return;
        }
        int length = objArr.length;
        int i2 = length + (length >> 1);
        if (i2 - i < 0) {
            i2 = i;
        }
        if (i2 - 2147483639 > 0) {
            i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i2];
        AbstractC1036.m3991(0, this.f4456, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.f4454;
        int length2 = objArr3.length;
        int i3 = this.f4456;
        AbstractC1036.m3991(length2 - i3, 0, i3, objArr3, objArr2);
        this.f4456 = 0;
        this.f4454 = objArr2;
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final int m4046(int i) {
        if (i == this.f4454.length - 1) {
            return 0;
        }
        return i + 1;
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final int m4047(int i) {
        Object[] objArr = this.f4454;
        return i >= objArr.length ? i - objArr.length : i;
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final int m4048(int i) {
        return i < 0 ? i + this.f4454.length : i;
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public final void m4049(int i, int i2) {
        if (i < i2) {
            Arrays.fill(this.f4454, i, i2, (Object) null);
            return;
        }
        Object[] objArr = this.f4454;
        Arrays.fill(objArr, i, objArr.length, (Object) null);
        Arrays.fill(this.f4454, 0, i2, (Object) null);
    }

    @Override // p013.AbstractC1048
    /* renamed from: ٴˎ */
    public final int mo4037() {
        return this.f4455;
    }

    @Override // p013.AbstractC1048
    /* renamed from: ᐧʻ */
    public final Object mo4038(int i) {
        int i2 = this.f4455;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC0002.m55(i, i2, "index: ", ", size: "));
        }
        if (i == AbstractC1037.m4009(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        m4050();
        int iM4047 = m4047(this.f4456 + i);
        Object[] objArr = this.f4454;
        Object obj = objArr[iM4047];
        if (i < (this.f4455 >> 1)) {
            int i3 = this.f4456;
            if (iM4047 >= i3) {
                AbstractC1036.m3991(i3 + 1, i3, iM4047, objArr, objArr);
            } else {
                AbstractC1036.m3991(1, 0, iM4047, objArr, objArr);
                Object[] objArr2 = this.f4454;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i4 = this.f4456;
                AbstractC1036.m3991(i4 + 1, i4, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f4454;
            int i5 = this.f4456;
            objArr3[i5] = null;
            this.f4456 = m4046(i5);
        } else {
            int iM40472 = m4047(AbstractC1037.m4009(this) + this.f4456);
            if (iM4047 <= iM40472) {
                Object[] objArr4 = this.f4454;
                AbstractC1036.m3991(iM4047, iM4047 + 1, iM40472 + 1, objArr4, objArr4);
            } else {
                Object[] objArr5 = this.f4454;
                AbstractC1036.m3991(iM4047, iM4047 + 1, objArr5.length, objArr5, objArr5);
                Object[] objArr6 = this.f4454;
                objArr6[objArr6.length - 1] = objArr6[0];
                AbstractC1036.m3991(0, 1, iM40472 + 1, objArr6, objArr6);
            }
            this.f4454[iM40472] = null;
        }
        this.f4455--;
        return obj;
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final void m4050() {
        ((AbstractList) this).modCount++;
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void m4051(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f4454.length;
        while (i < length && it.hasNext()) {
            this.f4454[i] = it.next();
            i++;
        }
        int i2 = this.f4456;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.f4454[i3] = it.next();
        }
        this.f4455 = collection.size() + mo4037();
    }
}
