package j$.util.stream;

import j$.util.AbstractC5414b;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

/* loaded from: classes2.dex */
final class h4 extends k4 implements IntConsumer, j$.util.X {
    int e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h4(Spliterator spliterator, int i) {
        super(spliterator);
        this.f = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h4(Spliterator spliterator, k4 k4Var, int i) {
        super(spliterator, k4Var);
        this.f = i;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        this.d = (this.d + 1) & 63;
        this.e = i;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.f(this, intConsumer);
    }

    @Override // j$.util.stream.k4
    final Spliterator c(Spliterator spliterator) {
        switch (this.f) {
            case 0:
                return new h4((j$.util.X) spliterator, this, 0);
            default:
                return new h4((j$.util.X) spliterator, this, 1);
        }
    }

    @Override // j$.util.stream.k4, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC5414b.b(this, consumer);
    }

    @Override // j$.util.d0
    public final void forEachRemaining(IntConsumer intConsumer) {
        while (tryAdvance(intConsumer)) {
        }
    }

    @Override // j$.util.d0
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        switch (this.f) {
            case 1:
                tryAdvance((IntConsumer) obj);
                return false;
            default:
                return tryAdvance((IntConsumer) obj);
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC5414b.g(this, consumer);
    }

    @Override // j$.util.X
    public final boolean tryAdvance(IntConsumer intConsumer) {
        switch (this.f) {
            case 0:
                boolean z = this.c;
                Spliterator spliterator = this.a;
                if (!z) {
                    return ((j$.util.X) spliterator).tryAdvance(intConsumer);
                }
                this.c = false;
                boolean zTryAdvance = ((j$.util.X) spliterator).tryAdvance((IntConsumer) this);
                if (zTryAdvance && b()) {
                    IntPredicate intPredicate = null;
                    intPredicate.test(this.e);
                    throw null;
                }
                if (!zTryAdvance) {
                    return zTryAdvance;
                }
                intConsumer.accept(this.e);
                return zTryAdvance;
            default:
                if (!this.c || !b() || !((j$.util.X) this.a).tryAdvance((IntConsumer) this)) {
                    this.c = false;
                    return false;
                }
                IntPredicate intPredicate2 = null;
                intPredicate2.test(this.e);
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
    public j$.util.X trySplit() {
        switch (this.f) {
            case 1:
                if (this.b.get()) {
                    return null;
                }
                return (j$.util.X) super.trySplit();
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
