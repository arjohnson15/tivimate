package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
final class E1 extends AbstractC5551y0 {
    public final /* synthetic */ int h;
    final /* synthetic */ Object i;
    final /* synthetic */ Object j;
    final /* synthetic */ Object k;

    public /* synthetic */ E1(EnumC5455e3 enumC5455e3, Object obj, Object obj2, Object obj3, int i) {
        this.h = i;
        this.j = obj;
        this.k = obj2;
        this.i = obj3;
    }

    @Override // j$.util.stream.AbstractC5551y0
    public final U1 e0() {
        switch (this.h) {
            case 0:
                return new B1((Supplier) this.i, (ObjLongConsumer) this.k, (r) this.j);
            case 1:
                return new H1((Supplier) this.i, (ObjDoubleConsumer) this.k, (r) this.j);
            case 2:
                return new J1(this.i, (BiFunction) this.k, (BinaryOperator) this.j);
            case 3:
                return new N1((Supplier) this.i, (BiConsumer) this.k, (BiConsumer) this.j);
            default:
                return new R1((Supplier) this.i, (ObjIntConsumer) this.k, (r) this.j);
        }
    }
}
