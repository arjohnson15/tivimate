package p345;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import ⁱـ.ˑי;

/* renamed from: ᵎᴵ.ᴵʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3964 extends AbstractCollection {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final Object f15335;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f15336;

    public /* synthetic */ C3964(int i, Serializable serializable) {
        this.f15336 = i;
        this.f15335 = serializable;
    }

    public C3964(C3979 c3979) {
        this.f15336 = 2;
        this.f15335 = c3979;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f15336) {
            case 0:
                ((C3934) this.f15335).m9148();
                break;
            case 1:
                ((C3926) this.f15335).clear();
                break;
            default:
                ((C3979) this.f15335).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        switch (this.f15336) {
            case 0:
                return ((C3934) this.f15335).mo2919(obj);
            case 1:
            default:
                return super.contains(obj);
            case 2:
                return ((C3979) this.f15335).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f15336) {
            case 2:
                return ((C3979) this.f15335).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f15336) {
            case 0:
                return new C3956((C3934) this.f15335);
            case 1:
                C3926 c3926 = (C3926) this.f15335;
                Map mapM9132 = c3926.m9132();
                return mapM9132 != null ? mapM9132.values().iterator() : new C3941(c3926, 2);
            default:
                return new C3919(((C3979) this.f15335).entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f15336) {
            case 2:
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    C3979 c3979 = (C3979) this.f15335;
                    for (Map.Entry entry : c3979.entrySet()) {
                        if (ˑי.ﹶˆ(obj, entry.getValue())) {
                            c3979.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f15336) {
            case 2:
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    C3979 c3979 = (C3979) this.f15335;
                    for (Map.Entry entry : c3979.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return c3979.keySet().removeAll(hashSet);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f15336) {
            case 2:
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    C3979 c3979 = (C3979) this.f15335;
                    for (Map.Entry entry : c3979.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return c3979.keySet().retainAll(hashSet);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f15336) {
            case 0:
                return ((C3934) this.f15335).f15283;
            case 1:
                return ((C3926) this.f15335).size();
            default:
                return ((C3979) this.f15335).f15357.size();
        }
    }
}
