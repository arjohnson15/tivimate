package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.BinaryOperator;
import java.util.function.LongFunction;

/* loaded from: classes2.dex */
class R0 extends AbstractC5451e {
    protected final AbstractC5436b h;
    protected final LongFunction i;
    protected final BinaryOperator j;

    R0(R0 r0, Spliterator spliterator) {
        super(r0, spliterator);
        this.h = r0.h;
        this.i = r0.i;
        this.j = r0.j;
    }

    R0(AbstractC5436b abstractC5436b, Spliterator spliterator, LongFunction longFunction, BinaryOperator binaryOperator) {
        super(abstractC5436b, spliterator);
        this.h = abstractC5436b;
        this.i = longFunction;
        this.j = binaryOperator;
    }

    @Override // j$.util.stream.AbstractC5451e
    protected AbstractC5451e e(Spliterator spliterator) {
        return new R0(this, spliterator);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC5451e
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final K0 a() {
        C0 c0 = (C0) this.i.apply(this.h.G(this.b));
        this.h.V(this.b, c0);
        return c0.a();
    }

    @Override // j$.util.stream.AbstractC5451e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC5451e abstractC5451e = this.d;
        if (abstractC5451e != null) {
            f((K0) this.j.apply((K0) ((R0) abstractC5451e).c(), (K0) ((R0) this.e).c()));
        }
        super.onCompletion(countedCompleter);
    }
}
