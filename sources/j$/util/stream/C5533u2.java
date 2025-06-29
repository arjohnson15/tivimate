package j$.util.stream;

/* renamed from: j$.util.stream.u2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5533u2 extends AbstractC5484k2 {
    long b;
    long c;
    final /* synthetic */ C5538v2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5533u2(C5538v2 c5538v2, InterfaceC5509p2 interfaceC5509p2) {
        super(interfaceC5509p2);
        this.d = c5538v2;
        this.b = c5538v2.m;
        long j = c5538v2.n;
        this.c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // j$.util.stream.InterfaceC5504o2, java.util.function.LongConsumer
    public final void accept(long j) {
        long j2 = this.b;
        if (j2 != 0) {
            this.b = j2 - 1;
            return;
        }
        long j3 = this.c;
        if (j3 > 0) {
            this.c = j3 - 1;
            this.a.accept(j);
        }
    }

    @Override // j$.util.stream.AbstractC5484k2, j$.util.stream.InterfaceC5509p2
    public final void l(long j) {
        this.a.l(AbstractC5551y0.A(j, this.d.m, this.c));
    }

    @Override // j$.util.stream.AbstractC5484k2, j$.util.stream.InterfaceC5509p2
    public final boolean n() {
        return this.c == 0 || this.a.n();
    }
}
