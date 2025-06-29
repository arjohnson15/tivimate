package j$.util.stream;

import j$.util.C5563w;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.IntFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
abstract class C extends AbstractC5436b implements F {
    /* JADX INFO: Access modifiers changed from: private */
    public static j$.util.U Z(Spliterator spliterator) {
        if (spliterator instanceof j$.util.U) {
            return (j$.util.U) spliterator;
        }
        if (!M3.a) {
            throw new UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
        }
        M3.a(AbstractC5436b.class, "using DoubleStream.adapt(Spliterator<Double> s)");
        throw null;
    }

    @Override // j$.util.stream.AbstractC5436b
    final K0 F(AbstractC5436b abstractC5436b, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return AbstractC5551y0.F(abstractC5436b, spliterator, z);
    }

    @Override // j$.util.stream.AbstractC5436b
    final boolean H(Spliterator spliterator, InterfaceC5509p2 interfaceC5509p2) {
        DoubleConsumer c5506p;
        boolean zN;
        j$.util.U uZ = Z(spliterator);
        if (interfaceC5509p2 instanceof DoubleConsumer) {
            c5506p = (DoubleConsumer) interfaceC5509p2;
        } else {
            if (M3.a) {
                M3.a(AbstractC5436b.class, "using DoubleStream.adapt(Sink<Double> s)");
                throw null;
            }
            Objects.requireNonNull(interfaceC5509p2);
            c5506p = new C5506p(interfaceC5509p2);
        }
        do {
            zN = interfaceC5509p2.n();
            if (zN) {
                break;
            }
        } while (uZ.tryAdvance(c5506p));
        return zN;
    }

    @Override // j$.util.stream.AbstractC5436b
    final EnumC5455e3 I() {
        return EnumC5455e3.DOUBLE_VALUE;
    }

    @Override // j$.util.stream.AbstractC5436b
    final C0 N(long j, IntFunction intFunction) {
        return AbstractC5551y0.J(j);
    }

    @Override // j$.util.stream.AbstractC5436b
    final Spliterator U(AbstractC5436b abstractC5436b, Supplier supplier, boolean z) {
        return new C5505o3(abstractC5436b, supplier, z);
    }

    @Override // j$.util.stream.F
    public final F a() {
        int i = l4.a;
        Objects.requireNonNull(null);
        return new Z3(this, l4.a, 0);
    }

    @Override // j$.util.stream.F
    public final j$.util.A average() {
        double[] dArr = (double[]) collect(new C5511q(23), new C5511q(1), new C5511q(2));
        if (dArr[2] <= 0.0d) {
            return j$.util.A.a();
        }
        int i = AbstractC5486l.a;
        double d = dArr[0] + dArr[1];
        double d2 = dArr[dArr.length - 1];
        if (Double.isNaN(d) && Double.isInfinite(d2)) {
            d = d2;
        }
        return j$.util.A.d(d / dArr[2]);
    }

    @Override // j$.util.stream.F
    public final F b() {
        Objects.requireNonNull(null);
        return new C5535v(this, EnumC5450d3.t, 2);
    }

    @Override // j$.util.stream.F
    public final Stream boxed() {
        return new C5530u(this, 0, new C5511q(26), 0);
    }

    @Override // j$.util.stream.F
    public final F c() {
        int i = l4.a;
        Objects.requireNonNull(null);
        return new b4(this, l4.b, 0);
    }

