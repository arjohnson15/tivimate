package j$.util.stream;

import j$.util.Objects;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5550y extends AbstractC5474i2 {
    boolean b;
    C5506p c;
    final /* synthetic */ C5555z d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5550y(C5555z c5555z, InterfaceC5509p2 interfaceC5509p2) {
        super(interfaceC5509p2);
        this.d = c5555z;
        InterfaceC5509p2 interfaceC5509p22 = this.a;
        Objects.requireNonNull(interfaceC5509p22);
        this.c = new C5506p(interfaceC5509p22);
    }

    @Override // j$.util.stream.InterfaceC5494m2, j$.util.stream.InterfaceC5509p2
    public final void accept(double d) throws Exception {
        F f = (F) ((C5431a) this.d.n).apply(d);
        if (f != null) {
            try {
                boolean z = this.b;
                C5506p c5506p = this.c;
                if (z) {
                    j$.util.U uSpliterator = f.sequential().spliterator();
                    while (!this.a.n() && uSpliterator.tryAdvance((DoubleConsumer) c5506p)) {
                    }
                } else {
                    f.sequential().forEach(c5506p);
                }
            } catch (Throwable th) {
                try {
                    f.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (f != null) {
            f.close();
        }
    }

    @Override // j$.util.stream.AbstractC5474i2, j$.util.stream.InterfaceC5509p2
    public final void l(long j) {
        this.a.l(-1L);
    }

    @Override // j$.util.stream.AbstractC5474i2, j$.util.stream.InterfaceC5509p2
    public final boolean n() {
        this.b = true;
        return this.a.n();
    }
}
