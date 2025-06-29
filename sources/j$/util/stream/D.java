package j$.util.stream;

import j$.util.AbstractC5414b;
import j$.util.C5563w;
import j$.util.Spliterator;
import j$.util.stream.IntStream;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;

/* loaded from: classes2.dex */
public final /* synthetic */ class D implements F {
    public final /* synthetic */ DoubleStream a;

    private /* synthetic */ D(DoubleStream doubleStream) {
        this.a = doubleStream;
    }

    public static /* synthetic */ F k(DoubleStream doubleStream) {
        if (doubleStream == null) {
            return null;
        }
        return doubleStream instanceof E ? ((E) doubleStream).a : new D(doubleStream);
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ F a() {
        return k(this.a.takeWhile(null));
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ j$.util.A average() {
        return AbstractC5414b.j(this.a.average());
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ F b() {
        return k(this.a.filter(null));
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ Stream boxed() {
        return C5435a3.k(this.a.boxed());
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ F c() {
        return k(this.a.dropWhile(null));
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        return this.a.collect(supplier, objDoubleConsumer, biConsumer);
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ long count() {
        return this.a.count();
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ F d() {
        return k(this.a.map(null));
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ F distinct() {
        return k(this.a.distinct());
    }

    @Override // j$.util.stream.F
    public final F e(C5431a c5431a) {
        DoubleStream doubleStream = this.a;
        C5431a c5431a2 = new C5431a(7);
        c5431a2.b = c5431a;
        return k(doubleStream.flatMap(c5431a2));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DoubleStream doubleStream = this.a;
        if (obj instanceof D) {
            obj = ((D) obj).a;
        }
        return doubleStream.equals(obj);
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ j$.util.A findAny() {
        return AbstractC5414b.j(this.a.findAny());
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ j$.util.A findFirst() {
        return AbstractC5414b.j(this.a.findFirst());
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ void forEach(DoubleConsumer doubleConsumer) {
        this.a.forEach(doubleConsumer);
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ void forEachOrdered(DoubleConsumer doubleConsumer) {
        this.a.forEachOrdered(doubleConsumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ boolean i() {
        return this.a.allMatch(null);
    }

    @Override // j$.util.stream.InterfaceC5466h
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfDouble] */
    @Override // j$.util.stream.F
    public final /* synthetic */ j$.util.G iterator() {
        return j$.util.E.a(this.a.iterator());
    }

    @Override // j$.util.stream.InterfaceC5466h, j$.util.stream.F
    public final /* synthetic */ Iterator iterator() {
        return this.a.iterator();
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ InterfaceC5497n0 j() {
        return C5487l0.k(this.a.mapToLong(null));
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ F limit(long j) {
        return k(this.a.limit(j));
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ Stream mapToObj(DoubleFunction doubleFunction) {
        return C5435a3.k(this.a.mapToObj(doubleFunction));
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ j$.util.A max() {
        return AbstractC5414b.j(this.a.max());
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ j$.util.A min() {
        return AbstractC5414b.j(this.a.min());
    }

    @Override // j$.util.stream.InterfaceC5466h
    public final /* synthetic */ InterfaceC5466h onClose(Runnable runnable) {
        return C5456f.k(this.a.onClose(runnable));
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ boolean p() {
        return this.a.anyMatch(null);
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ F parallel() {
        return k(this.a.parallel());
    }

    @Override // j$.util.stream.InterfaceC5466h, j$.util.stream.F
    public final /* synthetic */ InterfaceC5466h parallel() {
        return C5456f.k(this.a.parallel());
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ F peek(DoubleConsumer doubleConsumer) {
        return k(this.a.peek(doubleConsumer));
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ double reduce(double d, DoubleBinaryOperator doubleBinaryOperator) {
        return this.a.reduce(d, doubleBinaryOperator);
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ j$.util.A reduce(DoubleBinaryOperator doubleBinaryOperator) {
        return AbstractC5414b.j(this.a.reduce(doubleBinaryOperator));
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ F sequential() {
        return k(this.a.sequential());
    }

    @Override // j$.util.stream.InterfaceC5466h, j$.util.stream.F
    public final /* synthetic */ InterfaceC5466h sequential() {
        return C5456f.k(this.a.sequential());
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ F skip(long j) {
        return k(this.a.skip(j));
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ F sorted() {
        return k(this.a.sorted());
    }

    @Override // j$.util.stream.InterfaceC5466h
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.e0.a(this.a.spliterator());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfDouble] */
    @Override // j$.util.stream.F, j$.util.stream.InterfaceC5466h
    public final /* synthetic */ j$.util.U spliterator() {
        return j$.util.S.a(this.a.spliterator());
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ double sum() {
        return this.a.sum();
    }

    @Override // j$.util.stream.F
    public final C5563w summaryStatistics() {
        this.a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.DoubleSummaryStatistics");
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ double[] toArray() {
        return this.a.toArray();
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ IntStream u() {
        return IntStream.VivifiedWrapper.convert(this.a.mapToInt(null));
    }

    @Override // j$.util.stream.InterfaceC5466h
    public final /* synthetic */ InterfaceC5466h unordered() {
        return C5456f.k(this.a.unordered());
    }

    @Override // j$.util.stream.F
    public final /* synthetic */ boolean y() {
        return this.a.noneMatch(null);
    }
}
