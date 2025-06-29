package j$.util.stream;

import j$.util.AbstractC5414b;
import j$.util.Spliterator;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.t3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5529t3 extends AbstractC5544w3 implements j$.util.U {
    @Override // j$.util.stream.AbstractC5554y3
    protected final Spliterator a(Spliterator spliterator, long j, long j2, long j3, long j4) {
        return new C5529t3((j$.util.U) spliterator, j, j2, j3, j4);
    }

    @Override // j$.util.stream.AbstractC5544w3
    protected final Object b() {
        return new D0(1);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC5414b.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC5414b.f(this, consumer);
    }
}
