package j$.util.stream;

import j$.util.C5418f;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Collector;

/* loaded from: classes2.dex */
final class L1 extends AbstractC5551y0 {
    final /* synthetic */ BinaryOperator h;
    final /* synthetic */ BiConsumer i;
    final /* synthetic */ Supplier j;
    final /* synthetic */ C5476j k;

    L1(EnumC5455e3 enumC5455e3, BinaryOperator binaryOperator, BiConsumer biConsumer, Supplier supplier, C5476j c5476j) {
        this.h = binaryOperator;
        this.i = biConsumer;
        this.j = supplier;
        this.k = c5476j;
    }

    @Override // j$.util.stream.AbstractC5551y0, j$.util.stream.J3
    public final int d() {
        Set<Collector.Characteristics> setCharacteristics = this.k.a.characteristics();
        if (setCharacteristics != null && !setCharacteristics.isEmpty()) {
            HashSet hashSet = new HashSet();
            Collector.Characteristics next = setCharacteristics.iterator().next();
            if (next instanceof EnumC5471i) {
                Iterator<Collector.Characteristics> it = setCharacteristics.iterator();
                while (it.hasNext()) {
                    try {
                        EnumC5471i enumC5471i = (EnumC5471i) it.next();
                        hashSet.add(enumC5471i == null ? null : enumC5471i == EnumC5471i.CONCURRENT ? Collector.Characteristics.CONCURRENT : enumC5471i == EnumC5471i.UNORDERED ? Collector.Characteristics.UNORDERED : Collector.Characteristics.IDENTITY_FINISH);
                    } catch (ClassCastException e) {
                        C5418f.a("java.util.stream.Collector.Characteristics", e);
                        throw null;
                    }
                }
            } else {
                if (!(next instanceof Collector.Characteristics)) {
                    C5418f.a("java.util.stream.Collector.Characteristics", next.getClass());
                    throw null;
                }
                Iterator<Collector.Characteristics> it2 = setCharacteristics.iterator();
                while (it2.hasNext()) {
                    try {
                        Collector.Characteristics next2 = it2.next();
                        hashSet.add(next2 == null ? null : next2 == Collector.Characteristics.CONCURRENT ? EnumC5471i.CONCURRENT : next2 == Collector.Characteristics.UNORDERED ? EnumC5471i.UNORDERED : EnumC5471i.IDENTITY_FINISH);
                    } catch (ClassCastException e2) {
                        C5418f.a("java.util.stream.Collector.Characteristics", e2);
                        throw null;
                    }
                }
            }
            setCharacteristics = hashSet;
        }
        if (setCharacteristics.contains(EnumC5471i.UNORDERED)) {
            return EnumC5450d3.r;
        }
        return 0;
    }

    @Override // j$.util.stream.AbstractC5551y0
    public final U1 e0() {
        return new M1(this.j, this.i, this.h);
    }
}
