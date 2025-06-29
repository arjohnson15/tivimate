package j$.util.stream;

import j$.util.AbstractC5414b;
import j$.util.Spliterator;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
final class O0 implements K0 {
    private final Collection a;

    O0(Collection collection) {
        this.a = collection;
    }

    @Override // j$.util.stream.K0
    public final K0 b(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.K0
    public final long count() {
        return this.a.size();
    }

    @Override // j$.util.stream.K0
    public final void forEach(Consumer consumer) {
        AbstractC5414b.q(this.a, consumer);
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ K0 h(long j, long j2, IntFunction intFunction) {
        return AbstractC5551y0.w(this, j, j2, intFunction);
    }

    @Override // j$.util.stream.K0
    public final void i(Object[] objArr, int i) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    @Override // j$.util.stream.K0
    public final Object[] o(IntFunction intFunction) {
        Collection collection = this.a;
        return collection.toArray((Object[]) intFunction.apply(collection.size()));
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ int q() {
        return 0;
    }

    @Override // j$.util.stream.K0
    public final Spliterator spliterator() {
        return AbstractC5414b.y(this.a).spliterator();
    }

    public final String toString() {
        Collection collection = this.a;
        return String.format("CollectionNode[%d][%s]", Integer.valueOf(collection.size()), collection);
    }
}
