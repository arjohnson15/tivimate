package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* loaded from: classes2.dex */
final class j4 extends k4 implements Consumer {
    final Predicate e;
    Object f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(Spliterator spliterator, j4 j4Var, int i) {
        super(spliterator, j4Var);
        this.g = i;
        this.e = j4Var.e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(Spliterator spliterator, Predicate predicate, int i) {
        super(spliterator);
        this.g = i;
        this.e = predicate;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.d = (this.d + 1) & 63;
        this.f = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    @Override // j$.util.stream.k4
    final Spliterator c(Spliterator spliterator) {
        switch (this.g) {
            case 0:
                return new j4(spliterator, this, 0);
            default:
                return new j4(spliterator, this, 1);
        }
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        boolean zTryAdvance;
        boolean zTest;
        switch (this.g) {
            case 0:
                boolean z = this.c;
                Spliterator spliterator = this.a;
                if (!z) {
                    return spliterator.tryAdvance(consumer);
                }
                boolean z2 = false;
                this.c = false;
                while (true) {
                    zTryAdvance = spliterator.tryAdvance(this);
                    if (zTryAdvance && b() && this.e.test(this.f)) {
                        z2 = true;
                    }
                }
                if (!zTryAdvance) {
                    return zTryAdvance;
                }
                if (z2) {
                    this.b.set(true);
                }
                consumer.accept(this.f);
                return zTryAdvance;
            default:
                if (this.c && b() && this.a.tryAdvance(this)) {
                    zTest = this.e.test(this.f);
                    if (zTest) {
                        consumer.accept(this.f);
                        return true;
                    }
                } else {
                    zTest = true;
                }
                this.c = false;
                if (!zTest) {
                    this.b.set(true);
                }
                return false;
        }
    }

    @Override // j$.util.stream.k4, j$.util.Spliterator
    public Spliterator trySplit() {
        switch (this.g) {
            case 1:
                if (!this.b.get()) {
                    break;
                }
                break;
        }
        return super.trySplit();
    }
}
