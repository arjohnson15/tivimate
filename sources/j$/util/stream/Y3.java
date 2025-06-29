package j$.util.stream;

import java.util.function.DoublePredicate;

/* loaded from: classes2.dex */
final class Y3 extends AbstractC5474i2 {
    boolean b;
    final /* synthetic */ Z3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Y3(Z3 z3, InterfaceC5509p2 interfaceC5509p2) {
        super(interfaceC5509p2);
        this.c = z3;
        this.b = true;
    }

    @Override // j$.util.stream.InterfaceC5494m2, j$.util.stream.InterfaceC5509p2
    public final void accept(double d) {
        if (this.b) {
            this.c.getClass();
            DoublePredicate doublePredicate = null;
            doublePredicate.test(d);
            throw null;
        }
    }

    @Override // j$.util.stream.AbstractC5474i2, j$.util.stream.InterfaceC5509p2
    public final void l(long j) {
        this.a.l(-1L);
    }

    @Override // j$.util.stream.AbstractC5474i2, j$.util.stream.InterfaceC5509p2
    public final boolean n() {
        return !this.b || this.a.n();
    }
}
