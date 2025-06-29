package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntConsumer;

/* renamed from: j$.util.stream.t1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5527t1 extends AbstractC5542w1 implements InterfaceC5499n2 {
    private final int[] h;

    C5527t1(Spliterator spliterator, AbstractC5436b abstractC5436b, int[] iArr) {
        super(spliterator, abstractC5436b, iArr.length);
        this.h = iArr;
    }

    C5527t1(C5527t1 c5527t1, Spliterator spliterator, long j, long j2) {
        super(c5527t1, spliterator, j, j2, c5527t1.h.length);
        this.h = c5527t1.h;
    }

    @Override // j$.util.stream.AbstractC5542w1, j$.util.stream.InterfaceC5509p2
    public final void accept(int i) {
        int i2 = this.f;
        if (i2 >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        int[] iArr = this.h;
        this.f = i2 + 1;
        iArr[i2] = i;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        m((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.f(this, intConsumer);
    }

    @Override // j$.util.stream.AbstractC5542w1
    final AbstractC5542w1 b(Spliterator spliterator, long j, long j2) {
        return new C5527t1(this, spliterator, j, j2);
    }

    @Override // j$.util.stream.InterfaceC5499n2
    public final /* synthetic */ void m(Integer num) {
        AbstractC5551y0.g(this, num);
    }
}
