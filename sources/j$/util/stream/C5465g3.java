package j$.util.stream;

import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.g3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5465g3 extends AbstractC5480j3 implements DoubleConsumer {
    final double[] c;

    C5465g3(int i) {
        this.c = new double[i];
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        int i = this.b;
        this.b = i + 1;
        this.c[i] = d;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.e(this, doubleConsumer);
    }

    @Override // j$.util.stream.AbstractC5480j3
    final void b(Object obj, long j) {
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj;
        for (int i = 0; i < j; i++) {
            doubleConsumer.accept(this.c[i]);
        }
    }
}
