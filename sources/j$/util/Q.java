package j$.util;

import java.util.SortedSet;

/* loaded from: classes2.dex */
final class Q extends q0 {
    final /* synthetic */ SortedSet f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Q(SortedSet sortedSet, java.util.Collection collection) {
        super(collection, 21);
        this.f = sortedSet;
    }

    @Override // j$.util.q0, j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        return this.f.comparator();
    }
}
