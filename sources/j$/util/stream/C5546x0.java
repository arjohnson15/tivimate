package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: j$.util.stream.x0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5546x0 extends AbstractC5441c {
    private final C5541w0 j;

    C5546x0(C5541w0 c5541w0, AbstractC5436b abstractC5436b, Spliterator spliterator) {
        super(abstractC5436b, spliterator);
        this.j = c5541w0;
    }

    C5546x0(C5546x0 c5546x0, Spliterator spliterator) {
        super(c5546x0, spliterator);
        this.j = c5546x0.j;
    }

    @Override // j$.util.stream.AbstractC5451e
    protected final Object a() {
        AbstractC5436b abstractC5436b = this.a;
        AbstractC5531u0 abstractC5531u0 = (AbstractC5531u0) this.j.b.get();
        abstractC5436b.V(this.b, abstractC5531u0);
        boolean z = abstractC5531u0.b;
        if (z == this.j.a.b) {
            Boolean boolValueOf = Boolean.valueOf(z);
            AtomicReference atomicReference = this.h;
            while (!atomicReference.compareAndSet(null, boolValueOf) && atomicReference.get() == null) {
            }
        }
        return null;
    }

    @Override // j$.util.stream.AbstractC5451e
    protected final AbstractC5451e e(Spliterator spliterator) {
        return new C5546x0(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC5441c
    protected final Object j() {
        return Boolean.valueOf(!this.j.a.b);
    }
}
