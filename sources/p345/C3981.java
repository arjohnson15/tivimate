package p345;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: ᵎᴵ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C3981 extends C3979 implements SortedMap {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public SortedSet f15361;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ C3934 f15362;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3981(C3934 c3934, SortedMap sortedMap) {
        super(c3934, sortedMap);
        this.f15362 = c3934;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return mo9162().comparator();
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return mo9162().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new C3981(this.f15362, mo9162().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return mo9162().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new C3981(this.f15362, mo9162().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new C3981(this.f15362, mo9162().tailMap(obj));
    }

    /* renamed from: ʽᐧ */
    public SortedSet mo9161() {
        return new C3931(this.f15362, mo9162());
    }

    /* renamed from: ʿʼ */
    public SortedMap mo9162() {
        return (SortedMap) this.f15357;
    }

    @Override // p345.C3979, java.util.AbstractMap, java.util.Map, java.util.SortedMap
    /* renamed from: ˑʽ, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f15361;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetMo9161 = mo9161();
        this.f15361 = sortedSetMo9161;
        return sortedSetMo9161;
    }
}
