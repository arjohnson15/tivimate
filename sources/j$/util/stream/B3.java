package j$.util.stream;

import j$.util.AbstractC5414b;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
final class B3 extends C3 implements j$.util.a0, LongConsumer {
    long f;

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        this.f = j;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.g(this, longConsumer);
    }

    @Override // j$.util.stream.F3
    protected final Spliterator c(Spliterator spliterator) {
        return new B3((j$.util.a0) spliterator, this);
    }

    @Override // j$.util.stream.C3
    protected final void e(Object obj) {
        ((LongConsumer) obj).accept(this.f);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC5414b.c(this, consumer);
    }

    @Override // j$.util.stream.C3
    protected final AbstractC5480j3 h(int i) {
        return new C5475i3(i);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC5414b.h(this, consumer);
    }
}
