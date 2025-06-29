package j$.util.stream;

import j$.util.AbstractC5414b;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
final class V2 extends X2 implements j$.util.a0 {
    final /* synthetic */ W2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    V2(W2 w2, int i, int i2, int i3, int i4) {
        super(w2, i, i2, i3, i4);
        this.g = w2;
    }

    @Override // j$.util.stream.X2
    final void a(int i, Object obj, Object obj2) {
        ((LongConsumer) obj2).accept(((long[]) obj)[i]);
    }

    @Override // j$.util.stream.X2
    final j$.util.d0 b(Object obj, int i, int i2) {
        return Spliterators.l((long[]) obj, i, i2 + i);
    }

    @Override // j$.util.stream.X2
    final j$.util.d0 c(int i, int i2, int i3, int i4) {
        return new V2(this.g, i, i2, i3, i4);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC5414b.c(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC5414b.h(this, consumer);
    }
}
