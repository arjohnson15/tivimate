package j$.util.stream;

import j$.util.AbstractC5414b;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.o3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5505o3 extends AbstractC5460f3 implements j$.util.U {
    @Override // j$.util.stream.AbstractC5460f3
    final void d() {
        S2 s2 = new S2();
        this.h = s2;
        Objects.requireNonNull(s2);
        this.e = this.b.W(new C5500n3(s2, 0));
        this.f = new C5431a(2, this);
    }

    @Override // j$.util.stream.AbstractC5460f3
    final AbstractC5460f3 e(Spliterator spliterator) {
        return new C5505o3(this.b, spliterator, this.a);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC5414b.a(this, consumer);
    }

    @Override // j$.util.d0
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        if (this.h != null || this.i) {
            while (tryAdvance(doubleConsumer)) {
            }
            return;
        }
        Objects.requireNonNull(doubleConsumer);
        c();
        Objects.requireNonNull(doubleConsumer);
        C5500n3 c5500n3 = new C5500n3(doubleConsumer, 1);
        this.b.V(this.d, c5500n3);
        this.i = true;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC5414b.f(this, consumer);
    }

    @Override // j$.util.d0
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        boolean zA = a();
        if (zA) {
            S2 s2 = (S2) this.h;
            long j = this.g;
            int iU = s2.u(j);
            doubleConsumer.accept((s2.c == 0 && iU == 0) ? ((double[]) s2.e)[(int) j] : ((double[][]) s2.f)[iU][(int) (j - s2.d[iU])]);
        }
        return zA;
    }

    @Override // j$.util.stream.AbstractC5460f3, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.U) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC5460f3, j$.util.Spliterator
    public final j$.util.U trySplit() {
        return (j$.util.U) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC5460f3, j$.util.Spliterator
    public final j$.util.d0 trySplit() {
        return (j$.util.U) super.trySplit();
    }
}
