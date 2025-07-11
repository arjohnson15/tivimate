package j$.util;

import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5566z implements LongConsumer, IntConsumer {
    private long count;
    private long sum;
    private long min = Long.MAX_VALUE;
    private long max = Long.MIN_VALUE;

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        accept(i);
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        this.count++;
        this.sum += j;
        this.min = Math.min(this.min, j);
        this.max = Math.max(this.max, j);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.f(this, intConsumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.g(this, longConsumer);
    }

    public final void b(C5566z c5566z) {
        this.count += c5566z.count;
        this.sum += c5566z.sum;
        this.min = Math.min(this.min, c5566z.min);
        this.max = Math.max(this.max, c5566z.max);
    }

    public final String toString() {
        String simpleName = C5566z.class.getSimpleName();
        Long lValueOf = Long.valueOf(this.count);
        Long lValueOf2 = Long.valueOf(this.sum);
        Long lValueOf3 = Long.valueOf(this.min);
        long j = this.count;
        return String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", simpleName, lValueOf, lValueOf2, lValueOf3, Double.valueOf(j > 0 ? this.sum / j : 0.0d), Long.valueOf(this.max));
    }
}
