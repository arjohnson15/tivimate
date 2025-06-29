package p200;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: ˎٴ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2758 implements Collection {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ C2741 f10789;

    public C2758(C2741 c2741) {
        this.f10789 = c2741;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f10789.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f10789.m7019(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f10789.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C2751(this.f10789, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C2741 c2741 = this.f10789;
        int iM7019 = c2741.m7019(obj);
        if (iM7019 < 0) {
            return false;
        }
        c2741.mo7022(iM7019);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C2741 c2741 = this.f10789;
        int i = c2741.f10778;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(c2741.m7016(i2))) {
                c2741.mo7022(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C2741 c2741 = this.f10789;
        int i = c2741.f10778;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(c2741.m7016(i2))) {
                c2741.mo7022(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f10789.f10778;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C2741 c2741 = this.f10789;
        int i = c2741.f10778;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c2741.m7016(i2);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C2741 c2741 = this.f10789;
        int i = c2741.f10778;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c2741.m7016(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
