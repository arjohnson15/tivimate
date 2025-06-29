package j$.util.stream;

import j$.util.C5566z;
import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.n0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC5497n0 extends InterfaceC5466h {
    InterfaceC5497n0 a();

    F asDoubleStream();

    j$.util.A average();

    InterfaceC5497n0 b();

    Stream boxed();

    InterfaceC5497n0 c();

    Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer);

    long count();

    InterfaceC5497n0 d();

    InterfaceC5497n0 distinct();

    InterfaceC5497n0 e(C5431a c5431a);

    j$.util.C findAny();

    j$.util.C findFirst();

    void forEach(LongConsumer longConsumer);

    void forEachOrdered(LongConsumer longConsumer);

    @Override // j$.util.stream.InterfaceC5466h, j$.util.stream.F
    j$.util.O iterator();

    F l();

    InterfaceC5497n0 limit(long j);

    Stream mapToObj(LongFunction longFunction);

    j$.util.C max();

    j$.util.C min();

    boolean n();

    @Override // j$.util.stream.InterfaceC5466h, j$.util.stream.F
    InterfaceC5497n0 parallel();

    InterfaceC5497n0 peek(LongConsumer longConsumer);

    boolean r();

    long reduce(long j, LongBinaryOperator longBinaryOperator);

    j$.util.C reduce(LongBinaryOperator longBinaryOperator);

    @Override // j$.util.stream.InterfaceC5466h, j$.util.stream.F
    InterfaceC5497n0 sequential();

    InterfaceC5497n0 skip(long j);

    InterfaceC5497n0 sorted();

    @Override // j$.util.stream.InterfaceC5466h
    j$.util.a0 spliterator();

    long sum();

    C5566z summaryStatistics();

    long[] toArray();

    boolean w();

    IntStream x();
}
