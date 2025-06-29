package j$.util.stream;

import j$.util.AbstractC5414b;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.s3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5524s3 extends AbstractC5460f3 implements j$.util.a0 {
    @Override // j$.util.stream.AbstractC5460f3
    final void d() {
        W2 w2 = new W2();
        this.h = w2;
        Objects.requireNonNull(w2);
        this.e = this.b.W(new C5519r3(w2, 0));
        this.f = new C5431a(4, this);
    }

    @Override // j$.util.stream.AbstractC5460f3
    final AbstractC5460f3 e(Spliterator spliterator) {
        return new C5524s3(this.b, spliterator, this.a);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC5414b.c(this, consumer);
    }

    @Override // j$.util.d0
    public final void forEachRemaining(LongConsumer longConsumer) {
        if (this.h != null || this.i) {
            while (tryAdvance(longConsumer)) {
            }
            return;
        }
        Objects.requireNonNull(longConsumer);
        c();
        Objects.requireNonNull(longConsumer);
        C5519r3 c5519r3 = new C5519r3(longConsumer, 1);
        this.b.V(this.d, c5519r3);
        this.i = true;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC5414b.h(this, consumer);
    }

    @Override // j$.util.d0
    public final boolean tryAdvance(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        boolean zA = a();
        if (zA) {
            W2 w2 = (W2) this.h;
            long j = this.g;
            int iU = w2.u(j);
            longConsumer.accept((w2.c == 0 && iU == 0) ? ((long[]) w2.e)[(int) j] : ((long[][]) w2.f)[iU][(int) (j - w2.d[iU])]);
        }
        return zA;
    }

    @Override // j$.util.stream.AbstractC5460f3, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.a0) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC5460f3, j$.util.Spliterator
    public final j$.util.a0 trySplit() {
        return (j$.util.a0) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC5460f3, j$.util.Spliterator
    public final j$.util.d0 trySplit() {
        return (j$.util.a0) super.trySplit();
    }
}
