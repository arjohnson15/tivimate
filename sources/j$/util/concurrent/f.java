package j$.util.concurrent;

import j$.util.AbstractC5414b;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
final class f extends o implements Spliterator {
    final ConcurrentHashMap i;
    long j;

    f(k[] kVarArr, int i, int i2, int i3, long j, ConcurrentHashMap concurrentHashMap) {
        super(kVarArr, i, i2, i3);
        this.i = concurrentHashMap;
        this.j = j;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 4353;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.j;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        while (true) {
            k kVarA = a();
            if (kVarA == null) {
                return;
            } else {
                consumer.p(new j(kVarA.b, kVarA.c, this.i));
            }
        }
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC5414b.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return AbstractC5414b.e(this, i);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        k kVarA = a();
        if (kVarA == null) {
            return false;
        }
        consumer.p(new j(kVarA.b, kVarA.c, this.i));
        return true;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int i = this.f;
        int i2 = this.g;
        int i3 = (i + i2) >>> 1;
        if (i3 <= i) {
            return null;
        }
        k[] kVarArr = this.a;
        this.g = i3;
        long j = this.j >>> 1;
        this.j = j;
        return new f(kVarArr, this.h, i3, i2, j, this.i);
    }
}
