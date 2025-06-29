package j$.util.stream;

import java.util.function.DoublePredicate;

/* loaded from: classes2.dex */
final class a4 extends AbstractC5474i2 implements d4 {
    final /* synthetic */ b4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a4(b4 b4Var, InterfaceC5509p2 interfaceC5509p2, boolean z) {
        super(interfaceC5509p2);
        this.b = b4Var;
    }

    @Override // j$.util.stream.InterfaceC5494m2, j$.util.stream.InterfaceC5509p2
    public final void accept(double d) {
        this.b.getClass();
        DoublePredicate doublePredicate = null;
        doublePredicate.test(d);
        throw null;
    }

    @Override // j$.util.stream.d4
    public final long f() {
        return 0L;
    }
}
