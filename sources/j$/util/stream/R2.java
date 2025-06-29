package j$.util.stream;

import j$.util.AbstractC5414b;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
final class R2 extends X2 implements j$.util.U {
    final /* synthetic */ S2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    R2(S2 s2, int i, int i2, int i3, int i4) {
        super(s2, i, i2, i3, i4);
        this.g = s2;
    }

    @Override // j$.util.stream.X2
    final void a(int i, Object obj, Object obj2) {
        ((DoubleConsumer) obj2).accept(((double[]) obj)[i]);
    }

    @Override // j$.util.stream.X2
    final j$.util.d0 b(Object obj, int i, int i2) {
        return Spliterators.j((double[]) obj, i, i2 + i);
    }

    @Override // j$.util.stream.X2
    final j$.util.d0 c(int i, int i2, int i3, int i4) {
        return new R2(this.g, i, i2, i3, i4);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC5414b.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC5414b.f(this, consumer);
    }
}
