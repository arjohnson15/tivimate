package j$.util;

import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public interface a0 extends d0 {
    void forEachRemaining(LongConsumer longConsumer);

    boolean tryAdvance(LongConsumer longConsumer);

    @Override // j$.util.d0, j$.util.Spliterator
    a0 trySplit();
}
