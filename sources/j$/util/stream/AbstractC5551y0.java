package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;
import java.util.function.Predicate;

/* renamed from: j$.util.stream.y0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC5551y0 implements J3 {
    private static final C5448d1 a = new C5448d1();
    private static final G0 b = new C5438b1();
    private static final I0 c = new C5443c1();
    private static final E0 d = new C5433a1();
    private static final int[] e = new int[0];
    private static final long[] f = new long[0];
    private static final double[] g = new double[0];

    static long A(long j, long j2, long j3) {
        if (j >= 0) {
            return Math.max(-1L, Math.min(j - j2, j3));
        }
        return -1L;
    }

    static long B(long j, long j2) {
        long j3 = j2 >= 0 ? j + j2 : Long.MAX_VALUE;
        if (j3 >= 0) {
            return j3;
        }
        return Long.MAX_VALUE;
    }

    static Spliterator C(EnumC5455e3 enumC5455e3, Spliterator spliterator, long j, long j2) {
        long j3 = j2 >= 0 ? j + j2 : Long.MAX_VALUE;
        long j4 = j3 >= 0 ? j3 : Long.MAX_VALUE;
        int i = AbstractC5553y2.a[enumC5455e3.ordinal()];
        if (i == 1) {
            return new C5549x3(spliterator, j, j4);
        }
        if (i == 2) {
            return new C5534u3((j$.util.X) spliterator, j, j4);
        }
        if (i == 3) {
            return new C5539v3((j$.util.a0) spliterator, j, j4);
        }
        if (i == 4) {
            return new C5529t3((j$.util.U) spliterator, j, j4);
        }
        throw new IllegalStateException("Unknown shape " + enumC5455e3);
    }

    static C0 D(long j, IntFunction intFunction) {
        return (j < 0 || j >= 2147483639) ? new C5547x1() : new C5458f1(j, intFunction);
    }

    public static K0 E(AbstractC5436b abstractC5436b, Spliterator spliterator, boolean z, IntFunction intFunction) {
        long jG = abstractC5436b.G(spliterator);
        if (jG < 0 || !spliterator.hasCharacteristics(16384)) {
            Q0 q0 = new Q0();
            q0.a = intFunction;
            K0 k0 = (K0) new P0(abstractC5436b, spliterator, q0, new C5511q(14), 3).invoke();
            return z ? N(k0, intFunction) : k0;
        }
        if (jG >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jG);
        new C5537v1(spliterator, abstractC5436b, objArr).invoke();
        return new N0(objArr);
    }

    public static E0 F(AbstractC5436b abstractC5436b, Spliterator spliterator, boolean z) {
        long jG = abstractC5436b.G(spliterator);
        if (jG < 0 || !spliterator.hasCharacteristics(16384)) {
            E0 e0 = (E0) new P0(abstractC5436b, spliterator, new C5511q(8), new C5511q(9), 0).invoke();
            return z ? O(e0) : e0;
        }
        if (jG >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr = new double[(int) jG];
        new C5522s1(spliterator, abstractC5436b, dArr).invoke();
        return new X0(dArr);
    }

    public static G0 G(AbstractC5436b abstractC5436b, Spliterator spliterator, boolean z) {
        long jG = abstractC5436b.G(spliterator);
        if (jG < 0 || !spliterator.hasCharacteristics(16384)) {
            G0 g0 = (G0) new P0(abstractC5436b, spliterator, new C5511q(10), new C5511q(11), 1).invoke();
            return z ? P(g0) : g0;
        }
        if (jG >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) jG];
        new C5527t1(spliterator, abstractC5436b, iArr).invoke();
        return new C5463g1(iArr);
    }

    public static I0 H(AbstractC5436b abstractC5436b, Spliterator spliterator, boolean z) {
        long jG = abstractC5436b.G(spliterator);
        if (jG < 0 || !spliterator.hasCharacteristics(16384)) {
            I0 i0 = (I0) new P0(abstractC5436b, spliterator, new C5511q(12), new C5511q(13), 2).invoke();
            return z ? Q(i0) : i0;
        }
        if (jG >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr = new long[(int) jG];
        new C5532u1(spliterator, abstractC5436b, jArr).invoke();
        return new C5508p1(jArr);
    }

    static M0 I(EnumC5455e3 enumC5455e3, K0 k0, K0 k02) {
        int i = L0.a[enumC5455e3.ordinal()];
        if (i == 1) {
            return new W0(k0, k02);
        }
        if (i == 2) {
            return new T0((G0) k0, (G0) k02);
        }
        if (i == 3) {
            return new U0((I0) k0, (I0) k02);
        }
        if (i == 4) {
            return new S0((E0) k0, (E0) k02);
        }
        throw new IllegalStateException("Unknown shape " + enumC5455e3);
    }

    static InterfaceC5556z0 J(long j) {
        return (j < 0 || j >= 2147483639) ? new Z0() : new Y0(j);
    }

    public static F K(j$.util.U u) {
        return new A(u, EnumC5450d3.r(u), false);
    }

    static AbstractC5453e1 L(EnumC5455e3 enumC5455e3) {
        int i = L0.a[enumC5455e3.ordinal()];
        if (i == 1) {
            return a;
        }
        if (i == 2) {
            return (AbstractC5453e1) b;
        }
        if (i == 3) {
            return (AbstractC5453e1) c;
        }
        if (i == 4) {
            return (AbstractC5453e1) d;
        }
        throw new IllegalStateException("Unknown shape " + enumC5455e3);
    }

    private static int M(long j) {
        return (j != -1 ? EnumC5450d3.u : 0) | EnumC5450d3.t;
    }

    public static K0 N(K0 k0, IntFunction intFunction) {
        if (k0.q() <= 0) {
            return k0;
        }
        long jCount = k0.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jCount);
        new C5557z1(k0, objArr, 1).invoke();
        return new N0(objArr);
    }

    public static E0 O(E0 e0) {
        if (e0.q() <= 0) {
            return e0;
        }
        long jCount = e0.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr = new double[(int) jCount];
        new C5552y1(e0, dArr, 0).invoke();
        return new X0(dArr);
    }

    public static G0 P(G0 g0) {
        if (g0.q() <= 0) {
            return g0;
        }
        long jCount = g0.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) jCount];
        new C5552y1(g0, iArr, 0).invoke();
        return new C5463g1(iArr);
    }

    public static I0 Q(I0 i0) {
        if (i0.q() <= 0) {
            return i0;
        }
        long jCount = i0.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr = new long[(int) jCount];
        new C5552y1(i0, jArr, 0).invoke();
        return new C5508p1(jArr);
    }

    public static C5431a R(Function function) {
        C5431a c5431a = new C5431a(8);
        c5431a.b = function;
        return c5431a;
    }

    static A0 S(long j) {
        return (j < 0 || j >= 2147483639) ? new C5473i1() : new C5468h1(j);
    }

    public static IntStream T(j$.util.X x) {
        return new C5432a0(x, EnumC5450d3.r(x), false);
    }

    static B0 U(long j) {
        return (j < 0 || j >= 2147483639) ? new C5517r1() : new C5513q1(j);
    }

    public static InterfaceC5497n0 V(j$.util.a0 a0Var) {
        return new C5472i0(a0Var, EnumC5450d3.r(a0Var), false);
    }

    public static F W(C c2, long j, long j2) {
        if (j >= 0) {
            return new C5548x2(c2, M(j2), j, j2);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j);
    }

    public static C5541w0 X(EnumC5536v0 enumC5536v0) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(enumC5536v0);
        return new C5541w0(EnumC5455e3.DOUBLE_VALUE, enumC5536v0, new C5502o0(enumC5536v0, 2));
    }

    public static IntStream Y(AbstractC5442c0 abstractC5442c0, long j, long j2) {
        if (j >= 0) {
            return new C5528t2(abstractC5442c0, M(j2), j, j2);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j);
    }

    public static C5541w0 Z(EnumC5536v0 enumC5536v0) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(enumC5536v0);
        return new C5541w0(EnumC5455e3.INT_VALUE, enumC5536v0, new C5502o0(enumC5536v0, 1));
    }

    public static void a() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static InterfaceC5497n0 a0(AbstractC5482k0 abstractC5482k0, long j, long j2) {
        if (j >= 0) {
            return new C5538v2(abstractC5482k0, M(j2), j, j2);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j);
    }

    public static C5541w0 b0(EnumC5536v0 enumC5536v0) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(enumC5536v0);
        return new C5541w0(EnumC5455e3.LONG_VALUE, enumC5536v0, new C5502o0(enumC5536v0, 0));
    }

    public static C5541w0 c0(EnumC5536v0 enumC5536v0, Predicate predicate) {
        Objects.requireNonNull(predicate);
        Objects.requireNonNull(enumC5536v0);
        return new C5541w0(EnumC5455e3.REFERENCE, enumC5536v0, new C5507p0(0, enumC5536v0, predicate));
    }

    public static Stream d0(AbstractC5469h2 abstractC5469h2, long j, long j2) {
        if (j >= 0) {
            return new C5518r2(abstractC5469h2, M(j2), j, j2);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j);
    }

    public static void e(InterfaceC5494m2 interfaceC5494m2, Double d2) {
        if (M3.a) {
            M3.a(interfaceC5494m2.getClass(), "{0} calling Sink.OfDouble.accept(Double)");
            throw null;
        }
        interfaceC5494m2.accept(d2.doubleValue());
    }

    public static Stream f0(Spliterator spliterator, boolean z) {
        Objects.requireNonNull(spliterator);
        return new C5459f2(spliterator, EnumC5450d3.r(spliterator), z);
    }

    public static void g(InterfaceC5499n2 interfaceC5499n2, Integer num) {
        if (M3.a) {
            M3.a(interfaceC5499n2.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
            throw null;
        }
        interfaceC5499n2.accept(num.intValue());
    }

    public static void i(InterfaceC5504o2 interfaceC5504o2, Long l) {
        if (M3.a) {
            M3.a(interfaceC5504o2.getClass(), "{0} calling Sink.OfLong.accept(Long)");
            throw null;
        }
        interfaceC5504o2.accept(l.longValue());
    }

    public static void k() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static void l() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static Object[] m(J0 j0, IntFunction intFunction) {
        if (M3.a) {
            M3.a(j0.getClass(), "{0} calling Node.OfPrimitive.asArray");
            throw null;
        }
        if (j0.count() >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) j0.count());
        j0.i(objArr, 0);
        return objArr;
    }

    public static void n(E0 e0, Double[] dArr, int i) {
        if (M3.a) {
            M3.a(e0.getClass(), "{0} calling Node.OfDouble.copyInto(Double[], int)");
            throw null;
        }
        double[] dArr2 = (double[]) e0.d();
        for (int i2 = 0; i2 < dArr2.length; i2++) {
            dArr[i + i2] = Double.valueOf(dArr2[i2]);
        }
    }

    public static void o(G0 g0, Integer[] numArr, int i) {
        if (M3.a) {
            M3.a(g0.getClass(), "{0} calling Node.OfInt.copyInto(Integer[], int)");
            throw null;
        }
        int[] iArr = (int[]) g0.d();
        for (int i2 = 0; i2 < iArr.length; i2++) {
            numArr[i + i2] = Integer.valueOf(iArr[i2]);
        }
    }

    public static void p(I0 i0, Long[] lArr, int i) {
        if (M3.a) {
            M3.a(i0.getClass(), "{0} calling Node.OfInt.copyInto(Long[], int)");
            throw null;
        }
        long[] jArr = (long[]) i0.d();
        for (int i2 = 0; i2 < jArr.length; i2++) {
            lArr[i + i2] = Long.valueOf(jArr[i2]);
        }
    }

    public static void q(E0 e0, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            e0.e((DoubleConsumer) consumer);
        } else {
            if (M3.a) {
                M3.a(e0.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.U) e0.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void r(G0 g0, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            g0.e((IntConsumer) consumer);
        } else {
            if (M3.a) {
                M3.a(g0.getClass(), "{0} calling Node.OfInt.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.X) g0.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void s(I0 i0, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            i0.e((LongConsumer) consumer);
        } else {
            if (M3.a) {
                M3.a(i0.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.a0) i0.spliterator()).forEachRemaining(consumer);
        }
    }

    public static E0 t(E0 e0, long j, long j2) {
        if (j == 0 && j2 == e0.count()) {
            return e0;
        }
        long j3 = j2 - j;
        j$.util.U u = (j$.util.U) e0.spliterator();
        InterfaceC5556z0 interfaceC5556z0J = J(j3);
        interfaceC5556z0J.l(j3);
        for (int i = 0; i < j && u.tryAdvance((DoubleConsumer) new D0(0)); i++) {
        }
        if (j2 == e0.count()) {
            u.forEachRemaining((DoubleConsumer) interfaceC5556z0J);
        } else {
            for (int i2 = 0; i2 < j3 && u.tryAdvance((DoubleConsumer) interfaceC5556z0J); i2++) {
            }
        }
        interfaceC5556z0J.k();
        return interfaceC5556z0J.a();
    }

    public static G0 u(G0 g0, long j, long j2) {
        if (j == 0 && j2 == g0.count()) {
            return g0;
        }
        long j3 = j2 - j;
        j$.util.X x = (j$.util.X) g0.spliterator();
        A0 a0S = S(j3);
        a0S.l(j3);
        for (int i = 0; i < j && x.tryAdvance((IntConsumer) new F0(0)); i++) {
        }
        if (j2 == g0.count()) {
            x.forEachRemaining((IntConsumer) a0S);
        } else {
            for (int i2 = 0; i2 < j3 && x.tryAdvance((IntConsumer) a0S); i2++) {
            }
        }
        a0S.k();
        return a0S.a();
    }

    public static I0 v(I0 i0, long j, long j2) {
        if (j == 0 && j2 == i0.count()) {
            return i0;
        }
        long j3 = j2 - j;
        j$.util.a0 a0Var = (j$.util.a0) i0.spliterator();
        B0 b0U = U(j3);
        b0U.l(j3);
        for (int i = 0; i < j && a0Var.tryAdvance((LongConsumer) new H0(0)); i++) {
        }
        if (j2 == i0.count()) {
            a0Var.forEachRemaining((LongConsumer) b0U);
        } else {
            for (int i2 = 0; i2 < j3 && a0Var.tryAdvance((LongConsumer) b0U); i2++) {
            }
        }
        b0U.k();
        return b0U.a();
    }

    public static K0 w(K0 k0, long j, long j2, IntFunction intFunction) {
        if (j == 0 && j2 == k0.count()) {
            return k0;
        }
        Spliterator spliterator = k0.spliterator();
        long j3 = j2 - j;
        C0 c0D = D(j3, intFunction);
        c0D.l(j3);
        for (int i = 0; i < j && spliterator.tryAdvance(new C5520s(28)); i++) {
        }
        if (j2 == k0.count()) {
            spliterator.forEachRemaining(c0D);
        } else {
            for (int i2 = 0; i2 < j3 && spliterator.tryAdvance(c0D); i2++) {
            }
        }
        c0D.k();
        return c0D.a();
    }

    @Override // j$.util.stream.J3
    public Object b(AbstractC5436b abstractC5436b, Spliterator spliterator) {
        U1 u1E0 = e0();
        abstractC5436b.V(spliterator, u1E0);
        return u1E0.get();
    }

    @Override // j$.util.stream.J3
    public Object c(AbstractC5436b abstractC5436b, Spliterator spliterator) {
        return ((U1) new C5439b2(this, abstractC5436b, spliterator).invoke()).get();
    }

    @Override // j$.util.stream.J3
    public /* synthetic */ int d() {
        return 0;
    }

    public abstract U1 e0();
}
