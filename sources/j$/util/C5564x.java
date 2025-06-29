package j$.util;

import java.util.function.IntConsumer;

/* renamed from: j$.util.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5564x implements IntConsumer {
    private long count;
    private long sum;
    private int min = Integer.MAX_VALUE;
    private int max = Integer.MIN_VALUE;

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        this.count++;
        this.sum += i;
        this.min = Math.min(this.min, i);
        this.max = Math.max(this.max, i);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.f(this, intConsumer);
    }

    public final void b(C5564x c5564x) {
        this.count += c5564x.count;
        this.sum += c5564x.sum;
        this.min = Math.min(this.min, c5564x.min);
        this.max = Math.max(this.max, c5564x.max);
    }

    public final String toString() {
        String simpleName = C5564x.class.getSimpleName();
        Long lValueOf = Long.valueOf(this.count);
        Long lValueOf2 = Long.valueOf(this.sum);
        Integer numValueOf = Integer.valueOf(this.min);
        long j = this.count;
        return String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", simpleName, lValueOf, lValueOf2, numValueOf, Double.valueOf(j > 0 ? this.sum / j : 0.0d), Integer.valueOf(this.max));
    }
}
