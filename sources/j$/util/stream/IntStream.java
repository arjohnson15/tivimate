package j$.util.stream;

import j$.util.AbstractC5414b;
import j$.util.C5564x;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.BiConsumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

/* loaded from: classes2.dex */
public interface IntStream extends InterfaceC5466h {

    public final /* synthetic */ class VivifiedWrapper implements IntStream {
        public final /* synthetic */ java.util.stream.IntStream a;

        private /* synthetic */ VivifiedWrapper(java.util.stream.IntStream intStream) {
            this.a = intStream;
        }

        public static /* synthetic */ IntStream convert(java.util.stream.IntStream intStream) {
            if (intStream == null) {
                return null;
            }
            return intStream instanceof Wrapper ? IntStream.this : new VivifiedWrapper(intStream);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream a() {
            return convert(this.a.takeWhile(null));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ F asDoubleStream() {
            return D.k(this.a.asDoubleStream());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ InterfaceC5497n0 asLongStream() {
            return C5487l0.k(this.a.asLongStream());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.A average() {
            return AbstractC5414b.j(this.a.average());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream b() {
            return convert(this.a.filter(null));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ Stream boxed() {
            return C5435a3.k(this.a.boxed());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream c() {
            return convert(this.a.dropWhile(null));
        }

        @Override // java.lang.AutoCloseable
        public final /* synthetic */ void close() {
            this.a.close();
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
            return this.a.collect(supplier, objIntConsumer, biConsumer);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ long count() {
            return this.a.count();
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream d() {
            return convert(this.a.map(null));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream distinct() {
            return convert(this.a.distinct());
        }

        public final /* synthetic */ boolean equals(Object obj) {
            java.util.stream.IntStream intStream = this.a;
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).a;
            }
            return intStream.equals(obj);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ F f() {
            return D.k(this.a.mapToDouble(null));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.B findAny() {
            return AbstractC5414b.k(this.a.findAny());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.B findFirst() {
            return AbstractC5414b.k(this.a.findFirst());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ void forEach(IntConsumer intConsumer) {
            this.a.forEach(intConsumer);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ void forEachOrdered(IntConsumer intConsumer) {
            this.a.forEachOrdered(intConsumer);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ boolean g() {
            return this.a.noneMatch(null);
        }

        public final /* synthetic */ int hashCode() {
            return this.a.hashCode();
        }

        @Override // j$.util.stream.InterfaceC5466h
        public final /* synthetic */ boolean isParallel() {
            return this.a.isParallel();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfInt] */
        @Override // j$.util.stream.IntStream, j$.util.stream.InterfaceC5466h, j$.util.stream.F
        public final /* synthetic */ j$.util.K iterator() {
            return j$.util.I.a(this.a.iterator());
        }

        @Override // j$.util.stream.InterfaceC5466h, j$.util.stream.F
        public final /* synthetic */ Iterator iterator() {
            return this.a.iterator();
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream limit(long j) {
            return convert(this.a.limit(j));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ InterfaceC5497n0 m() {
            return C5487l0.k(this.a.mapToLong(null));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ Stream mapToObj(IntFunction intFunction) {
            return C5435a3.k(this.a.mapToObj(intFunction));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.B max() {
            return AbstractC5414b.k(this.a.max());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.B min() {
            return AbstractC5414b.k(this.a.min());
        }

        @Override // j$.util.stream.InterfaceC5466h
        public final /* synthetic */ InterfaceC5466h onClose(Runnable runnable) {
            return C5456f.k(this.a.onClose(runnable));
        }

        @Override // j$.util.stream.IntStream, j$.util.stream.InterfaceC5466h, j$.util.stream.F
        public final /* synthetic */ IntStream parallel() {
            return convert(this.a.parallel());
        }

        @Override // j$.util.stream.InterfaceC5466h, j$.util.stream.F
        public final /* synthetic */ InterfaceC5466h parallel() {
            return C5456f.k(this.a.parallel());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream peek(IntConsumer intConsumer) {
            return convert(this.a.peek(intConsumer));
        }

        @Override // j$.util.stream.IntStream
        public final IntStream q(Q0 q0) {
            java.util.stream.IntStream intStream = this.a;
            Q0 q02 = new Q0();
            q02.a = q0;
            return convert(intStream.flatMap(q02));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ int reduce(int i, IntBinaryOperator intBinaryOperator) {
            return this.a.reduce(i, intBinaryOperator);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.B reduce(IntBinaryOperator intBinaryOperator) {
            return AbstractC5414b.k(this.a.reduce(intBinaryOperator));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ boolean s() {
            return this.a.anyMatch(null);
        }

        @Override // j$.util.stream.IntStream, j$.util.stream.InterfaceC5466h, j$.util.stream.F
        public final /* synthetic */ IntStream sequential() {
            return convert(this.a.sequential());
        }

        @Override // j$.util.stream.InterfaceC5466h, j$.util.stream.F
        public final /* synthetic */ InterfaceC5466h sequential() {
            return C5456f.k(this.a.sequential());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream skip(long j) {
            return convert(this.a.skip(j));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream sorted() {
            return convert(this.a.sorted());
        }

        @Override // j$.util.stream.InterfaceC5466h
        public final /* synthetic */ Spliterator spliterator() {
            return j$.util.e0.a(this.a.spliterator());
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfInt] */
        @Override // j$.util.stream.IntStream, j$.util.stream.InterfaceC5466h
        public final /* synthetic */ j$.util.X spliterator() {
            return j$.util.V.a(this.a.spliterator());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ int sum() {
            return this.a.sum();
        }

        @Override // j$.util.stream.IntStream
        public final C5564x summaryStatistics() {
            this.a.summaryStatistics();
            throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.IntSummaryStatistics");
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ int[] toArray() {
            return this.a.toArray();
        }

        @Override // j$.util.stream.InterfaceC5466h
        public final /* synthetic */ InterfaceC5466h unordered() {
            return C5456f.k(this.a.unordered());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ boolean v() {
            return this.a.allMatch(null);
        }
    }

    public final /* synthetic */ class Wrapper implements java.util.stream.IntStream {
        private /* synthetic */ Wrapper() {
        }

        public static /* synthetic */ java.util.stream.IntStream convert(IntStream intStream) {
            if (intStream == null) {
                return null;
            }
            return intStream instanceof VivifiedWrapper ? ((VivifiedWrapper) intStream).a : intStream.new Wrapper();
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ boolean allMatch(IntPredicate intPredicate) {
            return IntStream.this.v();
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ boolean anyMatch(IntPredicate intPredicate) {
            return IntStream.this.s();
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ DoubleStream asDoubleStream() {
            return E.k(IntStream.this.asDoubleStream());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ LongStream asLongStream() {
            return C5492m0.k(IntStream.this.asLongStream());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalDouble average() {
            return AbstractC5414b.n(IntStream.this.average());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.Stream boxed() {
            return Stream.Wrapper.convert(IntStream.this.boxed());
        }

        @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
        public final /* synthetic */ void close() throws Exception {
            IntStream.this.close();
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
            return IntStream.this.collect(supplier, objIntConsumer, biConsumer);
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ long count() {
            return IntStream.this.count();
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream distinct() {
            return convert(IntStream.this.distinct());
        }

        public final /* synthetic */ java.util.stream.IntStream dropWhile(IntPredicate intPredicate) {
            return convert(IntStream.this.c());
        }

        public final /* synthetic */ boolean equals(Object obj) {
            IntStream intStream = IntStream.this;
            if (obj instanceof Wrapper) {
                obj = IntStream.this;
            }
            return intStream.equals(obj);
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream filter(IntPredicate intPredicate) {
            return convert(IntStream.this.b());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalInt findAny() {
            return AbstractC5414b.o(IntStream.this.findAny());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalInt findFirst() {
            return AbstractC5414b.o(IntStream.this.findFirst());
        }

        @Override // java.util.stream.IntStream
        public final java.util.stream.IntStream flatMap(IntFunction intFunction) {
            IntStream intStream = IntStream.this;
            Q0 q0 = new Q0();
            q0.a = intFunction;
            return convert(intStream.q(q0));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ void forEach(IntConsumer intConsumer) {
            IntStream.this.forEach(intConsumer);
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ void forEachOrdered(IntConsumer intConsumer) {
            IntStream.this.forEachOrdered(intConsumer);
        }

        public final /* synthetic */ int hashCode() {
            return IntStream.this.hashCode();
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ boolean isParallel() {
            return IntStream.this.isParallel();
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ Iterator<Integer> iterator() {
            return IntStream.this.iterator();
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        /* renamed from: iterator, reason: avoid collision after fix types in other method */
        public final /* synthetic */ Iterator<Integer> iterator2() {
            return j$.util.J.a(IntStream.this.iterator());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream limit(long j) {
            return convert(IntStream.this.limit(j));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream map(IntUnaryOperator intUnaryOperator) {
            return convert(IntStream.this.d());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ DoubleStream mapToDouble(IntToDoubleFunction intToDoubleFunction) {
            return E.k(IntStream.this.f());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ LongStream mapToLong(IntToLongFunction intToLongFunction) {
            return C5492m0.k(IntStream.this.m());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.Stream mapToObj(IntFunction intFunction) {
            return Stream.Wrapper.convert(IntStream.this.mapToObj(intFunction));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalInt max() {
            return AbstractC5414b.o(IntStream.this.max());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalInt min() {
            return AbstractC5414b.o(IntStream.this.min());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ boolean noneMatch(IntPredicate intPredicate) {
            return IntStream.this.g();
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ BaseStream onClose(Runnable runnable) {
            return C5461g.k(IntStream.this.onClose(runnable));
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ BaseStream parallel() {
            return C5461g.k(IntStream.this.parallel());
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ java.util.stream.IntStream parallel() {
            return convert(IntStream.this.parallel());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream peek(IntConsumer intConsumer) {
            return convert(IntStream.this.peek(intConsumer));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ int reduce(int i, IntBinaryOperator intBinaryOperator) {
            return IntStream.this.reduce(i, intBinaryOperator);
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalInt reduce(IntBinaryOperator intBinaryOperator) {
            return AbstractC5414b.o(IntStream.this.reduce(intBinaryOperator));
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ BaseStream sequential() {
            return C5461g.k(IntStream.this.sequential());
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ java.util.stream.IntStream sequential() {
            return convert(IntStream.this.sequential());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream skip(long j) {
            return convert(IntStream.this.skip(j));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream sorted() {
            return convert(IntStream.this.sorted());
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ java.util.Spliterator<Integer> spliterator() {
            return j$.util.W.a(IntStream.this.spliterator());
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        /* renamed from: spliterator, reason: avoid collision after fix types in other method */
        public final /* synthetic */ java.util.Spliterator<Integer> spliterator2() {
            return Spliterator.Wrapper.convert(IntStream.this.spliterator());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ int sum() {
            return IntStream.this.sum();
        }

        @Override // java.util.stream.IntStream
        public final IntSummaryStatistics summaryStatistics() {
            IntStream.this.summaryStatistics();
            throw new Error("Java 8+ API desugaring (library desugaring) cannot convert to java.util.IntSummaryStatistics");
        }

        public final /* synthetic */ java.util.stream.IntStream takeWhile(IntPredicate intPredicate) {
            return convert(IntStream.this.a());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ int[] toArray() {
            return IntStream.this.toArray();
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ BaseStream unordered() {
            return C5461g.k(IntStream.this.unordered());
        }
    }

    IntStream a();

    F asDoubleStream();

    InterfaceC5497n0 asLongStream();

    j$.util.A average();

    IntStream b();

    Stream boxed();

    IntStream c();

    Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer);

    long count();

    IntStream d();

    IntStream distinct();

    F f();

    j$.util.B findAny();

    j$.util.B findFirst();

    void forEach(IntConsumer intConsumer);

    void forEachOrdered(IntConsumer intConsumer);

    boolean g();

    @Override // j$.util.stream.InterfaceC5466h, j$.util.stream.F
    j$.util.K iterator();

    IntStream limit(long j);

    InterfaceC5497n0 m();

    Stream mapToObj(IntFunction intFunction);

    j$.util.B max();

    j$.util.B min();

    @Override // j$.util.stream.InterfaceC5466h, j$.util.stream.F
    IntStream parallel();

    IntStream peek(IntConsumer intConsumer);

    IntStream q(Q0 q0);

    int reduce(int i, IntBinaryOperator intBinaryOperator);

    j$.util.B reduce(IntBinaryOperator intBinaryOperator);

    boolean s();

    @Override // j$.util.stream.InterfaceC5466h, j$.util.stream.F
    IntStream sequential();

    IntStream skip(long j);

    IntStream sorted();

    @Override // j$.util.stream.InterfaceC5466h
    j$.util.X spliterator();

    int sum();

    C5564x summaryStatistics();

    int[] toArray();

    boolean v();
}
