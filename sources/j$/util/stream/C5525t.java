package j$.util.stream;

import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;

/* renamed from: j$.util.stream.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5525t extends AbstractC5474i2 {
    public final /* synthetic */ int b;
    final /* synthetic */ AbstractC5436b c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5525t(AbstractC5436b abstractC5436b, InterfaceC5509p2 interfaceC5509p2, int i) {
        super(interfaceC5509p2);
        this.b = i;
        this.c = abstractC5436b;
    }

    @Override // j$.util.stream.InterfaceC5494m2, j$.util.stream.InterfaceC5509p2
    public final void accept(double d) {
        switch (this.b) {
            case 0:
                this.a.accept((InterfaceC5509p2) ((DoubleFunction) ((C5530u) this.c).n).apply(d));
                return;
            case 1:
                ((C5535v) this.c).getClass();
                DoubleUnaryOperator doubleUnaryOperator = null;
                doubleUnaryOperator.applyAsDouble(d);
                throw null;
            case 2:
                ((C5540w) this.c).getClass();
                DoubleToIntFunction doubleToIntFunction = null;
                doubleToIntFunction.applyAsInt(d);
                throw null;
            case 3:
                ((C5545x) this.c).getClass();
                DoubleToLongFunction doubleToLongFunction = null;
                doubleToLongFunction.applyAsLong(d);
                throw null;
            case 4:
                ((C5535v) this.c).getClass();
                DoublePredicate doublePredicate = null;
                doublePredicate.test(d);
                throw null;
            default:
                ((DoubleConsumer) ((C5555z) this.c).n).accept(d);
                this.a.accept(d);
                return;
        }
    }

    @Override // j$.util.stream.AbstractC5474i2, j$.util.stream.InterfaceC5509p2
    public void l(long j) {
        switch (this.b) {
            case 4:
                this.a.l(-1L);
                break;
            default:
                super.l(j);
                break;
        }
    }
}
