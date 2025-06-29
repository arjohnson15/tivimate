package j$.util.stream;

/* renamed from: j$.util.stream.s2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5523s2 extends AbstractC5479j2 {
    long b;
    long c;
    final /* synthetic */ C5528t2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5523s2(C5528t2 c5528t2, InterfaceC5509p2 interfaceC5509p2) {
        super(interfaceC5509p2);
        this.d = c5528t2;
        this.b = c5528t2.m;
        long j = c5528t2.n;
        this.c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // j$.util.stream.InterfaceC5499n2, j$.util.stream.InterfaceC5509p2
    public final void accept(int i) {
        long j = this.b;
        if (j != 0) {
            this.b = j - 1;
            return;
        }
        long j2 = this.c;
        if (j2 > 0) {
            this.c = j2 - 1;
            this.a.accept(i);
        }
    }

    @Override // j$.util.stream.AbstractC5479j2, j$.util.stream.InterfaceC5509p2
    public final void l(long j) {
        this.a.l(AbstractC5551y0.A(j, this.d.m, this.c));
    }

    @Override // j$.util.stream.AbstractC5479j2, j$.util.stream.InterfaceC5509p2
    public final boolean n() {
        return this.c == 0 || this.a.n();
    }
}
