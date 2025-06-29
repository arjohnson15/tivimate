package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
final class O extends S implements InterfaceC5499n2 {
    final IntConsumer b;

    O(IntConsumer intConsumer, boolean z) {
        super(z);
        this.b = intConsumer;
    }

    @Override // j$.util.stream.S, j$.util.stream.InterfaceC5509p2
    public final void accept(int i) {
        this.b.accept(i);
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        m((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.f(this, intConsumer);
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

    @Override // j$.util.stream.InterfaceC5499n2
    public final /* synthetic */ void m(Integer num) {
        AbstractC5551y0.g(this, num);
    }
}
