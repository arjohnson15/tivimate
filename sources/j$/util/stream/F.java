package j$.util.stream;

import j$.util.C5563w;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public interface F extends InterfaceC5466h {
    F a();

    j$.util.A average();

    F b();

    Stream boxed();

    F c();

    Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer);

    long count();

    F d();

    F distinct();

    F e(C5431a c5431a);

    j$.util.A findAny();

    j$.util.A findFirst();

    void forEach(DoubleConsumer doubleConsumer);

    void forEachOrdered(DoubleConsumer doubleConsumer);

    boolean i();

    j$.util.G iterator();

    InterfaceC5497n0 j();

    F limit(long j);

    Stream mapToObj(DoubleFunction doubleFunction);

    j$.util.A max();

    j$.util.A min();

    boolean p();

    F parallel();

    F peek(DoubleConsumer doubleConsumer);

    double reduce(double d, DoubleBinaryOperator doubleBinaryOperator);

    j$.util.A reduce(DoubleBinaryOperator doubleBinaryOperator);

    F sequential();

    F skip(long j);

    F sorted();

    @Override // j$.util.stream.InterfaceC5466h
    j$.util.U spliterator();

    double sum();

    C5563w summaryStatistics();

    double[] toArray();

    IntStream u();

    boolean y();
}
