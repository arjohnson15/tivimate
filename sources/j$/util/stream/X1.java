package j$.util.stream;

import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
final class X1 extends AbstractC5434a2 implements InterfaceC5499n2 {
    @Override // j$.util.stream.AbstractC5434a2, j$.util.stream.InterfaceC5509p2
    public final void accept(int i) {
        this.b++;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        m((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.f(this, intConsumer);
    }

    @Override // j$.util.stream.U1
    public final void g(U1 u1) {
        this.b += ((AbstractC5434a2) u1).b;
    }

    @Override // j$.util.stream.V1, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.b);
    }

    @Override // j$.util.stream.InterfaceC5499n2
    public final /* synthetic */ void m(Integer num) {
        AbstractC5551y0.g(this, num);
    }
}
