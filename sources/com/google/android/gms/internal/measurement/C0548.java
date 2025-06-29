package com.google.android.gms.internal.measurement;

import android.support.v4.media.session.AbstractC0002;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.ﹳʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0548 extends AbstractC0325 implements InterfaceC0309, InterfaceC0365, RandomAccess {

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static final C0548 f2895 = new C0548(new long[0], 0, false);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public long[] f2896;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public int f2897;

    public C0548(long[] jArr, int i, boolean z) {
        super(z);
        this.f2896 = jArr;
        this.f2897 = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        long jLongValue = ((Long) obj).longValue();
        m1838();
        if (i < 0 || i > (i2 = this.f2897)) {
            throw new IndexOutOfBoundsException(AbstractC0002.m55(i, this.f2897, "Index:", ", Size:"));
        }
        long[] jArr = this.f2896;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[AbstractC0002.m53(i2, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f2896, i, jArr2, i + 1, this.f2897 - i);
            this.f2896 = jArr2;
        }
        this.f2896[i] = jLongValue;
        this.f2897++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        m2468(((Long) obj).longValue());
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0325, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m1838();
        Charset charset = AbstractC0412.f2705;
        collection.getClass();
        if (!(collection instanceof C0548)) {
            return super.addAll(collection);
        }
        C0548 c0548 = (C0548) collection;
        int i = c0548.f2897;
        if (i == 0) {
            return false;
        }
        int i2 = this.f2897;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.f2896;
        if (i3 > jArr.length) {
            this.f2896 = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(c0548.f2896, 0, this.f2896, this.f2897, c0548.f2897);
        this.f2897 = i3;
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
        if (!(obj instanceof C0548)) {
            return super.equals(obj);
        }
        C0548 c0548 = (C0548) obj;
        if (this.f2897 != c0548.f2897) {
            return false;
        }
        long[] jArr = c0548.f2896;
        for (int i = 0; i < this.f2897; i++) {
            if (this.f2896[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(m2469(i));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0325, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iM2144 = 1;
        for (int i = 0; i < this.f2897; i++) {
            iM2144 = (iM2144 * 31) + AbstractC0412.m2144(this.f2896[i]);
        }
        return iM2144;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i = this.f2897;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f2896[i2] == jLongValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0325, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        m1838();
        m2470(i);
        long[] jArr = this.f2896;
        long j = jArr[i];
        if (i < this.f2897 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.f2897--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m1838();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f2896;
        System.arraycopy(jArr, i2, jArr, i, this.f2897 - i2);
        this.f2897 -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        m1838();
        m2470(i);
        long[] jArr = this.f2896;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2897;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0465
    /* renamed from: ʽᐧ */
    public final InterfaceC0465 mo2107(int i) {
        if (i >= this.f2897) {
            return new C0548(Arrays.copyOf(this.f2896, i), this.f2897, true);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m2468(long j) {
        m1838();
        int i = this.f2897;
        long[] jArr = this.f2896;
        if (i == jArr.length) {
            long[] jArr2 = new long[AbstractC0002.m53(i, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f2896 = jArr2;
        }
        long[] jArr3 = this.f2896;
        int i2 = this.f2897;
        this.f2897 = i2 + 1;
        jArr3[i2] = j;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final long m2469(int i) {
        m2470(i);
        return this.f2896[i];
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void m2470(int i) {
        if (i < 0 || i >= this.f2897) {
            throw new IndexOutOfBoundsException(AbstractC0002.m55(i, this.f2897, "Index:", ", Size:"));
        }
    }
}
