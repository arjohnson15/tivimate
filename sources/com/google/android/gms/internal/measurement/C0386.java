package com.google.android.gms.internal.measurement;

import android.support.v4.media.session.AbstractC0002;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.ˉﾞ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0386 extends AbstractC0325 implements RandomAccess {

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static final C0386 f2659 = new C0386(new Object[0], 0, false);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public Object[] f2660;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public int f2661;

    public C0386(Object[] objArr, int i, boolean z) {
        super(z);
        this.f2660 = objArr;
        this.f2661 = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        m1838();
        if (i < 0 || i > (i2 = this.f2661)) {
            throw new IndexOutOfBoundsException(AbstractC0002.m55(i, this.f2661, "Index:", ", Size:"));
        }
        Object[] objArr = this.f2660;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[AbstractC0002.m53(i2, 3, 2, 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f2660, i, objArr2, i + 1, this.f2661 - i);
            this.f2660 = objArr2;
        }
        this.f2660[i] = obj;
        this.f2661++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m1838();
        int i = this.f2661;
        Object[] objArr = this.f2660;
        if (i == objArr.length) {
            this.f2660 = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f2660;
        int i2 = this.f2661;
        this.f2661 = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m2108(i);
        return this.f2660[i];
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0325, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m1838();
        m2108(i);
        Object[] objArr = this.f2660;
        Object obj = objArr[i];
        if (i < this.f2661 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.f2661--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m1838();
        m2108(i);
        Object[] objArr = this.f2660;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2661;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0465
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC0465 mo2107(int i) {
        if (i >= this.f2661) {
            return new C0386(Arrays.copyOf(this.f2660, i), this.f2661, true);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m2108(int i) {
        if (i < 0 || i >= this.f2661) {
            throw new IndexOutOfBoundsException(AbstractC0002.m55(i, this.f2661, "Index:", ", Size:"));
        }
    }
}
