package j$.util.stream;

import j$.util.AbstractC5414b;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* renamed from: j$.util.stream.q3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5515q3 extends AbstractC5460f3 implements j$.util.X {
    @Override // j$.util.stream.AbstractC5460f3
    final void d() {
        U2 u2 = new U2();
        this.h = u2;
        Objects.requireNonNull(u2);
        this.e = this.b.W(new C5510p3(u2, 0));
        this.f = new C5431a(3, this);
    }

    @Override // j$.util.stream.AbstractC5460f3
    final AbstractC5460f3 e(Spliterator spliterator) {
        return new C5515q3(this.b, spliterator, this.a);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC5414b.b(this, consumer);
    }

    @Override // j$.util.d0
    public final void forEachRemaining(IntConsumer intConsumer) {
        if (this.h != null || this.i) {
            while (tryAdvance(intConsumer)) {
            }
            return;
        }
        Objects.requireNonNull(intConsumer);
        c();
        Objects.requireNonNull(intConsumer);
        C5510p3 c5510p3 = new C5510p3(intConsumer, 1);
        this.b.V(this.d, c5510p3);
        this.i = true;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC5414b.g(this, consumer);
    }

    @Override // j$.util.d0
    public final boolean tryAdvance(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        boolean zA = a();
        if (zA) {
            U2 u2 = (U2) this.h;
            long j = this.g;
            int iU = u2.u(j);
            intConsumer.accept((u2.c == 0 && iU == 0) ? ((int[]) u2.e)[(int) j] : ((int[][]) u2.f)[iU][(int) (j - u2.d[iU])]);
        }
        return zA;
    }

    @Override // j$.util.stream.AbstractC5460f3, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.X) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC5460f3, j$.util.Spliterator
    public final j$.util.X trySplit() {
        return (j$.util.X) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC5460f3, j$.util.Spliterator
    public final j$.util.d0 trySplit() {
        return (j$.util.X) super.trySplit();
    }
}
