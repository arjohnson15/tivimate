package j$.util.stream;

import j$.util.C5564x;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.BiConsumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.c0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC5442c0 extends AbstractC5436b implements IntStream {
    /* JADX INFO: Access modifiers changed from: private */
    public static j$.util.X Z(Spliterator spliterator) {
        if (spliterator instanceof j$.util.X) {
            return (j$.util.X) spliterator;
        }
        if (!M3.a) {
            throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
        }
        M3.a(AbstractC5436b.class, "using IntStream.adapt(Spliterator<Integer> s)");
        throw null;
    }

    @Override // j$.util.stream.AbstractC5436b
    final K0 F(AbstractC5436b abstractC5436b, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return AbstractC5551y0.G(abstractC5436b, spliterator, z);
    }

    @Override // j$.util.stream.AbstractC5436b
    final boolean H(Spliterator spliterator, InterfaceC5509p2 interfaceC5509p2) {
        IntConsumer v;
        boolean zN;
        j$.util.X xZ = Z(spliterator);
        if (interfaceC5509p2 instanceof IntConsumer) {
            v = (IntConsumer) interfaceC5509p2;
        } else {
            if (M3.a) {
                M3.a(AbstractC5436b.class, "using IntStream.adapt(Sink<Integer> s)");
                throw null;
            }
            Objects.requireNonNull(interfaceC5509p2);
            v = new V(interfaceC5509p2);
        }
        do {
            zN = interfaceC5509p2.n();
            if (zN) {
                break;
            }
        } while (xZ.tryAdvance(v));
        return zN;
    }

    @Override // j$.util.stream.AbstractC5436b
    final EnumC5455e3 I() {
        return EnumC5455e3.INT_VALUE;
    }

    @Override // j$.util.stream.AbstractC5436b
    final C0 N(long j, IntFunction intFunction) {
        return AbstractC5551y0.S(j);
    }

    @Override // j$.util.stream.AbstractC5436b
    final Spliterator U(AbstractC5436b abstractC5436b, Supplier supplier, boolean z) {
        return new C5515q3(abstractC5436b, supplier, z);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream a() {
        int i = l4.a;
        Objects.requireNonNull(null);
        return new R3(this, l4.a, 0);
    }

    @Override // j$.util.stream.IntStream
    public final F asDoubleStream() {
        return new C5535v(this, 0, 3);
    }

    @Override // j$.util.stream.IntStream
    public final InterfaceC5497n0 asLongStream() {
        return new C5545x(this, 0, 1);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.A average() {
        long j = ((long[]) collect(new C5520s(14), new C5520s(15), new C5520s(16)))[0];
        return j > 0 ? j$.util.A.d(r0[1] / j) : j$.util.A.a();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream b() {
        Objects.requireNonNull(null);
        return new C5540w(this, EnumC5450d3.t, 3);
    }

    @Override // j$.util.stream.IntStream
    public final Stream boxed() {
        return new C5530u(this, 0, new C5520s(8), 1);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream c() {
        int i = l4.a;
        Objects.requireNonNull(null);
        return new T3(this, l4.b, 0);
    }

    @Override // j$.util.stream.IntStream
    public final Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        r rVar = new r(biConsumer, 1);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objIntConsumer);
        Objects.requireNonNull(rVar);
        return D(new E1(EnumC5455e3.INT_VALUE, rVar, objIntConsumer, supplier, 4));
    }

    @Override // j$.util.stream.IntStream
    public final long count() {
        return ((Long) D(new G1(3))).longValue();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream d() {
        Objects.requireNonNull(null);
        return new C5540w(this, EnumC5450d3.p | EnumC5450d3.n, 1);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream distinct() {
        return ((AbstractC5469h2) boxed()).distinct().mapToInt(new C5520s(7));
    }

    @Override // j$.util.stream.IntStream
    public final F f() {
        Objects.requireNonNull(null);
        return new C5535v(this, EnumC5450d3.p | EnumC5450d3.n, 4);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.B findAny() {
        return (j$.util.B) D(I.d);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.B findFirst() {
        return (j$.util.B) D(I.c);
    }

    public void forEach(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        D(new O(intConsumer, false));
    }

    public void forEachOrdered(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        D(new O(intConsumer, true));
    }

    @Override // j$.util.stream.IntStream
    public final boolean g() {
        return ((Boolean) D(AbstractC5551y0.Z(EnumC5536v0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.InterfaceC5466h, j$.util.stream.F
    public final j$.util.K iterator() {
        return Spliterators.g(spliterator());
    }

    @Override // j$.util.stream.IntStream
    public final IntStream limit(long j) {
        if (j >= 0) {
            return AbstractC5551y0.Y(this, 0L, j);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.IntStream
    public final InterfaceC5497n0 m() {
        Objects.requireNonNull(null);
        return new C5545x(this, EnumC5450d3.p | EnumC5450d3.n, 2);
    }

    @Override // j$.util.stream.IntStream
    public final Stream mapToObj(IntFunction intFunction) {
        Objects.requireNonNull(intFunction);
        return new C5530u(this, EnumC5450d3.p | EnumC5450d3.n, intFunction, 1);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.B max() {
        return reduce(new C5520s(13));
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.B min() {
        return reduce(new C5520s(9));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream peek(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        return new X(this, intConsumer);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream q(Q0 q0) {
        Objects.requireNonNull(q0);
        return new X(this, EnumC5450d3.p | EnumC5450d3.n | EnumC5450d3.t, q0, 1);
    }

    @Override // j$.util.stream.IntStream
    public final int reduce(int i, IntBinaryOperator intBinaryOperator) {
        Objects.requireNonNull(intBinaryOperator);
        return ((Integer) D(new P1(EnumC5455e3.INT_VALUE, intBinaryOperator, i))).intValue();
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.B reduce(IntBinaryOperator intBinaryOperator) {
        Objects.requireNonNull(intBinaryOperator);
        return (j$.util.B) D(new C1(EnumC5455e3.INT_VALUE, intBinaryOperator, 3));
    }

    @Override // j$.util.stream.IntStream
    public final boolean s() {
        return ((Boolean) D(AbstractC5551y0.Z(EnumC5536v0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : AbstractC5551y0.Y(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream sorted() {
        return new I2(this, EnumC5450d3.q | EnumC5450d3.o, 0);
    }

    @Override // j$.util.stream.AbstractC5436b, j$.util.stream.InterfaceC5466h
    public final j$.util.X spliterator() {
        return Z(super.spliterator());
    }

    @Override // j$.util.stream.IntStream
    public final int sum() {
        return reduce(0, new C5520s(12));
    }

    @Override // j$.util.stream.IntStream
    public final C5564x summaryStatistics() {
        return (C5564x) collect(new C5511q(17), new C5520s(10), new C5520s(11));
    }

    @Override // j$.util.stream.IntStream
    public final int[] toArray() {
        return (int[]) AbstractC5551y0.P((G0) E(new C5520s(6))).d();
    }

    @Override // j$.util.stream.IntStream
    public final boolean v() {
        return ((Boolean) D(AbstractC5551y0.Z(EnumC5536v0.ALL))).booleanValue();
    }
}
