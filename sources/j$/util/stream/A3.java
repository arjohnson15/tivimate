package j$.util.stream;

import j$.util.AbstractC5414b;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
final class A3 extends C3 implements j$.util.X, IntConsumer {
    int f;

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        this.f = i;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.f(this, intConsumer);
    }

    @Override // j$.util.stream.F3
    protected final Spliterator c(Spliterator spliterator) {
        return new A3((j$.util.X) spliterator, this);
    }

    @Override // j$.util.stream.C3
    protected final void e(Object obj) {
        ((IntConsumer) obj).accept(this.f);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC5414b.b(this, consumer);
    }

    @Override // j$.util.stream.C3
    protected final AbstractC5480j3 h(int i) {
        return new C5470h3(i);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC5414b.g(this, consumer);
    }
}
