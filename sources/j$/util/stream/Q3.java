package j$.util.stream;

import java.util.function.IntPredicate;

/* loaded from: classes2.dex */
final class Q3 extends AbstractC5479j2 {
    boolean b;
    final /* synthetic */ R3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Q3(R3 r3, InterfaceC5509p2 interfaceC5509p2) {
        super(interfaceC5509p2);
        this.c = r3;
        this.b = true;
    }

    @Override // j$.util.stream.InterfaceC5499n2, j$.util.stream.InterfaceC5509p2
    public final void accept(int i) {
        if (this.b) {
            this.c.getClass();
            IntPredicate intPredicate = null;
            intPredicate.test(i);
            throw null;
        }
    }

    @Override // j$.util.stream.AbstractC5479j2, j$.util.stream.InterfaceC5509p2
    public final void l(long j) {
        this.a.l(-1L);
    }

    @Override // j$.util.stream.AbstractC5479j2, j$.util.stream.InterfaceC5509p2
    public final boolean n() {
        return !this.b || this.a.n();
    }
}
