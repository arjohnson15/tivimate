package j$.util.stream;

import java.util.function.IntConsumer;

/* renamed from: j$.util.stream.h3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5470h3 extends AbstractC5480j3 implements IntConsumer {
    final int[] c;

    C5470h3(int i) {
        this.c = new int[i];
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        int i2 = this.b;
        this.b = i2 + 1;
        this.c[i2] = i;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.f(this, intConsumer);
    }

    @Override // j$.util.stream.AbstractC5480j3
    public final void b(Object obj, long j) {
        IntConsumer intConsumer = (IntConsumer) obj;
        for (int i = 0; i < j; i++) {
            intConsumer.accept(this.c[i]);
        }
    }
}
