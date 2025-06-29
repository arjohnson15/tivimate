package p057;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import p013.AbstractC1049;

/* renamed from: ʾˉ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1342 extends AbstractC1049 implements Serializable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final C1342 f5476;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C1347 f5477;

    static {
        C1347 c1347 = C1347.f5493;
        f5476 = new C1342(C1347.f5493);
    }

    public C1342() {
        this(new C1347());
    }

    public C1342(C1347 c1347) {
        this.f5477 = c1347;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.f5477.m4700(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        this.f5477.m4695();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f5477.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f5477.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f5477.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C1347 c1347 = this.f5477;
        c1347.getClass();
        return new C1348(c1347, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C1347 c1347 = this.f5477;
        c1347.m4695();
        int iM4702 = c1347.m4702(obj);
        if (iM4702 < 0) {
            return false;
        }
        c1347.m4697(iM4702);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        this.f5477.m4695();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        this.f5477.m4695();
        return super.retainAll(collection);
    }

    @Override // p013.AbstractC1049
    /* renamed from: ٴˎ */
    public final int mo4039() {
        return this.f5477.f5500;
    }
}
