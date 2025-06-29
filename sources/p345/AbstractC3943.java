package p345;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: ᵎᴵ.ˎᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3943 extends AbstractSet {
    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        collection.getClass();
        if (collection instanceof InterfaceC3938) {
            collection = ((InterfaceC3938) collection).m9152();
        }
        boolean zRemove = false;
        if (!(collection instanceof Set) || collection.size() <= size()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                zRemove |= remove(it.next());
            }
        } else {
            Iterator<E> it2 = iterator();
            collection.getClass();
            while (it2.hasNext()) {
                if (collection.contains(it2.next())) {
                    it2.remove();
                    zRemove = true;
                }
            }
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        collection.getClass();
        return super.retainAll(collection);
    }
}
