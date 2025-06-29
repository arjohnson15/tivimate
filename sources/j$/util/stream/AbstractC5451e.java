package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.ForkJoinPool;

/* renamed from: j$.util.stream.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC5451e extends CountedCompleter {
    private static final int g = ForkJoinPool.getCommonPoolParallelism() << 2;
    protected final AbstractC5436b a;
    protected Spliterator b;
    protected long c;
    protected AbstractC5451e d;
    protected AbstractC5451e e;
    private Object f;

    protected AbstractC5451e(AbstractC5436b abstractC5436b, Spliterator spliterator) {
        super(null);
        this.a = abstractC5436b;
        this.b = spliterator;
        this.c = 0L;
    }

    protected AbstractC5451e(AbstractC5451e abstractC5451e, Spliterator spliterator) {
        super(abstractC5451e);
        this.b = spliterator;
        this.a = abstractC5451e.a;
        this.c = abstractC5451e.c;
    }

    public static int b() {
        return g;
    }

    public static long g(long j) {
        long j2 = j / g;
        if (j2 > 0) {
            return j2;
        }
        return 1L;
    }

    protected abstract Object a();

    protected Object c() {
        return this.f;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.b;
        long jEstimateSize = spliterator.estimateSize();
        long jG = this.c;
        if (jG == 0) {
            jG = g(jEstimateSize);
            this.c = jG;
        }
        boolean z = false;
        AbstractC5451e abstractC5451e = this;
        while (jEstimateSize > jG && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            AbstractC5451e abstractC5451eE = abstractC5451e.e(spliteratorTrySplit);
            abstractC5451e.d = abstractC5451eE;
            AbstractC5451e abstractC5451eE2 = abstractC5451e.e(spliterator);
            abstractC5451e.e = abstractC5451eE2;
            abstractC5451e.setPendingCount(1);
            if (z) {
                spliterator = spliteratorTrySplit;
                abstractC5451e = abstractC5451eE;
                abstractC5451eE = abstractC5451eE2;
            } else {
                abstractC5451e = abstractC5451eE2;
            }
            z = !z;
            abstractC5451eE.fork();
            jEstimateSize = spliterator.estimateSize();
        }
        abstractC5451e.f(abstractC5451e.a());
        abstractC5451e.tryComplete();
    }

    protected final boolean d() {
        return ((AbstractC5451e) getCompleter()) == null;
    }

    protected abstract AbstractC5451e e(Spliterator spliterator);

    protected void f(Object obj) {
        this.f = obj;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public Object getRawResult() {
        return this.f;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void onCompletion(CountedCompleter countedCompleter) {
        this.b = null;
        this.e = null;
        this.d = null;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    protected final void setRawResult(Object obj) {
        if (obj != null) {
            throw new IllegalStateException();
        }
    }
}
