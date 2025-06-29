package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* renamed from: j$.util.stream.b2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5439b2 extends AbstractC5451e {
    private final AbstractC5551y0 h;

    C5439b2(C5439b2 c5439b2, Spliterator spliterator) {
        super(c5439b2, spliterator);
        this.h = c5439b2.h;
    }

    C5439b2(AbstractC5551y0 abstractC5551y0, AbstractC5436b abstractC5436b, Spliterator spliterator) {
        super(abstractC5436b, spliterator);
        this.h = abstractC5551y0;
    }

    @Override // j$.util.stream.AbstractC5451e
    protected final Object a() {
        AbstractC5436b abstractC5436b = this.a;
        U1 u1E0 = this.h.e0();
        abstractC5436b.V(this.b, u1E0);
        return u1E0;
    }

    @Override // j$.util.stream.AbstractC5451e
    protected final AbstractC5451e e(Spliterator spliterator) {
        return new C5439b2(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC5451e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC5451e abstractC5451e = this.d;
        if (abstractC5451e != null) {
            U1 u1 = (U1) ((C5439b2) abstractC5451e).c();
            u1.g((U1) ((C5439b2) this.e).c());
            f(u1);
        }
        super.onCompletion(countedCompleter);
    }
}
