package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* loaded from: classes2.dex */
final class P3 extends AbstractC5464g2 implements c4 {
    final /* synthetic */ Predicate m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P3(AbstractC5469h2 abstractC5469h2, int i, Predicate predicate) {
        super(abstractC5469h2, i, 0);
        this.m = predicate;
    }

    @Override // j$.util.stream.AbstractC5436b
    final K0 O(AbstractC5436b abstractC5436b, Spliterator spliterator, IntFunction intFunction) {
        return (K0) new e4(this, abstractC5436b, spliterator, intFunction).invoke();
    }

    @Override // j$.util.stream.AbstractC5436b
    final Spliterator P(AbstractC5436b abstractC5436b, Spliterator spliterator) {
        return EnumC5450d3.ORDERED.s(abstractC5436b.K()) ? O(abstractC5436b, spliterator, new C5520s(29)).spliterator() : new j4(abstractC5436b.X(spliterator), this.m, 0);
    }

    @Override // j$.util.stream.AbstractC5436b
    final InterfaceC5509p2 R(int i, InterfaceC5509p2 interfaceC5509p2) {
        return new O3(this, interfaceC5509p2, false);
    }

    @Override // j$.util.stream.c4
    public final d4 k(C0 c0, boolean z) {
        return new O3(this, c0, z);
    }
}
