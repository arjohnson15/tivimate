package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
final class T3 extends AbstractC5437b0 implements c4 {
    @Override // j$.util.stream.AbstractC5436b
    final K0 O(AbstractC5436b abstractC5436b, Spliterator spliterator, IntFunction intFunction) {
        return (K0) new e4(this, abstractC5436b, spliterator, intFunction).invoke();
    }

    @Override // j$.util.stream.AbstractC5436b
    final Spliterator P(AbstractC5436b abstractC5436b, Spliterator spliterator) {
        return EnumC5450d3.ORDERED.s(abstractC5436b.K()) ? O(abstractC5436b, spliterator, new C5444c2(7)).spliterator() : new h4((j$.util.X) abstractC5436b.X(spliterator), 0);
    }

    @Override // j$.util.stream.AbstractC5436b
    final InterfaceC5509p2 R(int i, InterfaceC5509p2 interfaceC5509p2) {
        return new S3(this, interfaceC5509p2, false);
    }

    @Override // j$.util.stream.c4
    public final d4 k(C0 c0, boolean z) {
        return new S3(this, c0, z);
    }
}
