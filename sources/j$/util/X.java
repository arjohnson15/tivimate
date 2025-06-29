package j$.util;

import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public interface X extends d0 {
    void forEachRemaining(IntConsumer intConsumer);

    boolean tryAdvance(IntConsumer intConsumer);

    @Override // j$.util.d0, j$.util.Spliterator
    X trySplit();
}
