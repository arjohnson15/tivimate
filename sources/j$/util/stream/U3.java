package j$.util.stream;

import java.util.function.LongPredicate;

/* loaded from: classes2.dex */
final class U3 extends AbstractC5484k2 {
    boolean b;
    final /* synthetic */ V3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    U3(V3 v3, InterfaceC5509p2 interfaceC5509p2) {
        super(interfaceC5509p2);
        this.c = v3;
        this.b = true;
    }

    @Override // j$.util.stream.InterfaceC5504o2, java.util.function.LongConsumer
    public final void accept(long j) {
        if (this.b) {
            this.c.getClass();
            LongPredicate longPredicate = null;
            longPredicate.test(j);
            throw null;
        }
    }

    @Override // j$.util.stream.AbstractC5484k2, j$.util.stream.InterfaceC5509p2
    public final void l(long j) {
        this.a.l(-1L);
    }

    @Override // j$.util.stream.AbstractC5484k2, j$.util.stream.InterfaceC5509p2
    public final boolean n() {
        return !this.b || this.a.n();
    }
}
