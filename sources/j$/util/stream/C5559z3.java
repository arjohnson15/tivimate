package j$.util.stream;

import j$.util.AbstractC5414b;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.z3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5559z3 extends C3 implements j$.util.U, DoubleConsumer {
    double f;

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.f = d;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.e(this, doubleConsumer);
    }

    @Override // j$.util.stream.F3
    protected final Spliterator c(Spliterator spliterator) {
        return new C5559z3((j$.util.U) spliterator, this);
    }

    @Override // j$.util.stream.C3
    protected final void e(Object obj) {
        ((DoubleConsumer) obj).accept(this.f);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC5414b.a(this, consumer);
    }

    @Override // j$.util.stream.C3
    protected final AbstractC5480j3 h(int i) {
        return new C5465g3(i);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC5414b.f(this, consumer);
    }
}
