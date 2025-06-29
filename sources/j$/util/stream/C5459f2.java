package j$.util.stream;

import java.util.function.Consumer;

/* renamed from: j$.util.stream.f2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5459f2 extends AbstractC5469h2 {
    @Override // j$.util.stream.AbstractC5436b
    final boolean Q() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC5436b
    final InterfaceC5509p2 R(int i, InterfaceC5509p2 interfaceC5509p2) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC5469h2, j$.util.stream.Stream
    public final void forEach(Consumer consumer) {
        if (isParallel()) {
            super.forEach(consumer);
        } else {
            T().forEachRemaining(consumer);
        }
    }

    @Override // j$.util.stream.AbstractC5469h2, j$.util.stream.Stream
    public final void forEachOrdered(Consumer consumer) {
        if (isParallel()) {
            super.forEachOrdered(consumer);
        } else {
            T().forEachRemaining(consumer);
        }
    }

    @Override // j$.util.stream.InterfaceC5466h
    public final InterfaceC5466h unordered() {
        return !L() ? this : new C5454e2(this, EnumC5450d3.r, 1);
    }
}
