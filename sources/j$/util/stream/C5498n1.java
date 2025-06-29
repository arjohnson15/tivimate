package j$.util.stream;

import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.n1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5498n1 extends AbstractC5503o1 {
    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.a == null) {
            return;
        }
        if (this.d != null) {
            while (tryAdvance(consumer)) {
            }
            return;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            spliterator.forEachRemaining(consumer);
            return;
        }
        ArrayDeque arrayDequeB = b();
        while (true) {
            K0 k0A = AbstractC5503o1.a(arrayDequeB);
            if (k0A == null) {
                this.a = null;
                return;
            }
            k0A.forEach(consumer);
        }
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        K0 k0A;
        if (!c()) {
            return false;
        }
        boolean zTryAdvance = this.d.tryAdvance(consumer);
        if (!zTryAdvance) {
            if (this.c == null && (k0A = AbstractC5503o1.a(this.e)) != null) {
                Spliterator spliterator = k0A.spliterator();
                this.d = spliterator;
                return spliterator.tryAdvance(consumer);
            }
            this.a = null;
        }
        return zTryAdvance;
    }
}
