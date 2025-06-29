package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntConsumer;

/* renamed from: j$.util.stream.a0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5432a0 extends AbstractC5442c0 {
    @Override // j$.util.stream.AbstractC5436b
    final boolean Q() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC5436b
    final InterfaceC5509p2 R(int i, InterfaceC5509p2 interfaceC5509p2) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC5442c0, j$.util.stream.IntStream
    public final void forEach(IntConsumer intConsumer) {
        if (isParallel()) {
            super.forEach(intConsumer);
        } else {
            AbstractC5442c0.Z(T()).forEachRemaining(intConsumer);
        }
    }

    @Override // j$.util.stream.AbstractC5442c0, j$.util.stream.IntStream
    public final void forEachOrdered(IntConsumer intConsumer) {
        if (isParallel()) {
            super.forEachOrdered(intConsumer);
        } else {
            AbstractC5442c0.Z(T()).forEachRemaining(intConsumer);
        }
    }

    @Override // j$.util.stream.AbstractC5436b, j$.util.stream.InterfaceC5466h, j$.util.stream.F
    public final /* bridge */ /* synthetic */ IntStream parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.AbstractC5436b, j$.util.stream.InterfaceC5466h, j$.util.stream.F
    public final /* bridge */ /* synthetic */ IntStream sequential() {
        sequential();
        return this;
    }

    @Override // j$.util.stream.AbstractC5436b, j$.util.stream.InterfaceC5466h
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }

    @Override // j$.util.stream.InterfaceC5466h
    public final InterfaceC5466h unordered() {
        return !L() ? this : new C5540w(this, EnumC5450d3.r, 2);
    }
}
