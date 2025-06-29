package j$.util.stream;

import j$.util.Comparator;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
final class K2 extends AbstractC5464g2 {
    private final boolean m;
    private final Comparator n;

    K2(AbstractC5469h2 abstractC5469h2) {
        super(abstractC5469h2, EnumC5450d3.q | EnumC5450d3.o, 0);
        this.m = true;
        this.n = Comparator.CC.a();
    }

    K2(AbstractC5469h2 abstractC5469h2, java.util.Comparator comparator) {
        super(abstractC5469h2, EnumC5450d3.q | EnumC5450d3.p, 0);
        this.m = false;
        this.n = (java.util.Comparator) Objects.requireNonNull(comparator);
    }

    @Override // j$.util.stream.AbstractC5436b
    public final K0 O(AbstractC5436b abstractC5436b, Spliterator spliterator, IntFunction intFunction) {
        if (EnumC5450d3.SORTED.s(abstractC5436b.K()) && this.m) {
            return abstractC5436b.C(spliterator, false, intFunction);
        }
        Object[] objArrO = abstractC5436b.C(spliterator, true, intFunction).o(intFunction);
        Arrays.sort(objArrO, this.n);
        return new N0(objArrO);
    }

    @Override // j$.util.stream.AbstractC5436b
    public final InterfaceC5509p2 R(int i, InterfaceC5509p2 interfaceC5509p2) {
        Objects.requireNonNull(interfaceC5509p2);
        if (EnumC5450d3.SORTED.s(i) && this.m) {
            return interfaceC5509p2;
        }
        boolean zS = EnumC5450d3.SIZED.s(i);
        java.util.Comparator comparator = this.n;
        return zS ? new P2(interfaceC5509p2, comparator) : new L2(interfaceC5509p2, comparator);
    }
}
