package j$.util;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
final class g0 implements K, IntConsumer, InterfaceC5565y {
    boolean a = false;
    int b;
    final /* synthetic */ X c;

    g0(X x) {
        this.c = x;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        this.a = true;
        this.b = i;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.f(this, intConsumer);
    }

    @Override // j$.util.K, java.util.Iterator, j$.util.InterfaceC5565y
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            forEachRemaining((IntConsumer) consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        if (t0.a) {
            t0.a(g0.class, "{0} calling PrimitiveIterator.OfInt.forEachRemainingInt(action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        forEachRemaining((IntConsumer) new H(consumer));
    }

    @Override // j$.util.P
    public final void forEachRemaining(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        while (hasNext()) {
            intConsumer.accept(nextInt());
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.a) {
            this.c.tryAdvance((IntConsumer) this);
        }
        return this.a;
    }

    @Override // java.util.Iterator
    public final Integer next() {
        if (!t0.a) {
            return Integer.valueOf(nextInt());
        }
        t0.a(g0.class, "{0} calling PrimitiveIterator.OfInt.nextInt()");
        throw null;
    }

    @Override // j$.util.K
    public final int nextInt() {
        if (!this.a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = false;
        return this.b;
    }
}
