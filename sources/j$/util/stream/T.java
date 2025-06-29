package j$.util.stream;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
final class T extends CountedCompleter {
    private final AbstractC5436b a;
    private Spliterator b;
    private final long c;
    private final ConcurrentHashMap d;
    private final S e;
    private final T f;
    private K0 g;

    T(T t, Spliterator spliterator, T t2) {
        super(t);
        this.a = t.a;
        this.b = spliterator;
        this.c = t.c;
        this.d = t.d;
        this.e = t.e;
        this.f = t2;
    }

    protected T(AbstractC5436b abstractC5436b, Spliterator spliterator, S s) {
        super(null);
        this.a = abstractC5436b;
        this.b = spliterator;
        this.c = AbstractC5451e.g(spliterator.estimateSize());
        this.d = new ConcurrentHashMap(Math.max(16, AbstractC5451e.b() << 1), 0.75f, 1);
        this.e = s;
        this.f = null;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.b;
        long j = this.c;
        boolean z = false;
        T t = this;
        while (spliterator.estimateSize() > j && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            T t2 = new T(t, spliteratorTrySplit, t.f);
            T t3 = new T(t, spliterator, t2);
            t.addToPendingCount(1);
            t3.addToPendingCount(1);
            t.d.put(t2, t3);
            if (t.f != null) {
                t2.addToPendingCount(1);
                if (t.d.replace(t.f, t, t2)) {
                    t.addToPendingCount(-1);
                } else {
                    t2.addToPendingCount(-1);
                }
            }
            if (z) {
                spliterator = spliteratorTrySplit;
                t = t2;
                t2 = t3;
            } else {
                t = t3;
            }
            z = !z;
            t2.fork();
        }
        if (t.getPendingCount() > 0) {
            C5520s c5520s = new C5520s(5);
            AbstractC5436b abstractC5436b = t.a;
            C0 c0N = abstractC5436b.N(abstractC5436b.G(spliterator), c5520s);
            t.a.V(spliterator, c0N);
            t.g = c0N.a();
            t.b = null;
        }
        t.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        K0 k0 = this.g;
        if (k0 != null) {
            k0.forEach(this.e);
            this.g = null;
        } else {
            Spliterator spliterator = this.b;
            if (spliterator != null) {
                this.a.V(spliterator, this.e);
                this.b = null;
            }
        }
        T t = (T) this.d.remove(this);
        if (t != null) {
            t.tryComplete();
        }
    }
}
