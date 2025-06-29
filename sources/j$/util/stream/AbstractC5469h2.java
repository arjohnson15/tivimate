package j$.util.stream;

import j$.util.Objects;
import j$.util.Optional;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* renamed from: j$.util.stream.h2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC5469h2 extends AbstractC5436b implements Stream {
    @Override // j$.util.stream.AbstractC5436b
    final K0 F(AbstractC5436b abstractC5436b, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return AbstractC5551y0.E(abstractC5436b, spliterator, z, intFunction);
    }

    @Override // j$.util.stream.AbstractC5436b
    final boolean H(Spliterator spliterator, InterfaceC5509p2 interfaceC5509p2) {
        boolean zN;
        do {
            zN = interfaceC5509p2.n();
            if (zN) {
                break;
            }
        } while (spliterator.tryAdvance(interfaceC5509p2));
        return zN;
    }

    @Override // j$.util.stream.AbstractC5436b
    final EnumC5455e3 I() {
        return EnumC5455e3.REFERENCE;
    }

    @Override // j$.util.stream.AbstractC5436b
    final C0 N(long j, IntFunction intFunction) {
        return AbstractC5551y0.D(j, intFunction);
    }

    @Override // j$.util.stream.AbstractC5436b
    final Spliterator U(AbstractC5436b abstractC5436b, Supplier supplier, boolean z) {
        return new H3(abstractC5436b, supplier, z);
    }

    @Override // j$.util.stream.Stream
    public final boolean allMatch(Predicate predicate) {
        return ((Boolean) D(AbstractC5551y0.c0(EnumC5536v0.ALL, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final boolean anyMatch(Predicate predicate) {
        return ((Boolean) D(AbstractC5551y0.c0(EnumC5536v0.ANY, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(biConsumer);
        Objects.requireNonNull(biConsumer2);
        return D(new E1(EnumC5455e3.REFERENCE, biConsumer2, biConsumer, supplier, 3));
    }

    @Override // j$.util.stream.Stream
    public final long count() {
        return ((Long) D(new G1(2))).longValue();
    }

    @Override // j$.util.stream.Stream
    public final Stream distinct() {
        return new C5501o(this, EnumC5450d3.m | EnumC5450d3.t, 0);
    }

    @Override // j$.util.stream.Stream
    public final Stream dropWhile(Predicate predicate) {
        int i = l4.a;
        Objects.requireNonNull(predicate);
        return new P3(this, l4.b, predicate);
    }

    @Override // j$.util.stream.Stream
    public final Stream e(C5431a c5431a) {
        Objects.requireNonNull(c5431a);
        return new C5530u(this, EnumC5450d3.p | EnumC5450d3.n | EnumC5450d3.t, c5431a, 6);
    }

    @Override // j$.util.stream.Stream
    public final Stream filter(Predicate predicate) {
        Objects.requireNonNull(predicate);
        return new C5530u(this, EnumC5450d3.t, predicate, 4);
    }

    @Override // j$.util.stream.Stream
    public final Optional findAny() {
        return (Optional) D(K.d);
    }

    @Override // j$.util.stream.Stream
    public final Optional findFirst() {
        return (Optional) D(K.c);
    }

    public void forEach(Consumer consumer) {
        Objects.requireNonNull(consumer);
        D(new Q(consumer, false));
    }

    public void forEachOrdered(Consumer consumer) {
        Objects.requireNonNull(consumer);
        D(new Q(consumer, true));
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x014b  */
    @Override // j$.util.stream.Stream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(j$.util.stream.C5476j r10) {
        /*
            Method dump skipped, instructions count: 525
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.AbstractC5469h2.h(j$.util.stream.j):java.lang.Object");
    }

    @Override // j$.util.stream.InterfaceC5466h, j$.util.stream.F
    public final Iterator iterator() {
        return Spliterators.i(spliterator());
    }

    @Override // j$.util.stream.Stream
    public final Stream limit(long j) {
        if (j >= 0) {
            return AbstractC5551y0.d0(this, 0L, j);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.Stream
    public final Stream map(Function function) {
        Objects.requireNonNull(function);
        return new C5530u(this, EnumC5450d3.p | EnumC5450d3.n, function, 5);
    }

    @Override // j$.util.stream.Stream
    public final F mapToDouble(ToDoubleFunction toDoubleFunction) {
        Objects.requireNonNull(toDoubleFunction);
        return new C5555z(this, EnumC5450d3.p | EnumC5450d3.n, toDoubleFunction, 2);
    }

    @Override // j$.util.stream.Stream
    public final IntStream mapToInt(ToIntFunction toIntFunction) {
        Objects.requireNonNull(toIntFunction);
        return new X(this, EnumC5450d3.p | EnumC5450d3.n, toIntFunction, 2);
    }

    @Override // j$.util.stream.Stream
    public final InterfaceC5497n0 mapToLong(ToLongFunction toLongFunction) {
        Objects.requireNonNull(toLongFunction);
        return new C5467h0(this, EnumC5450d3.p | EnumC5450d3.n, toLongFunction, 3);
    }

    @Override // j$.util.stream.Stream
    public final Optional max(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return reduce(new j$.util.function.a(0, comparator));
    }

    @Override // j$.util.stream.Stream
    public final Optional min(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return reduce(new j$.util.function.a(1, comparator));
    }

    @Override // j$.util.stream.Stream
    public final boolean noneMatch(Predicate predicate) {
        return ((Boolean) D(AbstractC5551y0.c0(EnumC5536v0.NONE, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final InterfaceC5497n0 o(C5431a c5431a) {
        Objects.requireNonNull(c5431a);
        return new C5467h0(this, EnumC5450d3.p | EnumC5450d3.n | EnumC5450d3.t, c5431a, 2);
    }

    @Override // j$.util.stream.Stream
    public final Stream peek(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return new C5530u(this, consumer);
    }

    @Override // j$.util.stream.Stream
    public final Optional reduce(BinaryOperator binaryOperator) {
        Objects.requireNonNull(binaryOperator);
        return (Optional) D(new C1(EnumC5455e3.REFERENCE, binaryOperator, 2));
    }

    @Override // j$.util.stream.Stream
    public final Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        Objects.requireNonNull(biFunction);
        Objects.requireNonNull(binaryOperator);
        return D(new E1(EnumC5455e3.REFERENCE, binaryOperator, biFunction, obj, 2));
    }

    @Override // j$.util.stream.Stream
    public final Object reduce(Object obj, BinaryOperator binaryOperator) {
        Objects.requireNonNull(binaryOperator);
        Objects.requireNonNull(binaryOperator);
        return D(new E1(EnumC5455e3.REFERENCE, binaryOperator, binaryOperator, obj, 2));
    }

    @Override // j$.util.stream.Stream
    public final Stream skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : AbstractC5551y0.d0(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted() {
        return new K2(this);
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted(Comparator comparator) {
        return new K2(this, comparator);
    }

    @Override // j$.util.stream.Stream
    public final IntStream t(C5431a c5431a) {
        Objects.requireNonNull(c5431a);
        return new X(this, EnumC5450d3.p | EnumC5450d3.n | EnumC5450d3.t, c5431a, 3);
    }

    @Override // j$.util.stream.Stream
    public final Stream takeWhile(Predicate predicate) {
        int i = l4.a;
        Objects.requireNonNull(predicate);
        return new N3(this, l4.a, predicate);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray() {
        return toArray(new C5444c2(0));
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray(IntFunction intFunction) {
        return AbstractC5551y0.N(E(intFunction), intFunction).o(intFunction);
    }

    @Override // j$.util.stream.Stream
    public final F z(C5431a c5431a) {
        Objects.requireNonNull(c5431a);
        return new C5555z(this, EnumC5450d3.p | EnumC5450d3.n | EnumC5450d3.t, c5431a, 3);
    }
}
