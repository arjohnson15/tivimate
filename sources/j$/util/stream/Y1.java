package j$.util.stream;

import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
final class Y1 extends AbstractC5434a2 implements InterfaceC5504o2 {
    @Override // j$.util.stream.AbstractC5434a2, j$.util.stream.InterfaceC5509p2, j$.util.stream.InterfaceC5504o2, java.util.function.LongConsumer
    public final void accept(long j) {
        this.b++;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        j((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.g(this, longConsumer);
    }

    @Override // j$.util.stream.U1
    public final void g(U1 u1) {
        this.b += ((AbstractC5434a2) u1).b;
    }

    @Override // j$.util.stream.V1, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.b);
    }

    @Override // j$.util.stream.InterfaceC5504o2
    public final /* synthetic */ void j(Long l) {
        AbstractC5551y0.i(this, l);
    }
}
