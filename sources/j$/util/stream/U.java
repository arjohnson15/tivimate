package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
final class U extends CountedCompleter {
    private Spliterator a;
    private final InterfaceC5509p2 b;
    private final AbstractC5436b c;
    private long d;

    U(U u, Spliterator spliterator) {
        super(u);
        this.a = spliterator;
        this.b = u.b;
        this.d = u.d;
        this.c = u.c;
    }

    U(AbstractC5436b abstractC5436b, Spliterator spliterator, InterfaceC5509p2 interfaceC5509p2) {
        super(null);
        this.b = interfaceC5509p2;
        this.c = abstractC5436b;
        this.a = spliterator;
        this.d = 0L;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.a;
        long jEstimateSize = spliterator.estimateSize();
        long jG = this.d;
        if (jG == 0) {
            jG = AbstractC5451e.g(jEstimateSize);
            this.d = jG;
        }
        boolean zS = EnumC5450d3.SHORT_CIRCUIT.s(this.c.K());
        InterfaceC5509p2 interfaceC5509p2 = this.b;
        boolean z = false;
        U u = this;
        while (true) {
            if (zS && interfaceC5509p2.n()) {
                break;
            }
            if (jEstimateSize <= jG || (spliteratorTrySplit = spliterator.trySplit()) == null) {
                break;
            }
            U u2 = new U(u, spliteratorTrySplit);
            u.addToPendingCount(1);
            if (z) {
                spliterator = spliteratorTrySplit;
            } else {
                U u3 = u;
                u = u2;
                u2 = u3;
            }
            z = !z;
            u.fork();
            u = u2;
            jEstimateSize = spliterator.estimateSize();
        }
        u.c.A(spliterator, interfaceC5509p2);
        u.a = null;
        u.propagateCompletion();
    }
}
