package j$.util.stream;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
final class H1 extends V1 implements U1, InterfaceC5494m2 {
    final /* synthetic */ Supplier b;
    final /* synthetic */ ObjDoubleConsumer c;
    final /* synthetic */ r d;

    H1(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, r rVar) {
        this.b = supplier;
        this.c = objDoubleConsumer;
        this.d = rVar;
    }

    @Override // j$.util.stream.InterfaceC5509p2
    public final void accept(double d) {
        this.c.accept(this.a, d);
    }

    @Override // j$.util.stream.InterfaceC5509p2
    public final /* synthetic */ void accept(int i) {
        AbstractC5551y0.k();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC5509p2, j$.util.stream.InterfaceC5504o2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j) {
        AbstractC5551y0.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        p((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.e(this, doubleConsumer);
    }

    @Override // j$.util.stream.U1
    public final void g(U1 u1) {
        this.a = this.d.apply(this.a, ((H1) u1).a);
    }

    @Override // j$.util.stream.InterfaceC5509p2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.InterfaceC5509p2
    public final void l(long j) {
        this.a = this.b.get();
    }

    @Override // j$.util.stream.InterfaceC5509p2
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC5494m2
    public final /* synthetic */ void p(Double d) {
        AbstractC5551y0.e(this, d);
    }
}
