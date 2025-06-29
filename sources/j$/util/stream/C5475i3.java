package j$.util.stream;

import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.i3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5475i3 extends AbstractC5480j3 implements LongConsumer {
    final long[] c;

    C5475i3(int i) {
        this.c = new long[i];
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        int i = this.b;
        this.b = i + 1;
        this.c[i] = j;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.g(this, longConsumer);
    }

    @Override // j$.util.stream.AbstractC5480j3
    public final void b(Object obj, long j) {
        LongConsumer longConsumer = (LongConsumer) obj;
        for (int i = 0; i < j; i++) {
            longConsumer.accept(this.c[i]);
        }
    }
}
