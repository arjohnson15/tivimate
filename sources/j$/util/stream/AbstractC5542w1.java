package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.w1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC5542w1 extends CountedCompleter implements InterfaceC5509p2 {
    protected final Spliterator a;
    protected final AbstractC5436b b;
    protected final long c;
    protected long d;
    protected long e;
    protected int f;
    protected int g;

    AbstractC5542w1(Spliterator spliterator, AbstractC5436b abstractC5436b, int i) {
        this.a = spliterator;
        this.b = abstractC5436b;
        this.c = AbstractC5451e.g(spliterator.estimateSize());
        this.d = 0L;
        this.e = i;
    }

    AbstractC5542w1(AbstractC5542w1 abstractC5542w1, Spliterator spliterator, long j, long j2, int i) {
        super(abstractC5542w1);
        this.a = spliterator;
        this.b = abstractC5542w1.b;
        this.c = abstractC5542w1.c;
        this.d = j;
        this.e = j2;
        if (j < 0 || j2 < 0 || (j + j2) - 1 >= i) {
            throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", Long.valueOf(j), Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)));
        }
    }

    public /* synthetic */ void accept(double d) {
        AbstractC5551y0.a();
        throw null;
    }

    public /* synthetic */ void accept(int i) {
        AbstractC5551y0.k();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
        AbstractC5551y0.l();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    abstract AbstractC5542w1 b(Spliterator spliterator, long j, long j2);

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.a;
        AbstractC5542w1 abstractC5542w1B = this;
        while (spliterator.estimateSize() > abstractC5542w1B.c && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            abstractC5542w1B.setPendingCount(1);
            long jEstimateSize = spliteratorTrySplit.estimateSize();
            abstractC5542w1B.b(spliteratorTrySplit, abstractC5542w1B.d, jEstimateSize).fork();
            abstractC5542w1B = abstractC5542w1B.b(spliterator, abstractC5542w1B.d + jEstimateSize, abstractC5542w1B.e - jEstimateSize);
        }
        abstractC5542w1B.b.V(spliterator, abstractC5542w1B);
        abstractC5542w1B.propagateCompletion();
    }

    @Override // j$.util.stream.InterfaceC5509p2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.InterfaceC5509p2
    public final void l(long j) {
        long j2 = this.e;
        if (j > j2) {
            throw new IllegalStateException("size passed to Sink.begin exceeds array length");
        }
        int i = (int) this.d;
        this.f = i;
        this.g = i + ((int) j2);
    }

    @Override // j$.util.stream.InterfaceC5509p2
    public final /* synthetic */ boolean n() {
        return false;
    }
}
