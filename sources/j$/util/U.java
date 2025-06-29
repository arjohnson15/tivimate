package j$.util;

import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public interface U extends d0 {
    void forEachRemaining(DoubleConsumer doubleConsumer);

    boolean tryAdvance(DoubleConsumer doubleConsumer);

    @Override // j$.util.d0, j$.util.Spliterator
    U trySplit();
}
