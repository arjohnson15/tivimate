package com.google.android.gms.internal.play_billing;

import android.support.v4.media.session.AbstractC0002;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.play_billing.ﹳﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0673 extends AbstractC0655 implements RandomAccess, InterfaceC0637, InterfaceC0605 {

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static final C0673 f3090 = new C0673(0, false, new int[0]);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public int[] f3091;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public int f3092;

    public C0673(int i, boolean z, int[] iArr) {
        super(z);
        this.f3091 = iArr;
        this.f3092 = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        m2672();
        if (i < 0 || i > (i2 = this.f3092)) {
            throw new IndexOutOfBoundsException(AbstractC0002.m55(i, this.f3092, "Index:", ", Size:"));
        }
        int i3 = i + 1;
        int[] iArr = this.f3091;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i3, i2 - i);
        } else {
            int[] iArr2 = new int[AbstractC0002.m53(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f3091, i, iArr2, i3, this.f3092 - i);
            this.f3091 = iArr2;
        }
        this.f3091[i] = iIntValue;
        this.f3092++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0655, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m2738(((Integer) obj).intValue());
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0655, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m2672();
        Charset charset = AbstractC0595.f2962;
        collection.getClass();
        if (!(collection instanceof C0673)) {
            return super.addAll(collection);
        }
        C0673 c0673 = (C0673) collection;
        int i = c0673.f3092;
        if (i == 0) {
            return false;
        }
        int i2 = this.f3092;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.f3091;
        if (i3 > iArr.length) {
            this.f3091 = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(c0673.f3091, 0, this.f3091, this.f3092, c0673.f3092);
        this.f3092 = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0655, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0673)) {
            return super.equals(obj);
        }
        C0673 c0673 = (C0673) obj;
        if (this.f3092 != c0673.f3092) {
            return false;
        }
        int[] iArr = c0673.f3091;
        for (int i = 0; i < this.f3092; i++) {
            if (this.f3091[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m2739(i);
        return Integer.valueOf(this.f3091[i]);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0655, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f3092; i2++) {
            i = (i * 31) + this.f3091[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f3092;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f3091[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0655, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        m2672();
        m2739(i);
        int[] iArr = this.f3091;
        int i2 = iArr[i];
        if (i < this.f3092 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.f3092--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m2672();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f3091;
        System.arraycopy(iArr, i2, iArr, i, this.f3092 - i2);
        this.f3092 -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        m2672();
        m2739(i);
        int[] iArr = this.f3091;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3092;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final int m2737(int i) {
        m2739(i);
        return this.f3091[i];
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m2738(int i) {
        m2672();
        int i2 = this.f3092;
        int[] iArr = this.f3091;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[AbstractC0002.m53(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f3091 = iArr2;
        }
        int[] iArr3 = this.f3091;
        int i3 = this.f3092;
        this.f3092 = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC0680
    /* renamed from: ᵎـ */
    public final /* bridge */ /* synthetic */ InterfaceC0680 mo2653(int i) {
        if (i < this.f3092) {
            throw new IllegalArgumentException();
        }
        return new C0673(this.f3092, true, Arrays.copyOf(this.f3091, i));
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void m2739(int i) {
        if (i < 0 || i >= this.f3092) {
            throw new IndexOutOfBoundsException(AbstractC0002.m55(i, this.f3092, "Index:", ", Size:"));
        }
    }
}
