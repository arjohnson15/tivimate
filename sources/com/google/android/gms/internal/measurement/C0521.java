package com.google.android.gms.internal.measurement;

import android.support.v4.media.session.AbstractC0002;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.ᵢʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0521 extends AbstractC0325 implements InterfaceC0458, InterfaceC0365, RandomAccess {

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static final C0521 f2864 = new C0521(0, false, new int[0]);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public int[] f2865;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public int f2866;

    public C0521(int i, boolean z, int[] iArr) {
        super(z);
        this.f2865 = iArr;
        this.f2866 = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        m1838();
        if (i < 0 || i > (i2 = this.f2866)) {
            throw new IndexOutOfBoundsException(AbstractC0002.m55(i, this.f2866, "Index:", ", Size:"));
        }
        int[] iArr = this.f2865;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[AbstractC0002.m53(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f2865, i, iArr2, i + 1, this.f2866 - i);
            this.f2865 = iArr2;
        }
        this.f2865[i] = iIntValue;
        this.f2866++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        m2382(((Integer) obj).intValue());
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0325, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m1838();
        Charset charset = AbstractC0412.f2705;
        collection.getClass();
        if (!(collection instanceof C0521)) {
            return super.addAll(collection);
        }
        C0521 c0521 = (C0521) collection;
        int i = c0521.f2866;
        if (i == 0) {
            return false;
        }
        int i2 = this.f2866;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.f2865;
        if (i3 > iArr.length) {
            this.f2865 = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(c0521.f2865, 0, this.f2865, this.f2866, c0521.f2866);
        this.f2866 = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0325, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0521)) {
            return super.equals(obj);
        }
        C0521 c0521 = (C0521) obj;
        if (this.f2866 != c0521.f2866) {
            return false;
        }
        int[] iArr = c0521.f2865;
        for (int i = 0; i < this.f2866; i++) {
            if (this.f2865[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(m2381(i));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0325, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f2866; i2++) {
            i = (i * 31) + this.f2865[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f2866;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f2865[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0325, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        m1838();
        m2383(i);
        int[] iArr = this.f2865;
        int i2 = iArr[i];
        if (i < this.f2866 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.f2866--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m1838();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f2865;
        System.arraycopy(iArr, i2, iArr, i, this.f2866 - i2);
        this.f2866 -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        m1838();
        m2383(i);
        int[] iArr = this.f2865;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2866;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0465
    /* renamed from: ʽᐧ */
    public final InterfaceC0465 mo2107(int i) {
        if (i < this.f2866) {
            throw new IllegalArgumentException();
        }
        return new C0521(this.f2866, true, Arrays.copyOf(this.f2865, i));
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final int m2381(int i) {
        m2383(i);
        return this.f2865[i];
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m2382(int i) {
        m1838();
        int i2 = this.f2866;
        int[] iArr = this.f2865;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[AbstractC0002.m53(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f2865 = iArr2;
        }
        int[] iArr3 = this.f2865;
        int i3 = this.f2866;
        this.f2866 = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void m2383(int i) {
        if (i < 0 || i >= this.f2866) {
            throw new IndexOutOfBoundsException(AbstractC0002.m55(i, this.f2866, "Index:", ", Size:"));
        }
    }
}
