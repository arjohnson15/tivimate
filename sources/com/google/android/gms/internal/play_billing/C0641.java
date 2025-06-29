package com.google.android.gms.internal.play_billing;

import android.support.v4.media.session.AbstractC0002;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.play_billing.ٴᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0641 extends AbstractC0655 implements RandomAccess {

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static final C0641 f3024 = new C0641(new Object[0], 0, false);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public Object[] f3025;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public int f3026;

    public C0641(Object[] objArr, int i, boolean z) {
        super(z);
        this.f3025 = objArr;
        this.f3026 = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        m2672();
        if (i < 0 || i > (i2 = this.f3026)) {
            throw new IndexOutOfBoundsException(AbstractC0002.m55(i, this.f3026, "Index:", ", Size:"));
        }
        int i3 = i + 1;
        Object[] objArr = this.f3025;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            Object[] objArr2 = new Object[AbstractC0002.m53(i2, 3, 2, 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f3025, i, objArr2, i3, this.f3026 - i);
            this.f3025 = objArr2;
        }
        this.f3025[i] = obj;
        this.f3026++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0655, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m2672();
        int i = this.f3026;
        Object[] objArr = this.f3025;
        if (i == objArr.length) {
            this.f3025 = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f3025;
        int i2 = this.f3026;
        this.f3026 = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m2656(i);
        return this.f3025[i];
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0655, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m2672();
        m2656(i);
        Object[] objArr = this.f3025;
        Object obj = objArr[i];
        if (i < this.f3026 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.f3026--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m2672();
        m2656(i);
        Object[] objArr = this.f3025;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3026;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m2656(int i) {
        if (i < 0 || i >= this.f3026) {
            throw new IndexOutOfBoundsException(AbstractC0002.m55(i, this.f3026, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC0680
    /* renamed from: ᵎـ */
    public final /* bridge */ /* synthetic */ InterfaceC0680 mo2653(int i) {
        if (i >= this.f3026) {
            return new C0641(Arrays.copyOf(this.f3025, i), this.f3026, true);
        }
        throw new IllegalArgumentException();
    }
}
