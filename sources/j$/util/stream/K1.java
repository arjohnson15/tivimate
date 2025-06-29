package j$.util.stream;

import j$.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
final class K1 implements U1 {
    private boolean a;
    private Object b;
    final /* synthetic */ BinaryOperator c;

    K1(BinaryOperator binaryOperator) {
        this.c = binaryOperator;
    }

    @Override // j$.util.stream.InterfaceC5509p2
    public final /* synthetic */ void accept(double d) {
        AbstractC5551y0.a();
        throw null;
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
    public final void p(Object obj) {
        if (!this.a) {
            this.b = this.c.apply(this.b, obj);
        } else {
            this.a = false;
            this.b = obj;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    @Override // j$.util.stream.U1
    public final void g(U1 u1) {
        K1 k1 = (K1) u1;
        if (k1.a) {
            return;
        }
        p(k1.b);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.a ? Optional.a() : Optional.d(this.b);
    }

    @Override // j$.util.stream.InterfaceC5509p2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.InterfaceC5509p2
    public final void l(long j) {
        this.a = true;
        this.b = null;
    }

    @Override // j$.util.stream.InterfaceC5509p2
    public final /* synthetic */ boolean n() {
        return false;
    }
}
