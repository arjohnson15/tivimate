package j$.util;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
final class r0 implements a0 {
    private final long[] a;
    private int b;
    private final int c;
    private final int d;

    public r0(long[] jArr, int i, int i2, int i3) {
        this.a = jArr;
        this.b = i;
        this.c = i2;
        this.d = i3 | 16448;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.d;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.c - this.b;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC5414b.c(this, consumer);
    }

    @Override // j$.util.d0
    public final void forEachRemaining(LongConsumer longConsumer) {
        int i;
        longConsumer.getClass();
        long[] jArr = this.a;
        int length = jArr.length;
        int i2 = this.c;
        if (length < i2 || (i = this.b) < 0) {
            return;
        }
        this.b = i2;
        if (i < i2) {
            do {
                longConsumer.accept(jArr[i]);
                i++;
            } while (i < i2);
        }
    }

    @Override // j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        if (AbstractC5414b.e(this, 4)) {
            return null;
        }
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
        return AbstractC5414b.h(this, consumer);
    }

    @Override // j$.util.d0
    public final boolean tryAdvance(LongConsumer longConsumer) {
        longConsumer.getClass();
        int i = this.b;
        if (i < 0 || i >= this.c) {
            return false;
        }
        this.b = i + 1;
        longConsumer.accept(this.a[i]);
        return true;
    }

    @Override // j$.util.d0, j$.util.Spliterator
    public final a0 trySplit() {
        int i = this.b;
        int i2 = (this.c + i) >>> 1;
        if (i >= i2) {
            return null;
        }
        this.b = i2;
        return new r0(this.a, i, i2, this.d);
    }
}
