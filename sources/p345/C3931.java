package p345;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: ᵎᴵ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C3931 extends C3924 implements SortedSet {

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ C3934 f15273;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3931(C3934 c3934, SortedMap sortedMap) {
        super(c3934, sortedMap);
        this.f15273 = c3934;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return mo9144().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return mo9144().firstKey();
    }

    @Override // java.util.SortedSet
    public SortedSet headSet(Object obj) {
        return new C3931(this.f15273, mo9144().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return mo9144().lastKey();
    }

    @Override // java.util.SortedSet
    public SortedSet subSet(Object obj, Object obj2) {
        return new C3931(this.f15273, mo9144().subMap(obj, obj2));
    }

    @Override // java.util.SortedSet
    public SortedSet tailSet(Object obj) {
        return new C3931(this.f15273, mo9144().tailMap(obj));
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public SortedMap mo9144() {
        return (SortedMap) this.f15250;
    }
}
