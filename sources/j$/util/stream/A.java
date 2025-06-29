package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
final class A extends C {
    @Override // j$.util.stream.AbstractC5436b
    final boolean Q() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC5436b
    final InterfaceC5509p2 R(int i, InterfaceC5509p2 interfaceC5509p2) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.C, j$.util.stream.F
    public final void forEach(DoubleConsumer doubleConsumer) {
        if (isParallel()) {
            super.forEach(doubleConsumer);
        } else {
            C.Z(T()).forEachRemaining(doubleConsumer);
        }
    }

    @Override // j$.util.stream.C, j$.util.stream.F
    public final void forEachOrdered(DoubleConsumer doubleConsumer) {
        if (isParallel()) {
            super.forEachOrdered(doubleConsumer);
        } else {
            C.Z(T()).forEachRemaining(doubleConsumer);
        }
    }

    @Override // j$.util.stream.AbstractC5436b, j$.util.stream.InterfaceC5466h, j$.util.stream.F
    public final /* bridge */ /* synthetic */ F parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.AbstractC5436b, j$.util.stream.InterfaceC5466h, j$.util.stream.F
    public final /* bridge */ /* synthetic */ F sequential() {
        sequential();
        return this;
    }

    @Override // j$.util.stream.AbstractC5436b, j$.util.stream.InterfaceC5466h
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }

    @Override // j$.util.stream.InterfaceC5466h
    public final InterfaceC5466h unordered() {
        return !L() ? this : new C5535v(this, EnumC5450d3.r, 1);
    }
}
