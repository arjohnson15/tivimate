package p057;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import p070.AbstractC1549;
import p407.InterfaceC4670;

/* renamed from: ʾˉ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1349 extends AbstractCollection implements Collection, InterfaceC4670 {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C1347 f5508;

    public C1349(C1347 c1347) {
        this.f5508 = c1347;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f5508.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f5508.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f5508.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C1347 c1347 = this.f5508;
        c1347.getClass();
        return new C1348(c1347, 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        C1347 c1347 = this.f5508;
        c1347.m4695();
        int i2 = c1347.f5504;
        while (true) {
            i = -1;
            i2--;
            if (i2 >= 0) {
                if (c1347.f5498[i2] >= 0 && AbstractC1549.m5138(c1347.f5495[i2], obj)) {
                    i = i2;
                    break;
                }
            } else {
                break;
            }
        }
        if (i < 0) {
            return false;
        }
        c1347.m4697(i);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        this.f5508.m4695();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        this.f5508.m4695();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f5508.f5500;
    }
}
