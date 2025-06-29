package p105;

import android.support.v4.media.session.AbstractC0001;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import ﹶⁱ.ـﹶ;

/* renamed from: ˆᐧ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1794 extends AbstractList implements RandomAccess, Serializable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final int f6937;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final int f6938;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int[] f6939;

    public C1794(int i, int i2, int[] iArr) {
        this.f6939 = iArr;
        this.f6937 = i;
        this.f6938 = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Integer) {
            if (AbstractC0001.m7(this.f6939, ((Integer) obj).intValue(), this.f6937, this.f6938) != -1) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1794)) {
            return super.equals(obj);
        }
        C1794 c1794 = (C1794) obj;
        int size = size();
        if (c1794.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (this.f6939[this.f6937 + i] != c1794.f6939[c1794.f6937 + i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        ـﹶ.ᐧʻ(i, size());
        return Integer.valueOf(this.f6939[this.f6937 + i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = this.f6937; i2 < this.f6938; i2++) {
            i = (i * 31) + this.f6939[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int[] iArr = this.f6939;
        int i = this.f6937;
        int iM7 = AbstractC0001.m7(iArr, iIntValue, i, this.f6938);
        if (iM7 >= 0) {
            return iM7 - i;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int i;
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            int i2 = this.f6938;
            while (true) {
                i2--;
                i = this.f6937;
                if (i2 < i) {
                    i2 = -1;
                    break;
                }
                if (this.f6939[i2] == iIntValue) {
                    break;
                }
            }
            if (i2 >= 0) {
                return i2 - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Integer num = (Integer) obj;
        ـﹶ.ᐧʻ(i, size());
        int i2 = this.f6937 + i;
        int[] iArr = this.f6939;
        int i3 = iArr[i2];
        num.getClass();
        iArr[i2] = num.intValue();
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6938 - this.f6937;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        ـﹶ.ˉי(i, i2, size());
        if (i == i2) {
            return Collections.emptyList();
        }
        int i3 = this.f6937;
        return new C1794(i + i3, i3 + i2, this.f6939);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder(size() * 5);
        sb.append('[');
        int[] iArr = this.f6939;
        int i = this.f6937;
        sb.append(iArr[i]);
        while (true) {
            i++;
            if (i >= this.f6938) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(iArr[i]);
        }
    }
}
