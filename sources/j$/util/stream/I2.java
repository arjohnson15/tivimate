package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
final class I2 extends AbstractC5437b0 {
    @Override // j$.util.stream.AbstractC5436b
    public final K0 O(AbstractC5436b abstractC5436b, Spliterator spliterator, IntFunction intFunction) {
        if (EnumC5450d3.SORTED.s(abstractC5436b.K())) {
            return abstractC5436b.C(spliterator, false, intFunction);
        }
        int[] iArr = (int[]) ((G0) abstractC5436b.C(spliterator, true, intFunction)).d();
        Arrays.sort(iArr);
        return new C5463g1(iArr);
    }

    @Override // j$.util.stream.AbstractC5436b
    public final InterfaceC5509p2 R(int i, InterfaceC5509p2 interfaceC5509p2) {
        Objects.requireNonNull(interfaceC5509p2);
        return EnumC5450d3.SORTED.s(i) ? interfaceC5509p2 : EnumC5450d3.SIZED.s(i) ? new N2(interfaceC5509p2) : new F2(interfaceC5509p2);
    }
}
