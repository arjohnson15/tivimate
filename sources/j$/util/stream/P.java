package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
final class P extends S implements InterfaceC5504o2 {
    final LongConsumer b;

    P(LongConsumer longConsumer, boolean z) {
        super(z);
        this.b = longConsumer;
    }

    @Override // j$.util.stream.S, j$.util.stream.InterfaceC5509p2, j$.util.stream.InterfaceC5504o2, java.util.function.LongConsumer
    public final void accept(long j) {
        this.b.accept(j);
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        j((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.g(this, longConsumer);
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

    @Override // j$.util.stream.InterfaceC5504o2
    public final /* synthetic */ void j(Long l) {
        AbstractC5551y0.i(this, l);
    }
}
