package j$.util.stream;

import j$.util.C5566z;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.BiConsumer;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.k0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC5482k0 extends AbstractC5436b implements InterfaceC5497n0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static j$.util.a0 Z(Spliterator spliterator) {
        if (spliterator instanceof j$.util.a0) {
            return (j$.util.a0) spliterator;
        }
        if (!M3.a) {
            throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
        }
        M3.a(AbstractC5436b.class, "using LongStream.adapt(Spliterator<Long> s)");
        throw null;
    }

    @Override // j$.util.stream.AbstractC5436b
    final K0 F(AbstractC5436b abstractC5436b, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return AbstractC5551y0.H(abstractC5436b, spliterator, z);
    }

    @Override // j$.util.stream.AbstractC5436b
    final boolean H(Spliterator spliterator, InterfaceC5509p2 interfaceC5509p2) {
        LongConsumer c5447d0;
        boolean zN;
        j$.util.a0 a0VarZ = Z(spliterator);
        if (interfaceC5509p2 instanceof LongConsumer) {
            c5447d0 = (LongConsumer) interfaceC5509p2;
        } else {
            if (M3.a) {
                M3.a(AbstractC5436b.class, "using LongStream.adapt(Sink<Long> s)");
                throw null;
            }
            Objects.requireNonNull(interfaceC5509p2);
            c5447d0 = new C5447d0(interfaceC5509p2);
        }
        do {
            zN = interfaceC5509p2.n();
            if (zN) {
                break;
            }
        } while (a0VarZ.tryAdvance(c5447d0));
        return zN;
    }

    @Override // j$.util.stream.AbstractC5436b
    final EnumC5455e3 I() {
        return EnumC5455e3.LONG_VALUE;
    }

    @Override // j$.util.stream.AbstractC5436b
    final C0 N(long j, IntFunction intFunction) {
        return AbstractC5551y0.U(j);
    }

    @Override // j$.util.stream.AbstractC5436b
    final Spliterator U(AbstractC5436b abstractC5436b, Supplier supplier, boolean z) {
        return new C5524s3(abstractC5436b, supplier, z);
    }

    @Override // j$.util.stream.InterfaceC5497n0
    public final InterfaceC5497n0 a() {
        int i = l4.a;
        Objects.requireNonNull(null);
        return new V3(this, l4.a, 0);
    }

    @Override // j$.util.stream.InterfaceC5497n0
    public final F asDoubleStream() {
        return new C5535v(this, EnumC5450d3.n, 5);
    }

    @Override // j$.util.stream.InterfaceC5497n0
    public final j$.util.A average() {
        long j = ((long[]) collect(new C5520s(23), new C5520s(24), new C5520s(25)))[0];
        return j > 0 ? j$.util.A.d(r0[1] / j) : j$.util.A.a();
    }

    @Override // j$.util.stream.InterfaceC5497n0
    public final InterfaceC5497n0 b() {
        Objects.requireNonNull(null);
        return new C5545x(this, EnumC5450d3.t, 5);
    }

    @Override // j$.util.stream.InterfaceC5497n0
    public final Stream boxed() {
        return new C5530u(this, 0, new C5520s(22), 2);
    }

    @Override // j$.util.stream.InterfaceC5497n0
    public final InterfaceC5497n0 c() {
        int i = l4.a;
        Objects.requireNonNull(null);
        return new X3(this, l4.b, 0);
    }

    @Override // j$.util.stream.InterfaceC5497n0
    public final Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        r rVar = new r(biConsumer, 2);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objLongConsumer);
        Objects.requireNonNull(rVar);
        return D(new E1(EnumC5455e3.LONG_VALUE, rVar, objLongConsumer, supplier, 0));
    }

    @Override // j$.util.stream.InterfaceC5497n0
    public final long count() {
        return ((Long) D(new G1(0))).longValue();
    }

    @Override // j$.util.stream.InterfaceC5497n0
    public final InterfaceC5497n0 d() {
        Objects.requireNonNull(null);
        return new C5545x(this, EnumC5450d3.p | EnumC5450d3.n, 3);
    }

    @Override // j$.util.stream.InterfaceC5497n0
    public final InterfaceC5497n0 distinct() {
        return ((AbstractC5469h2) boxed()).distinct().mapToLong(new C5520s(19));
    }

    @Override // j$.util.stream.InterfaceC5497n0
    public final InterfaceC5497n0 e(C5431a c5431a) {
        Objects.requireNonNull(c5431a);
        return new C5467h0(this, EnumC5450d3.p | EnumC5450d3.n | EnumC5450d3.t, c5431a, 0);
    }

    @Override // j$.util.stream.InterfaceC5497n0
    public final j$.util.C findAny() {
        return (j$.util.C) D(J.d);
    }

    @Override // j$.util.stream.InterfaceC5497n0
    public final j$.util.C findFirst() {
        return (j$.util.C) D(J.c);
    }

    public void forEach(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        D(new P(longConsumer, false));
    }

    public void forEachOrdered(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        D(new P(longConsumer, true));
    }

    @Override // j$.util.stream.InterfaceC5466h, j$.util.stream.F
    public final j$.util.O iterator() {
        return Spliterators.h(spliterator());
    }

    @Override // j$.util.stream.InterfaceC5497n0
    public final F l() {
        Objects.requireNonNull(null);
        return new C5535v(this, EnumC5450d3.p | EnumC5450d3.n, 6);
    }

    @Override // j$.util.stream.InterfaceC5497n0
    public final InterfaceC5497n0 limit(long j) {
        if (j >= 0) {
            return AbstractC5551y0.a0(this, 0L, j);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.InterfaceC5497n0
    public final Stream mapToObj(LongFunction longFunction) {
        Objects.requireNonNull(longFunction);
        return new C5530u(this, EnumC5450d3.p | EnumC5450d3.n, longFunction, 2);
    }

    @Override // j$.util.stream.InterfaceC5497n0
    public final j$.util.C max() {
        return reduce(new C5520s(26));
    }

    @Override // j$.util.stream.InterfaceC5497n0
    public final j$.util.C min() {
        return reduce(new C5520s(18));
    }

    @Override // j$.util.stream.InterfaceC5497n0
    public final boolean n() {
        return ((Boolean) D(AbstractC5551y0.b0(EnumC5536v0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.InterfaceC5497n0
    public final InterfaceC5497n0 peek(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        return new C5467h0(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC5497n0
    public final boolean r() {
        return ((Boolean) D(AbstractC5551y0.b0(EnumC5536v0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.InterfaceC5497n0
    public final long reduce(long j, LongBinaryOperator longBinaryOperator) {
        Objects.requireNonNull(longBinaryOperator);
        return ((Long) D(new A1(EnumC5455e3.LONG_VALUE, longBinaryOperator, j))).longValue();
    }

    @Override // j$.util.stream.InterfaceC5497n0
    public final j$.util.C reduce(LongBinaryOperator longBinaryOperator) {
        Objects.requireNonNull(longBinaryOperator);
        return (j$.util.C) D(new C1(EnumC5455e3.LONG_VALUE, longBinaryOperator, 0));
    }

    @Override // j$.util.stream.InterfaceC5497n0
    public final InterfaceC5497n0 skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : AbstractC5551y0.a0(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.InterfaceC5497n0
    public final InterfaceC5497n0 sorted() {
        return new J2(this, EnumC5450d3.q | EnumC5450d3.o, 0);
    }

    @Override // j$.util.stream.AbstractC5436b, j$.util.stream.InterfaceC5466h
    public final j$.util.a0 spliterator() {
        return Z(super.spliterator());
    }

    @Override // j$.util.stream.InterfaceC5497n0
    public final long sum() {
        return reduce(0L, new C5520s(27));
    }

    @Override // j$.util.stream.InterfaceC5497n0
    public final C5566z summaryStatistics() {
        return (C5566z) collect(new C5511q(18), new C5520s(17), new C5520s(20));
    }

    @Override // j$.util.stream.InterfaceC5497n0
    public final long[] toArray() {
        return (long[]) AbstractC5551y0.Q((I0) E(new C5520s(21))).d();
    }

    @Override // j$.util.stream.InterfaceC5497n0
    public final boolean w() {
        return ((Boolean) D(AbstractC5551y0.b0(EnumC5536v0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.InterfaceC5497n0
    public final IntStream x() {
        Objects.requireNonNull(null);
        return new C5540w(this, EnumC5450d3.p | EnumC5450d3.n, 4);
    }
}
