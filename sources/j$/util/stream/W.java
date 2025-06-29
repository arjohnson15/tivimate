package j$.util.stream;

import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;

/* loaded from: classes2.dex */
final class W extends AbstractC5479j2 {
    public final /* synthetic */ int b;
    final /* synthetic */ AbstractC5436b c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ W(AbstractC5436b abstractC5436b, InterfaceC5509p2 interfaceC5509p2, int i) {
        super(interfaceC5509p2);
        this.b = i;
        this.c = abstractC5436b;
    }

    @Override // j$.util.stream.InterfaceC5499n2, j$.util.stream.InterfaceC5509p2
    public final void accept(int i) {
        switch (this.b) {
            case 0:
                this.a.accept((InterfaceC5509p2) ((IntFunction) ((C5530u) this.c).n).apply(i));
                return;
            case 1:
                ((IntConsumer) ((X) this.c).n).accept(i);
                this.a.accept(i);
                return;
            case 2:
                ((C5540w) this.c).getClass();
                IntUnaryOperator intUnaryOperator = null;
                intUnaryOperator.applyAsInt(i);
                throw null;
            case 3:
                ((C5545x) this.c).getClass();
                IntToLongFunction intToLongFunction = null;
                intToLongFunction.applyAsLong(i);
                throw null;
            case 4:
                ((C5535v) this.c).getClass();
                IntToDoubleFunction intToDoubleFunction = null;
                intToDoubleFunction.applyAsDouble(i);
                throw null;
            default:
                ((C5540w) this.c).getClass();
                IntPredicate intPredicate = null;
                intPredicate.test(i);
                throw null;
        }
    }

    @Override // j$.util.stream.AbstractC5479j2, j$.util.stream.InterfaceC5509p2
    public void l(long j) {
        switch (this.b) {
            case 5:
                this.a.l(-1L);
                break;
            default:
                super.l(j);
                break;
        }
    }
}
