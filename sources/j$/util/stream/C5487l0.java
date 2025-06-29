package j$.util.stream;

import j$.util.AbstractC5414b;
import j$.util.C5566z;
import j$.util.Spliterator;
import j$.util.stream.IntStream;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
import java.util.stream.LongStream;

/* renamed from: j$.util.stream.l0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C5487l0 implements InterfaceC5497n0 {
    public final /* synthetic */ LongStream a;

    private /* synthetic */ C5487l0(LongStream longStream) {
        this.a = longStream;
    }

    public static /* synthetic */ InterfaceC5497n0 k(LongStream longStream) {
        if (longStream == null) {
            return null;
        }
        return longStream instanceof C5492m0 ? ((C5492m0) longStream).a : new C5487l0(longStream);
    }

    @Override // j$.util.stream.InterfaceC5497n0
    public final /* synthetic */ InterfaceC5497n0 a() {
        return k(this.a.takeWhile(null));
    }

    @Override // j$.util.stream.InterfaceC5497n0
    public final /* synthetic */ F asDoubleStream() {
        return D.k(this.a.asDoubleStream());
    }

    @Override // j$.util.stream.InterfaceC5497n0
    public final /* synthetic */ j$.util.A average() {
        return AbstractC5414b.j(this.a.average());
    }

    @Override // j$.util.stream.InterfaceC5497n0
    public final /* synthetic */ InterfaceC5497n0 b() {
        return k(this.a.filter(null));
    }

    @Override // j$.util.stream.InterfaceC5497n0
    public final /* synthetic */ Stream boxed() {
        return C5435a3.k(this.a.boxed());
    }

    @Override // j$.util.stream.InterfaceC5497n0
    public final /* synthetic */ InterfaceC5497n0 c() {
        return k(this.a.dropWhile(null));
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    @Override // j$.util.stream.InterfaceC5497n0
    public final /* synthetic */ Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        return this.a.collect(supplier, objLongConsumer, biConsumer);
    }

    @Override // j$.util.stream.InterfaceC5497n0
    public final /* synthetic */ long count() {
        return this.a.count();
    }

    @Override // j$.util.stream.InterfaceC5497n0
    public final /* synthetic */ InterfaceC5497n0 d() {
        return k(this.a.map(null));
    }

    @Override // j$.util.stream.InterfaceC5497n0
    public final /* synthetic */ InterfaceC5497n0 distinct() {
        return k(this.a.distinct());
    }

    @Override // j$.util.stream.InterfaceC5497n0
    public final InterfaceC5497n0 e(C5431a c5431a) {
        LongStream longStream = this.a;
        C5431a c5431a2 = new C5431a(9);
        c5431a2.b = c5431a;
        return k(longStream.flatMap(c5431a2));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        LongStream longStream = this.a;
        if (obj instanceof C5487l0) {
            obj = ((C5487l0) obj).a;
        }
        return longStream.equals(obj);
    }

    @Override // j$.util.stream.InterfaceC5497n0
    public final /* synthetic */ j$.util.C findAny() {
        return AbstractC5414b.l(this.a.findAny());
    }

    @Override // j$.util.stream.InterfaceC5497n0
    public final /* synthetic */ j$.util.C findFirst() {
        return AbstractC5414b.l(this.a.findFirst());
    }

    @Override // j$.util.stream.InterfaceC5497n0
    public final /* synthetic */ void forEach(LongConsumer longConsumer) {
        this.a.forEach(longConsumer);
    }

    @Override // j$.util.stream.InterfaceC5497n0
    public final /* synthetic */ void forEachOrdered(LongConsumer longConsumer) {
        this.a.forEachOrdered(longConsumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.stream.InterfaceC5466h
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfLong] */
    @Override // j$.util.stream.InterfaceC5497n0, j$.util.stream.InterfaceC5466h, j$.util.stream.F
    public final /* synthetic */ j$.util.O iterator() {
        return j$.util.M.a(this.a.iterator());
    }

    @Override // j$.util.stream.InterfaceC5466h, j$.util.stream.F
    public final /* synthetic */ Iterator iterator() {
        return this.a.iterator();
    }

    @Override // j$.util.stream.InterfaceC5497n0
    public final /* synthetic */ F l() {
        return D.k(this.a.mapToDouble(null));
    }

    @Override // j$.util.stream.InterfaceC5497n0
    public final /* synthetic */ InterfaceC5497n0 limit(long j) {
        return k(this.a.limit(j));
    }

    @Override // j$.util.stream.InterfaceC5497n0
    public final /* synthetic */ Stream mapToObj(LongFunction longFunction) {
        return C5435a3.k(this.a.mapToObj(longFunction));
    }

    @Override // j$.util.stream.InterfaceC5497n0
    public final /* synthetic */ j$.util.C max() {
        return AbstractC5414b.l(this.a.max());
    }

    @Override // j$.util.stream.InterfaceC5497n0
    public final /* synthetic */ j$.util.C min() {
        return AbstractC5414b.l(this.a.min());
    }

    @Override // j$.util.stream.InterfaceC5497n0
    public final /* synthetic */ boolean n() {
        return this.a.noneMatch(null);
    }

    @Override // j$.util.stream.InterfaceC5466h
    public final /* synthetic */ InterfaceC5466h onClose(Runnable runnable) {
        return C5456f.k(this.a.onClose(runnable));
    }

    @Override // j$.util.stream.InterfaceC5466h, j$.util.stream.F
    public final /* synthetic */ InterfaceC5466h parallel() {
        return C5456f.k(this.a.parallel());
    }

    @Override // j$.util.stream.InterfaceC5497n0, j$.util.stream.InterfaceC5466h, j$.util.stream.F
    public final /* synthetic */ InterfaceC5497n0 parallel() {
        return k(this.a.parallel());
    }

    @Override // j$.util.stream.InterfaceC5497n0
    public final /* synthetic */ InterfaceC5497n0 peek(LongConsumer longConsumer) {
        return k(this.a.peek(longConsumer));
    }

    @Override // j$.util.stream.InterfaceC5497n0
    public final /* synthetic */ boolean r() {
        return this.a.allMatch(null);
    }

    @Override // j$.util.stream.InterfaceC5497n0
    public final /* synthetic */ long reduce(long j, LongBinaryOperator longBinaryOperator) {
        return this.a.reduce(j, longBinaryOperator);
    }

    @Override // j$.util.stream.InterfaceC5497n0
    public final /* synthetic */ j$.util.C reduce(LongBinaryOperator longBinaryOperator) {
        return AbstractC5414b.l(this.a.reduce(longBinaryOperator));
    }

    @Override // j$.util.stream.InterfaceC5466h, j$.util.stream.F
    public final /* synthetic */ InterfaceC5466h sequential() {
        return C5456f.k(this.a.sequential());
    }

    @Override // j$.util.stream.InterfaceC5497n0, j$.util.stream.InterfaceC5466h, j$.util.stream.F
    public final /* synthetic */ InterfaceC5497n0 sequential() {
        return k(this.a.sequential());
    }

    @Override // j$.util.stream.InterfaceC5497n0
    public final /* synthetic */ InterfaceC5497n0 skip(long j) {
        return k(this.a.skip(j));
    }

    @Override // j$.util.stream.InterfaceC5497n0
    public final /* synthetic */ InterfaceC5497n0 sorted() {
        return k(this.a.sorted());
    }

    @Override // j$.util.stream.InterfaceC5466h
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.e0.a(this.a.spliterator());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfLong] */
    @Override // j$.util.stream.InterfaceC5497n0, j$.util.stream.InterfaceC5466h
    public final /* synthetic */ j$.util.a0 spliterator() {
        return j$.util.Y.a(this.a.spliterator());
    }

    @Override // j$.util.stream.InterfaceC5497n0
    public final /* synthetic */ long sum() {
        return this.a.sum();
    }

    @Override // j$.util.stream.InterfaceC5497n0
    public final C5566z summaryStatistics() {
        this.a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.LongSummaryStatistics");
    }

    @Override // j$.util.stream.InterfaceC5497n0
    public final /* synthetic */ long[] toArray() {
        return this.a.toArray();
    }

    @Override // j$.util.stream.InterfaceC5466h
    public final /* synthetic */ InterfaceC5466h unordered() {
        return C5456f.k(this.a.unordered());
    }

    @Override // j$.util.stream.InterfaceC5497n0
    public final /* synthetic */ boolean w() {
        return this.a.anyMatch(null);
    }

    @Override // j$.util.stream.InterfaceC5497n0
    public final /* synthetic */ IntStream x() {
        return IntStream.VivifiedWrapper.convert(this.a.mapToInt(null));
    }
}
