package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* renamed from: j$.util.stream.b1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5438b1 extends AbstractC5453e1 implements G0 {
    @Override // j$.util.stream.AbstractC5453e1, j$.util.stream.K0
    public final J0 b(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.AbstractC5453e1, j$.util.stream.K0
    public final /* bridge */ /* synthetic */ K0 b(int i) {
        b(i);
        throw null;
    }

    @Override // j$.util.stream.J0
    public final Object d() {
        return AbstractC5551y0.e;
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC5551y0.r(this, consumer);
    }

    @Override // j$.util.stream.AbstractC5453e1, j$.util.stream.K0
    public final /* synthetic */ K0 h(long j, long j2, IntFunction intFunction) {
        return AbstractC5551y0.u(this, j, j2);
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ void i(Object[] objArr, int i) {
        AbstractC5551y0.o(this, (Integer[]) objArr, i);
    }

    @Override // j$.util.stream.K0
    public final Spliterator spliterator() {
        return Spliterators.c();
    }

    @Override // j$.util.stream.K0
    public final j$.util.d0 spliterator() {
        return Spliterators.c();
    }
}
