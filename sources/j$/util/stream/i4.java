package j$.util.stream;

import j$.util.AbstractC5414b;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
import java.util.function.LongPredicate;

/* loaded from: classes2.dex */
final class i4 extends k4 implements LongConsumer, j$.util.a0 {
    long e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i4(Spliterator spliterator, int i) {
        super(spliterator);
        this.f = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i4(Spliterator spliterator, k4 k4Var, int i) {
        super(spliterator, k4Var);
        this.f = i;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        this.d = (this.d + 1) & 63;
        this.e = j;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.g(this, longConsumer);
    }

    @Override // j$.util.stream.k4
    final Spliterator c(Spliterator spliterator) {
        switch (this.f) {
            case 0:
                return new i4((j$.util.a0) spliterator, this, 0);
            default:
                return new i4((j$.util.a0) spliterator, this, 1);
        }
    }

    @Override // j$.util.stream.k4, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC5414b.c(this, consumer);
    }

    @Override // j$.util.d0
    public final void forEachRemaining(LongConsumer longConsumer) {
        while (tryAdvance(longConsumer)) {
        }
    }

    @Override // j$.util.d0
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        switch (this.f) {
            case 1:
                tryAdvance((LongConsumer) obj);
                return false;
            default:
                return tryAdvance((LongConsumer) obj);
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC5414b.h(this, consumer);
    }

    @Override // j$.util.a0
    public final boolean tryAdvance(LongConsumer longConsumer) {
        switch (this.f) {
            case 0:
                boolean z = this.c;
                Spliterator spliterator = this.a;
                if (!z) {
                    return ((j$.util.a0) spliterator).tryAdvance(longConsumer);
                }
                this.c = false;
                boolean zTryAdvance = ((j$.util.a0) spliterator).tryAdvance((LongConsumer) this);
                if (zTryAdvance && b()) {
                    LongPredicate longPredicate = null;
                    longPredicate.test(this.e);
                    throw null;
                }
                if (!zTryAdvance) {
                    return zTryAdvance;
                }
                longConsumer.accept(this.e);
                return zTryAdvance;
            default:
                if (!this.c || !b() || !((j$.util.a0) this.a).tryAdvance((LongConsumer) this)) {
                    this.c = false;
                    return false;
                }
                LongPredicate longPredicate2 = null;
                longPredicate2.test(this.e);
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
    public j$.util.a0 trySplit() {
        switch (this.f) {
            case 1:
                if (this.b.get()) {
                    return null;
                }
                return (j$.util.a0) super.trySplit();
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
