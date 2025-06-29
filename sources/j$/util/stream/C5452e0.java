package j$.util.stream;

import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;

/* renamed from: j$.util.stream.e0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5452e0 extends AbstractC5484k2 {
    public final /* synthetic */ int b;
    final /* synthetic */ AbstractC5436b c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5452e0(AbstractC5436b abstractC5436b, InterfaceC5509p2 interfaceC5509p2, int i) {
        super(interfaceC5509p2);
        this.b = i;
        this.c = abstractC5436b;
    }

    @Override // j$.util.stream.InterfaceC5504o2, java.util.function.LongConsumer
    public final void accept(long j) {
        switch (this.b) {
            case 0:
                this.a.accept((InterfaceC5509p2) ((LongFunction) ((C5530u) this.c).n).apply(j));
                return;
            case 1:
                ((C5545x) this.c).getClass();
                LongUnaryOperator longUnaryOperator = null;
                longUnaryOperator.applyAsLong(j);
                throw null;
            case 2:
                ((C5540w) this.c).getClass();
                LongToIntFunction longToIntFunction = null;
                longToIntFunction.applyAsInt(j);
                throw null;
            case 3:
                ((C5535v) this.c).getClass();
                LongToDoubleFunction longToDoubleFunction = null;
                longToDoubleFunction.applyAsDouble(j);
                throw null;
            case 4:
                ((C5545x) this.c).getClass();
                LongPredicate longPredicate = null;
                longPredicate.test(j);
                throw null;
            default:
                ((LongConsumer) ((C5467h0) this.c).n).accept(j);
                this.a.accept(j);
                return;
        }
    }

    @Override // j$.util.stream.AbstractC5484k2, j$.util.stream.InterfaceC5509p2
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
