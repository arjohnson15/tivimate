package j$.util;

import java.util.function.Consumer;

/* loaded from: classes2.dex */
final class r implements Spliterator {
    final Spliterator a;

    r(Spliterator spliterator) {
        this.a = spliterator;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.a.characteristics();
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        this.a.forEachRemaining(new C5428p(consumer));
    }

    @Override // j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        return this.a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        return this.a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final boolean hasCharacteristics(int i) {
        return this.a.hasCharacteristics(i);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return this.a.tryAdvance(new C5428p(consumer));
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        Spliterator spliteratorTrySplit = this.a.trySplit();
        if (spliteratorTrySplit == null) {
            return null;
        }
        return new r(spliteratorTrySplit);
    }
}
