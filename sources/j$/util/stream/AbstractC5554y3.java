package j$.util.stream;

import j$.util.Spliterator;

/* renamed from: j$.util.stream.y3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC5554y3 {
    final long a;
    final long b;
    Spliterator c;
    long d;
    long e;

    AbstractC5554y3(Spliterator spliterator, long j, long j2, long j3, long j4) {
        this.c = spliterator;
        this.a = j;
        this.b = j2;
        this.d = j3;
        this.e = j4;
    }

    protected abstract Spliterator a(Spliterator spliterator, long j, long j2, long j3, long j4);

    public final int characteristics() {
        return this.c.characteristics();
    }

    public final long estimateSize() {
        long j = this.e;
        long j2 = this.a;
        if (j2 < j) {
            return j - Math.max(j2, this.d);
        }
        return 0L;
    }

    public final Spliterator trySplit() {
        long j = this.e;
        if (this.a >= j || this.d >= j) {
            return null;
        }
        while (true) {
            Spliterator spliteratorTrySplit = this.c.trySplit();
            if (spliteratorTrySplit == null) {
                return null;
            }
            long jEstimateSize = spliteratorTrySplit.estimateSize() + this.d;
            long jMin = Math.min(jEstimateSize, this.b);
            long j2 = this.a;
            if (j2 >= jMin) {
                this.d = jMin;
            } else {
                long j3 = this.b;
                if (jMin < j3) {
                    long j4 = this.d;
                    if (j4 < j2 || jEstimateSize > j3) {
                        this.d = jMin;
                        return a(spliteratorTrySplit, j2, j3, j4, jMin);
                    }
                    this.d = jMin;
                    return spliteratorTrySplit;
                }
                this.c = spliteratorTrySplit;
                this.e = jMin;
            }
        }
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.U m3538trySplit() {
        return (j$.util.U) trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.X m3539trySplit() {
        return (j$.util.X) trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.a0 m3540trySplit() {
        return (j$.util.a0) trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.d0 m3541trySplit() {
        return (j$.util.d0) trySplit();
    }
}
