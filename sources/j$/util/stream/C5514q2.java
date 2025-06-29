package j$.util.stream;

/* renamed from: j$.util.stream.q2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5514q2 extends AbstractC5489l2 {
    long b;
    long c;
    final /* synthetic */ C5518r2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5514q2(C5518r2 c5518r2, InterfaceC5509p2 interfaceC5509p2) {
        super(interfaceC5509p2);
        this.d = c5518r2;
        this.b = c5518r2.m;
        long j = c5518r2.n;
        this.c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void p(Object obj) {
        long j = this.b;
        if (j != 0) {
            this.b = j - 1;
            return;
        }
        long j2 = this.c;
        if (j2 > 0) {
            this.c = j2 - 1;
            this.a.p((InterfaceC5509p2) obj);
        }
    }

    @Override // j$.util.stream.AbstractC5489l2, j$.util.stream.InterfaceC5509p2
    public final void l(long j) {
        this.a.l(AbstractC5551y0.A(j, this.d.m, this.c));
    }

    @Override // j$.util.stream.AbstractC5489l2, j$.util.stream.InterfaceC5509p2
    public final boolean n() {
        return this.c == 0 || this.a.n();
    }
}
