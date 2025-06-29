package androidx.datastore.preferences.protobuf;

import android.support.v4.media.session.AbstractC0002;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.ˋﾞ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0033 extends AbstractC0012 implements RandomAccess {

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static final C0033 f400;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public Object[] f401;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public int f402;

    static {
        C0033 c0033 = new C0033(0, new Object[0]);
        f400 = c0033;
        c0033.f358 = false;
    }

    public C0033(int i, Object[] objArr) {
        this.f401 = objArr;
        this.f402 = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        m233();
        if (i < 0 || i > (i2 = this.f402)) {
            StringBuilder sbM40 = AbstractC0002.m40(i, "Index:", ", Size:");
            sbM40.append(this.f402);
            throw new IndexOutOfBoundsException(sbM40.toString());
        }
        Object[] objArr = this.f401;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[AbstractC0002.m53(i2, 3, 2, 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f401, i, objArr2, i + 1, this.f402 - i);
            this.f401 = objArr2;
        }
        this.f401[i] = obj;
        this.f402++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0012, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m233();
        int i = this.f402;
        Object[] objArr = this.f401;
        if (i == objArr.length) {
            this.f401 = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f401;
        int i2 = this.f402;
        this.f402 = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m345(i);
        return this.f401[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m233();
        m345(i);
        Object[] objArr = this.f401;
        Object obj = objArr[i];
        if (i < this.f402 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.f402--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m233();
        m345(i);
        Object[] objArr = this.f401;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f402;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0048
    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final InterfaceC0048 mo344(int i) {
        if (i < this.f402) {
            throw new IllegalArgumentException();
        }
        return new C0033(this.f402, Arrays.copyOf(this.f401, i));
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m345(int i) {
        if (i < 0 || i >= this.f402) {
            StringBuilder sbM40 = AbstractC0002.m40(i, "Index:", ", Size:");
            sbM40.append(this.f402);
            throw new IndexOutOfBoundsException(sbM40.toString());
        }
    }
}
