package j$.util.stream;

import j$.util.Objects;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
final class Z extends AbstractC5479j2 {
    boolean b;
    V c;
    final /* synthetic */ X d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Z(X x, InterfaceC5509p2 interfaceC5509p2) {
        super(interfaceC5509p2);
        this.d = x;
        InterfaceC5509p2 interfaceC5509p22 = this.a;
        Objects.requireNonNull(interfaceC5509p22);
        this.c = new V(interfaceC5509p22);
    }

    @Override // j$.util.stream.InterfaceC5499n2, j$.util.stream.InterfaceC5509p2
    public final void accept(int i) throws Exception {
        IntStream intStream = (IntStream) ((Q0) this.d.n).apply(i);
        if (intStream != null) {
            try {
                boolean z = this.b;
                V v = this.c;
                if (z) {
                    j$.util.X xSpliterator = intStream.sequential().spliterator();
                    while (!this.a.n() && xSpliterator.tryAdvance((IntConsumer) v)) {
                    }
                } else {
                    intStream.sequential().forEach(v);
                }
            } catch (Throwable th) {
                try {
                    intStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (intStream != null) {
            intStream.close();
        }
    }

    @Override // j$.util.stream.AbstractC5479j2, j$.util.stream.InterfaceC5509p2
    public final void l(long j) {
        this.a.l(-1L);
    }

    @Override // j$.util.stream.AbstractC5479j2, j$.util.stream.InterfaceC5509p2
    public final boolean n() {
        this.b = true;
        return this.a.n();
    }
}
