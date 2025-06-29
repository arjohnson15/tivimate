package j$.util.stream;

import j$.util.Spliterator;

/* renamed from: j$.util.stream.v1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5537v1 extends AbstractC5542w1 {
    private final Object[] h;

    C5537v1(Spliterator spliterator, AbstractC5436b abstractC5436b, Object[] objArr) {
        super(spliterator, abstractC5436b, objArr.length);
        this.h = objArr;
    }

    C5537v1(C5537v1 c5537v1, Spliterator spliterator, long j, long j2) {
        super(c5537v1, spliterator, j, j2, c5537v1.h.length);
        this.h = c5537v1.h;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f;
        if (i >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        Object[] objArr = this.h;
        this.f = i + 1;
        objArr[i] = obj;
    }

    @Override // j$.util.stream.AbstractC5542w1
    final AbstractC5542w1 b(Spliterator spliterator, long j, long j2) {
        return new C5537v1(this, spliterator, j, j2);
    }
}
