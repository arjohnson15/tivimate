package j$.util.stream;

import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

/* loaded from: classes2.dex */
final class C1 extends AbstractC5551y0 {
    public final /* synthetic */ int h;
    final /* synthetic */ Object i;

    public /* synthetic */ C1(EnumC5455e3 enumC5455e3, Object obj, int i) {
        this.h = i;
        this.i = obj;
    }

    @Override // j$.util.stream.AbstractC5551y0
    public final U1 e0() {
        switch (this.h) {
            case 0:
                return new T1((LongBinaryOperator) this.i);
            case 1:
                return new F1((DoubleBinaryOperator) this.i);
            case 2:
                return new K1((BinaryOperator) this.i);
            default:
                return new Q1((IntBinaryOperator) this.i);
        }
    }
}
