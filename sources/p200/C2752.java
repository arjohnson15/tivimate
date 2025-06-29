package p200;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import p013.AbstractC1036;
import p013.AbstractC1041;
import p340.AbstractC3876;
import p407.InterfaceC4670;
import ˏʼ.ʽᐧ;

/* renamed from: ˎٴ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2752 implements Collection, Set, InterfaceC4670 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public Object[] f10763;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public int f10764;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public int[] f10765;

    public C2752(int i) {
        this.f10765 = AbstractC3876.f14876;
        this.f10763 = AbstractC3876.f14875;
        if (i > 0) {
            this.f10765 = new int[i];
            this.f10763 = new Object[i];
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int iM6986;
        int i2 = this.f10764;
        if (obj == null) {
            iM6986 = AbstractC2746.m6986(this, null, 0);
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            iM6986 = AbstractC2746.m6986(this, obj, iHashCode);
        }
        if (iM6986 >= 0) {
            return false;
        }
        int i3 = ~iM6986;
        int[] iArr = this.f10765;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.f10763;
            int[] iArr2 = new int[i4];
            this.f10765 = iArr2;
            this.f10763 = new Object[i4];
            if (i2 != this.f10764) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                AbstractC1036.m3996(0, objArr.length, 6, objArr, this.f10763);
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.f10765;
            int i5 = i3 + 1;
            AbstractC1036.m4004(i5, i3, i2, iArr3, iArr3);
            Object[] objArr2 = this.f10763;
            AbstractC1036.m3991(i5, i3, i2, objArr2, objArr2);
        }
        int i6 = this.f10764;
        if (i2 == i6) {
            int[] iArr4 = this.f10765;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.f10763[i3] = obj;
                this.f10764 = i6 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int size = collection.size() + this.f10764;
        int i = this.f10764;
        int[] iArr = this.f10765;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f10763;
            int[] iArr2 = new int[size];
            this.f10765 = iArr2;
            this.f10763 = new Object[size];
            if (i > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, i);
                AbstractC1036.m3996(0, this.f10764, 6, objArr, this.f10763);
            }
        }
        if (this.f10764 != i) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f10764 != 0) {
            this.f10765 = AbstractC3876.f14876;
            this.f10763 = AbstractC3876.f14875;
            this.f10764 = 0;
        }
        if (this.f10764 != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? AbstractC2746.m6986(this, null, 0) : AbstractC2746.m6986(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
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
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Set) && this.f10764 == ((Set) obj).size()) {
            try {
                int i = this.f10764;
                for (int i2 = 0; i2 < i; i2++) {
                    if (((Set) obj).contains(this.f10763[i2])) {
                    }
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f10765;
        int i = this.f10764;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f10764 <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C2751(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iM6986 = obj == null ? AbstractC2746.m6986(this, null, 0) : AbstractC2746.m6986(this, obj, obj.hashCode());
        if (iM6986 < 0) {
            return false;
        }
        m7001(iM6986);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        boolean z = false;
        for (int i = this.f10764 - 1; -1 < i; i--) {
            if (!AbstractC1041.m4019(collection, this.f10763[i])) {
                m7001(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f10764;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Object[] objArr = this.f10763;
        int i = this.f10764;
        ʽᐧ.ﹳﹳ(i, objArr.length);
        return Arrays.copyOfRange(objArr, 0, i);
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        int i = this.f10764;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        AbstractC1036.m3991(0, 0, this.f10764, this.f10763, objArr);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f10764 * 14);
        sb.append('{');
        int i = this.f10764;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.f10763[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final Object m7001(int i) {
        int i2 = this.f10764;
        Object[] objArr = this.f10763;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
        } else {
            int i3 = i2 - 1;
            int[] iArr = this.f10765;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                if (i < i3) {
                    int i4 = i + 1;
                    AbstractC1036.m4004(i, i4, i2, iArr, iArr);
                    Object[] objArr2 = this.f10763;
                    AbstractC1036.m3991(i, i4, i2, objArr2, objArr2);
                }
                this.f10763[i3] = null;
            } else {
                int i5 = i2 > 8 ? i2 + (i2 >> 1) : 8;
                int[] iArr2 = new int[i5];
                this.f10765 = iArr2;
                this.f10763 = new Object[i5];
                if (i > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, i);
                    AbstractC1036.m3996(0, i, 6, objArr, this.f10763);
                }
                if (i < i3) {
                    int i6 = i + 1;
                    AbstractC1036.m4004(i, i6, i2, iArr, this.f10765);
                    AbstractC1036.m3991(i, i6, i2, objArr, this.f10763);
                }
            }
            if (i2 != this.f10764) {
                throw new ConcurrentModificationException();
            }
            this.f10764 = i3;
        }
        return obj;
    }
}
