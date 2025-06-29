package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.i0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5472i0 extends AbstractC5482k0 {
    @Override // j$.util.stream.AbstractC5436b
    final boolean Q() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC5436b
    final InterfaceC5509p2 R(int i, InterfaceC5509p2 interfaceC5509p2) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC5482k0, j$.util.stream.InterfaceC5497n0
    public final void forEach(LongConsumer longConsumer) {
        if (isParallel()) {
            super.forEach(longConsumer);
        } else {
            AbstractC5482k0.Z(T()).forEachRemaining(longConsumer);
        }
    }

    @Override // j$.util.stream.AbstractC5482k0, j$.util.stream.InterfaceC5497n0
    public final void forEachOrdered(LongConsumer longConsumer) {
        if (isParallel()) {
            super.forEachOrdered(longConsumer);
        } else {
            AbstractC5482k0.Z(T()).forEachRemaining(longConsumer);
        }
    }

    @Override // j$.util.stream.AbstractC5436b, j$.util.stream.InterfaceC5466h, j$.util.stream.F
    public final /* bridge */ /* synthetic */ InterfaceC5497n0 parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.AbstractC5436b, j$.util.stream.InterfaceC5466h, j$.util.stream.F
    public final /* bridge */ /* synthetic */ InterfaceC5497n0 sequential() {
        sequential();
        return this;
    }

    @Override // j$.util.stream.AbstractC5436b, j$.util.stream.InterfaceC5466h
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }

    @Override // j$.util.stream.InterfaceC5466h
    public final InterfaceC5466h unordered() {
        return !L() ? this : new C5545x(this, EnumC5450d3.r, 4);
    }
}
