package j$.util.stream;

import j$.util.AbstractC5414b;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
final class T2 extends X2 implements j$.util.X {
    final /* synthetic */ U2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    T2(U2 u2, int i, int i2, int i3, int i4) {
        super(u2, i, i2, i3, i4);
        this.g = u2;
    }

    @Override // j$.util.stream.X2
    final void a(int i, Object obj, Object obj2) {
        ((IntConsumer) obj2).accept(((int[]) obj)[i]);
    }

    @Override // j$.util.stream.X2
    final j$.util.d0 b(Object obj, int i, int i2) {
        return Spliterators.k((int[]) obj, i, i2 + i);
    }

    @Override // j$.util.stream.X2
    final j$.util.d0 c(int i, int i2, int i3, int i4) {
        return new T2(this.g, i, i2, i3, i4);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC5414b.b(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC5414b.g(this, consumer);
    }
}
