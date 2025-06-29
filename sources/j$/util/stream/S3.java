package j$.util.stream;

import java.util.function.IntPredicate;

/* loaded from: classes2.dex */
final class S3 extends AbstractC5479j2 implements d4 {
    final /* synthetic */ T3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    S3(T3 t3, InterfaceC5509p2 interfaceC5509p2, boolean z) {
        super(interfaceC5509p2);
        this.b = t3;
    }

    @Override // j$.util.stream.InterfaceC5499n2, j$.util.stream.InterfaceC5509p2
    public final void accept(int i) {
        this.b.getClass();
        IntPredicate intPredicate = null;
        intPredicate.test(i);
        throw null;
    }

    @Override // j$.util.stream.d4
    public final long f() {
        return 0L;
    }
}
