package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: j$.util.stream.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC5441c extends AbstractC5451e {
    protected final AtomicReference h;
    protected volatile boolean i;

    protected AbstractC5441c(AbstractC5436b abstractC5436b, Spliterator spliterator) {
        super(abstractC5436b, spliterator);
        this.h = new AtomicReference(null);
    }

    protected AbstractC5441c(AbstractC5441c abstractC5441c, Spliterator spliterator) {
        super(abstractC5441c, spliterator);
        this.h = abstractC5441c.h;
    }

    @Override // j$.util.stream.AbstractC5451e
    public final Object c() {
        if (!d()) {
            return super.c();
        }
        Object obj = this.h.get();
        return obj == null ? j() : obj;
    }

    @Override // j$.util.stream.AbstractC5451e, java.util.concurrent.CountedCompleter
    public final void compute() {
        Object objJ;
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.b;
        long jEstimateSize = spliterator.estimateSize();
        long jG = this.c;
        if (jG == 0) {
            jG = AbstractC5451e.g(jEstimateSize);
            this.c = jG;
        }
        AtomicReference atomicReference = this.h;
        boolean z = false;
        AbstractC5441c abstractC5441c = this;
        while (true) {
            objJ = atomicReference.get();
            if (objJ != null) {
                break;
            }
            boolean z2 = abstractC5441c.i;
            if (!z2) {
                CountedCompleter<?> completer = abstractC5441c.getCompleter();
                while (true) {
                    AbstractC5441c abstractC5441c2 = (AbstractC5441c) ((AbstractC5451e) completer);
                    if (z2 || abstractC5441c2 == null) {
                        break;
                    }
                    z2 = abstractC5441c2.i;
                    completer = abstractC5441c2.getCompleter();
                }
            }
            if (z2) {
                objJ = abstractC5441c.j();
                break;
            }
            if (jEstimateSize <= jG || (spliteratorTrySplit = spliterator.trySplit()) == null) {
                break;
            }
            AbstractC5441c abstractC5441c3 = (AbstractC5441c) abstractC5441c.e(spliteratorTrySplit);
            abstractC5441c.d = abstractC5441c3;
            AbstractC5441c abstractC5441c4 = (AbstractC5441c) abstractC5441c.e(spliterator);
            abstractC5441c.e = abstractC5441c4;
            abstractC5441c.setPendingCount(1);
            if (z) {
                spliterator = spliteratorTrySplit;
                abstractC5441c = abstractC5441c3;
                abstractC5441c3 = abstractC5441c4;
            } else {
                abstractC5441c = abstractC5441c4;
            }
            z = !z;
            abstractC5441c3.fork();
            jEstimateSize = spliterator.estimateSize();
        }
        objJ = abstractC5441c.a();
        abstractC5441c.f(objJ);
        abstractC5441c.tryComplete();
    }

    @Override // j$.util.stream.AbstractC5451e
    protected final void f(Object obj) {
        if (!d()) {
            super.f(obj);
        } else if (obj != null) {
            AtomicReference atomicReference = this.h;
            while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
            }
        }
    }

    @Override // j$.util.stream.AbstractC5451e, java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final Object getRawResult() {
        return c();
    }

    protected void h() {
        this.i = true;
    }

    protected final void i() {
        AbstractC5441c abstractC5441c = this;
        for (AbstractC5441c abstractC5441c2 = (AbstractC5441c) ((AbstractC5451e) getCompleter()); abstractC5441c2 != null; abstractC5441c2 = (AbstractC5441c) ((AbstractC5451e) abstractC5441c2.getCompleter())) {
            if (abstractC5441c2.d == abstractC5441c) {
                AbstractC5441c abstractC5441c3 = (AbstractC5441c) abstractC5441c2.e;
                if (!abstractC5441c3.i) {
                    abstractC5441c3.h();
                }
            }
            abstractC5441c = abstractC5441c2;
        }
    }

    protected abstract Object j();
}
