package j$.util.stream;

import java.util.function.LongPredicate;

/* loaded from: classes2.dex */
final class W3 extends AbstractC5484k2 implements d4 {
    final /* synthetic */ X3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    W3(X3 x3, InterfaceC5509p2 interfaceC5509p2, boolean z) {
        super(interfaceC5509p2);
        this.b = x3;
    }

    @Override // j$.util.stream.InterfaceC5504o2, java.util.function.LongConsumer
    public final void accept(long j) {
        this.b.getClass();
        LongPredicate longPredicate = null;
        longPredicate.test(j);
        throw null;
    }

    @Override // j$.util.stream.d4
    public final long f() {
        return 0L;
    }
}
