package j$.util.stream;

import java.util.function.LongBinaryOperator;

/* loaded from: classes2.dex */
final class A1 extends AbstractC5551y0 {
    final /* synthetic */ LongBinaryOperator h;
    final /* synthetic */ long i;

    A1(EnumC5455e3 enumC5455e3, LongBinaryOperator longBinaryOperator, long j) {
        this.h = longBinaryOperator;
        this.i = j;
    }

    @Override // j$.util.stream.AbstractC5551y0
    public final U1 e0() {
        return new S1(this.i, this.h);
    }
}
