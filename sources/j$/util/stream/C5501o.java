package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.IntFunction;

/* renamed from: j$.util.stream.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5501o extends AbstractC5464g2 {
    static O0 Y(AbstractC5436b abstractC5436b, Spliterator spliterator) {
        C5511q c5511q = new C5511q(19);
        C5511q c5511q2 = new C5511q(20);
        C5511q c5511q3 = new C5511q(21);
        Objects.requireNonNull(c5511q);
        Objects.requireNonNull(c5511q2);
        Objects.requireNonNull(c5511q3);
        return new O0((Collection) new E1(EnumC5455e3.REFERENCE, c5511q3, c5511q2, c5511q, 3).c(abstractC5436b, spliterator));
    }

    @Override // j$.util.stream.AbstractC5436b
    final K0 O(AbstractC5436b abstractC5436b, Spliterator spliterator, IntFunction intFunction) {
        if (EnumC5450d3.DISTINCT.s(abstractC5436b.K())) {
            return abstractC5436b.C(spliterator, false, intFunction);
        }
        if (EnumC5450d3.ORDERED.s(abstractC5436b.K())) {
            return Y(abstractC5436b, spliterator);
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        C5507p0 c5507p0 = new C5507p0(2, atomicBoolean, concurrentHashMap);
        Objects.requireNonNull(c5507p0);
        new Q(c5507p0, false).e(abstractC5436b, spliterator);
        Collection collectionKeySet = concurrentHashMap.keySet();
        if (atomicBoolean.get()) {
            HashSet hashSet = new HashSet(collectionKeySet);
            hashSet.add(null);
            collectionKeySet = hashSet;
        }
        return new O0(collectionKeySet);
    }

    @Override // j$.util.stream.AbstractC5436b
    final Spliterator P(AbstractC5436b abstractC5436b, Spliterator spliterator) {
        return EnumC5450d3.DISTINCT.s(abstractC5436b.K()) ? abstractC5436b.X(spliterator) : EnumC5450d3.ORDERED.s(abstractC5436b.K()) ? Y(abstractC5436b, spliterator).spliterator() : new C5495m3(abstractC5436b.X(spliterator));
    }

    @Override // j$.util.stream.AbstractC5436b
    final InterfaceC5509p2 R(int i, InterfaceC5509p2 interfaceC5509p2) {
        Objects.requireNonNull(interfaceC5509p2);
        return EnumC5450d3.DISTINCT.s(i) ? interfaceC5509p2 : EnumC5450d3.SORTED.s(i) ? new C5491m(interfaceC5509p2) : new C5496n(interfaceC5509p2);
    }
}
