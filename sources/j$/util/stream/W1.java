package j$.util.stream;

import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
final class W1 extends AbstractC5434a2 implements InterfaceC5494m2 {
    @Override // j$.util.stream.AbstractC5434a2, j$.util.stream.InterfaceC5509p2
    public final void accept(double d) {
        this.b++;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        p((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.e(this, doubleConsumer);
    }

    @Override // j$.util.stream.U1
    public final void g(U1 u1) {
        this.b += ((AbstractC5434a2) u1).b;
    }

    @Override // j$.util.stream.V1, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.b);
    }

    @Override // j$.util.stream.InterfaceC5494m2
    public final /* synthetic */ void p(Double d) {
        AbstractC5551y0.e(this, d);
    }
}
