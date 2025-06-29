package j$.util.stream;

import j$.util.AbstractC5414b;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
final class D3 extends F3 implements Spliterator, Consumer {
    Object f;

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void p(Object obj) {
        this.f = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    @Override // j$.util.stream.F3
    protected final Spliterator c(Spliterator spliterator) {
        return new D3(spliterator, this);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        C5485k3 c5485k3 = null;
        while (true) {
            E3 e3D = d();
            if (e3D == E3.NO_MORE) {
                return;
            }
            E3 e3 = E3.MAYBE_MORE;
            Spliterator spliterator = this.a;
            if (e3D != e3) {
                spliterator.forEachRemaining(consumer);
                return;
            }
            int i = this.c;
            if (c5485k3 == null) {
                c5485k3 = new C5485k3(i);
            } else {
                c5485k3.a = 0;
            }
            long j = 0;
            while (spliterator.tryAdvance(c5485k3)) {
                j++;
                if (j >= i) {
                    break;
                }
            }
            if (j == 0) {
                return;
            }
            long jB = b(j);
            for (int i2 = 0; i2 < jB; i2++) {
                consumer.p(c5485k3.b[i2]);
            }
        }
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC5414b.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return AbstractC5414b.e(this, i);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        while (d() != E3.NO_MORE && this.a.tryAdvance(this)) {
            if (b(1L) == 1) {
                consumer.p(this.f);
                this.f = null;
                return true;
            }
        }
        return false;
    }
}
