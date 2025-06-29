package j$.util.concurrent;

import j$.util.AbstractC5414b;
import j$.util.X;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
final class y implements X {
    long a;
    final long b;
    final int c;
    final int d;

    y(long j, long j2, int i, int i2) {
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = i2;
    }

    @Override // j$.util.d0, j$.util.Spliterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final y trySplit() {
        long j = this.a;
        long j2 = (this.b + j) >>> 1;
        if (j2 <= j) {
            return null;
        }
        this.a = j2;
        return new y(j, j2, this.c, this.d);
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
        AbstractC5414b.b(this, consumer);
    }

    @Override // j$.util.d0
    public final void forEachRemaining(IntConsumer intConsumer) {
        intConsumer.getClass();
        long j = this.a;
        long j2 = this.b;
        if (j < j2) {
            this.a = j2;
            ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
            do {
                intConsumer.accept(threadLocalRandomCurrent.d(this.c, this.d));
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
        return AbstractC5414b.g(this, consumer);
    }

    @Override // j$.util.d0
    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        long j = this.a;
        if (j >= this.b) {
            return false;
        }
        intConsumer.accept(ThreadLocalRandom.current().d(this.c, this.d));
        this.a = j + 1;
        return true;
    }
}
