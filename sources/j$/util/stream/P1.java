package j$.util.stream;

import java.util.function.IntBinaryOperator;

/* loaded from: classes2.dex */
final class P1 extends AbstractC5551y0 {
    final /* synthetic */ IntBinaryOperator h;
    final /* synthetic */ int i;

    P1(EnumC5455e3 enumC5455e3, IntBinaryOperator intBinaryOperator, int i) {
        this.h = intBinaryOperator;
        this.i = i;
    }

    @Override // j$.util.stream.AbstractC5551y0
    public final U1 e0() {
        return new O1(this.i, this.h);
    }
}
