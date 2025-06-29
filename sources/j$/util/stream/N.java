package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
final class N extends S implements InterfaceC5494m2 {
    final DoubleConsumer b;

    N(DoubleConsumer doubleConsumer, boolean z) {
        super(z);
        this.b = doubleConsumer;
    }

    @Override // j$.util.stream.S, j$.util.stream.InterfaceC5509p2
    public final void accept(double d) {
        this.b.accept(d);
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        p((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.e(this, doubleConsumer);
    }

    @Override // j$.util.stream.J3
    public final Object b(AbstractC5436b abstractC5436b, Spliterator spliterator) {
        abstractC5436b.V(spliterator, this);
        return null;
    }

    @Override // j$.util.stream.J3
    public final /* bridge */ /* synthetic */ Object c(AbstractC5436b abstractC5436b, Spliterator spliterator) {
        e(abstractC5436b, spliterator);
        return null;
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // j$.util.stream.InterfaceC5494m2
    public final /* synthetic */ void p(Double d) {
        AbstractC5551y0.e(this, d);
    }
}
