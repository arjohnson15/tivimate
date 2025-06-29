package p345;

import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: ᵎᴵ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3957 extends C3981 implements NavigableMap {

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final /* synthetic */ C3934 f15328;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3957(C3934 c3934, NavigableMap navigableMap) {
        super(c3934, navigableMap);
        this.f15328 = c3934;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry entryCeilingEntry = mo9162().ceilingEntry(obj);
        if (entryCeilingEntry == null) {
            return null;
        }
        return m9202(entryCeilingEntry);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return mo9162().ceilingKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new C3957(this.f15328, mo9162().descendingMap());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry entryFirstEntry = mo9162().firstEntry();
        if (entryFirstEntry == null) {
            return null;
        }
        return m9202(entryFirstEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry entryFloorEntry = mo9162().floorEntry(obj);
        if (entryFloorEntry == null) {
            return null;
        }
        return m9202(entryFloorEntry);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return mo9162().floorKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z) {
        return new C3957(this.f15328, mo9162().headMap(obj, z));
    }

    @Override // p345.C3981, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry entryHigherEntry = mo9162().higherEntry(obj);
        if (entryHigherEntry == null) {
            return null;
        }
        return m9202(entryHigherEntry);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return mo9162().higherKey(obj);
    }

    @Override // p345.C3981, p345.C3979, java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public final Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry entryLastEntry = mo9162().lastEntry();
        if (entryLastEntry == null) {
            return null;
        }
        return m9202(entryLastEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry entryLowerEntry = mo9162().lowerEntry(obj);
        if (entryLowerEntry == null) {
            return null;
        }
        return m9202(entryLowerEntry);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return mo9162().lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return m9164(((C3922) entrySet()).iterator());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return m9164(((C3922) ((C3979) descendingMap()).entrySet()).iterator());
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return new C3957(this.f15328, mo9162().subMap(obj, z, obj2, z2));
    }

    @Override // p345.C3981, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z) {
        return new C3957(this.f15328, mo9162().tailMap(obj, z));
    }

    @Override // p345.C3981, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // p345.C3981
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final SortedSet mo9161() {
        return new C3960(this.f15328, mo9162());
    }

    @Override // p345.C3981
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final SortedSet keySet() {
        return (NavigableSet) super.keySet();
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final C3940 m9164(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Collection collectionM9149 = this.f15328.m9149();
        collectionM9149.addAll((Collection) entry.getValue());
        it.remove();
        return new C3940(entry.getKey(), DesugarCollections.unmodifiableList((List) collectionM9149));
    }

    @Override // p345.C3981
    /* renamed from: ᐧʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final NavigableMap mo9162() {
        return (NavigableMap) ((SortedMap) this.f15357);
    }
}
