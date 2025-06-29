package j$.util;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
final class n0 extends AbstractC5414b implements a0 {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC5414b.c(this, consumer);
    }

    @Override // j$.util.a0
    public final void forEachRemaining(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
    }

    @Override // j$.util.Spliterator
    public final java.util.Comparator getComparator() {
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

    @Override // j$.util.a0
    public final boolean tryAdvance(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        return false;
    }

    @Override // j$.util.AbstractC5414b, j$.util.U, j$.util.d0, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ a0 trySplit() {
        return null;
    }

    @Override // j$.util.AbstractC5414b, j$.util.U, j$.util.d0, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ d0 trySplit() {
        return null;
    }
}
