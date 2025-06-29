package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
final class Q extends S {
    final Consumer b;

    Q(Consumer consumer, boolean z) {
        super(z);
        this.b = consumer;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.b.accept(obj);
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
}
