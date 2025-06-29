package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
final class H3 extends AbstractC5460f3 {
    @Override // j$.util.stream.AbstractC5460f3
    final void d() {
        Z2 z2 = new Z2();
        this.h = z2;
        Objects.requireNonNull(z2);
        this.e = this.b.W(new G3(z2, 0));
        this.f = new C5431a(5, this);
    }

    @Override // j$.util.stream.AbstractC5460f3
    final AbstractC5460f3 e(Spliterator spliterator) {
        return new H3(this.b, spliterator, this.a);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.h != null || this.i) {
            while (tryAdvance(consumer)) {
            }
            return;
        }
        Objects.requireNonNull(consumer);
        c();
        Objects.requireNonNull(consumer);
        G3 g3 = new G3(consumer, 1);
        this.b.V(this.d, g3);
        this.i = true;
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Object obj;
        Objects.requireNonNull(consumer);
        boolean zA = a();
        if (zA) {
            Z2 z2 = (Z2) this.h;
            long j = this.g;
            if (z2.c != 0) {
                if (j >= z2.count()) {
                    throw new IndexOutOfBoundsException(Long.toString(j));
                }
                for (int i = 0; i <= z2.c; i++) {
                    long j2 = z2.d[i];
                    Object[] objArr = z2.f[i];
                    if (j < objArr.length + j2) {
                        obj = objArr[(int) (j - j2)];
                    }
                }
                throw new IndexOutOfBoundsException(Long.toString(j));
            }
            if (j >= z2.b) {
                throw new IndexOutOfBoundsException(Long.toString(j));
            }
            obj = z2.e[(int) j];
            consumer.p(obj);
        }
        return zA;
    }
}
