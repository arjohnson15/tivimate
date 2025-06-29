package j$.util.concurrent;

import j$.util.AbstractC5414b;
import j$.util.U;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
final class x implements U {
    long a;
    final long b;
    final double c;
    final double d;

    x(long j, long j2, double d, double d2) {
        this.a = j;
        this.b = j2;
        this.c = d;
        this.d = d2;
    }

    @Override // j$.util.d0, j$.util.Spliterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final x trySplit() {
        long j = this.a;
        long j2 = (this.b + j) >>> 1;
        if (j2 <= j) {
            return null;
        }
        this.a = j2;
        return new x(j, j2, this.c, this.d);
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.b - this.a;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC5414b.a(this, consumer);
    }

    @Override // j$.util.d0
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        long j = this.a;
        long j2 = this.b;
        if (j < j2) {
            this.a = j2;
            ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
            do {
                doubleConsumer.accept(threadLocalRandomCurrent.c(this.c, this.d));
                j++;
            } while (j < j2);
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
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC5414b.f(this, consumer);
    }

    @Override // j$.util.d0
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        long j = this.a;
        if (j >= this.b) {
            return false;
        }
        doubleConsumer.accept(ThreadLocalRandom.current().c(this.c, this.d));
        this.a = j + 1;
        return true;
    }
}
