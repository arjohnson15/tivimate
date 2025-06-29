package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
final class S0 extends V0 implements E0 {
    @Override // j$.util.stream.J0
    public final Object c(int i) {
        return new double[i];
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC5551y0.q(this, consumer);
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ K0 h(long j, long j2, IntFunction intFunction) {
        return AbstractC5551y0.t(this, j, j2);
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ void i(Object[] objArr, int i) {
        AbstractC5551y0.n(this, (Double[]) objArr, i);
    }

    @Override // j$.util.stream.K0
    public final Spliterator spliterator() {
        return new C5478j1(this);
    }

    @Override // j$.util.stream.K0
    public final j$.util.d0 spliterator() {
        return new C5478j1(this);
    }
}
