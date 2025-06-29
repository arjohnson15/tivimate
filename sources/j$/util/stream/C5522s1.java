package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.s1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5522s1 extends AbstractC5542w1 implements InterfaceC5494m2 {
    private final double[] h;

    C5522s1(Spliterator spliterator, AbstractC5436b abstractC5436b, double[] dArr) {
        super(spliterator, abstractC5436b, dArr.length);
        this.h = dArr;
    }

    C5522s1(C5522s1 c5522s1, Spliterator spliterator, long j, long j2) {
        super(c5522s1, spliterator, j, j2, c5522s1.h.length);
        this.h = c5522s1.h;
    }

    @Override // j$.util.stream.AbstractC5542w1, j$.util.stream.InterfaceC5509p2
    public final void accept(double d) {
        int i = this.f;
        if (i >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        double[] dArr = this.h;
        this.f = i + 1;
        dArr[i] = d;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        p((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.e(this, doubleConsumer);
    }

    @Override // j$.util.stream.AbstractC5542w1
    final AbstractC5542w1 b(Spliterator spliterator, long j, long j2) {
        return new C5522s1(this, spliterator, j, j2);
    }

    @Override // j$.util.stream.InterfaceC5494m2
    public final /* synthetic */ void p(Double d) {
        AbstractC5551y0.e(this, d);
    }
}
