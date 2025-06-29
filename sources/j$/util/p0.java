package j$.util;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
final class p0 implements X {
    private final int[] a;
    private int b;
    private final int c;
    private final int d;

    public p0(int[] iArr, int i, int i2, int i3) {
        this.a = iArr;
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
        AbstractC5414b.b(this, consumer);
    }

    @Override // j$.util.d0
    public final void forEachRemaining(IntConsumer intConsumer) {
        int i;
        intConsumer.getClass();
        int[] iArr = this.a;
        int length = iArr.length;
        int i2 = this.c;
        if (length < i2 || (i = this.b) < 0) {
            return;
        }
        this.b = i2;
        if (i < i2) {
            do {
                intConsumer.accept(iArr[i]);
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
        return AbstractC5414b.g(this, consumer);
    }

    @Override // j$.util.d0
    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        int i = this.b;
        if (i < 0 || i >= this.c) {
            return false;
        }
        this.b = i + 1;
        intConsumer.accept(this.a[i]);
        return true;
    }

    @Override // j$.util.d0, j$.util.Spliterator
    public final X trySplit() {
        int i = this.b;
        int i2 = (this.c + i) >>> 1;
        if (i >= i2) {
            return null;
        }
        this.b = i2;
        return new p0(this.a, i, i2, this.d);
    }
}
