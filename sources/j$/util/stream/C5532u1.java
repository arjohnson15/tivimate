package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.u1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5532u1 extends AbstractC5542w1 implements InterfaceC5504o2 {
    private final long[] h;

    C5532u1(Spliterator spliterator, AbstractC5436b abstractC5436b, long[] jArr) {
        super(spliterator, abstractC5436b, jArr.length);
        this.h = jArr;
    }

    C5532u1(C5532u1 c5532u1, Spliterator spliterator, long j, long j2) {
        super(c5532u1, spliterator, j, j2, c5532u1.h.length);
        this.h = c5532u1.h;
    }

    @Override // j$.util.stream.AbstractC5542w1, j$.util.stream.InterfaceC5509p2, j$.util.stream.InterfaceC5504o2, java.util.function.LongConsumer
    public final void accept(long j) {
        int i = this.f;
        if (i >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        long[] jArr = this.h;
        this.f = i + 1;
        jArr[i] = j;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        j((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.g(this, longConsumer);
    }

    @Override // j$.util.stream.AbstractC5542w1
    final AbstractC5542w1 b(Spliterator spliterator, long j, long j2) {
        return new C5532u1(this, spliterator, j, j2);
    }

    @Override // j$.util.stream.InterfaceC5504o2
    public final /* synthetic */ void j(Long l) {
        AbstractC5551y0.i(this, l);
    }
}
