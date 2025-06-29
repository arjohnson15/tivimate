package com.google.crypto.tink.shaded.protobuf;

import android.support.v4.media.session.AbstractC0002;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.google.crypto.tink.shaded.protobuf.ˋﾞ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0740 extends AbstractC0724 implements RandomAccess {

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static final C0740 f3555;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public Object[] f3556;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public int f3557;

    static {
        C0740 c0740 = new C0740(0, new Object[0]);
        f3555 = c0740;
        c0740.f3523 = false;
    }

    public C0740(int i, Object[] objArr) {
        this.f3556 = objArr;
        this.f3557 = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        m2933();
        if (i < 0 || i > (i2 = this.f3557)) {
            StringBuilder sbM40 = AbstractC0002.m40(i, "Index:", ", Size:");
            sbM40.append(this.f3557);
            throw new IndexOutOfBoundsException(sbM40.toString());
        }
        Object[] objArr = this.f3556;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[AbstractC0002.m53(i2, 3, 2, 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f3556, i, objArr2, i + 1, this.f3557 - i);
            this.f3556 = objArr2;
        }
        this.f3556[i] = obj;
        this.f3557++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0724, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m2933();
        int i = this.f3557;
        Object[] objArr = this.f3556;
        if (i == objArr.length) {
            this.f3556 = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f3556;
        int i2 = this.f3557;
        this.f3557 = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m3053(i);
        return this.f3556[i];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0724, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m2933();
        m3053(i);
        Object[] objArr = this.f3556;
        Object obj = objArr[i];
        if (i < this.f3557 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.f3557--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m2933();
        m3053(i);
        Object[] objArr = this.f3556;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3557;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC0780
    /* renamed from: ˏᵢ */
    public final InterfaceC0780 mo2949(int i) {
        if (i < this.f3557) {
            throw new IllegalArgumentException();
        }
        return new C0740(this.f3557, Arrays.copyOf(this.f3556, i));
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m3053(int i) {
        if (i < 0 || i >= this.f3557) {
            StringBuilder sbM40 = AbstractC0002.m40(i, "Index:", ", Size:");
            sbM40.append(this.f3557);
            throw new IndexOutOfBoundsException(sbM40.toString());
        }
    }
}
