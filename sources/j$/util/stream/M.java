package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
final class M extends AbstractC5441c {
    private final G j;
    private final boolean k;

    M(G g, boolean z, AbstractC5436b abstractC5436b, Spliterator spliterator) {
        super(abstractC5436b, spliterator);
        this.k = z;
        this.j = g;
    }

    M(M m, Spliterator spliterator) {
        super(m, spliterator);
        this.k = m.k;
        this.j = m.j;
    }

    @Override // j$.util.stream.AbstractC5451e
    protected final Object a() {
        AbstractC5436b abstractC5436b = this.a;
        K3 k3 = (K3) this.j.d.get();
        abstractC5436b.V(this.b, k3);
        Object obj = k3.get();
        if (!this.k) {
            if (obj != null) {
                AtomicReference atomicReference = this.h;
                while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
                }
            }
            return null;
        }
        if (obj == null) {
            return null;
        }
        AbstractC5451e abstractC5451e = this;
        while (true) {
            if (abstractC5451e != null) {
                AbstractC5451e abstractC5451e2 = (AbstractC5451e) abstractC5451e.getCompleter();
                if (abstractC5451e2 != null && abstractC5451e2.d != abstractC5451e) {
                    i();
                    break;
                }
                abstractC5451e = abstractC5451e2;
            } else {
                AtomicReference atomicReference2 = this.h;
                while (!atomicReference2.compareAndSet(null, obj) && atomicReference2.get() == null) {
                }
            }
        }
        return obj;
    }

    @Override // j$.util.stream.AbstractC5451e
    protected final AbstractC5451e e(Spliterator spliterator) {
        return new M(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC5441c
    protected final Object j() {
        return this.j.b;
    }

    @Override // j$.util.stream.AbstractC5451e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        if (this.k) {
            M m = (M) this.d;
            M m2 = null;
            while (true) {
                if (m != m2) {
                    Object objC = m.c();
                    if (objC != null && this.j.c.test(objC)) {
                        f(objC);
                        AbstractC5451e abstractC5451e = this;
                        while (true) {
                            if (abstractC5451e != null) {
                                AbstractC5451e abstractC5451e2 = (AbstractC5451e) abstractC5451e.getCompleter();
                                if (abstractC5451e2 != null && abstractC5451e2.d != abstractC5451e) {
                                    i();
                                    break;
                                }
                                abstractC5451e = abstractC5451e2;
                            } else {
                                AtomicReference atomicReference = this.h;
                                while (!atomicReference.compareAndSet(null, objC) && atomicReference.get() == null) {
                                }
                            }
                        }
                    } else {
                        m2 = m;
                        m = (M) this.e;
                    }
                } else {
                    break;
                }
            }
        }
        super.onCompletion(countedCompleter);
    }
}
