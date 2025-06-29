package j$.util.stream;

import j$.util.AbstractC5414b;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.l1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5488l1 extends AbstractC5493m1 implements j$.util.a0 {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC5414b.c(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC5414b.h(this, consumer);
    }
}
