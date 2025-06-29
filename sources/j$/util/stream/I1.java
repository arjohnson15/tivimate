package j$.util.stream;

import java.util.function.DoubleBinaryOperator;

/* loaded from: classes2.dex */
final class I1 extends AbstractC5551y0 {
    final /* synthetic */ DoubleBinaryOperator h;
    final /* synthetic */ double i;

    I1(EnumC5455e3 enumC5455e3, DoubleBinaryOperator doubleBinaryOperator, double d) {
        this.h = doubleBinaryOperator;
        this.i = d;
    }

    @Override // j$.util.stream.AbstractC5551y0
    public final U1 e0() {
        return new D1(this.i, this.h);
    }
}