    @Override // j$.util.stream.F
    public final Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        r rVar = new r(biConsumer, 0);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objDoubleConsumer);
        Objects.requireNonNull(rVar);
        return D(new E1(EnumC5455e3.DOUBLE_VALUE, rVar, objDoubleConsumer, supplier, 1));
    }

    @Override // j$.util.stream.F
    public final long count() {
        return ((Long) D(new G1(1))).longValue();
    }

    @Override // j$.util.stream.F
    public final F d() {
        Objects.requireNonNull(null);
        return new C5535v(this, EnumC5450d3.p | EnumC5450d3.n, 0);
    }

    @Override // j$.util.stream.F
    public final F distinct() {
        return ((AbstractC5469h2) boxed()).distinct().mapToDouble(new C5511q(27));
    }

    @Override // j$.util.stream.F
    public final F e(C5431a c5431a) {
        Objects.requireNonNull(c5431a);
        return new C5555z(this, EnumC5450d3.p | EnumC5450d3.n | EnumC5450d3.t, c5431a, 0);
    }

    @Override // j$.util.stream.F
    public final j$.util.A findAny() {
        return (j$.util.A) D(H.d);
    }

    @Override // j$.util.stream.F
    public final j$.util.A findFirst() {
        return (j$.util.A) D(H.c);
    }

    public void forEach(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        D(new N(doubleConsumer, false));
    }

    public void forEachOrdered(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        D(new N(doubleConsumer, true));
    }

    @Override // j$.util.stream.F
    public final boolean i() {
        return ((Boolean) D(AbstractC5551y0.X(EnumC5536v0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.InterfaceC5466h, j$.util.stream.F
    public final j$.util.G iterator() {
        return Spliterators.f(spliterator());
    }

    @Override // j$.util.stream.F
    public final InterfaceC5497n0 j() {
        Objects.requireNonNull(null);
        return new C5545x(this, EnumC5450d3.p | EnumC5450d3.n, 0);
    }

    @Override // j$.util.stream.F
    public final F limit(long j) {
        if (j >= 0) {
            return AbstractC5551y0.W(this, 0L, j);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.F
    public final Stream mapToObj(DoubleFunction doubleFunction) {
        Objects.requireNonNull(doubleFunction);
        return new C5530u(this, EnumC5450d3.p | EnumC5450d3.n, doubleFunction, 0);
    }

    @Override // j$.util.stream.F
    public final j$.util.A max() {
        return reduce(new C5511q(29));
    }

    @Override // j$.util.stream.F
    public final j$.util.A min() {
        return reduce(new C5511q(22));
    }

    @Override // j$.util.stream.F
    public final boolean p() {
        return ((Boolean) D(AbstractC5551y0.X(EnumC5536v0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.F
    public final F peek(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        return new C5555z(this, doubleConsumer);
    }

    @Override // j$.util.stream.F
    public final double reduce(double d, DoubleBinaryOperator doubleBinaryOperator) {
        Objects.requireNonNull(doubleBinaryOperator);
        return ((Double) D(new I1(EnumC5455e3.DOUBLE_VALUE, doubleBinaryOperator, d))).doubleValue();
    }

    @Override // j$.util.stream.F
    public final j$.util.A reduce(DoubleBinaryOperator doubleBinaryOperator) {
        Objects.requireNonNull(doubleBinaryOperator);
        return (j$.util.A) D(new C1(EnumC5455e3.DOUBLE_VALUE, doubleBinaryOperator, 1));
    }

    @Override // j$.util.stream.F
    public final F skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : AbstractC5551y0.W(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.F
    public final F sorted() {
        return new H2(this, EnumC5450d3.q | EnumC5450d3.o, 0);
    }

    @Override // j$.util.stream.AbstractC5436b, j$.util.stream.InterfaceC5466h
    public final j$.util.U spliterator() {
        return Z(super.spliterator());
    }

    @Override // j$.util.stream.F
    public final double sum() {
        double[] dArr = (double[]) collect(new C5520s(0), new C5511q(3), new C5511q(0));
        int i = AbstractC5486l.a;
        double d = dArr[0] + dArr[1];
        double d2 = dArr[dArr.length - 1];
        return (Double.isNaN(d) && Double.isInfinite(d2)) ? d2 : d;
    }

    @Override // j$.util.stream.F
    public final C5563w summaryStatistics() {
        return (C5563w) collect(new C5511q(16), new C5511q(24), new C5511q(25));
    }

    @Override // j$.util.stream.F
    public final double[] toArray() {
        return (double[]) AbstractC5551y0.O((E0) E(new C5511q(28))).d();
    }

    @Override // j$.util.stream.F
    public final IntStream u() {
        Objects.requireNonNull(null);
        return new C5540w(this, EnumC5450d3.p | EnumC5450d3.n, 0);
    }

    @Override // j$.util.stream.F
    public final boolean y() {
        return ((Boolean) D(AbstractC5551y0.X(EnumC5536v0.NONE))).booleanValue();
    }
}
