package j$.util.stream;

import j$.util.Objects;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.g0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5462g0 extends AbstractC5484k2 {
    boolean b;
    C5447d0 c;
    final /* synthetic */ C5467h0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5462g0(C5467h0 c5467h0, InterfaceC5509p2 interfaceC5509p2) {
        super(interfaceC5509p2);
        this.d = c5467h0;
        InterfaceC5509p2 interfaceC5509p22 = this.a;
        Objects.requireNonNull(interfaceC5509p22);
        this.c = new C5447d0(interfaceC5509p22);
    }

    @Override // j$.util.stream.InterfaceC5504o2, java.util.function.LongConsumer
    public final void accept(long j) throws Exception {
        InterfaceC5497n0 interfaceC5497n0 = (InterfaceC5497n0) ((C5431a) this.d.n).apply(j);
        if (interfaceC5497n0 != null) {
            try {
                boolean z = this.b;
                C5447d0 c5447d0 = this.c;
                if (z) {
                    j$.util.a0 a0VarSpliterator = interfaceC5497n0.sequential().spliterator();
                    while (!this.a.n() && a0VarSpliterator.tryAdvance((LongConsumer) c5447d0)) {
                    }
                } else {
                    interfaceC5497n0.sequential().forEach(c5447d0);
                }
            } catch (Throwable th) {
                try {
                    interfaceC5497n0.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (interfaceC5497n0 != null) {
            interfaceC5497n0.close();
        }
    }

    @Override // j$.util.stream.AbstractC5484k2, j$.util.stream.InterfaceC5509p2
    public final void l(long j) {
        this.a.l(-1L);
    }

    @Override // j$.util.stream.AbstractC5484k2, j$.util.stream.InterfaceC5509p2
    public final boolean n() {
        this.b = true;
        return this.a.n();
    }
}
