package j$.util.stream;

import j$.util.AbstractC5414b;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.DoublePredicate;

/* loaded from: classes2.dex */
final class g4 extends k4 implements DoubleConsumer, j$.util.U {
    double e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g4(Spliterator spliterator, int i) {
        super(spliterator);
        this.f = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g4(Spliterator spliterator, k4 k4Var, int i) {
        super(spliterator, k4Var);
        this.f = i;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.d = (this.d + 1) & 63;
        this.e = d;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.e(this, doubleConsumer);
    }

    @Override // j$.util.stream.k4
    final Spliterator c(Spliterator spliterator) {
        switch (this.f) {
            case 0:
                return new g4((j$.util.U) spliterator, this, 0);
            default:
                return new g4((j$.util.U) spliterator, this, 1);
        }
    }

    @Override // j$.util.stream.k4, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC5414b.a(this, consumer);
    }

    @Override // j$.util.d0
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        while (tryAdvance(doubleConsumer)) {
        }
    }

    @Override // j$.util.d0
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        switch (this.f) {
            case 1:
                tryAdvance((DoubleConsumer) obj);
                return false;
            default:
                return tryAdvance((DoubleConsumer) obj);
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC5414b.f(this, consumer);
    }

    @Override // j$.util.U
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        switch (this.f) {
            case 0:
                boolean z = this.c;
                Spliterator spliterator = this.a;
                if (!z) {
                    return ((j$.util.U) spliterator).tryAdvance(doubleConsumer);
                }
                this.c = false;
                boolean zTryAdvance = ((j$.util.U) spliterator).tryAdvance((DoubleConsumer) this);
                if (zTryAdvance && b()) {
                    DoublePredicate doublePredicate = null;
                    doublePredicate.test(this.e);
                    throw null;
                }
                if (!zTryAdvance) {
                    return zTryAdvance;
                }
                doubleConsumer.accept(this.e);
                return zTryAdvance;
            default:
                if (!this.c || !b() || !((j$.util.U) this.a).tryAdvance((DoubleConsumer) this)) {
                    this.c = false;
                    return false;
                }
                DoublePredicate doublePredicate2 = null;
                doublePredicate2.test(this.e);
                throw null;
        }
    }

    @Override // j$.util.stream.k4, j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator trySplit() {
        switch (this.f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.stream.k4, j$.util.Spliterator
    public j$.util.U trySplit() {
        switch (this.f) {
            case 1:
                if (this.b.get()) {
                    return null;
                }
                return (j$.util.U) super.trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.stream.k4, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.d0 trySplit() {
        switch (this.f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }
}
