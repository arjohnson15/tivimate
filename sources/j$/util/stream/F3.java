package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
abstract class F3 {
    protected final Spliterator a;
    protected final boolean b;
    protected final int c;
    private final long d;
    private final AtomicLong e;

    F3(Spliterator spliterator, long j, long j2) {
        this.a = spliterator;
        this.b = j2 < 0;
        this.d = j2 >= 0 ? j2 : 0L;
        this.c = 128;
        this.e = new AtomicLong(j2 >= 0 ? j + j2 : j);
    }

    F3(Spliterator spliterator, F3 f3) {
        this.a = spliterator;
        this.b = f3.b;
        this.e = f3.e;
        this.d = f3.d;
        this.c = f3.c;
    }

    protected final long b(long j) {
        AtomicLong atomicLong;
        long j2;
        boolean z;
        long jMin;
        do {
            atomicLong = this.e;
            j2 = atomicLong.get();
            z = this.b;
            if (j2 != 0) {
                jMin = Math.min(j2, j);
                if (jMin <= 0) {
                    break;
                }
            } else {
                if (z) {
                    return j;
                }
                return 0L;
            }
        } while (!atomicLong.compareAndSet(j2, j2 - jMin));
        if (z) {
            return Math.max(j - jMin, 0L);
        }
        long j3 = this.d;
        return j2 > j3 ? Math.max(jMin - (j2 - j3), 0L) : jMin;
    }

    protected abstract Spliterator c(Spliterator spliterator);

    public final int characteristics() {
        return this.a.characteristics() & (-16465);
    }

    protected final E3 d() {
        return this.e.get() > 0 ? E3.MAYBE_MORE : this.b ? E3.UNLIMITED : E3.NO_MORE;
    }

    public final long estimateSize() {
        return this.a.estimateSize();
    }

    public final Spliterator trySplit() {
        Spliterator spliteratorTrySplit;
        if (this.e.get() == 0 || (spliteratorTrySplit = this.a.trySplit()) == null) {
            return null;
        }
        return c(spliteratorTrySplit);
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.U m3534trySplit() {
        return (j$.util.U) trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.X m3535trySplit() {
        return (j$.util.X) trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.a0 m3536trySplit() {
        return (j$.util.a0) trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.d0 m3537trySplit() {
        return (j$.util.d0) trySplit();
    }
}
